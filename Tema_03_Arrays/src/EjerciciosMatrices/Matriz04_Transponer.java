package EjerciciosMatrices;

import java.util.Scanner;

public class Matriz04_Transponer {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int matriz [] [];
		matriz = new int [3] [3];
		
		System.out.println("introduzca los datos de la matriz: ");
		 for (int i = 0; i < 3 ; i ++) 
		 {
			 
			 for(int j = 0; j< 3 ; j++) 
			 {
				 System.out.println("Matriz 2 [" +i+"] [" +j+"] :");
				 matriz [i][j] = ent.nextInt();
			 }
		 }
		
		for (int i = 0; i < 3; i++) 
		{
			System.out.println(" ");
			for(int j= 0; j < 3; j++) 
			{
				
				System.out.print(matriz[i][j]);
			}
		}
		/**
		 * Vamos a transporner la matriz 
		 */
		int aux;
		for(int  i = 0; i < 3; i++) 
		{
			for(int j = 0; j < i; j++) 
			{
				aux = matriz[i][j];
				matriz [i][j] = matriz[j][i];
				matriz [j][i] = aux;
			}
		}
			System.out.println("La Matriz transpuesta: ");
			for (int i = 0 ; i< 3; i++) 
			{
				System.out.println(" ");
				for(int j= 0; j< 3; j++) 
				{
					System.out.println(matriz[i][j]);
				}
			}
			
		}
	}


