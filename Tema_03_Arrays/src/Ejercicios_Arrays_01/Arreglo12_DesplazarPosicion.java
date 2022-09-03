package Ejercicios_Arrays_01;

import java.util.Scanner;


public class Arreglo12_DesplazarPosicion {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		///Declaramos el Array
		int Tablas [] = new int [10];
		int ultimo;
		
		//Pedimos el numero
		System.out.println("introduce Los numeros");
		for (int i = 0;i < 10; i++) {
			System.out.println("numeros " +(i +1)+ ": ");
			Tablas[i]= ent.nextInt();
			
			
			
			
		}///Mostramos el desplazamiento
		ultimo =Tablas[9];//Guardamos el ultimo elemento
		
		
		System.out.println("Tabla de numero:");
		
		for(int i = 8; i >= 0; i--) {
			Tablas [i + 1] =Tablas[i] ;//Avanzamos una posicion en el arreglo
			
		}
		Tablas[0] = ultimo;
		
		
		System.out.println("El nuevo Arrays: ");
		for (int i= 0; i < 10 ; i++) {
			System.out.println(Tablas[i]);
		}
	}
	
}
