package autoevaluacion;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RespuestaMultiple extends Respuesta implements ActionListener {
	private ArrayList<JCheckBox> group = new ArrayList<JCheckBox>();

	public RespuestaMultiple(String[] correctas, String[] alternativas) {
		super(correctas, alternativas);
	}
	
	@Override
	public JPanel createComponent(){
		ArrayList<String> resp = new ArrayList<String>();
		resp.addAll(getCorrectas());
		resp.addAll(getAlternativas());
		Collections.shuffle(resp);
		
		group = new ArrayList<JCheckBox>();
		JPanel panel = new JPanel(new GridLayout(resp.size(),1));
		for(String r : resp){
			JCheckBox rb = new JCheckBox(r);
			rb.setActionCommand(r);
			rb.addActionListener((ActionListener) this);
			group.add(rb);
			panel.add(rb);
		}
		
		return panel;
	}
	
	public void actionPerformed(ActionEvent e) {
		if(getSeleccionadas().contains(e.getActionCommand())){
			getSeleccionadas().remove(e.getActionCommand());
		}else{
			getSeleccionadas().add(e.getActionCommand());
		}
		/*
		ArrayList<String> selec = new ArrayList<>();
		for (int i = 0; i < group.size(); i++){
		    JCheckBox cb = group.get(i);
		    if (cb.isSelected()){
				selec.add(cb.getActionCommand());
		    }
		}
		setSeleccionadas(selec);
		*/
	}

	@Override
	public boolean corrige(){
		if(getSeleccionadas().isEmpty() || getCorrectas().isEmpty())
			return false;
		int flag = 0;
		for(String s : getSeleccionadas()){
			if(getCorrectas().contains(s)){
				flag++;
			}
		}
		if(flag==getCorrectas().size())
			return true;
		return false;
	}
	
	@Override
	public JPanel muestraCorreccion(){
		JPanel panel = new JPanel(new GridLayout(getCorrectas().size()+getSeleccionadas().size(),1));
		for(String c : getCorrectas()){
			JLabel correcta = new JLabel(c);
			correcta.setForeground(Color.green);
			panel.add(correcta);
		}
		for(String  s: getSeleccionadas()){
			if(!getCorrectas().contains(s)){
				JLabel seleccionada = new JLabel(s);
				seleccionada.setForeground(Color.red);
				panel.add(seleccionada);
			}
		}
		return panel;
	}
}
