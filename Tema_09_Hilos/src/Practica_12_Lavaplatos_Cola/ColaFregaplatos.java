package Practica_12_Lavaplatos_Cola;

public class ColaFregaplatos {

	private int cola [];
	private int inicio;
	private int ultimo;
	private int tamMax;
	
	public ColaFregaplatos() {
		inicio = 0;
		ultimo =0;
		tamMax = 9;
		cola = new int [tamMax];
		
	}
	
	public void ponerPlato(int plato) {
		
		cola[ultimo] = plato;
		ultimo++;
	}
	public int quitarPlato() {
		
		inicio++;
		return cola[inicio-1];
	}
	
	public boolean ColaLlena() {
		return ultimo == tamMax;
	}
	
	
	public boolean ColaVacia() {
		return  inicio == ultimo;
	}
		
	
}
