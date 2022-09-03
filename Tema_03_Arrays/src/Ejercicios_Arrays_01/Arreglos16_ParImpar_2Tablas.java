package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglos16_ParImpar_2Tablas {

	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		///Atributos
		int Tabla[] = new int [10];
	
		int cuentaPares = 0;
		int cuentaImpares = 0;
	
		
		
		//Pedimos los numeros del Array
		System.out.println("Introducimos los numeros : ");
		
		for (int i = 0; i< 10; i++) {
			System.out.println("numero " +(i+1) +":");
			Tabla[i] = ent.nextInt();
			
				//Contamos La cantidad de numeros pares e impares que va haber para no perder memoria
				if(Tabla[i]%2 == 0)
				{
					cuentaPares++;
				}
				else 
				{
					cuentaImpares++;
				}	
			}
		
		int pares[] =new int[cuentaPares];//Creamos el Array con el numero Exacto de numeros
		int impares[] =new int[cuentaImpares];	
		
		cuentaPares =0;
		cuentaImpares = 0;
		
		//Volvemos a inicializar las 2 variables para utilizarlas ahora de iterador y ahorrar recursos
		//Seleccionamos numeros pares e impares
		
		for(int i = 0;i< 10 ; i++)
		{
			if(Tabla[i]%2 == 0)
			{
				pares[cuentaPares] = Tabla[i];
				cuentaPares++;
			}
			else 
			{
				impares[cuentaImpares] = Tabla[i];
				cuentaImpares++;
			}	
		}
		//Mostramos tabla de numeros pares e impares
		System.out.print("El Array con numeros pares: ");
		for(int i = 0; i < cuentaPares ; i++) 
		{
			System.out.print(pares[i]+"-");
			
			
		}
		System.out.println("");
	
		System.out.print("El Array con numeros pares: ");
		for(int i = 0; i < cuentaImpares ; i++)
		{
		System.out.print(impares[i]+"-");
		
		
	}	
	}

}
