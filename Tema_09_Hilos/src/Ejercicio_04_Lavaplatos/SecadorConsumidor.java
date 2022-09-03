package Ejercicio_04_Lavaplatos;

public class SecadorConsumidor extends Thread {
	
	private MaquinaLavaPlatos maquina;
	private int n;
	
	public SecadorConsumidor(MaquinaLavaPlatos maquina,int n) {
		this.maquina = maquina;
		this.n = n;
	}
	public void run() {
		int plato;
		
		for (int i =0; i< 10; i++) {
			plato = maquina.quitaPlatos();
			System.out.println("Has secado " +plato);
			try {
                sleep(300);
            } catch (InterruptedException e) { }	
			
        }
		}
		
		
	}

