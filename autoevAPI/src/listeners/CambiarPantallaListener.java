package listeners;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import autoevaluacion.Pantalla;

public class CambiarPantallaListener implements ActionListener {

	private JPanel baraja;
	private CardLayout layout;
	private String destino;
	private Pantalla pantalla;

	public CambiarPantallaListener(JPanel pantallas, String destino, Pantalla pantalla) {
		this.baraja = pantallas;
		this.layout = (CardLayout)pantallas.getLayout();
		this.destino = destino;
		this.pantalla = pantalla;
	}
	
	public CambiarPantallaListener(JPanel pantallas, String destino) {
		this.baraja = pantallas;
		this.layout = (CardLayout)pantallas.getLayout();
		this.destino = destino;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (pantalla != null) {
			baraja.add(pantalla.create(),destino);
		}
		layout.show(baraja, destino);
	}
}