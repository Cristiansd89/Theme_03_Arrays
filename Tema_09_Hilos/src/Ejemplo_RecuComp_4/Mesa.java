package Ejemplo_RecuComp_4;

public class Mesa {
	
	private int numero;
	boolean siHayPorciones = true;

	//Si hay porciones
	public synchronized int get() {
		while(siHayPorciones==false) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}
		siHayPorciones = false;
		notifyAll();
		return numero;
	}
	//No hay Porciones
	public synchronized void put(int porciones) {
		while(siHayPorciones == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			numero = porciones;
			siHayPorciones = true;
			notifyAll();
			
		}
	}
}
