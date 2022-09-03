package Practica_12_Lavaplatos_Cola;

public class ProductorLavador extends Thread {
	
	ColaFregaplatos maquina;
	
	
	public ProductorLavador(ColaFregaplatos maquina) {
		this.maquina = maquina;
		
	}
	
	
	
	public void  run () {
		
			
		for(int i = 0; i < 10; i++) {

			synchronized(maquina) {
		
				while(maquina.ColaLlena()) {
					
					try{
						maquina.wait();
					}catch(InterruptedException e) {
						
					}
					
				}
				maquina.ponerPlato(i);
				maquina.notifyAll();
				
				
				System.out.println("Ha puesto un plato " +(i+1));
				
				try {
					sleep(300);
				} catch (InterruptedException e) {
					
				}
			}	
		}
			
	}

}
