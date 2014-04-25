package autoevaluacion;

import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class PantallaEjercicios extends JPanel{
	//private JScrollPane scrollP;
	private TipoHoja tipo;
	public static enum TipoHoja {Wizard,WizardAdaptativo};
	private ArrayList<Ejercicio> ejercicios = new ArrayList<>();
	private ArrayList<Integer> respondidos = new ArrayList<>();

	public PantallaEjercicios(TipoHoja tipo) {
		this.tipo = tipo;
	}
	
	public ArrayList<Ejercicio> getEjercicios() {
		return ejercicios;
	}
	
	public void addEjercicio(Ejercicio e){
		ejercicios.add(e);
	}
	
	public void show(){
		switch(tipo){
		case Wizard:
			Collections.sort(ejercicios);
			for(Ejercicio e: ejercicios)
				this.add(e.createComponent());
			break;
		case WizardAdaptativo:
			int r = (int) Math.random()*(ejercicios.size()-1);
			this.add(ejercicios.get(r).createComponent());
			respondidos.add(r);
		}
		
	}

	public Ejercicio getLastAnswered() {
		return ejercicios.get(respondidos.get(respondidos.size()-1));
	}
}
