package Ejercicios_Arrays_04;


import java.util.Scanner;


public class Ejercicio_04_PrimeroYUltimo
{

	public static void main(String[] args) 
	{
		Scanner ent = new Scanner(System.in);
		
		int numElem ;
		int Array[];
		
		
		
		
		System.out.println("Cuantos datos Quieres introducir:");
		numElem = ent.nextInt();
		Array = new int [numElem];
		
		System.out.println("Introduce los datos ");
		for(int i = 0; i < numElem; i++) 
		{
			System.out.println("Datos [" +i+ "]");
			Array[i] = ent.nextInt();
		}
		
		for (int i= 0; i< numElem; i++) {
		System.out.println(Array[i]);
		System.out.println(Array[numElem - 1]);
		numElem--;
		
	}
	}

}
