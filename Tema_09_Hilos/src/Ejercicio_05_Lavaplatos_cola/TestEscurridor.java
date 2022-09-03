package Ejercicio_05_Lavaplatos_cola;

public class TestEscurridor {

	public static void main(String[] args) {
		//Declaros los objetos que necesito: el recurso compartido (escurridor) y los hilos (lavador y secador).
		Escurridor escurridor = new Escurridor();
		Lavador lavador = new Lavador(escurridor);
		Secador secador = new Secador(escurridor);
		
		//Arranco los hilos
		lavador.start();
		secador.start();
	}

}
