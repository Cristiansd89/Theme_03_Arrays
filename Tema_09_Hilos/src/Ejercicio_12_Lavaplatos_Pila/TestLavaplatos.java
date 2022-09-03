package Ejercicio_12_Lavaplatos_Pila;

public class TestLavaplatos {

	public static void main(String[] args) {
		
		PilaEscurridor maquina = new PilaEscurridor();
		
		ProductorLavador lavador = new ProductorLavador(maquina);
		ConsumidorSecador secador = new ConsumidorSecador(maquina);
		
		lavador.start();
		secador.start();
				
	}

}
