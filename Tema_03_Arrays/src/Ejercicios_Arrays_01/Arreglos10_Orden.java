package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglos10_Orden {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Declaramos el Arrays
		int Lista [];
		
		//Damos seleccion al numero de elementos
		Lista = new int[10];
		
		//Pedimos el numero de elementos del array
		System.out.println("Introduzca 10 Numeros: ");
		for(int  i = 0;i < 10;i++) {
			System.out.println("Numero " +(i+1)+ ":");
			Lista[i] = ent.nextInt(); 
			
		}
		//For para leeer los numeros del Array
		System.out.println("");
		System.out.println("Lectura Del Array :");
		for(int i = 0; i<10;i++) {
			System.out.print(" Numeros introducidos " + Lista[i]);
			System.out.println("");
			
		}
		//Formulas para Disociar que tipo  de Array es
		if(Lista[0]<Lista[1] && Lista[2]<Lista[3] && Lista[4]<Lista[5] && Lista[6]<Lista[7] && Lista[8]<Lista[9]) {
			
			System.out.println("El Array es Ascendente");
			
		}else if(Lista[0]>Lista[1] && Lista[2]>Lista[3] && Lista[4]>Lista[5] && Lista[6]>Lista[7] && Lista[8]>Lista[9]) {
			System.out.println("El Array es Descendente");
			
		}else if(Lista[0]==Lista[1] && Lista[2]==Lista[3] && Lista[4]==Lista[5] && Lista[6] ==Lista[7] && Lista[8]==Lista[9]){
		System.out.println("Todos los numeros son iguales");
		
		}else {
			System.out.println("El Arrays esta Desordenado");
		}
	}
}


