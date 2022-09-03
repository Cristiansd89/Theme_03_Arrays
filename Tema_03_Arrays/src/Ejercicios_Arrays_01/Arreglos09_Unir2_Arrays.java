package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglos09_Unir2_Arrays {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		///Declaramos los Arrays
		int a [];
		int b [];
		int c [];
		
		///Añadimos la cantidad de elementos que tienen los Arrays
		a = new int [12];
		b = new int [12];
		c = new int [24];
		
		
		//pedimos los elementos del Array A;
		System.out.println("Introduce los datos del primer Array");
		for(int i = 0; i<12;i++) {
			System.out.println("Elemento numero "+(i+1)+ " del primer Array:");
			a[i] = ent.nextInt();
		}
		//pedimos los elementos del Array B;
				System.out.println("Introduce los datos del Segundo Array");
				for(int i = 0; i<12;i++) {
					System.out.println("Elemento numero "+(i+1)+ " del Segundo Array:");
					b[i] = ent.nextInt();
				}
		//Pasamos a mezclar los 2 Arrays de 3 en 3
		//iterador i para a y b
		//iterador aux para el C
			
		int j=0;
		int a1=0;
		int a2=0;

		for(int i = 0 ; i<4; i++){
			///El Segundo bucle for es para introducir los 3 primeros datos del primer array
	       for(int z = 0; z<3; z++){
	    	   c[j]=a[a1];

			    a1++;
			    j++;
	       }
	       //El tercer for es para introducir los 3 siguentes del 3 array
	       for(int x = 0; x<3; x++){

			c[j]=b[a2];

			a2++;

			j++;
	       }

		}


			//Mostramos El Array Mezclado
			System.out.println("El tercer Array es: ");
			for(int i= 0;i<24;i++) {
				System.out.print(c[i]);
			}
			System.out.println();
	}

}
