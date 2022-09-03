package Ejercicios_Arrays_02;

import java.util.Scanner;

public class TestArrayIntOrdenacionBusquedaBinaria {

	public static void main(String[] args)
	{
		//Creamos un objeto
		ArraysEnteros array = new ArraysEnteros();
		Scanner entrada = new Scanner(System.in);
		
		//Introducimos datos en el array
		array.PedirArray();
		
		//Enviamos a pantalla el contaenido del array
		array.MostrarArray();
		array.metodoBurbuja();
		System.out.println();
		array.MostrarArray();
		System.out.println("Introduce elemento a buscar: ");
		int buscado = entrada.nextInt();
		int posicion = array.BusquedaBinaria(buscado);
		boolean existe = (posicion != -1);
		if(existe)
			System.out.println(buscado + " está en la posición " + posicion);
		else
			System.out.println(buscado + " no está en el array");
		
		
	}

}
