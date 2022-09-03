package Ejemplo_RecuComp_4;

public class TestTarta {

	public static void main(String[] args) {
			Mesa mesa = new Mesa();
			
			ConcineroProductor cocinero = new ConcineroProductor(mesa,0);
			ClienteConsumidor Cliente = new ClienteConsumidor(mesa, 0);
			
			cocinero.start();
			Cliente.start();

	}

}
