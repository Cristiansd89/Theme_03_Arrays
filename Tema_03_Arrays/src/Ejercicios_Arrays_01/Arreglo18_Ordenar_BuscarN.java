package Ejercicios_Arrays_01;

import java.util.Scanner;
public class Arreglo18_Ordenar_BuscarN {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Atributos
		
		int numElem;
		int N ; // Es el el numero que vamos a buscar dentro del Array
		boolean	Hayintercambio,esnumero;
		
		//Pedimos el Array
		System.out.println("Introducimos el numero de elementos: ");
		numElem = ent.nextInt();
		int Array[] = new int[numElem];
		
		
		System.out.println("Introduzca los datos dentro del Array: ");
		for(int i = 0; i<numElem; i++) 
		{
			System.out.println("Introduzca el numero " +(i+1)+ " : ");
			Array[i] = ent.nextInt();
		
		}
		
		//Con este metodo ordenamos ascendentemente el Array
		
	
		do {
			Hayintercambio = false;
			for (int i = 0; i < numElem-1;i++) 
			{
				if(Array[i] > Array[i+1]) 
				{
					//Intercambios
					int aux	= Array[i];
					Array[i] = Array[i+i];
					Array[i + 1] = aux;
					Hayintercambio = true;
				}
			}
			
		}while(Hayintercambio);
			
		//Solicitamos el numero que queremos buscar

		System.out.println("Solicitamos El numero que queremos buscar :");
		N = ent.nextInt();
		int i = 0;
		
		while(i<numElem && Array[i]< N) {
			i++;
		}
		if(i == numElem ) {//Hemos recorido todo el Array y no hay nada
			System.out.println("Numero no Encontrado");
		}else {
			if(Array[i] == N) {
				System.out.println("El numero se ha encontrado");
			}else {
				System.out.println("El numero no es encontrado");
			}
		
		
	}
		
			
	}
}
