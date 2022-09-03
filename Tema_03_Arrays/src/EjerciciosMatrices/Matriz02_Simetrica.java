package EjerciciosMatrices;

import java.util.Scanner;


public class Matriz02_Simetrica {

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		//Atributos
		int matriz [] [];
		int numFilas;
		int numColum;
		boolean simetrica = true;
		
		System.out.println("Introduczca el numero de Filas: ");
		numFilas = ent.nextInt();
		
		System.out.println("Introduzcae el numero de Columas:");
		numColum = ent.nextInt();
		
		matriz = new int [numFilas][numColum];
		
		
		System.out.println("introduzca los datos dnetro de la matriz");
		
		for (int i = 0; i< numFilas; i++) 
		{
			for(int j = 0; j < numColum; j++) 
			{
				System.out.println("Matriz [" +i+"] [" +j+"] :");
				matriz [i] [j] = ent.nextInt();
			}
		}
		if(numFilas == numColum) {///Si el numero de filas es igual al numero de columnas
			int i = 0;
			int j = 0;
			
			while (i< numFilas && simetrica == true) 
			{
				
				while (j< i && simetrica == true)
				{
					//Si en algun momento  al anaizar los elementos de la matriz 
					//Salte que no son iguales la matriz no es simetrica
					if(matriz[i][j] != matriz[j][i]) 
					{
						simetrica = false;;
					}
					j++;
				}
				i++;
				
			}
			//quiere decir que nunca ha llegado a entrar en para dar false
			if(simetrica == true) {
				System.out.println("la Matriz es simetrica");
			}else {
				System.out.println("La matriz no es simetrica");
			}
		}else {
			System.out.println("La matriz no es simetrica");
		}
	}

}
