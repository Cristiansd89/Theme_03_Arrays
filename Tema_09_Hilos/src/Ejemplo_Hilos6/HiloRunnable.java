package Ejemplo_Hilos6;

import com.sun.source.tree.SynchronizedTree;

public class HiloRunnable implements Runnable{

	
	
	private static int cont = 0; 
	
	///Este Cerrojo tiene que ser a la fuerza estatico si no no vale para nada
	private static Object lock = new Object();
	
	
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		int nucleos = runtime.availableProcessors();
		
		
		Thread [] hilos = new Thread[nucleos];
		
		for(int i = 0; i< hilos.length; i++) {
			
			Runnable runnable = new HiloRunnable();
			hilos[i] =new Thread(runnable);
			hilos[i].start();
		}
		System.out.println(cont);
	}
	
	@Override
	public void run() {
		
		synchronized(lock){
		
			for (int i = 0; i < 20000; i++) {
				///Vamos a conseguir que los hilos entren de uno en uno cuando haya terminado el primer hilo despertara a todos
				//Y entrara el que mas rapido haya sido volviendo a dormirse el resto
				// y necesariamente tiene que tener un objeto
				
					cont++;
				}
		}
	
	}
	
	
}
