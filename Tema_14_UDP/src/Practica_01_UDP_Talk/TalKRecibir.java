package Practica_01_UDP_Talk;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class TalKRecibir extends Thread{

	
	int puerto;
	int tamMens;
	
	
	public TalKRecibir(int puerto, int tamMens) {
		
		super();
		this.puerto = puerto;
		this.tamMens = tamMens;
	}
	
	public void run() {
		
		try {
			DatagramSocket socket = new DatagramSocket(puerto); //Socket
			byte [] buffer = new byte [tamMens]; // Buffer
			
			DatagramPacket paqueteRecibido = new DatagramPacket(buffer, tamMens); //Flujo de entrada del paquete
			
			socket.receive(paqueteRecibido); // Receptor del paquete
			
			String mensaje = new String (paqueteRecibido.getData());  // Transformamos los bytes en el mensaje
				
		} catch (SocketException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
