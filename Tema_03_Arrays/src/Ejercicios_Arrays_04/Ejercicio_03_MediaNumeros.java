package Ejercicios_Arrays_04;

import java.util.Calendar;
import java.util.Scanner;

public class Ejercicio_03_MediaNumeros {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int numElem = 5;
		int Array[];
		Array = new int [numElem]; 
		int positivos = 0;
		int negativos = 0;
		int ceros = 0;
		int ContPos = 0;
		int ContNeg = 0;
		
		System.out.println("Introduce lo datos del Array");
		for (int i = 0; i < numElem ; i++) 
		{
			System.out.println("Datos ["+ i+ "]");
			Array[i] = ent.nextInt();
		}
		
		for (int i = 0; i < numElem ; i++) 
		{
			if(Array[i] > 0) 
			{
				positivos = positivos + Array[i];
				ContPos++;
			}else if (Array[i] < 0) 
			{
				negativos = negativos + Array[i];
				ContNeg++;;
			}else if (Array[i] == 0) 
			{
				ceros++;
			}
		}
		if (ContPos > 0) {
			System.out.println("hay "+ContPos+ " numeros positivos y la media de esos numeros es "+positivos / ContPos);
		}else {
			System.out.println("No has introducido numeros Positivos");
		}
		if (ContPos > 0) {
			System.out.println("hay "+ContPos+ " numeros Negativos y la media de esos numeros es "+negativos / ContNeg);
		}else {
			System.out.println("No has introducido numeros Negativos");
		}
		if(ceros > 0) {
			System.out.println("hay " +ceros+ " cantidad de ceros");
		}else {
			System.out.println("No hay ceros");
		}
		
		
		
	}

}
