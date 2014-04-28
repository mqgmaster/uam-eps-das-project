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
		final ExercisePanel pAutoevaluacion.impl.EjercicioImpl@1bedcf4 (enunciado: sda, puntuacionEj: 2.2, categoria: sda, name: sada, order: 5) = new ExercisePanel("Autoevaluacion.impl.EjercicioImpl@1bedcf4 (enunciado: sda, puntuacionEj: 2.2, categoria: sda, name: sada, order: 5)", PanelType.WIZARD);
		addExercisePanel(pAutoevaluacion.impl.EjercicioImpl@1bedcf4 (enunciado: sda, puntuacionEj: 2.2, categoria: sda, name: sada, order: 5));
		
		//Anade ejercicios
		psda.addExercise(new Exercise(
				"sada", 
				"sda", 
				5, 
				"sda",
				2.2,
				
				new String[]{
				"sdas"
				},
				new String[]{
				"ASD",
				"SAD"
				},
				
				AnswerType.UNIQUE
				));
		
		//Anade boton siguiente
		pAutoevaluacion.impl.EjercicioImpl@1bedcf4 (enunciado: sda, puntuacionEj: 2.2, categoria: sda, name: sada, order: 5).addNextButton("Corregir", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Panel panel = createFinalPanel();
				addPanel(panel);
				showPanel(panel);
			}
		});
		
		
		//Comienza en la pantalla inicial
		showPanel(pAutoevaluacion.impl.EjercicioImpl@1bedcf4 (enunciado: sda, puntuacionEj: 2.2, categoria: sda, name: sada, order: 5));
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
