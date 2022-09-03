package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglo15_insertar_SinPerderOrden {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int Tabla[] = new int[10];
		int numExtra;
		int posicion = 0;
		boolean creciente = true;
		int j = 0;//Iterador 
		
		do 
		{
		//Pedimos los numeros del Arrays
				System.out.println("Introducimos los numeros en el Array");
				for (int i = 0; i < 5 ;i++) 
				{
					System.out.println("Numero "+(i+1)+ ":");
					Tabla[i] = ent.nextInt();
					
				}
				
				//Comprobamos si el  Array esta ordenado de forma ascendente
				for(int i = 0; i< 4; i++) 
				{
					if (Tabla[i] < Tabla[i+1]) 
					{
						creciente = true;
					}
					if(Tabla[i] > Tabla[i+1]) 
					{
						creciente = false;
						break;
					}
				}
				///Si esto es False el bucle se volvera a repetir
				if(creciente == false) 
				{
					System.out.println("El Array no esta ordenando de forma creciente");
				}
				
		}while(creciente == false);
		
		
		///Pedimos el numero Extra que queremos insertar
		System.out.println("Introduce el numero Extra:");
		numExtra = ent.nextInt();
				
		
		///Esto es para darnos cuenta en que posicion va ir el numero
		while(Tabla[j] <numExtra && j< 5) {
			posicion++;
			j++;
		}	
		for(int i =0; i>=posicion; i--)
		{
			Tabla[i+1] = Tabla[i];
			
		}
		Tabla[posicion] = numExtra;
		
		
		System.out.println("El Array queda asi");
		for(int i = 0; i< 10; i++) {
			System.out.print(Tabla[i]+ "-");
		}

	}
}