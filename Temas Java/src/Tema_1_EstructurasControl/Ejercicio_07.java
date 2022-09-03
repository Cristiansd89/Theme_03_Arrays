package Tema_1_EstructurasControl;



import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		String frase;
		String opcion;
		
		boolean salir = false;
		do {
			
			frase = pideFrase();
			System.out.println(frase);
			System.out.println(" ");
			System.out.println("Desea Continuar  S/N");
			opcion =  ent.nextLine();
			
			if(opcion.equalsIgnoreCase("N")) {
			salir = true;
			}
			
			
			
		}while(!salir);
		System.out.println("Fin del Programa :");
	}

		
	public static String pideFrase() {
		
		Scanner ent = new Scanner(System.in);
		System.out.println("Introduce frase :");
		String Frase = ent.nextLine();
		return Frase;
		
		
	}

}
