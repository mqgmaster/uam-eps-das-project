package autoevaluacion;

import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import autoevaluacion.answer.Answer;
import autoevaluacion.answer.MultipleAnswer;
import autoevaluacion.answer.OrdinationAnswer;
import autoevaluacion.answer.UniqueAnswer;
import autoevaluacion.answer.WrittenAnswer;
import autoevaluacion.answer.Answer.AnswerType;

public class Exercise implements Comparable<Exercise> {
	
	private String name;
	private String enunciado;
	private double puntuacionEj;
	private String categoria;
	private Integer orden;
	private Answer respuestas;
	
	public Exercise(String name, String enunciado, double puntuacionEj,
			String categoria, int orden,String[] correctas,String[] alternativas, AnswerType tipo) {
		super();
		this.name = name;
		this.enunciado = enunciado;
		this.puntuacionEj = puntuacionEj;
		this.categoria = categoria;
		this.orden = orden;
		switch(tipo){
		case UNIQUE:
			this.respuestas = new UniqueAnswer(correctas, alternativas);
			break;
		case MULTIPLE:
			this.respuestas = new MultipleAnswer(correctas, alternativas);
			break;
		case WRITTEN:
			this.respuestas = new WrittenAnswer(correctas, alternativas);
			break;
		case ORDINATION:
			this.respuestas = new OrdinationAnswer(correctas, alternativas);
			break;
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
	public int compareTo(Exercise o) {
		return orden.compareTo(o.orden);
	}
	
	public boolean isAnswered(){
		return respuestas.isAnswered();
	}
	
	public boolean isCorrect() {
		return respuestas.corrige();
	}
}
