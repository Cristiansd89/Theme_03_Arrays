package Ejercicios_Arrays_04;

import java.util.Scanner;
public class Ejercicio_02_5NumerosInversos {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int numElem = 5;
		int Array[];
		Array = new int [numElem];  
		
		System.out.println("introduce el Array: ");
		
		for (int i=0; i < numElem ;i++) {
			System.out.println("Dato ["+i+ "]");
			Array[i] = ent.nextInt();
		}
		
		for(int i = numElem - 1; i >= 0; i--) {
			System.out.println(Array[i]+ "-");
		}
	}

}
