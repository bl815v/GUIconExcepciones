package view;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class PanelPrincipal extends JPanel{
	
	private JLabel etitulo, enumero, eresultado, emostrar;
	private JTextField cnumero;
	private JButton botonValidar;
	
	public PanelPrincipal() {
		setLayout(null);
		
		inicializarComponentes();
		
		setVisible(true);
	}

	public void inicializarComponentes() {
		etitulo = new JLabel("DETERMINA SI UN NUMERO ES PAR O IMPAR");
		Font fuenteNueva = new Font("arial", Font.BOLD, 20);
		etitulo.setFont(fuenteNueva);
		etitulo.setForeground(Color.DARK_GRAY);
		etitulo.setBounds(120,50,670,30);
		add(etitulo);
		
		enumero = new JLabel("Numero: ");
		enumero.setBounds(100,200,200,30);
		add(enumero);
		
		eresultado = new JLabel("Resultado: ");
		eresultado.setBounds(100,300,200,30);
		add(eresultado);
		
		emostrar = new JLabel();
		emostrar.setBounds(250,350,300,30);
		add(emostrar);
		
		cnumero = new JTextField();
		cnumero.setBounds(300,200,100,30);
		cnumero.setHorizontalAlignment(JTextField.CENTER);
		add(cnumero);
		
		botonValidar = new JButton("Validar");
		botonValidar.setBackground(Color.black);
		botonValidar.setForeground(Color.white);
		botonValidar.setBounds(480,200,100,30);
		botonValidar.setActionCommand("VALIDAR");
		add(botonValidar);
		
	
	}

	public JLabel getEtitulo() {
		return etitulo;
	}

	public void setEtitulo(JLabel etitulo) {
		this.etitulo = etitulo;
	}

	public JLabel getEnumero() {
		return enumero;
	}

	public void setEnumero(JLabel enumero) {
		this.enumero = enumero;
	}

	public JLabel getEresultado() {
		return eresultado;
	}

	public void setEresultado(JLabel eresultado) {
		this.eresultado = eresultado;
	}

	public JLabel getEmostrar() {
		return emostrar;
	}

	public void setEmostrar(JLabel emostrar) {
		this.emostrar = emostrar;
	}

	public JTextField getCnumero() {
		return cnumero;
	}

	public void setCnumero(JTextField cnumero) {
		this.cnumero = cnumero;
	}

	public JButton getBotonValidar() {
		return botonValidar;
	}

	public void setBotonValidar(JButton botonValidar) {
		this.botonValidar = botonValidar;
	}
	
}
