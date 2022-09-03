package Ejercicio_10_Caracteres;

import java.util.Stack;

public class Pila {
	Stack <Character> pila = new Stack<Character>();
	private char c;
	
	public synchronized  char sacar(){
		
		if(pila.size()==0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
		c = pila.remove(0);
		notify();

		return c;
	}	
	
	public synchronized char poner(char c){	
		if (pila.size()!=0){
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		pila.add(c);
	    notify();
		
		return c;

	}
}
