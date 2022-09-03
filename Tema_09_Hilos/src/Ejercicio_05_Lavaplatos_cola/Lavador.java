package Ejercicio_05_Lavaplatos_cola;

public class Lavador extends Thread {

	//Atributos
	private Escurridor escurridor;
	private int platosSucios;
	
	//Constructor
	public Lavador(Escurridor escurridor) {
		this.escurridor = escurridor;
		platosSucios = 15;
	}
	
	//Arranque del hilo
	public void run() {
		//Creo un bucle for para lavar todos los platos sucios
		synchronized (escurridor) {
		for(int i = 0; i < platosSucios; i++) {
			//Declaro la sección crítica para que el lavador y el secador no puedan usar a la vez el mismo espacio del escurridor
			
				//Si el escurridor (recurso compartido) está lleno, le pido al lavador (hilo) que se ponga a la cola del escurridor (rec. compartido) 
				while (escurridor.estaLleno() == true){
					try {
						escurridor.wait();
					} catch( InterruptedException e ) {		
					}
				}
				//Si el escurridor no está lleno, ejecuto el método lavar
				escurridor.lavar(i);
				//Cuando el plato está lavado, el escurridor notifica a sus hilos en espera (en este caso, el secador) que pueden ejecutarse.
				escurridor.notifyAll();
				System.out.println("Se ha lavado el plato "  + (i+1));
				//Mando a dormir al hilo lavador para permitir que los demás hilos se ejecuten, si pueden hacerlo
				try {
					sleep(500);
				}catch(InterruptedException e) {
				}
			}
			
		}	
	}	
}