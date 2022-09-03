package Ejercicio_05_Lavaplatos_cola;

public class Secador extends Thread {
	
	//Atributos
	private Escurridor escurridor;
	private int platosSucios;
	
	//Constructor
	public Secador(Escurridor escurridor) {
		this.escurridor = escurridor;
		platosSucios = 15;
	}
	
	//Arranque del hilo
	public void run() {
		//Creo un bucle for para lavar todos los platos sucios
		synchronized (escurridor) {
		for(int i = 0; i < platosSucios; i++) {
			//Declaro la sección crítica para que el lavador y el secador no puedan usar a la vez el mismo espacio del escurridor
			
				//Si el escurridor (recurso compartido) está vacío, le pido al secador (hilo) que se ponga a la cola hasta que haya platos en el escurridor (rec. compartido) 
				if (escurridor.estaVacio() == true) {	
					try {
						escurridor.wait();
					} catch( InterruptedException e ) {		
					}
				}
				//Si el escurridor no está vacío, ejecuto el método secar
				escurridor.secar();
				//Cuando el plato está seco, el escurridor notifica a sus hilos en espera (en este caso, el lavador) que pueden ejecutarse.
				escurridor.notifyAll();
				System.out.println("Se ha secado el plato "  + (i+1));
				try {
					sleep(500);
				}catch(InterruptedException e) {
				}	
			}
			//Mando a dormir al hilo secador para permitir que los demás hilos se ejecuten, si pueden hacerlo
				
			
		}	
	}	
}