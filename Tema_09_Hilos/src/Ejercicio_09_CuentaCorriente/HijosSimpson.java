package Ejercicio_09_CuentaCorriente;

public class HijosSimpson extends Thread{

	
	String nombre;
	double dinero;
	Cajero cajero;
	
	
	public HijosSimpson(String nombre,Cajero cajero) {
		
		this.nombre = nombre;
		this.cajero = cajero;
		this.dinero = (double) Math.random() *100;
		
	}
	
	
	public synchronized void run() {
		try {
			for(int i= 0;i< 10;i++) {
				cajero.retirarPasta(dinero, nombre);
				Thread.sleep(2000);
			}
			
		} catch (Exception e) {
			System.out.println("Error en el hilos productor ");
		}
	}

}

