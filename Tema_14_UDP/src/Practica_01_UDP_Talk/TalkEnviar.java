package Practica_01_UDP_Talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TalkEnviar extends Thread {
	
	
	Vista vista;
	String mensaje;
	int tamMen;
	InetAddress host;
	
	
	public TalkEnviar(Vista vista) {
		this.vista = vista;
		this.mensaje = mensaje;
		this.host = null;
		this.tamMen = tamMen;
		
	}
	
	
	public void run() {
		
		try {
			DatagramSocket socket = new DatagramSocket(); // Creamos socket
			byte [] buffer = new byte[tamMen]; // Establecemos el tamaño del buffer que vamos a enviar
			InetAddress direccion = InetAddress.getByName(host);  // transformamos el string del ppuerto en un numero de bytes
			DatagramPacket paqueteEnvio = new DatagramPacket(buffer, buffer.length ,direccion,puerto);  //Montaje del paquete de envio
			socket.send(paqueteEnvio); // Envio del paquete
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
}
