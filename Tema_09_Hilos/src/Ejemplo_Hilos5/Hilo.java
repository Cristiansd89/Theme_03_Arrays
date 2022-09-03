package Ejemplo_Hilos5;

public class Hilo extends Thread {
	
	
	private int id ;
	private static int tamMax = 5;
	
	public static void main(String[] args) {
		
		
		//Declaramos el Array con el que vamos a tirar hilos
		Hilo [] hiloArray = new Hilo[tamMax];
		
		//El primer Array es para inicializar los hilos
		for(int i =0; i< hiloArray.length;i++) {
			hiloArray[i] = new Hilo(i);
		}
		
		//Este segundo Array es el que va lanzar los hilos
		for(int i = 0;i<hiloArray.length; i++) {
			hiloArray[i].start();
		}
		System.out.println("Hilo pricipal");
	}
	public Hilo(int id) {
		this.id = id;
		
	}
	//Este metodo es el que van a ejecutar los hilos
	public void run() {
		System.out.println("Soy el hilo "+id);
	}
}
