package Ejercicio_12_Lavaplatos_Pila;

public class ConsumidorSecador extends Thread {
	
	PilaEscurridor maquina;
	
	
	public ConsumidorSecador (PilaEscurridor maquina) {
		this.maquina = maquina;
	}
	
	
	
	public void run () {
		
		while(true) {
			
			int aux = maquina.secarPlato();
			
			System.out.println(" Seca " +aux+ " plato");
			try {
                sleep(300);
            } catch (InterruptedException e) { 
            	}
            }
		}
		
		
}


