package autoevaluacion;

import java.util.ArrayList;

import javax.swing.JPanel;

public abstract class Respuesta {
	private ArrayList<String> correctas = new ArrayList<String>();
	private ArrayList<String> alternativas = new ArrayList<String>();
	private ArrayList<String> seleccionadas = new ArrayList<String>();
	
	public Respuesta(ArrayList<String> correctas,
			ArrayList<String> alternativas, ArrayList<String> seleccionadas) {
		super();
		this.correctas = correctas;
		this.alternativas = alternativas;
		this.seleccionadas = seleccionadas;
	}
	public ArrayList<String> getCorrectas() {
		return correctas;
	}
	public void setCorrectas(ArrayList<String> correctas) {
		this.correctas = correctas;
	}
	public ArrayList<String> getAlternativas() {
		return alternativas;
	}
	public void setAlternativas(ArrayList<String> alternativas) {
		this.alternativas = alternativas;
	}
	public ArrayList<String> getSeleccionadas() {
		return seleccionadas;
	}
	public void setSeleccionadas(ArrayList<String> seleccionadas) {
		this.seleccionadas = seleccionadas;
	}
	public abstract JPanel createComponent();
	public abstract boolean corrige();
	public abstract JPanel muestraCorreccion();
}
