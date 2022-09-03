package Ejercicios_Arrays_02;

import java.util.Scanner;

public class TestFusion {

	public static void main(String[] args) 
	{
		Scanner entrada = new Scanner(System.in);
		ArraysEnteros Array1 = new ArraysEnteros();
		
		//Introducimos los datos en el Array
		Array1.PedirArray();
		
		
		//Enviamos por pantalla el contenido del Array
		Array1.MostrarArray();
		
		Array1.metodoBurbuja();
		System.out.println();
		System.out.println("contenido del array 1");
		
		Array1.MostrarArray();
		ArraysEnteros Array2 = new ArraysEnteros();
		
		Array2.PedirArray();
		Array2.metodoBurbuja();
		System.out.println();
		System.out.println("contenido del array 2");
		Array2.MostrarArray();
		
		// PROBAMOS LA FUSION MEZCLA
		
		ArraysEnteros array3 = Array1.fusion(Array2);
		System.out.println("contenido del array 3");
		array3.MostrarArray();
		

	}

}
