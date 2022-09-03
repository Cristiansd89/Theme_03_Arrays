package Ejercicio_11_Tarta_02;

public class TestTarta {

	public static void main(String[] args) {
		
		
		PilaTarta porcion = new PilaTarta();
		
		
		ClientesConsumidores clientes = new ClientesConsumidores(porcion);
		ProductorCocinero cocinero = new ProductorCocinero(porcion);
		
		
		clientes.start();
		cocinero.start();
		
		
		
		
	}

}
