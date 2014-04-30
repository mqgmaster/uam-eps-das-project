package autoevaluacion;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import autoevaluacion.ExercisePanel.PanelType;
import autoevaluacion.answer.Answer.AnswerType;

@SuppressWarnings("serial")
public class Autoevaluacion extends JFrame {
	private double nota;
	private double puntuacionStandard;
	private double penalizacion;
	private JPanel mainContainer = new JPanel(new CardLayout());
	private ArrayList<ExercisePanel> exercisePanels = new ArrayList<>();
	
	public Autoevaluacion (double puntuacionStandard, final double penalizacion) {
		super ("Autoevaluacion");
		this.puntuacionStandard = puntuacionStandard;
		this.penalizacion = penalizacion;
		//Crea pantallas
		final ExercisePanel pc1 = new ExercisePanel("c1", PanelType.WIZARD_ADAPTATIVE);
		final ExercisePanel pc2 = new ExercisePanel("c2", PanelType.WIZARD_ADAPTATIVE);
		final ExercisePanel pc3 = new ExercisePanel("c3", PanelType.WIZARD_ADAPTATIVE);
		
		//Anade ejercicios
		pc1.addExercise(new Exercise(
				"Ejercicio 2", 
				"Enunciado 2 respuesta unica", 
				2.0,
				"c1",
				2,
				new String[]{
				"correcta"
				},
				new String[]{
				"alter1",
				"alter2"
				},
				AnswerType.UNIQUE
				));
		pc1.addExercise(new Exercise(
				"Ejercicio 1", 
				"Enunciado 1 respuesta multiple", 
				1.0,
				"c1",
				1,
				new String[]{
				"correcta1",
				"correcta2"
				},
				new String[]{
				"altern1",
				"alter2",
				"alter3"
				},
				AnswerType.MULTIPLE
				));
		pc1.addExercise(new Exercise(
				"Ejercicio 7", 
				"Enunciado 7 respuesta unica", 
				2.0,
				"c1",
				7,
				new String[]{
				"correcta"
				},
				new String[]{
				"alter1",
				"alter2"
				},
				AnswerType.UNIQUE
				));
		pc2.addExercise(new Exercise(
				"Ejercicio 4", 
				"Enunciado 4 ordenacion", 
				0.5,
				"c2",
				4,
				new String[]{
				"1",
				"2",
				"3",
				"4"
				},
				new String[]{
				},
				AnswerType.ORDINATION
				));
		pc2.addExercise(new Exercise(
				"Ejercicio 6", 
				"Enunciado 6 ordenacion descendente", 
				0.5,
				"c2",
				6,
				new String[]{
				"4",
				"3",
				"2",
				"1"
				},
				new String[]{
				},
				AnswerType.ORDINATION
				));
		pc3.addExercise(new Exercise(
				"Ejercicio 3", 
				"Enunciado 3 texto libre: escribe 'a' o 'b'", 
				1.0,
				"c3",
				3,
				new String[]{
				"a",
				"b"
				},
				new String[]{
				},
				AnswerType.WRITTEN
				));
		pc3.addExercise(new Exercise(
				"Ejercicio 5", 
				"Enunciado 5 texto libre: escribe 'asdf' o 'qwer'", 
				1.0,
				"c3",
				5,
				new String[]{
				"qwer",
				"asdf"
				},
				new String[]{
				},
				AnswerType.WRITTEN
				));
		
		//Anade boton siguiente
		pc1.addNextButton("Proxima", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				showPanel(pc2);
			}
		});
		pc2.addNextButton("Proxima", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				showPanel(pc3);
			}
		});
		pc3.addNextButton("Corregir", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Panel panel = createFinalPanel();
				addPanel(panel);
				showPanel(panel);
			}
		});
		
		addExercisePanel(pc1);
		addExercisePanel(pc2);
		addExercisePanel(pc3);
		
		//Comienza en la pantalla inicial
		showPanel(pc1);
		// anadir panel a la ventana
		getContentPane().add(mainContainer);
		
		
	}
	
	public Panel createFinalPanel() {
		Panel panel = new Panel("Nota");
		calculaNota(panel);
		JLabel n = new JLabel("Nota : "+nota);
		panel.add(n);
		panel.addButton("Salir", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Autoevaluacion.this.setVisible(false);
				Autoevaluacion.this.dispose();
			}
		});
		return panel;
	}
	
	public void addExercisePanel(ExercisePanel ep) {
		exercisePanels.add(ep);
		addPanel(ep);
	}
	
	public void addPanel(Panel panel) {
		panel.setupView();
		mainContainer.add(panel, panel.getName());
	}
	
	public void showPanel(Panel panel) {
		((CardLayout)mainContainer.getLayout()).show(mainContainer, panel.getName());
	}

	public void mostrar() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.pack();
		this.setVisible(true);
	}
	 
	public void calculaNota(Panel pantalla) {
		nota = 0.0;
		for (ExercisePanel pe : exercisePanels) {
			for (Exercise e : pe.getAllExercises()) {
				if(e.isAnswered()){
					double c = e.corrige(penalizacion);
					nota += c;
					if (c <= 0) {
						pantalla.add(e.muestraCorreccion());
					}
				}
			}
		}
	}
}
