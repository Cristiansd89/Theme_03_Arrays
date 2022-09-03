package Ejercicios_Arrays_04;

import java.util.Scanner;


public class Ejercicio_05_MezclarTablas {
	
	

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int numElem = 10;
		int ArrayA [];
		int ArrayB [];
		int ArrayC [];
		
		
		System.out.println("introduce los Datos del ArrayA");
		ArrayA = new int [numElem];
		for(int i = 0; i < numElem;i++) 
		{
			System.out.println("Datos [" +i+ "]");
			ArrayA[i] = ent.nextInt();
		}
		
		System.out.println(" ");
		System.out.println("introduce los Datos del ArrayB");
		ArrayB = new int [numElem];
		for(int i = 0; i < numElem;i++) 
		{
			System.out.println("Datos [" +i+ "]");
			ArrayB[i] = ent.nextInt();
			
		}
		ArrayC = new int [20];
		
		
		int j = 0;
		int k = 0 ;
		
		
		
		
		for(int i= 0; i<numElem ; i++)
		{
			/*
			 * Copia el primer elemento del Array I en el ArrayC y adelantamos una posicion
			 * a K para que el primer elemento del ArrayB pueda copiarse en el segundo puesto del
			 * C
			*/
			ArrayC[k] = ArrayA[i];
			k++;
			ArrayC[k]= ArrayB[i];
			k++;
		}

			
			
		
		
		System.out.println("El Array A + Array B :");
		
		for(int i= 0; i< 20; i++) {
			System.out.println(ArrayC[i]+" - ");
		}
		/**
		 * Revisalo no funciona
		 */
	}

}
