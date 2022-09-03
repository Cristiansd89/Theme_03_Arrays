package Colecciones02;

import java.util.*;
public class Practica_1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = leerValores();
		int Media = CalcularMedia(lista);
		mostrarResultados(lista,Media);
	}

	
	public static ArrayList leerValores() 
	{
		Scanner ent = new Scanner(System.in);
		ArrayList<Integer> array = new ArrayList<Integer>();
		boolean salir = false;
		int num;
		int contador = 0;
		do 
		{
			System.out.println("Introduce los datos [" +contador+"]");
			num = ent.nextInt();
			if (num == -99) 
			{
				salir = true;
			}else {
				array.add(num);
				contador++;
			}
			
		}while(!salir);
	return array;
		
	}
	public static int CalcularMedia(ArrayList<Integer> array) 
	{
		Iterator<Integer> Iterador = array.iterator();
		int suma = 0;
		while(Iterador.hasNext()) {
			suma = suma + Iterador.next();
			
		}
		return suma /array.size();
	}
	
	public static void mostrarResultados(ArrayList<Integer> array, int Media) {
	
		System.out.println(array);
		System.out.println(Media);
		int mayores = 0;
		
		for (Integer valor : array) {
			if(valor > Media) {
				mayores++;
				
			}
		}
		System.out.println("Hay un total de " + mayores + " numeros mayores.");	
	}
}
