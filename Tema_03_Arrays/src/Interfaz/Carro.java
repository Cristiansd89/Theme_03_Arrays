package Interfaz;

public class Carro implements Rueda {
	
	public Carro() {
		
	}
	//una vez que has creado la interfaz tienes que implementar los metodos
	@Override
	public void avanzar() {
		System.out.println("El carro avanza");
	}
	@Override
	public void detenerse() {
		System.out.println("El carro  se deteniene");
	}
}
