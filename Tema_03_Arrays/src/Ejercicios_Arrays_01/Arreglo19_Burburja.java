package Ejercicios_Arrays_01;


import java.util.Scanner;

public class Arreglo19_Burburja {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int numElem;
		int aux;
		
		
		System.out.println("Que tamaño quieres que tenga tu Array");
		numElem = ent.nextInt();
		int Array[] = new int[numElem];
		
		for(int i = 0;i < numElem;i++) {
			System.out.println("Introduce el numero "+(i+1)+ ":");
			Array[i] = ent.nextInt();
		}
		
		//Metodo Burbuja
		
		for(int i = 0 ; i < numElem; i++) {//Para saber cuantas vuelta tiene que dar el programa
			for(int j= 0; j<numElem-1;j++) {
				if (Array[j] > Array[j + 1] ) {
					aux = Array[j];
					Array [j] =Array[j+1];
					Array[j+1] = aux;
				}
			}
		}
		
		//Mostramos EL Array
		for(int i = 0;i< numElem;i++) {
			System.out.print("El Array ordenado de forma ascendente : " +Array[i]);
		}
		for(int i = numElem-1;i>= 0;i--) {
			System.out.println("El Array ordenado Descendente:  " +Array[i]);
		}
	}

}
