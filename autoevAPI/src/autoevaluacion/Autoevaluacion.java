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
		
		//Crea un ejercicio
		final ExercisePanel pe = new ExercisePanel("matematica", PanelType.WIZARD);
		final ExercisePanel pe2 = new ExercisePanel("fisica", PanelType.WIZARD);
		
		pe.addExercise(new Exercise(
				"Ejercicio 1", 
				"Calcula 1 + 1 = ?", 
				1.0, 
				"matematica",
				5,
				new String[]{"dos"},
				new String[]{"tres","uno","cien"},
				AnswerType.UNIQUE));
		
		pe.addExercise(new Exercise(
				"Ejercicio 2", 
				"Calcula 1 + 2 = ?",
				1.0, 
				"matematica", 
				0, 
				new String[]{"3"},
				new String[]{"2","1","100"},
				AnswerType.UNIQUE));
		
		pe2.addExercise(new Exercise(
				"Ejercicio 3", 
				"Calcula 1 + 1 = ?", 
				1.0, 
				"fisica",
				5,
				new String[]{"dos"},
				new String[]{"tres","uno","cien"},
				AnswerType.UNIQUE));
		
		pe2.addExercise(new Exercise(
				"Ejercicio 4", 
				"Calcula 1 + 2 = ?",
				1.0, 
				"fisica", 
				0, 
				new String[]{"3"},
				new String[]{"2","1","100"},
				AnswerType.UNIQUE));
		
		pe.addNextButton("Proxima", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				showPanel(pe2);
			}
		});
		
		
		pe2.addNextButton("Corregir", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Panel panel = createFinalPanel();
				addPanel(panel);
				showPanel(panel);
			}
		});
		
		addExercisePanel(pe);
		addExercisePanel(pe2);
		
		//Comienza en la pantalla inicial
		showPanel(pe);
		// añadir panel a la ventana
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
