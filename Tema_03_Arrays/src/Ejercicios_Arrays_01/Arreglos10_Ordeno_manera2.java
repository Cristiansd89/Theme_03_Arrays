package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglos10_Ordeno_manera2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int Lista [] = new int [10];
		boolean Ascendente = false, Descendente = false;
		
		
		System.out.println("Introduce los numeros del Arrays");
		for(int i=0; i< 10 ; i++) {
			System.out.println("numero " +(i+1) +":");
			Lista [i] = ent.nextInt();
		}
		//For para leeer los numeros del Array
				System.out.println("");
				
				for(int i = 0; i<9;i++) {
					if(Lista [i] < Lista [i+1]) {
						Ascendente = true;
					}else if(Lista [i] > Lista [i+1]) {
						Descendente = true;
					}
				}
				
				if(Ascendente == true && Descendente == false) {
					System.out.println("El Array Asecendente ");
				}else if (Ascendente == false && Descendente == true) {
					System.out.println("EL Arrays es Descendente");
				}else if(Ascendente == true && Descendente == true) {
					System.out.println("El Array esta desordenado");
				}else if(Ascendente == false && Descendente == false) {
				System.out.println("Todos los numeros son iguales");
				
				}
	}

}
