package view;

import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame{
	
	private PanelPrincipal panel;
	
	public VentanaPrincipal() {
		setTitle("Interfaz Grafica 1");
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.gray);
		getContentPane().setLayout(null);
		
		inicializarComponentes();
		
		setResizable(false);
		setLocationRelativeTo(null); //begin in the middle of the screen
		setVisible(true);
	}
	
	public void inicializarComponentes() {
		panel = new PanelPrincipal();
		panel.setBounds(25,25,750,510); // first 2 of location, final 2 of weight of the panel //735 for windows
		getContentPane().add(panel);
	}

	public PanelPrincipal getPanel() {
		return panel;
	}

	public void setPanel(PanelPrincipal panel) {
		this.panel = panel;
	}
}
