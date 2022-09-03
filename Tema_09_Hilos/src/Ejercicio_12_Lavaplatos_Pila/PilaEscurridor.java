package Ejercicio_12_Lavaplatos_Pila;

public class PilaEscurridor  {
	
	private int escurridor[];
	private int tamMax;
	private int cima;
	private boolean escurridorLleno;
	private boolean escurridorVacio;

	
	public PilaEscurridor() {
		tamMax = 10;
		escurridor = new int [tamMax];
		cima = 0;
		escurridorLleno = false;
		escurridorVacio = true;
		
	}
	
	
	public synchronized void ponerPlato (int plato) {
		
		while(escurridorLleno) { // Comprueba la condicion  si el escurridor esta lleno
			try {
				wait();
			}catch(Exception e) {
				
			}
		}
		
		escurridor[cima] = plato;
		cima++;
		
		
		if(cima == tamMax) { // Si esta lleno  cambia a true
			escurridorLleno = true;
		}
		escurridorVacio = false; // como el escurridor esta lleno pasamos a false  que este vacio
		notifyAll();
		
		
	}
	public synchronized  int secarPlato () {
		
		while (escurridorVacio) {
			try {
				wait();
			}catch(Exception e) {
			}
		}

		cima--;
		if (cima == 0) {
			escurridorVacio = true;
			
		}
		escurridorLleno = false;
		notifyAll();
		 return escurridor[cima];
	}
	
}
