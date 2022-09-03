package Ejemplo_Hilos4;

public class Hilo extends Thread{
	private int id;
		
	public static void main(String[] args) {
			System.out.println("Hilo principal");
			Hilo h1 = new Hilo (1);
			Hilo h2 = new Hilo (2);
			Hilo h3 = new Hilo (3);
			
			
			//Con el metodo star Lanzamos los hilos
			h1.start();
			h2.start();
			h3.start();

	}
	public Hilo(int id) {
		this.id= id;
	}
	
	
	public void run() {
		System.out.println("Este es el hilo " +id );
	}

}
