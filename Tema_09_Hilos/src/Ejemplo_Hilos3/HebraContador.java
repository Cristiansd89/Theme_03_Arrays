package Ejemplo_Hilos3;

import java.lang.Thread;



public class HebraContador extends Thread {
	
	
	private int contador = 10;
	private static int hebras = 0;
	
	public HebraContador() {
		super("Hebra" + hebras++);
	}
	
	public String toString() {
		
		return getName() + ": " +contador;
		//Ejecucion de la Hebra
	
	}
	
	
	//Este es es el metodo que va ir disminuyendo el contador uno a uno
	public void run() {
		while(contador >0) {
			System.out.println(this);
			contador--;
		}
	}
	
	
}
