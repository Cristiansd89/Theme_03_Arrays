package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglo11_InsertarNum_OtraPisicion {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Declaramos el Array
		int Tabla[] = new int [10];
		int posicion = 0;
		int numero;
		
		//pedimos los numeros
		System.out.println("introducir los Numeros");
		for(int i= 0; i < 8 ;i++) {
			System.out.println("Posicion "+(i+1)+ ":");
			Tabla[i] = ent.nextInt();
			
		//REalizamos la lectura de los 8 numeros	
			
		}
		System.out.println("Numeros : ");
		for(int i = 0; i < 8; i++) {
			System.out.println(Tabla[i]);
		}
		System.out.println("");
		
		///Pedimos Donde queremos introducir el nuevo elemento
		System.out.println("donde quieres Insertar un nuevo  numero :");
		posicion = ent.nextInt();
		posicion = posicion-1;
		//Pedimos el numero que queremos insertar
		System.out.print("número que desea insertar en la tabla: ");
        numero = ent.nextInt();
		
		//movemos la todos los numeros hasta la posicion definida
		for(int i = 8; i > posicion; i--) {
			Tabla[i+1] = Tabla[i];
		}
		
		
		///Insertamos el numero en la posicion
		Tabla[posicion] = numero;
		System.out.println(" ");
		System.out.println("La Tabla Modificada");
		for(int i = 0; i< 10 ; i++) {
			System.out.println(Tabla[i]);
		}
		
	}///Busca por internet para enterder el Ejercicio Esta mal se come la posicion don introduces el numero y te duplica la siguente

}
