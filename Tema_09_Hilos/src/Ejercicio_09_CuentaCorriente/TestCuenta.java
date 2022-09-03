package Ejercicio_09_CuentaCorriente;

public class TestCuenta {

	public static void main(String[] args) {
		Cajero cajero = new Cajero();
		
		
		PadresSimsomps hilo1 = new PadresSimsomps("Homer", cajero);
		PadresSimsomps hilo2 = new PadresSimsomps("Marge simpson", cajero);
		
		
		HijosSimpson hilo3 = new HijosSimpson("Lisa", cajero);
		HijosSimpson hilo4 = new HijosSimpson("Bart", cajero);
		HijosSimpson hilo5 = new HijosSimpson("Magie", cajero);
		
		hilo1.start();
		hilo2.start();
		hilo3.start();
		hilo4.start();
		hilo5.start();
	}

}
