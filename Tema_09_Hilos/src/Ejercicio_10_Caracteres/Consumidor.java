package Ejercicio_10_Caracteres;

public class Consumidor {
	private Pila pila;

    public Consumidor (Pila pila){
		this.pila = pila;
	}

	public void run (int i){
	        char c;
			c = pila.sacar();
			
		   System.out.println("Consumidor "+i+": "+c);
		   }

}
