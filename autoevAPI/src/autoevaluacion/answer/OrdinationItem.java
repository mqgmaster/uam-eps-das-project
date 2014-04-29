package autoevaluacion.answer;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class OrdinationItem extends JPanel implements Comparable<OrdinationItem> {
	
	private final JTextArea answerPosition = new JTextArea(1,2);
	private final JLabel answerLabel = new JLabel();
	
	public OrdinationItem(String answerText) {
		super();
		this.answerLabel.setText(answerText);
		this.add(answerPosition);
		this.add(answerLabel);
	}

	@Override
	public int compareTo(OrdinationItem another) {
		return this.getAnswerPosition().compareTo(another.getAnswerPosition());
	}
	
	@Override
	public boolean equals(Object another) {
		if (another instanceof OrdinationItem) {
			if (((OrdinationItem) another).getAnswerPosition().equals(this.getAnswerPosition())) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return this.getAnswerPosition().hashCode();
	}

	public String getAnswerPosition() {
		return answerPosition.getText();
	}
	
	public String getAnswerText() {
		return answerLabel.getText();
	}
}
