package Ejercicio_11_Tarta_02;


public class ProductorCocinero extends Thread {
	
	PilaTarta porcion;
	

	public ProductorCocinero(PilaTarta porcion) {
		this.porcion = porcion;
		
	}
	
	
	public synchronized void run() {
		int trozo =1;
		
		for(int i = 0; i < 10; i++) {
			
			System.out.println("Cocinero pongo la porcion : "  +trozo);
			porcion.reponerTarta(trozo);
			trozo++;
			try {
				sleep(300);
			}catch(InterruptedException e) {
				
			}
		
		}
		notifyAll();
		System.out.println("El cocinero ha a puesto tarta");
		
	}
	
}
