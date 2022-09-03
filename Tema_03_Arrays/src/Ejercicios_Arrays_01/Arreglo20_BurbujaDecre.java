package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglo20_BurbujaDecre {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		
		int numElem;
		int aux;
		boolean hayIntercambio;
		
		//Solicitamos los datos del Array
		
		
		System.out.println("introducimos el numero de elementos : ");
		numElem = ent.nextInt();
		int Array[] = new int[numElem];
		
		System.out.println("Introducimos los datos el Array :");
		for(int i = 0; i < numElem; i++) {
			System.out.println("Introducimos el dato "+(i+1) +":");
			Array[i] = ent.nextInt();
		}
		//Metodo Burbuja
		
		do
		{
			hayIntercambio = false;
			for (int j = 0; j < numElem-1; j++) 
			{
				if (Array[j] > Array[j + 1] ) 
				{
					aux = Array[j];
					Array [j] =Array[j+1];
					Array[j+1] = aux;
					hayIntercambio = true;
				}
			}
		}while(hayIntercambio);
		
		System.out.print("El Array ordenado seria:   ");
		for(int i = 0;i< numElem;i++) {
			System.out.print("");
			System.out.print(Array[i]+" - ");
		}

	}

}
