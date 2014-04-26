package autoevaluacion;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.CambiarPantallaListener;
import listeners.FinalizarListener;
import autoevaluacion.Ejercicio.TipoRespuesta;
import autoevaluacion.PantallaEjercicios.TipoHoja;

@SuppressWarnings("serial")
public class Autoevaluacion extends JFrame {
	private double nota;
	private double puntuacionStandard;
	private double penalizacion;
	private JPanel mainContainer = new JPanel(new CardLayout());
	private ArrayList<PantallaEjercicios> pantallasEj = new ArrayList<>();
	
	public Autoevaluacion (double puntuacionStandard, final double penalizacion) {
		super ("New Project");
		this.puntuacionStandard = puntuacionStandard;
		this.penalizacion = penalizacion;
		
		/**
		 * Crea la pantalla de ejercicios 
		 **/
		//Crea un ejercicio
		PantallaEjercicios pe = new PantallaEjercicios("matematica", TipoHoja.Wizard);		
		pe.addEjercicio(new Ejercicio(
				"Ejercicio 1", 
				"Calcula 1 + 1 = ?", 
				1.0, 
				"matematica",
				5,
				new String[]{"dos"},
				new String[]{"tres","uno","cien"},
				TipoRespuesta.RespuestaUnica));
		
		pe.addEjercicio(new Ejercicio(
				"Ejercicio 2", 
				"Calcula 1 + 2 = ?",
				1.0, 
				"matematica", 
				0, 
				new String[]{"3"},
				new String[]{"2","1","100"},
				TipoRespuesta.RespuestaUnica));
		
		PantallaEjercicios pe2 = new PantallaEjercicios("fisica", TipoHoja.Wizard);		
		pe2.addEjercicio(new Ejercicio(
				"Ejercicio 3", 
				"Calcula 1 + 1 = ?", 
				1.0, 
				"matematica",
				5,
				new String[]{"dos"},
				new String[]{"tres","uno","cien"},
				TipoRespuesta.RespuestaUnica));
		
		pe2.addEjercicio(new Ejercicio(
				"Ejercicio 4", 
				"Calcula 1 + 2 = ?",
				1.0, 
				"matematica", 
				0, 
				new String[]{"3"},
				new String[]{"2","1","100"},
				TipoRespuesta.RespuestaUnica));
		
		pe.show();
		pe2.show();
		pantallasEj.add(pe);
		pantallasEj.add(pe2);

		mainContainer.add(pe, "Inicial");
		mainContainer.add(pe2, "Fisica");
		pe.setNextButton("Vamo", new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				Autoevaluacion.this.showPanel("Fisica");
			}
		});
		
		JButton boton = new JButton("Corregir");
		boton.addActionListener(new CambiarPantallaListener(mainContainer, "Nota", new Pantalla() {
			/**
			 * Crea la pantalla final
			 **/
			@Override
			public JPanel create() {
				JPanel pantalla = new JPanel();
				calculaNota(pantalla);
				JLabel n = new JLabel("Nota : "+nota);
				pantalla.add(n);
				
				JPanel botonera = new JPanel();
				JButton boton = new JButton("Salir");
				boton.addActionListener(new FinalizarListener(Autoevaluacion.this));
				botonera.add(boton);
				pantalla.add(botonera);
				return pantalla;
			}
		}));
		
		boton = new JButton("Salir");
		boton.addActionListener(new FinalizarListener(this));
		
		//Comienza en la pantalla inicial
		showPanel("Inicial");
		// añadir panel a la ventana
		getContentPane().add(mainContainer);
	}
	private void showPanel(String name) {
		((CardLayout)mainContainer.getLayout()).show(mainContainer, name);
	}
	/**
	 * muestra el wizard
	 */
	 public void mostrar() {
	 	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 	this.pack();
	 	this.setVisible(true);
	 }
	 
	public void calculaNota(JPanel pantalla) {
		nota = 0.0;
		for (PantallaEjercicios pe : pantallasEj) {
			for (Ejercicio e : pe.getEjercicios()) {
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
	/*public void addEjercicio(JPanel pantalla, Ejercicio e) {
		Container c = new Container();
		
		ArrayList<String> correctas;
		ArrayList<String> alternativas;
		Respuesta r;
		Ejercicio e;

		correctas = new ArrayList<String>();
		alternativas = new ArrayList<String>();

		correctas.add("dos");
		alternativas.add("uno");
		alternativas.add("tres");
		alternativas.add("cien");

		r = new RespuestaUnica(correctas, alternativas, new ArrayList<String>());
		e = new Ejercicio("Ejercicio", "Calcula 1 + 1 = ?", 1.0, "ninguna", 0,
				r);
		pantalla.add(e.createComponent());
	}*/
}
