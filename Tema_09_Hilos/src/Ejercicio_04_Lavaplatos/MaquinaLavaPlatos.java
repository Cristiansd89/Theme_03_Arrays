package Ejercicio_04_Lavaplatos;

public class MaquinaLavaPlatos extends Thread {
	
	private final int tMAx;
	private int [] maquina;
	private int cima;
	private int plato;
	boolean estaLlena;
	boolean estaVacia;
	
	 
	public MaquinaLavaPlatos() {
		tMAx = 2;
		maquina = new int[tMAx];
		plato = 1;
		cima = 0;
		estaLlena = false;
		estaVacia = true;
		
		
	}
	//Metodo para introducir platos
	public synchronized  void ponPlato(int plato) {
		while(estaLlena) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		
		maquina[cima] = plato;
		cima++;
		
		if(cima == tMAx) {
			estaLlena = true;
				
		}
		estaVacia= false;
		notifyAll();
	}
	//Metodo para sacarPlatos
	//Esto es una cola primero en entrar primero en salir
	public synchronized int quitaPlatos() {
		while (estaVacia) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
		}
		cima--;
		if(cima == 0) {
			estaVacia = true;
			;
			
		}
		return maquina[cima];
	}
	
}

