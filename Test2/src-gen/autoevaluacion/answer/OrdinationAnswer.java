package autoevaluacion.answer;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class OrdinationAnswer extends Answer {

	public OrdinationAnswer(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}

	@Override
	public JPanel createComponent(){
		ArrayList<String> resp = new ArrayList<String>();
		resp.addAll(getCorrectas());
		
		ButtonGroup group = new ButtonGroup();
		JPanel panel = new JPanel(new GridLayout(resp.size(),1));
		for(String r : resp){
			JRadioButton rb = new JRadioButton(r);
			rb.setActionCommand(r);
			rb.addActionListener((ActionListener) this);
			group.add(rb);
			panel.add(rb);
		}
		
		return panel;
	}
	
	public void actionPerformed(ActionEvent e) {
		ArrayList<String> selec = new ArrayList<>();
		selec.add(e.getActionCommand());
		setSeleccionadas(selec);
	}
	
	@Override
	public boolean corrige(){
		if(getSeleccionadas().isEmpty() || getCorrectas().isEmpty())
			return false;
		
		if(getCorrectas().contains(getSeleccionadas().get(0))){
			return true;
		}
		return false;
	}
	
	@Override
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(2,1));
		JLabel correcta = new JLabel(getCorrectas().get(0));
		correcta.setForeground(Color.green);
		panel.add(correcta);
		JLabel seleccionada = new JLabel(getSeleccionadas().get(0));
		seleccionada.setForeground(Color.red);
		panel.add(seleccionada);
		return panel;
	}
}
