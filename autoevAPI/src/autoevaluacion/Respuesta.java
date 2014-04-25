package autoevaluacion;

import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JPanel;

public abstract class Respuesta {
	private ArrayList<String> correctas = new ArrayList<String>();
	private ArrayList<String> alternativas = new ArrayList<String>();
	private ArrayList<String> seleccionadas = new ArrayList<String>();
	
	public Respuesta(String[] correctas,
			String[] alternativas) {
		super();
		this.correctas = new ArrayList<String>(Arrays.asList(correctas));
		this.alternativas = new ArrayList<String>(Arrays.asList(alternativas));
		this.seleccionadas = new ArrayList<String>();
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
