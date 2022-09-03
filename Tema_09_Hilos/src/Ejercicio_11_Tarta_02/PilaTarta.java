package Ejercicio_11_Tarta_02;

public class PilaTarta {

	int [] tarta;
	int tamMax;
	int cima;
	
	boolean tartaLlena;
	boolean NoHayTarta;
	
	
	public PilaTarta () {
		tamMax = 10;
		tarta = new int [tamMax];
		tartaLlena = false;
		NoHayTarta = true;
		cima = 0;
		
	}
	
	
	public synchronized void reponerTarta(int porcion) {
		
		while(tartaLlena) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}
		}
		 tarta[cima] = porcion;
		 cima++;
		
		
		if(cima == tamMax) {
			tartaLlena = true;
		}
		NoHayTarta =false;
		notifyAll();
	}
	
	public synchronized int  comerTarta() {
		
		
		while(NoHayTarta) {
			try {
				wait();
			}catch(InterruptedException e) {
				
			}	
		}
		
		cima--;
		int aux = tarta[cima];
		if(cima == 0) {
			NoHayTarta = true;
		}
		tartaLlena= false;
		notifyAll();
		 
		return aux;
		
	

	}
	
	
}
