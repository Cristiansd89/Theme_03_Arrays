package Ejercicio_01;

public class Hilo implements Runnable {
	
	private String cadena;
	
	
	public Hilo(String cadena) {
		this.cadena = cadena;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(cadena);
			
			try {
				Thread.sleep((long)(Math.random()*500));
			}catch(InterruptedException ex) {
				
			}
		}
	}
}

