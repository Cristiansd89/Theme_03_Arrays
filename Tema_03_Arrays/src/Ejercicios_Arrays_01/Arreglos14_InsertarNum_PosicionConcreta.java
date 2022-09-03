package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglos14_InsertarNum_PosicionConcreta {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		///Atributos
		int NumExtra;
		int posicion;
		int Tabla[] = new int [10];
		
		//Pedimos los numeros del Arrays
		System.out.println("Introducimos los numeros en el Array");
		for (int i = 0; i < 5 ;i++) {
			System.out.println("Numero "+(i+1)+ ":");
			Tabla[i] = ent.nextInt();
			
	}
		///Pedimos el numero Extra que queremos insertar
		System.out.println("Introduce el numero Extra:");
		NumExtra = ent.nextInt();
		
		//Pedimos la posicion donde queremos insertarlo
		
		System.out.println("En que posicion quieres insertar el Numero: ");
		posicion = ent.nextInt();
		
		
		//Desplazamos la posiciones para poder insertar el numero
		for(int i = 8; i >= posicion;i--) {
			Tabla[i+ 1]= Tabla[i];
			
			
		}
		//insertamos el numero Extra en la posicion especificada
		Tabla[posicion ] = NumExtra;
		
		///Mostramos el Arrays  modificado
		System.out.println("El Nuevo array: ");
		for(int i = 0; i<10; i++) {
			System.out.println(Tabla[i]);
		}
	}	
}
