package autoevaluacion;

import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Panel extends JPanel {
	
	protected JPanel buttonContainer = new JPanel();
	
	public Panel(String name) {
		this.setName(name);
	}
	
	public void setupView() {
		this.add(buttonContainer);
	}
	
	public void addButton(String label, ActionListener action) {
		JButton button = new JButton(label);
		buttonContainer.add(button);
		button.addActionListener(action);
	}

}
