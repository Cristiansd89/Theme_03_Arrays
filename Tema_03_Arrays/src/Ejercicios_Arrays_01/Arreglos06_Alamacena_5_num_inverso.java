package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglos06_Alamacena_5_num_inverso {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		float[] numeros =  new float [5];
		
	
		System.out.println("Introduce los datos del Array:");
		for(int i = 0; i < 5 ;i++) {
			System.out.println("Introduce el numero" +(i+1)+ ":");
			numeros[i] = ent.nextFloat();
		}
		
		
		System.out.println("\nImprimir los elementos del Array");
		//Acuerdate de que empiezan siempre en 0 por eso hay que poner un numero menos
		for(int i = 4;  i >= 0;i--) {
			System.out.println(numeros[i]);
			
		}
		
		}
	}


