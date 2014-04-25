package autoevaluacion;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ejercicio implements Comparable<Ejercicio>{
	private String name;
	private String enunciado;
	private double puntuacionEj;
	private String categoria;
	private Integer orden;
	private Respuesta respuestas;
	
	public static enum TipoRespuesta {
		RespuestaUnica,
		RespuestaMultiple,
		TextoLibre,
		Ordenacion};
	
	public Ejercicio(String name, String enunciado, double puntuacionEj,
			String categoria, int orden,String[] correctas,String[] alternativas, TipoRespuesta tipo) {
		super();
		this.name = name;
		this.enunciado = enunciado;
		this.puntuacionEj = puntuacionEj;
		this.categoria = categoria;
		this.orden = orden;
		switch(tipo){
		case RespuestaUnica:
			this.respuestas = new RespuestaUnica(correctas, alternativas);
			break;
		case RespuestaMultiple:
			this.respuestas = new RespuestaMultiple(correctas, alternativas);
			break;
		case TextoLibre:
			this.respuestas = new TextoLibre(correctas, alternativas);
			break;
		/*case Ordenacion:
			this.respuestas = new Ordenacion(correctas, alternativas);
			break;*/
		default:
			
		}
		
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

	@Override
	public int compareTo(Ejercicio o) {
		return (Integer) orden.compareTo(o.orden);
	}
	
	public boolean isAnswered(){
		if(respuestas.getSeleccionadas().isEmpty())
			return false;
		return true;
	}
	
	public boolean isCorrect() {
		return respuestas.corrige();
	}
}
