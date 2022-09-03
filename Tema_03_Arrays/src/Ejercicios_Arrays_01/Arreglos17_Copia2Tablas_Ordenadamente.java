package Ejercicios_Arrays_01;

import java.util.Scanner;


public class Arreglos17_Copia2Tablas_Ordenadamente {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int Tabla1[] = new int[5];
		int Tabla2[] = new int[5];
		int fusion[] = new int[10];
		int j = 0;//Iterador 

		//introducimos datos de la primera y segunda tabla
		System.out.println("Introduce los datos de la primera Tabla: ");
		
		for(int i = 0; i< 5; i++) {
		System.out.println("numero " +(i+1)+ ":");
		 Tabla1[i] = ent.nextInt();
		
		}
		/*
		System.out.println("Introduce los datos de la primera Tabla: ");
		
		for(int i = 0; i< 0; i++) {
		System.out.println("numero " +(i+1)+ ":");
		 Tabla1[i] = ent.nextInt();
		
		}*/
		
		///Insercion ordenada de los datos
		do 
		{
			
			
			for(int i =0; i < 10; i++) 
			{
				if(Tabla1[i]> Tabla1[i+ 1])
				{
					Tabla1[i+1]= Tabla1[i];
					Tabla1[i] = Tabla1[i + i];
				}
			}	
		j++;
		}while(Tabla1[j]> Tabla1[j +1]);
		
		
		//mostrar Arra Ordenado
		
		for(int i = 0;i < 10 ; i++) {
			System.out.println(Tabla1[i]); 
		}
	
	}

}/////pediente de acabar
