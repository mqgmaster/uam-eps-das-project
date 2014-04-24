package autoevaluacion;

import java.util.ArrayList;

import javax.swing.JPanel;

public class TextoLibre extends Respuesta {

	public TextoLibre(ArrayList<String> correctas,
			ArrayList<String> alternativas, ArrayList<String> seleccionadas) {
		super(correctas, alternativas, seleccionadas);
	}

	@Override
	public JPanel createComponent() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean corrige() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public JPanel muestraCorreccion() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
