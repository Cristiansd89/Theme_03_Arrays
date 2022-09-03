package Ejercicio_12_Lavaplatos_Pila;

public class ProductorLavador extends Thread {

	
	PilaEscurridor maquina;
	
	
	public ProductorLavador (PilaEscurridor maquina) {
		this.maquina = maquina;
		
	}
	
	
	public void run () {
		int plato = 1;
		while(true) {
			
			System.out.println("Se ha puesto  " +plato+ " platos en la maquina");
			maquina.ponerPlato(plato);
			try {
                sleep(300);
            } catch (InterruptedException e) { 
            	}
			
		}
	}
}
