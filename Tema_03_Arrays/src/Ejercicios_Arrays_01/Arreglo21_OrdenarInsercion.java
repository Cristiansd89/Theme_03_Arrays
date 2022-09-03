package Ejercicios_Arrays_01;

import java.util.Scanner;
public class Arreglo21_OrdenarInsercion {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		//Atributos
		int Array[];
		int numElem;
		int pos;
		int aux;
		
		System.out.println("introduzca el numero de elementos del Array");
		numElem = ent.nextInt();
		
		Array = new int [numElem];
		
		for(int i = 0; i < numElem; i++) {
			System.out.println("Posicion "+(i+1));
			Array[i] = ent.nextInt();
		}
		
		///Ordenamiento por Insercion
		
		for(int i =0; i < numElem; i++) {
			pos = i;
			aux = Array[i];
			while( (pos > 0) && (Array[pos-1] > aux)) {
				Array[pos] = Array[pos-1];
				pos--;
			}
			Array[pos] = aux;
		}
		System.out.println("\n Orden ascendente");
		for(int i = 0; i < numElem; i++) {
			System.out.println(Array[i]+"-");
			
		}
		System.out.println(" ");
		
		System.out.println("Orden Descendente");
		for(int i = (numElem- 1); i > 0; i--)
		{
			System.out.println(Array[i]);
		}
	}

}
