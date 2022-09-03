package Ejercicio_02;


import java.lang.*;

public class HilosThread {
	
	static int [] array1 = new int [100];
	
	static int [] array2 = new int [100];
	
	public static void main(String []args) {
			
		   long tiempoInicial;
		
			for(int i = 0; i < array1.length; i++) {
				array1[i] = (int)(Math.random() * 100);
			}
			
			for(int i = 0; i < array2.length; i++) {
				array2[i] = (int)(Math.random() * 100);
			}
			///Creamo el objeto clase Hilo(es un hilo)
			Hebra h1 = new Hebra(array1);
			Hebra h2 = new Hebra(array2);
			
			 tiempoInicial = System.currentTimeMillis();
			//Lanzamos el hilo con el metodo star();
			h1.start();
			h2.start();
			
		System.out.println("Tiempo de ejecuci�n: " + (System.currentTimeMillis() - tiempoInicial) + " ms");
		}
	
	
}

	class Hebra extends Thread {
	
		int array[];
		
		public Hebra (int array[]) {
			this.array = array;
		}

	
	
	public void run() {
		burbuja(array);
		
		}
	
	
	public static void burbuja(int[] Arreglo) {
		
		
		boolean hayIntercambio = false;
		do {
			hayIntercambio = false;
			
			for (int i= 0; i < Arreglo.length -1;i++) {
				
				if(Arreglo[i]> Arreglo [i+1]) {
					int aux = Arreglo[i];
					Arreglo[i] = Arreglo[i+1];
					Arreglo[i+1] =aux;
					hayIntercambio = true;
							
				}
			}
			
	
		}while(hayIntercambio);
		
		for(int i = 0; i < Arreglo.length;i++) {
			System.out.println(Arreglo[i] + "\t");
		}
		
	}
	
}
