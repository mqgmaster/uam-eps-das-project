package autoevaluacion;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import autoevaluacion.Ejercicio.TipoRespuesta;
import autoevaluacion.PantallaEjercicios.TipoHoja;
import listeners.*;

@SuppressWarnings("serial")
public class Autoevaluacion extends JFrame {
	private double nota;
	private double puntuacionStandard;
	private double penalizacion;
	private ArrayList<PantallaEjercicios> pantallasEj = new ArrayList<>();
	
	public Autoevaluacion (double puntuacionStandard, final double penalizacion) {
		super ("New Project");
		this.puntuacionStandard = puntuacionStandard;
		this.penalizacion = penalizacion;
		
		// panel con todas las pantallas
		JPanel pantallas = new JPanel(new CardLayout());
		
		//Anade pantallas
		JPanel pantalla;
		JPanel botonera;
		JButton boton;
		
		Ejercicio e;
		
		/**
		 * Crea la pantalla de ejercicios 
		 **/

		
		//Crea un ejercicio
		PantallaEjercicios pe = new PantallaEjercicios(TipoHoja.WizardAdaptativo);		
		e = new Ejercicio("Ejercicio", "Calcula 1 + 1 = ?", 1.0, "ninguna", 5,
				new String[]{"dos"},new String[]{"tres","uno","cien"},TipoRespuesta.RespuestaUnica);
		pe.addEjercicio(e);
		
		e = new Ejercicio("Ejercicio", "Calcula 1 + 2 = ?", 1.0, "ninguna", 0, 
				new String[]{"3"},new String[]{"2","1","100"},TipoRespuesta.RespuestaUnica);
		pe.addEjercicio(e);
		
		pe.show();
		pantallasEj.add(pe);

		pantalla = new JPanel();
		pantalla.add(pe);
		
		//Boton corregir
		botonera = new JPanel();
		boton = new JButton("Corregir");
		boton.addActionListener(new CambiarPantallaListener(pantallas, "Nota", new Pantalla() {
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
		botonera.add(boton);
		boton = new JButton("Salir");
		boton.addActionListener(new FinalizarListener(this));
		botonera.add(boton);
		pantalla.add(botonera);
		pantallas.add(pantalla, "Inicial");
		
		
		//Comienza en la pantalla inicial
		((CardLayout)pantallas.getLayout()).show(pantallas,"Inicial");
		// añadir panel a la ventana
		getContentPane().add(pantallas);
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
