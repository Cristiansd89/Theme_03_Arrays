package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglos08_Unir2_Arrays {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Declaramos los Arrays
		int a[];
		int b[];
		int c[];
		
		
		//Indicamos el numero de elementos que van a tener los arrays
		a = new int[10];
		b = new int[10];
		c = new int[20];
		
		//pedimos el Array a
		System.out.println("introduzca el Primer Array :");
		for (int i = 0; i < 10 ;i++) {
			System.out.print("Numero "+(i+1)+"del primer Arrays: ");
			a[i] = ent.nextInt();
		}
		//pedimos el Array B
		System.out.println("introduzca el Segundp Array :");
		for (int i = 0; i < 10 ;i++) {
			System.out.print("\nNumero "+(i+1)+"del Segundo Arrays: ");
			b[i] = ent.nextInt();
		}
		//ahora Vamos a mezclar los dos arrays
		//Vamos autilizar el iterador i para los arrays a y b
		//y el iterador j para el arrays c
		
		int j = 0;
		for (int i = 0; i< 10;i++) {
			//copiamos en el arry c (iterador j) el primer elemento del A
			c[j] = a[i]; 
			j++;
			
			//copiamos el primer elementos del array B  en c;
			c[j] = b[i];
			j++;
			
		}
		//Vamos a mostrar el tercer Array
		System.out.println("El tercer array es: " );
		for(int i = 0; i<20;i++) {
			System.out.println(c[i]+"");
			
		}
		System.out.println();
	}

}
