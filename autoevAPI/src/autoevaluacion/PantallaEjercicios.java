package autoevaluacion;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class PantallaEjercicios extends JPanel{
	//private JScrollPane scrollP;
	private TipoHoja type;
	private String name;
	public static enum TipoHoja {Classic,Wizard,WizardAdaptativo};
	private ArrayList<Ejercicio> ejercicios = new ArrayList<>();
	private ArrayList<Integer> respondidos = new ArrayList<>();
	private JButton nextButton;

	public PantallaEjercicios(String name, TipoHoja type) {
		this.type = type;
		this.name = name;
	}
	
	public ArrayList<Ejercicio> getEjercicios() {
		return ejercicios;
	}
	
	public void addEjercicio(Ejercicio e){
		ejercicios.add(e);
	}
	
	public void show(){
		switch(type){
		case Classic :
			break;
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
	
	public void setNextButton(String buttonLabel, ActionListener action) {
		JPanel buttonContainer = new JPanel();
		nextButton = new JButton(buttonLabel);
		buttonContainer.add(nextButton);
		this.add(buttonContainer);
		nextButton.addActionListener(action);
	}
}
