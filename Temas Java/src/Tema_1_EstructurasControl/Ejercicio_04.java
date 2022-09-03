package Tema_1_EstructurasControl;

import java.util.Scanner;


/*
 * Convierte las calificaciones alfabeticas en numericas I,F,B,N
 * 
 */
public class Ejercicio_04 {

	///Metodo principal
	public static void main(String[] args) {
		String nota = pideNota();
		mostrarNota(nota);

	}
	//Metodo estatico que solicita la nota en forma de cadena
	public static String pideNota() {
		Scanner ent = new Scanner(System.in);
		String nota;
		System.out.println("Introduce una letra I,F,N,S   :");
		return nota = ent.nextLine();
		
			
	}
	//7Metodo que muestra la nota
	public static void mostrarNota(String nota) {
			
		
		if(nota.equals("I") | nota.equals("F") |  nota.equals("N") | nota.equals("S") ) {
			switch(nota) {
			case "I" :
				System.out.println("4");
				break;
				
			case "F" :
					System.out.println("5");
					break;
					
			case "B" :
					System.out.println("6");
					break;
					
			case "N" :
					System.out.println("6");
					break;
					
			case "S" :
					System.out.println("7");
					break;		
			}	
					
		}else {

			System.out.println("Nota Erronea");
		}
	}

}
