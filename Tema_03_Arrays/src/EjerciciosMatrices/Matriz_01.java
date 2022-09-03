package EjerciciosMatrices;
import java.util.Scanner;

public class Matriz_01 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		///Atributos
		int matriz [] [];
		int numColum;
		int NumFilas;
		
		///pedimos el numero de fila y columnas que tiene tu matriz
		System.out.println("Cuantas filas quieres que contenga tu matriz :");
		NumFilas =  ent.nextInt();
		
		System.out.println(" ");
	
		System.out.println("Cuantas columnas contiene tu matriz");
		
		numColum = ent.nextInt();
		matriz = new int [NumFilas] [numColum];
		//Introducimos los datos en la matriz
		
		System.out.println("introduzca los datos en la matriz");
		for(int  i= 0;i < NumFilas; i++)
		{
			
			for(int j = 0; j < numColum ; j++)
			{
				System.out.println("Matriz [" +i+"] [" +j+"] :");
				matriz [i] [j] = ent.nextInt();
			}
			
		}
		
		//mostramos los datos de la matriz
		System.out.println("La matriz es: ");
			for(int i = 0;i < NumFilas; i++)
			{
				System.out.println("");
				for(int j = 0; j < numColum ; j++)
				{
					System.out.print(matriz[i][j]);
				}
			}
	}

}
