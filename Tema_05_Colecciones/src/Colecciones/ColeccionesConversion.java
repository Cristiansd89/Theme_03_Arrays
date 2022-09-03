package Colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



public class ColeccionesConversion {

	public static void main(String[] args) {
	
		Set<Integer> s1 = new LinkedHashSet<Integer>();
		
		s1.add(4);
		s1.add(3);
		s1.add(10);
		s1.add(5);
		s1.add(6);
		
		System.out.println(s1);
		
		
		System.out.println(" ");
		
		System.out.println("con TreeSet Ordenamos la lista");
		Set<Integer> s2 = new TreeSet<>();
		s2.addAll(s1);
		
		
		System.out.println(s2);
		
		
		
		
		List<Integer> l1 = new ArrayList<>();
		l1.add(4);
		l1.add(10);
		l1.add(2);
		l1.add(13);
		l1.add(5);
		
		
		/**
		 * Intercambia una posicion por otra
		 */
		Collections.swap(l1, 1, 4);
		//Remplaza un numero por otro
		Collections.replaceAll(l1, 4, 99);
		System.out.println(l1);
		
		
		
		
		System.out.println(" ");
		
		Set <Integer> l2 = new TreeSet<>();
		l2.addAll(l1);
		
		
		
		System.out.println(l2);
		
		

	}

}
