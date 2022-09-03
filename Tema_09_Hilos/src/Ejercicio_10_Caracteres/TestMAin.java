package Ejercicio_10_Caracteres;

public class TestMAin {

	public static void main(String[] args) {
		
		Pila pila = new Pila();
		
		Productor pr = new Productor(pila);
		Consumidor cs = new Consumidor (pila);
		
		for (int i = 1; i < 11 ; i++){
		pr.run(i);
		
		cs.run(i);
		
        } 

	}

}
