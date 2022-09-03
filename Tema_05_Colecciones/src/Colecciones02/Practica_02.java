package Colecciones02;

import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Practica_02 {

	public static void main(String[] args) 
	{
		List<Integer> lista = LeerArrays(); 
		Set<Integer> listaOrdenada = SinRepeticiones(lista);
		OrdenarLista(lista);
		MostrarListas(lista,listaOrdenada);
		
	}
	public static List LeerArrays()
	{
		
		Scanner ent = new Scanner(System.in);
		int num;
		List<Integer> lista = new ArrayList<>();
		for(int i = 0 ; i < 10; i++) {
			num = (int)(Math.random()*100);
			lista.add(num);
		}
		return lista;
	}
	public static List OrdenarLista(List<Integer> lista) 
	{
		Collections.sort(lista);
		Collections.reverse(lista);
		return lista;
		
	}
	
	public static void MostrarListas(List<Integer> lista, Set<Integer> listaOrdenada) 
	{
		System.out.println("Lista Aleatoria ");
		System.out.println(lista);
		
		System.out.println("  ");
		System.out.println(" Lista sin Repeticiones");
		System.out.println(listaOrdenada);
	}
	public static  Set SinRepeticiones(List<Integer> lista)
{
		Set<Integer> listaOrdenada = new TreeSet<>();
		listaOrdenada.addAll(lista); 
		return listaOrdenada;
		
	}
	
	public static LinkedList InsercionOrdenada() 
	{
		
		Integer num;
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		///insertamos el primer numero 
		lista.add((int)Math.random()*100);
		
		for(int i = 0 ; i < 10; i++) 
		{
			num = (int)(Math.random()*100);
			//Buscamos el sitio donde insertarlo
			int indice = 0;
			while(indice < i && num < lista.get(indice))
			{
			
			indice++;
			
			}
		lista.add(indice, num);
		}
	
		return lista;
	}
	
	
	
}
///Interfaz para  para utilizar el metodo compareTo
class  EnterosDecrecientes implements Comparator <Integer>

{
	
	@Override
	public int compare(Integer obj1, Integer obje2) 
	{
		return obj1- obje2;
		
	}


	
}





