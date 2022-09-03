package Ejercicio_11_Tarta_02;



public class ClientesConsumidores extends Thread{

	PilaTarta porcion;
	
	public ClientesConsumidores(PilaTarta porcion) {
		
		this.porcion = porcion;
	}
	
	
	
	public  void run() {

		for(int i = 10 ;i > 0; i--) {
					
					
			int aux =porcion.comerTarta();
			System.out.println("Consumidor he consumido la porcion: " + aux);
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				System.out.println("No queda tarta ");
		
			}
			
			
			}

		}
	}

