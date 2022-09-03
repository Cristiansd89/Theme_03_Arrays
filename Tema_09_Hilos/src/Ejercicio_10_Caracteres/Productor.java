package Ejercicio_10_Caracteres;

import java.util.Random;

public class Productor {
	private Pila pila;
	private String alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	private char c;
	
	private Random random = new Random();
	
	
	public Productor (Pila pila, int cant, int ms){
		this.pila = pila;
	
	}
	
	public Productor (Pila p){
		this.pila = p;
	}
	
	public void run (int i){
		
			c = alfabeto.charAt(random.nextInt(26));
			System.out.println("Productor "+i+": "+c);
			pila.poner(c);
		
	}
}
