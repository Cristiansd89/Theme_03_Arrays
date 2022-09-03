package Ejercicio_02;


import java.lang.*;


//Primero creamos una clase Hebra que va a heredar de la interfaz runnable
class  HebraRunnable implements Runnable {
		
	int array[];
	
	public HebraRunnable (int array[]) {
		this.array = array;
	}
	
	///Metodo Burbuja dentro de  la primera clase
	public static void burbuja(int [] Arreglo) {
		
		int aux;
		boolean hayIntercambio = false;
		
		do {
			hayIntercambio = false;
			
			for(int i = 0;i< Arreglo.length -1;i++) {
				if(Arreglo[i] > Arreglo[i+1]) {
					aux =Arreglo[i];
					Arreglo[i] = Arreglo [i+1];
					Arreglo [i+1] = aux;
					hayIntercambio = true;
				}
			}
		}while(hayIntercambio);
	
		for (int i = 0;i< Arreglo.length ;i++) {
			System.out.println(Arreglo[i]);
		}
	}
	
	//El metodo run es el que va a ejercutar el objeto hilo
	public void run() {
		
		burbuja(array);
	}

}



public class HilosRunnable{


	static int Array1 [] = new  int[100];
	static int array2[] = new int[100];
	
	static String id;
	
	public static void  main(String [] args) {
		
		long tiempoInicial;
		
		for(int i = 0; i <Array1.length; i++) {
			Array1[i] = (int)(Math.random()* 100);
		}
		 for (int i = 0; i < array2.length; i++) {
	        array2[i] = (int) (Math.random() * 100);
	        }
		 tiempoInicial = System.currentTimeMillis();
		 
		 HebraRunnable Hr1 = new HebraRunnable(Array1);
		 HebraRunnable Hr2 = new HebraRunnable(array2);
		
		Thread Hilo1 = new Thread(Hr1);
		Thread Hilo2 = new Thread(Hr2);
		
		
		Hilo1.start();
		Hilo2.start();
		
	}
	

	
	
	
	
	
	
}
