package Ejercicio_11_Tarta_Pila;


public class ClienteConsumidor extends Thread {

	PilaTarta tarta;
	
	public ClienteConsumidor(PilaTarta tarta) {
		this.tarta = tarta;
	}
	
	public void run() {
		
		synchronized (tarta) {
			 for (int i = 0; i  < 10 ;i++) {
				 while(tarta.tartaVacia()) {
					 try {
						 tarta.wait();
					 }catch(Exception e) {
						 System.out.println("Error en el consumidor");
					 }
				 }
				 int aux = tarta.comerTarta();
				 try {
			
					 Thread.sleep(500);
					 System.out.println(" Que dan " +aux+ " porciones");
				 }catch(Exception e) {
					 
				 }
				 
				 
			 }
			 System.out.println(" No queda tarta");
		}
		synchronized (tarta) {
			tarta.notifyAll();
		}
	}
	
	
}
