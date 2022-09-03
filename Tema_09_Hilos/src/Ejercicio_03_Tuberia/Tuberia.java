package Ejercicio_03_Tuberia;

//Pila
public class Tuberia {
	
	final int tMax;
	private char [] bufer ;
	int siguiente;
	boolean estaLlena;
	boolean estaVacia;
	
	
	public Tuberia() {
		tMax =6;
		bufer = new char[tMax];
		siguiente = 0;
		estaLlena = false;
		estaVacia = true;
		
	}
	/*
	 * Si la pila esta vacia entrara a esperar
	 */
	public synchronized char get() {
		//Si la pila esta vacia
		while(estaVacia) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		//Introduce en la posicion del array
		//la letra
		siguiente--;
		if(siguiente == 0) {
			estaVacia = true;
		}
		estaLlena = false;
		notifyAll();
		return bufer[siguiente];
	}
	//Con synchronized solo puede entrar un hilo a la vez en este metodo
	//Una vez dentro mientras este lleno dormira el hilo
	public synchronized void set(char letra) {
		///Si esta lleno el hilo que entre en este metodo se echara a dormir
		//Hasta que haya espacio
		while (estaLlena) {
			try {
				wait();
			} catch ( InterruptedException e) {
				// TODO: handle exception
			}
		}
		bufer[siguiente] = letra;
		siguiente++;
		//Si siguiente es igual que el numero maximo 
		//la pila esta llena
		if (siguiente == tMax) {
			estaLlena = true;
		}
		estaVacia = false;
		notifyAll();
	}
	
	
	
	
	

}
