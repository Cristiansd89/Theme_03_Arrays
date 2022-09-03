package Ejercicios_Arrays_04;

import java.util.Scanner;

public class Ejercicio_01_5Numeros {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int numELem = 5;
		int Array [];
		Array = new int [numELem];
		
		System.out.println("introduce el Array: ");
		
		for (int i=0; i < numELem ;i++) {
			System.out.println("Dato ["+i+ "]");
			Array[i] = ent.nextInt();
		}
		
		
		System.out.println("Lista de datos : ");
		for(int i = 0; i< numELem; i++) {
			System.out.print(Array[i]+"-");
		}
	}

}
