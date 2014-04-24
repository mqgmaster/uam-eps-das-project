package autoevaluacion;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.*;

import listeners.*;

@SuppressWarnings("serial")
public class Autoevaluacion extends JFrame {
	private double nota;
	private double puntuacionStandard;
	private double penalizacion;
	private ArrayList<Ejercicio> ejercicios;
	
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
		
		ejercicios = new ArrayList<Ejercicio>();
		ArrayList<String> correctas;
		ArrayList<String> alternativas;
		Respuesta r;
		Ejercicio e;
		
		/**
		 * Crea la pantalla de ejercicios 
		 **/
		pantalla = new JPanel(new GridLayout(3,1)); //num de ejerciccios + 1 para botones!!! 

		//Crea un ejercicio
		correctas = new ArrayList<String>();
		alternativas = new ArrayList<String>();

		correctas.add("dos");
		alternativas.add("uno");
		alternativas.add("tres");
		alternativas.add("cien");

		r = new RespuestaUnica(correctas, alternativas, new ArrayList<String>());
		e = new Ejercicio("Ejercicio", "Calcula 1 + 1 = ?", 1.0, "ninguna", 0,r);
		ejercicios.add(e);
		pantalla.add(e.createComponent());


		//Crea un ejercicio
		correctas = new ArrayList<String>();
		alternativas = new ArrayList<String>();
		
		correctas.add("3");
		alternativas.add("1");
		alternativas.add("2");
		alternativas.add("100");
		
		r = new RespuestaUnica(correctas,alternativas,new ArrayList<String>());
		e = new Ejercicio("Ejercicio", "Calcula 1 + 2 = ?", 1.0, "ninguna", 0, r);
		ejercicios.add(e);
		pantalla.add(e.createComponent());

		
		botonera = new JPanel();
		boton = new JButton("Corregir");
		boton.addActionListener(new CambiarPantallaListener(pantallas, "Nota", new Pantalla() {
			
			@Override
			public JPanel create() {
				JPanel pantalla = new JPanel();
				JLabel n = new JLabel("Nota : "+nota);
				pantalla.add(n);
				for(Ejercicio ej: ejercicios){
					if(ej.corrige(penalizacion)<=0){
						pantalla.add(ej.muestraCorreccion());
					}
				}
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
		
		/**
		 * Crea la pantalla final
		 **/
		
		
		
		//pantallas.add(pantalla, "Nota");
		
		
		
		
		
		pantalla = new JPanel();
		botonera = new JPanel();
		boton = new JButton("Mensaje");
		//boton.addActionListener(new  MuestraMsjListener("Hola"));
		botonera.add(boton);
		boton = new JButton("Salir");
		boton.addActionListener(new FinalizarListener(this));
		botonera.add(boton);
		boton = new JButton("Atras");
		boton.addActionListener(new CambiarPantallaListener(pantallas, "Inicial"));
		botonera.add(boton,0);
		pantalla.add(botonera);
		pantallas.add(pantalla, "P2");
		
		
		pantalla = new JPanel();
		botonera = new JPanel();
		boton = new JButton("P4");
		boton.addActionListener(new CambiarPantallaListener(pantallas, "P4"));
		botonera.add(boton);
		boton = new JButton("Mensaje");
		//boton.addActionListener(new  MuestraMsjListener("Mensaje creado con en la pantalla 3"));
		botonera.add(boton);
		pantalla.add(botonera);
		pantallas.add(pantalla, "P3");
		
		
		pantalla = new JPanel();
		botonera = new JPanel();
		boton = new JButton("Mensaje");
		//boton.addActionListener(new  MuestraMsjListener("Atras vuelve a la pantalla inicial"));
		botonera.add(boton);
		boton = new JButton("Atras");
		boton.addActionListener(new CambiarPantallaListener(pantallas, "Inicial"));
		botonera.add(boton,0);
		boton = new JButton("Finalizar");
		boton.addActionListener(new FinalizarListener(this));
		botonera.add(boton);
		pantalla.add(botonera);
		pantallas.add(pantalla, "P4");
		
		
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
	 
	 public void calculaNota(ArrayList<Ejercicio> ejercicios){
		 nota = 0.0;
		 for(Ejercicio e: ejercicios){
			 nota += e.corrige(penalizacion);
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
