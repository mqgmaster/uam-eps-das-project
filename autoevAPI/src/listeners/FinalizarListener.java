package listeners;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class FinalizarListener implements ActionListener {
	private JFrame ventana;
	
	public FinalizarListener(JFrame ventana){
		this.ventana = ventana;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		ventana.setVisible(false);
		ventana.dispose();
	}
}