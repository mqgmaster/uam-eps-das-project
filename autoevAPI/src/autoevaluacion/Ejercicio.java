package autoevaluacion;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio {
	private String name;
	private String enunciado;
	private double puntuacionEj;
	private String categoria;
	private int orden;
	private Respuesta respuestas;
	
	public Ejercicio(String name, String enunciado, double puntuacionEj,
			String categoria, int orden, Respuesta respuestas) {
		super();
		this.name = name;
		this.enunciado = enunciado;
		this.puntuacionEj = puntuacionEj;
		this.categoria = categoria;
		this.orden = orden;
		this.respuestas = respuestas;
	}
	
	public JPanel createComponent(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		JPanel enun = new JPanel(new GridLayout(2,1));
		JLabel n = new JLabel(name+" "+orden+" :");
		enun.add(n);
		JLabel e = new JLabel(enunciado);
		enun.add(e);
		panel.add(enun);
		panel.add(respuestas.createComponent());
		
		return panel;
	}
	
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		JPanel enun = new JPanel(new GridLayout(2,1));
		JLabel n = new JLabel(name+" "+orden+" :");
		enun.add(n);
		JLabel e = new JLabel(enunciado);
		enun.add(e);
		panel.add(enun);
		panel.add(respuestas.muestraCorreccion());
		
		return panel;
	}
	
	public double corrige(double penalizacion){
		if(respuestas.corrige())
			return puntuacionEj;
		return puntuacionEj*(-penalizacion);
	}
	
	
}
