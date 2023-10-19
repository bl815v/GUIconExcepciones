package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.*;
import view.VentanaPrincipal;

public class Controller implements ActionListener{
	
	private VentanaPrincipal vista;
	
	public Controller() {
		vista = new VentanaPrincipal();
		asignarOyentes();
	}
	
	public void asignarOyentes() {
		vista.getPanel().getBotonValidar().addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		int aux2;
		String comando = e.getActionCommand();
		if (comando.equals("VALIDAR")) {
			String aux1 = vista.getPanel().getCnumero().getText();
			try {
				aux2 = Integer.parseInt(aux1);
				Numero num = new Numero(aux2);
				if(num.esPar()) {
				vista.getPanel().getEmostrar().setText("El numero ingresado es PAR");
			}
			else {
				vista.getPanel().getEmostrar().setText("El numero ingresado es IMPAR");
			}
			}catch(NumberFormatException nfe) {
				vista.getPanel().getEmostrar().setText(" ");
				JOptionPane.showMessageDialog(null, "Error. Debe ingresar un numero entero.","Error", JOptionPane.ERROR_MESSAGE);
			}
			
			
			
		}
				
		
	}
	
}