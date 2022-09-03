package Ejercicio_01;

public class TestHilo {

	public static void main(String[] args) {
		
	
			
			///Primero Creamos un objeto de la clase Hilo
		Hilo h1 = new Hilo("primer hilo");
		Hilo h2 = new Hilo("Segundo hilo");
		
		///Despues Creamos otro objeto de tipo Thread a atraves del que pasamos
		//El primer objeto
		Thread hilo1 = new Thread(h1);
		Thread hilo2 = new Thread(h2);
		
		
		///Arrancamos el hilo
		hilo1.start();
		hilo2.start();
		
		
	}

}
