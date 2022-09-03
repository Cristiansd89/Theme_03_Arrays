package EjerciciosMatrices;

import java.util.Scanner;
public class Matrizces_09 
{
	Scanner ent = new Scanner(System.in);
	//Atributos
	int fila;
	int columna;
	int matriz [][];
	
	public Matrizces_09()
	{
		System.out.println("Filas Matriz :");
		this.fila = ent.nextInt();
		System.out.println("Columnas : ");
		this.columna = ent.nextInt();
		this.matriz = new int [fila][columna] ;
	}
	
	public void LeerMatriz () 
	{
		System.out.println("introduce los datos en la matriz :");
		for(int i = 0; i < fila; i++) 
		{
			for(int j = 0 ; j < columna; j++)
			{
				System.out.println("Datos ["+i+"]" + "["+j+"]  :");
				matriz [i][j] =ent.nextInt();
			}
		}
	}
	
	
	public void MostrarMatriz () 
	{
		System.out.println("La matriz es: ");

		for(int i = 0; i < fila; i++) 
		{
			System.out.println(" ");
			for(int j = 0 ; j < columna; j++)
			{
				System.out.print(matriz [i][j] );
				
			}
		}
	}
	public void MostrarSuma() {
		
		
		
	}
	public double Diagonal()
	{
		int suma= 0;
		System.out.println("La matriz es: ");
		for(int i = 0; i < fila; i++) 
		{
			for(int j = 0 ; j < columna; j++)
			{
				if (i == j) {
					suma = matriz [i][j] + matriz [i][j]; 
				}
				
			}

		}
		return suma;
	}
}
