package Excepciones;

public class Ejemplo_01 {

	public static void main(String[] args) {
		//Declaramos e instanciamos un Arrays
		/*El codigo donde se puede producir un error vamos a encerrar 
		 * dentro de una estructura tray catch */
		try {
			double Array[];
			
			Array = new double [1000000000];
			
		}
		catch (OutOfMemoryError Error) {
		System.err.println("Memoria insuficiente");
		}
		
	}

}
