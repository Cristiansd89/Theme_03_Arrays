package Ejercicio_11_Tarta_Pila;

public class PilaTarta {

	private int tarta [];
	private int tamMax;
	private int cima ;
	
	
	
	public PilaTarta() {
		tamMax = 10;
		tarta = new  int [tamMax];
		cima = 0;
	}
	
	
	
	public void ponerTarta(int porcion) {
		
		tarta[cima] = porcion;
		cima++;
		
	}
	
	public int comerTarta() {
		
		int aux =tarta[cima-1];
		cima--;
		return aux;
	}
	
	
	
	public boolean tartaLlena() {
		return cima == tamMax;
		
	}
	
	
	public boolean tartaVacia() {
		return cima == 0;
		
	}
	
	
}
