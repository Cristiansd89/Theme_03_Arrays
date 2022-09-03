package Ejercicio_04_Lavaplatos;

public class TestEscurridor {

	public static void main(String[] args) {
		MaquinaLavaPlatos maquina = new MaquinaLavaPlatos();
		
		
		LavadorProductor l1 = new LavadorProductor (maquina,1);
		SecadorConsumidor s2 = new SecadorConsumidor(maquina, 1);
		
		
		l1.start();
		s2.start();
	}

}
