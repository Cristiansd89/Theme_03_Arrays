package Ejemplo_RecursoCompartido_01;

import java.util.*;

public class Pulsador  {
	
	private int contador = 0;
	
	public synchronized void click(Proceso proceso) {
		System.out.println(proceso.getNombre()+" Pulsara, actualmente contador vale " +getContador());
		
		
		
		int aux = this.contador;
		try {
			Thread.sleep((int) (Math.random()*100));
		}catch (Exception e) {
			
		}
		aux++;
		this.contador = aux;
		System.out.println(proceso.getNombre() + "Ya pulso");
	}
	public int getContador() {
		return contador;
	}
}
