package autoevaluacion.answer;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class WrittenAnswer extends Answer {
	
	private final JTextArea textArea = new JTextArea(2,2);

	public WrittenAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}

	@Override
	public JPanel createComponent(){
		JPanel panel = new JPanel(new GridLayout(getCorrectas().size(),1));
		panel.add(textArea);
		return panel;
	}
	
	@Override
	public boolean corrige(){
		return getCorrectas().contains(textArea.getText());
	}
	
	public boolean isAnswered() {
		return !textArea.getText().trim().isEmpty();
	}
	
	@Override
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		JLabel correcta = new JLabel(getCorrectas().get(0));
		correcta.setForeground(Color.green);
		panel.add(correcta);
		JLabel written = new JLabel(textArea.getText());
		written.setForeground(Color.red);
		panel.add(written);
		return panel;
	}
}
