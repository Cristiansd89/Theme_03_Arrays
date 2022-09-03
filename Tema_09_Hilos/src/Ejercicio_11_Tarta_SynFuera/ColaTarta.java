package Ejercicio_11_Tarta_SynFuera;

public class ColaTarta {

	
	
	private int tamMax;
	private int primero;
	private int ultimo;
	private int cola [];
	
	
	public ColaTarta() {
		tamMax =10;
		cola = new int [tamMax];
		primero=0;
		ultimo = 0;

	}
	
	
	public void ponerTarta (int porcion) {
		
		cola[primero] = porcion;
		primero++;
		
		
	}
	
	
	public int comerTarta() {
		
		ultimo++;
		int aux =	cola[ultimo];
		return aux;
	}
	
	
	public boolean tartaLlena() {
		return primero == tamMax;
		
		

	}
	
	public boolean noHayTarta() {
		return primero == ultimo+1;
	}
}
