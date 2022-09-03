package Ejercicios_Arrays_01;

import java.util.Scanner;
public class Arreglos02 {

	public static void main(String[] args) {
		int nElementos;
		
		Scanner ent= new Scanner(System.in);
		System.out.println("Que longuitud va tener tu Array:");
		nElementos = ent.nextInt();
		
		char[] letras = new char[nElementos];
		
		System.out.println("Numero de elementos:");
		//Este bucle se utiliza para pedir el numero de elementos que tiene el Array
		for(int i = 0; i< nElementos;i++) {
			System.out.println((i+1)+ " Introduce los Caracteres del Array:");
			letras[i] = ent.next().charAt(0);
		}
		//Se utiliza para mostrar el numero de elementos que tiene el Array
		System.out.println("\nLos caracteres del arreglo son:");
		for (int i = 0; i<nElementos;i++) {
			System.out.println(letras[i]);
		}
	}
	

}
