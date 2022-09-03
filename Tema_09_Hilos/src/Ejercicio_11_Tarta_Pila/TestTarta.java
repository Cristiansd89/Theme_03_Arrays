package Ejercicio_11_Tarta_Pila;

public class TestTarta {

	public static void main(String[] args) {
		
		PilaTarta tarta = new PilaTarta();
		
		ProductorCocinero cocinero = new ProductorCocinero(tarta);
		ClienteConsumidor cliente = new ClienteConsumidor(tarta);
		
		cocinero.start();
		cliente.start();
	

	}

}
