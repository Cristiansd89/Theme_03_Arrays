package Ejemplo_RecursoCompartido_01;

public class TestProceso {

	public static void main(String[] args) {
		///Creo el objeto de tipo pulsador para poder pasarlo como parametro
		Pulsador pulsador = new Pulsador();
		
		Proceso p1 = new Proceso("P1", pulsador);
		Proceso p2 = new Proceso("P2", pulsador);
		Proceso p3 = new Proceso("P3", pulsador);
		Proceso p4 = new Proceso("P4", pulsador);
		
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		
		System.out.println("Estado final del pulsador "+ pulsador.getContador());

	}

}
