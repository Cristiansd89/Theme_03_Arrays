package Ejemplo_Hilos7;

import java.util.Random;

public class HiloRunnable implements Runnable {

	private static Random lock = new Random();
	private static int cont = 0;
	private  int id;
	
	
	

	public HiloRunnable(int id) {
		this.id = id;
	}
	public void run() {
		synchronized (lock) {
			//Si el identificador es diferente al contador el hilo entrara a dormir
			while(id != cont) {
				try {
					lock.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
					
				}
			}
			System.out.println( " Soy el hilo : " +id);
			cont++;
			//Con esto notificaremos a todos los hilos que despierten
			lock.notifyAll();
		}
		
	}
	public static void main(String[] args) {
		//Este metodo es para ver el numero de hilos que tiene
		//nuestro nucleo
		Runtime runtime =  Runtime.getRuntime();
		
		//Para tranformar el numero de hilos en un dato integer
		int nNucleos = runtime.availableProcessors();
		
		Thread [] hilos = new Thread[nNucleos];
		
		for(int i = 0 ; i < hilos.length; i++) {
			Runnable runable = new HiloRunnable(i);
			hilos[i] = new Thread(runable);
			hilos[i].start();
		}
		
		System.out.println("Es el hilo principal ");
	}

}
