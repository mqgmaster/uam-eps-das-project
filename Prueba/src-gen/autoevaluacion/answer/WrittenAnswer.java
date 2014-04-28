package autoevaluacion.answer;

import javax.swing.JPanel;

public class WrittenAnswer extends Answer {

	

	public WrittenAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
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