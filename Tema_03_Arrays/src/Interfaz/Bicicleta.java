package Interfaz;

public class Bicicleta implements Rueda,Silla {
	@Override
	public void avanzar(){
		System.out.println("La Bicicleta avanza");
		
	}
	@Override
	public void detenerse() {
		System.out.println("La Bicicleta se detiene");
		
	}
	@Override
	public void sentarse () {
		System.out.println("El conductor esta Sentado :");
	}

}
