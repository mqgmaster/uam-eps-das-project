package autoevaluacion.answer;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class OrdinationAnswer extends Answer {
	
	private final ArrayList<OrdinationItem> answersList = new ArrayList<>();

	public OrdinationAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}

	@Override
	public JPanel createComponent(){
		ArrayList<String> resp = new ArrayList<String>();
		resp.addAll(getCorrectas());
		Collections.shuffle(resp);
		
		OrdinationItem item;
		JPanel panel = new JPanel(new GridLayout(getCorrectas().size(),1));
		
		for(String r : resp){
			item = new OrdinationItem(r);
			answersList.add(item);
			panel.add(item);
		}
		
		return panel;
	}
	
	@Override
	public boolean corrige() {
		Collections.sort(answersList);
		Set<OrdinationItem> answersSet = new HashSet<>(answersList);
		if (answersSet.size() != answersList.size()) {
			return false;
		}
		for (int i=0;i<answersList.size();i++) {
			if (answersList.get(i).getAnswerPosition().isEmpty()) {
				return false;
			}
			if (!answersList.get(i).getAnswerText().equals(getCorrectas().get(i))) {
				return false;
			}
		}
		return true;
	}
	
	@Override
	public boolean isAnswered() {
		for (OrdinationItem item : answersList) {
			if (!item.getAnswerPosition().isEmpty()) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(getCorrectas().size(),1));
		for (int i=0;i<answersList.size();i++) {
			JLabel correcta = new JLabel(answersList.get(i).getAnswerText());
			correcta.setForeground(Color.green);
			panel.add(correcta);
			JLabel user = new JLabel(getCorrectas().get(i));
			if (answersList.get(i).getAnswerText().equals(getCorrectas().get(i))) {
				user.setForeground(Color.green);
			} else {
				user.setForeground(Color.red);
			}
			panel.add(user);
		}
		return panel;
	}
}
