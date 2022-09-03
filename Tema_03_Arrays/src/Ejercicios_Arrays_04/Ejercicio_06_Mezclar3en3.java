package Ejercicios_Arrays_04;

import java.util.Scanner;


public class Ejercicio_06_Mezclar3en3 
{

	public static void main(String[] args) 
	{
		
		Scanner ent = new Scanner(System.in);
		
		int numElem = 12;
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
		ArrayC = new int [24];
		
		
		int j = 0;
		int k = 0 ;
		
		
			for(int i = 0; i < numElem; i+=3) 
			{
				ArrayC [k] = ArrayA[i];
				k++;
				ArrayC [k] = ArrayA[i+1];
				k++;
				ArrayC [k] = ArrayA[i+2];
				k++;
				ArrayC [k] = ArrayB[i];
				k++;
				ArrayC [k] = ArrayB[i+1];
				k++;
				ArrayC [k] = ArrayB[i+2];
				k++;
				
			}
		System.out.println("El Array A + Array B :");
		
		for(int i= 0; i< 24; i++) {
			System.out.println(ArrayC[i]+" - ");
		}
	}
	
	

}
