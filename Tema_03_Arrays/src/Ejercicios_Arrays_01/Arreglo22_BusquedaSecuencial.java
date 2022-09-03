package Ejercicios_Arrays_01;

import java.util.Scanner;


public class Arreglo22_BusquedaSecuencial {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		
		int numElem;
		int Array [];
		int dato;
		boolean bandera = false;
		
		//Pedimos el numero de alemento que tener nuestro array
		System.out.println("Cuantos datos quieres introducir:");
		numElem = ent.nextInt();
		Array = new int [numElem]; //Creacion del Array
		
		
		System.out.println("Introduce los datos de el Array:");
		for (int i = 0; i < numElem; i++) {
			System.out.println("Dato" +(i));
			Array[i] = ent.nextInt();
		}
		
		System.out.println("Introduce el numero a buscar");
		dato = ent.nextInt();
		
		int i = 0;
		
		while(i < numElem && bandera == false) 
		{
			if(Array[i] == dato ) 
			{
				bandera = true;	
			}
			i++;
		}
		if(bandera == false) {
			System.out.println("No se ha encontrado en numero buscado");

		}else {
			 System.out.println("El numero que buscas esta en la posicion "+(i-1));
		}
	}

}
