package Ejercicios_Arrays_04;

import java.util.Scanner;


public class Ejercicio_07_tipoOrden {

	public static void main(String[] args) {
	Scanner ent = new Scanner(System.in);
		
		int numElem = 10;
		int ArrayA [];
		
		ArrayA = new int [numElem];
		
		for (int i = 0; i < numElem; i++) {
			System.out.println("Datos [" +i+ "]");
			ArrayA[i] = ent.nextInt();
		}
		boolean ascendente = false;
		boolean descendente = false;
		
		for(int i = 0; i < numElem -1; i++) 
		{
			if(ArrayA[i] < ArrayA[i+1])
			{
				ascendente = true;
				
			}else if(ArrayA[i] > ArrayA[i+1]) 
			{
				descendente = true;
			}

		}
		
		
		if(ascendente == true && descendente == false ) 
		{
			System.out.println("El Array esta de forma Ascenente");
	
		}else if(descendente == true && ascendente == false) 
		{
			System.out.println("El Array esta de forma Descendente");
			
		}else if(ascendente == true && descendente == true ) 
		{
			System.out.println("El Array  no esta ordenado");
		}else if (ascendente == false && descendente == false){
			
			System.out.println("Todos lo numeros son iguales");
		}

	}

}
