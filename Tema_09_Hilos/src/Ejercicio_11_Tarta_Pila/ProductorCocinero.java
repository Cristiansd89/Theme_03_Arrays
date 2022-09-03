package Ejercicio_11_Tarta_Pila;

public class ProductorCocinero extends Thread {
	
	
	PilaTarta tarta;
	
	
	public ProductorCocinero (PilaTarta tarta) {
		this.tarta = tarta;
	}
	
	
	public void run () {
		
		synchronized (tarta) {
			
			for(int i = 0; i < 10; i++) {
				
			while(tarta.tartaLlena()) {
				try {
					tarta.wait();
				}catch(Exception e) {
					System.out.println("Error en el productor");

				}
			}
			try {
				tarta.ponerTarta(i);
				Thread.sleep(500);
			}catch(Exception e) {
				
			}
			
			
		}
			
			
			
	}
		System.out.println("El cocinero ha puesto tarta");
		synchronized (tarta) {
			tarta.notifyAll();
		}

	}
}
