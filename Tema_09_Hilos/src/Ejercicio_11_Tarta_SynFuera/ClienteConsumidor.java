package Ejercicio_11_Tarta_SynFuera;

public class ClienteConsumidor extends Thread {

	
		ColaTarta tarta;
		
		public ClienteConsumidor(ColaTarta tarta) {
			
			this.tarta = tarta;
	
		}
		public void run() {
			
			
			synchronized (tarta) {
				
				
			for(int i = 0; i<= 10; i++) {	
				
			while(tarta.noHayTarta()) {
				
					try {
						tarta.wait();
					}catch(Exception e) {
						System.out.println(" Error en el productor");
					}
				}
				int aux =tarta.comerTarta();
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
				System.out.println("Se han comido " +aux+ " Porcion de tarta");
			}
			
			
			System.out.println(" No queda tarta");
			tarta.notifyAll();
				
				
				
			}
			
			
			
			
		}
}
