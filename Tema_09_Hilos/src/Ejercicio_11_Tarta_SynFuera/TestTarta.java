package Ejercicio_11_Tarta_SynFuera;

public class TestTarta {

	public static void main(String[] args) {
		
			ColaTarta tarta = new ColaTarta();
			
			
			ProductorCocinero cocinero = new ProductorCocinero(tarta);
			
			ClienteConsumidor cliente = new ClienteConsumidor(tarta);
			
			
			cocinero.start();
			cliente.start();
	}

}
