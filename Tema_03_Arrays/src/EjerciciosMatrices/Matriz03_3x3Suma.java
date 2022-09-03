package EjerciciosMatrices;

import java.util.Scanner;

public class Matriz03_3x3Suma {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		/**
		 * Declaramos los atributos de la clase matriz
		 */
		int matriz1 [] [];
		int matriz2 [] [];
		int sumaMatriz [][];
		int numFila = 3;
		int numColum = 3;
		
		/**
		 * Introducimos los datos en la primera matriz a través  de 2 bucles for
		 */
		System.out.println("introduzca los datos dela primera matriz: ");
		matriz1 = new int[numFila][numColum];
		
		for(int i = 0; i< numFila;i++)
		{
			for (int j = 0; j < numColum; j++) 
			{
				System.out.println("Matriz [" +i+"] [" +j+"] :");
				 matriz1 [i][j] = ent.nextInt();
			}
			
		}
		/**
		 * introducimos los datos de la segunda matriz a 
		 */
		
		System.out.println("introduzca los datos dela primera matriz: ");
		matriz2 = new int[numFila][numColum];
		for (int i=0; i< numFila; i++)
		{
			for (int j = 0; j < numColum; j++) 
			{
				System.out.println("Matriz 2 [" +i+"] [" +j+"] :");
				matriz2 [i][j] = ent.nextInt();
			}
		}
		
		/**
		 * Vamos a sumar las 2 matrices
		 */
		//Creamos la tercera matriz
		sumaMatriz = new int [numFila] [numColum];
		
		for(int i = 0; i< numFila; i++) 
		{
			for(int j = 0;  j< numColum; j++ ) 
			{
				sumaMatriz [i][j] += matriz1[i][j] + matriz2[i][j];
				
			}
		}
		
		
		/**
		 * mostramos todo lo que hay guardado en sumamatriz
		 */
		System.out.println("Primera Matriz : ");
		for(int i = 0; i < numFila; i++) 
		{
			System.out.println("");
			
			for(int j = 0; j < numColum; j++) 
			{
				
				System.out.print(matriz1 [i] [j]);
			}
		}	
		
		System.out.println(" ");
		System.out.println("Segunda Matriz :");
		for(int i = 0; i < numFila; i++) 
		{
				System.out.println("");
				for(int j = 0; j < numColum; j++) 
				{
					
					System.out.print(matriz2 [i] [j]);
				}
		}
		
		System.out.println(" ");
		System.out.println("Suma de Ambas ");
		for(int i = 0; i < numFila; i++) 
		{
			System.out.println("");
			for(int j = 0; j < numColum; j++) 
			{
				
				System.out.print(sumaMatriz [i] [j]);
			}
		}

	}

}
