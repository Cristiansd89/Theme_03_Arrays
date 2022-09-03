package Ejercicio_04_Lavaplatos;

public class LavadorProductor extends Thread {

	private MaquinaLavaPlatos maquina = new MaquinaLavaPlatos();
	
	private int n ;
	
	public LavadorProductor (MaquinaLavaPlatos maquina,int n) {
		this.maquina = maquina;
		this.n = n;
	}
	
	public void run() {
		int plato = 1;
		for(int i = 0 ; i< 10; i++) {
			System.out.println("Se ha puesto  " +plato+ " platos en la maquina");
			maquina.ponPlato(plato);
			try {
				sleep(300);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			
		}
		
	}
	
	
	
}
