package Practica_01_UDP_Talk;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.event.AncestorListener;

public class Vista {
	

	
	/*
	 * Declaramos los componentes
	 * 
	 * Siempre se añade el contenedor a la ventana
	 */
	 JFrame ventana; //Declaramos la ventana
	 Container contenedor; //Declaramos el contenedor
	
	
	
	 JPanel panelNort;
	 JPanel panelCent;
	 JPanel panelSur;
	
	 JTextField areaIp;  // Area de Ip o Locahost
	 JTextField areaPEnvio; //area del nick
	 JTextField areaPDestino;
	 JTextArea areaMensajes; // Area donde se comparten los mensajes
	 JTextArea areaEnvio;   // Area desde se envian los mensajes
	
	
	 JLabel etiqueIp;
	 JLabel PuertoEnvio;
	 JLabel etiquetaHost;
	
	 JButton enviar; // boton que envia el mensaje
	
	
	
	/*
	 * Este metodo crea los elementos  que van aparecer en la ventana
	 */
	public void crearElementos() {
		
		ventana = new JFrame("CHAT"); //Crear Ventana
		contenedor = new Container(); // Crear Contenedor
		
		panelNort = new JPanel(); // Crear Paneles
		panelCent = new JPanel();
		panelSur = new JPanel();
		
		
		areaIp = new JTextField(8);  // Crear Areas de texto
		areaPEnvio = new JTextField(8);
		areaPDestino = new JTextField(8);
		areaMensajes = new JTextArea(20,100);
		areaEnvio = new JTextArea(2,30);
		
		
		etiqueIp = new JLabel();
		PuertoEnvio = new JLabel();
		etiquetaHost = new JLabel();
		
		enviar = new JButton("Enviar");
		
		
		
		ventana.setVisible(true); // siempre tiene que estar esto que no se te olvide
		
		
	}
	
	public Vista() {
		crearElementos();
		añadirElementos();
		puertos();
	}
	
	
	
	
	public void añadirElementos() {
		contenedor = ventana.getContentPane();// Te da la referencia del contenedor
		ventana.setSize(500,400); // Tamaño de la ventana
		
		
		etiqueIp.setText("Ip o localhost");
		PuertoEnvio.setText("Puerto Envio ");
		etiquetaHost.setText("Puerto");
		
		panelNort.add(etiqueIp);
		panelNort.add(areaIp);
		panelNort.add(PuertoEnvio);
		panelNort.add(areaPEnvio);
		panelNort.add(etiquetaHost);
		panelNort.add(areaPDestino);
		
		panelCent.add(areaMensajes);
		
		panelSur.add(areaEnvio);
		
	
		
		
		panelSur.add(enviar);
		
		
		
		contenedor.add(panelNort, BorderLayout.NORTH);
		contenedor.add(panelCent, BorderLayout.CENTER);
		contenedor.add(panelSur,BorderLayout.SOUTH);
		
		
		
	}
	
	public void puertos() {
		String destino = areaPDestino.getText();
		int numDestino = Integer.valueOf(destino);
		
		String origen = areaEnvio.getText();
		int numOrigen = Integer.valueOf(origen);
		
	}
	/*
	 * /**
	 * Creo un metodo controlador que va ser el que interactue entre 
	 * las demas clases
	 * @param controlador
	 */
	 
	
	
	public void controlador(Controlador controlador) {
		/*
		 * Al boton enviar le paso el controlador
		 */
		enviar.addActionListener(controlador);
	}
	
	
	
	

	
	
	
	
		
}

	
	
	
	
	









