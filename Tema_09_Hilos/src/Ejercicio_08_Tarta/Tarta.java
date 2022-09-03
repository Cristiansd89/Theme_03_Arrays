package Ejercicio_08_Tarta;

public class Tarta implements Runnable{
	
	private boolean consumidor;
	private static int tarta = 0;
	private static Object lock;

	public static void main(String[] args) {
		
		int numHilos = 11;
		
		//Declaramos un Array con el numeros maximo de hilos 11
		Thread [] hilos = new Thread[numHilos]; 
		
		//El es para empezar a iterar los hilos
		for(int i = 0; i< hilos.length;i++) {
			Runnable runnable = null;
			if (i !=0) {
				
				runnable = new Tarta(true);
			}else {
				runnable = new Tarta(false);
			}
			//Vamos creando hilos del 1 al 11
			hilos[i] = new Thread(runnable);
			//Va lanzando hilos
			hilos[i].start();
		}
		for(int i = 0; i< hilos.length;i++) {
			try {
				//Para ir ordenando los hilos
				hilos[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	
	public Tarta (boolean consumidor) {
		this.consumidor = consumidor;
		
	}
	
	
	@Override
	public  void run() {
		while(true) {
			if(consumidor) {
				//Metodo consumidor
				Comiendo();
			}else {
				//Metodo productor
				cocinando();
			}
		}
	}

	//Metodo Consumidor
	private void Comiendo() {
		if(tarta > 0) {
			tarta--;
			System.out.println("Quedan "+tarta+ " porciones de tarta");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			//Si no queda tarta despertaremos a todos los hilos para que alguno entre
			//Metodo del cocinero
			lock.notifyAll();
			try {
				//Y ese mismo hilo se ira a dormir
				lock.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		}
		
	}
	//Metodo Productor
	private void cocinando() {
		//Si la tarta es 0 entrara cambiando la variable y despertando al reto de hilos
		synchronized (lock) {
			if(tarta == 0) {
				tarta = 10;
				System.out.println("Soy el cocinero y quedan" +tarta+ " tartas");
				lock.notifyAll();
			}
			try {
				lock.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	

}
