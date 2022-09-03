package Practica_12_Lavaplatos_Cola;

public class TestCola {

	public static void main(String[] args) {
		
	ColaFregaplatos maquina = new ColaFregaplatos();
	
	ProductorLavador lavador = new ProductorLavador(maquina);
	ConsumidorSecador secador = new ConsumidorSecador(maquina);
	
	lavador.start();
	secador.start();
	
	
	

	}

}
