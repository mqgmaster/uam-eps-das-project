package listeners;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;

import autoevaluacion.Pantalla;
import autoevaluacion.PantallaEjercicios;

public class SiguientePantallaListener implements ActionListener {

	private JPanel baraja;
	private CardLayout layout;
	private String destino;
	private PantallaEjercicios pantalla;

	public SiguientePantallaListener(JPanel pantallas, String destino, PantallaEjercicios pantalla) {
		this.baraja = pantallas;
		this.layout = (CardLayout)pantallas.getLayout();
		this.destino = destino;
		this.pantalla = pantalla;
	}
	
	public SiguientePantallaListener(JPanel pantallas, String destino) {
		this.baraja = pantallas;
		this.layout = (CardLayout)pantallas.getLayout();
		this.destino = destino;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(pantalla.getLastAnswered().isCorrect()) {
			layout.show(baraja, destino);
		} else {
			pantalla.show();
		}
		
	}
}