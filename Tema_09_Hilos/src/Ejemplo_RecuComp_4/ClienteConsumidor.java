package Ejemplo_RecuComp_4;

public class ClienteConsumidor extends Thread {
	
	private static int tarta;
	private static Mesa mesa;
	
	public ClienteConsumidor(Mesa m,int tarta) {
		this.tarta = tarta;
		mesa = m;
		
	}
	
	public void run() {
		int porciones = 0;
			try {
				 while(tarta > 0) {
					 tarta--;
					 porciones = mesa.get();
					 System.out.println("Lo clientes se han comido " +tarta+  "Tarta"); 
					 sleep(1000);
				 }

			}catch (Exception e) {
			
			}

		}
		
	}
	



