package Ejemplo_RecursoCompartido_02;

public class TestCajero {

	public static void main(String[] args) {
		
		CajeroAutomatico cajero = new CajeroAutomatico();
		
		Thread hilo =new Thread(cajero,"pepito");
		Thread hilo2 = new Thread(cajero,"Juan");
		
		
		hilo.start();
		hilo2.start();
		
		
		

	}

}
