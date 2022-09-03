package Practica_12_Lavaplatos_Cola;

public class ConsumidorSecador extends Thread {
	
	
	ColaFregaplatos maquina;
	
	
	public ConsumidorSecador(ColaFregaplatos maquina) {
		this.maquina = maquina;
	}
	

	
	public void run() {
		
		synchronized (maquina) {
		for(int i = 0; i < 10 ; i++) {
			
				while(maquina.ColaVacia()) {
					
					try
					{
						maquina.wait();
					}catch (InterruptedException e) {
					}
				}
				
				 maquina.quitarPlato();
				 maquina.notifyAll();
				
			
				
				System.out.println("Seca un plato"+i);
				try{
					sleep(300);
				}catch (InterruptedException e) {
					
				}
				
			}
			
		}
		
	}

}
