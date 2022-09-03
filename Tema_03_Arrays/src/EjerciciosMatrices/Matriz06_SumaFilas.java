package EjerciciosMatrices;

import java.util.Scanner;

public class Matriz06_SumaFilas {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int matriz [][];
		int SumaFila;
		int SumaColm;
		int numFila;
		int numCol;
		int suma;
		
		
		System.out.println("Numero de filias: ");
		numFila = ent.nextInt();
		
		
		System.out.println(" ");
		
		System.out.println("Numero de columnas: ");
		numCol = ent.nextInt();
		
		matriz = new int [numFila][numCol];
	
		
		///Introducimos los datos de la matriz
		System.out.println("introduce los datos de la Matriz:");
		for(int i = 0; i < numFila; i++)
		{
			for(int j = 0; j < numCol; j++) 
			{
				System.out.println("Matriz [" +i+"] [" +j+"] :");
				matriz[i][j] =ent.nextInt();
				
			}
		}
		//Imprimimos la matriz
		for(int i = 0; i < numFila; i++)
		{
			for(int j = 0; j < numCol; j++) 
			{
				System.out.println(matriz[i][j]);
			
			}
		}
		
		///Ahora procedemos a sumar la filas y lascolumnas
		
		/**
		 * sumamos las filas de la matriz
		 */
			System.out.println("la suma de las filas de la matriz");
			for(int i = 0; i < numFila;i++ ) 
			{
				SumaFila = 0;
				for (int j = 0 ; j < numCol; j++) {
					SumaFila += matriz[i][j];
				}
				System.out.println("\nLa suma de la fila ["+i+ "] es :" +SumaFila);
			}
			//sumamos la columnas
			for(int j = 0; j < numCol;j++ ) 
			{
				SumaColm = 0;
				for (int i = 0 ; i < numFila; i++) {
					SumaColm += matriz[i][j];
					
				}
				System.out.println("\nLa suma de la columnas ["+j+ "] es :" +SumaColm);
		
			}
		}
	}
