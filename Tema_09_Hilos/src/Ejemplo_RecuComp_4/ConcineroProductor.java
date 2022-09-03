package Ejemplo_RecuComp_4;

public class ConcineroProductor extends Thread {
	
	
	private static int tarta;
	private static Mesa mesa;
	
	public ConcineroProductor(Mesa m, int tarta) {
		this.tarta = tarta;
		mesa = m;
	}
	//Productor
	public void run() {
			try {
				//Si la tarta esta ha cero
				if(tarta == 0) {
					//cocina mas tartas
					tarta = 10;
					mesa.put(tarta);
					System.out.println("soy el cocinero y quedan " +tarta);
					 
					 sleep(100);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
}

