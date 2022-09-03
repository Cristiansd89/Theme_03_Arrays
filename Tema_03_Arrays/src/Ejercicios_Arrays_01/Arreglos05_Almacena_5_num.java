package Ejercicios_Arrays_01;

import java.util.Scanner;
public class Arreglos05_Almacena_5_num {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//Creamos el Array para 5 numeros
		float[] numeros = new float[5];
		
		///Bucle para guardad los 5 elementos 
		System.out.println("Guardando los datos en el Arrays");
		for (int i = 0; i<5;i++){
			System.out.print( "Introduce el numero "+(i + 1)+ ":");
			numeros[i] = ent.nextFloat();
		}
		//ahora vamos a mostrarlos en el mismo orden introducido
		System.out.println("\nImprimir los elementos del Array");
		for(float i : numeros) {
			System.out.println(i);
		}

	}

}
