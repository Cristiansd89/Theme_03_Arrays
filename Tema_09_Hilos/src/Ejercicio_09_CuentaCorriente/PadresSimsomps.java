package Ejercicio_09_CuentaCorriente;

import java.text.DecimalFormat;

public class PadresSimsomps extends Thread {
	
	String nombre;
	double dinero;
	Cajero cajero;
	
	
	
	
	public PadresSimsomps(String nombre, Cajero cajero) {
		this.nombre = nombre;
		this.cajero = cajero;
		this.dinero = (double) Math.random() *500;
		
	}
	
	
	public synchronized void run() {
		try {
			for(int i = 0; i<5;i++) {
				cajero.ingrasarPasta(dinero, nombre);
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
			System.out.println("Error en el hilos productor ");
		}
	}

}
