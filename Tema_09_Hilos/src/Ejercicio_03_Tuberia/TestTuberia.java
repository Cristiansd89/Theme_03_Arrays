package Ejercicio_03_Tuberia;

public class TestTuberia {

	public static void main(String[] args) {
		Tuberia tuberia = new Tuberia();
		
		Productor p1 = new Productor(tuberia, 1);
		Consumidor c1 = new Consumidor(tuberia, 1);
		
		p1.start();
		c1.start();
		
	
	}

}
