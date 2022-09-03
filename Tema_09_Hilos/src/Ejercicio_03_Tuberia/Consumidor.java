package Ejercicio_03_Tuberia;

public class Consumidor extends Thread {
	
	private Tuberia tuberia;	
	private int n;
	
	
	public Consumidor(Tuberia tuberia, int n) {
		this.tuberia = tuberia;
		this.n = n;
		
	}
	
	public void run() {
		char valor = 0;
        for (int i = 0; i < 10; i++) {
        	valor = tuberia.get();
            System.out.println(i + "=>Consumidor" + n 
                               + ": consume: " + valor);
			
			try {
                sleep(400);
            } catch (InterruptedException e) { }	
			
        }
	}

}
