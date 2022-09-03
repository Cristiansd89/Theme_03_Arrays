package Colecciones;

import java.util.ArrayList;



public class Coleccion1 {

	public static void main(String[] args) {
		
		ArrayList<Cliente> clie1 = new ArrayList<>();
		
		
		/**
		 * Metodos para insertar
		 */
		Cliente  cliente = new Cliente("111","Marta",20);
		//Estamos añadiendo  el objeto clie al Arraylist
		clie1.add(cliente);
		
		//Tambien se puede añadir de esta manera
		//clie1.add(new Cliente("111","Marta",20));
		clie1.add(new Cliente("115","Jorge",21));
		clie1.add(new Cliente("112","Carlos",18));
		
		
		System.out.println(clie1);
		System.out.println(clie1.size());
		System.out.println(clie1.isEmpty()+ "  La lista esta Vacia");
		
		
		//para comprobar si un elemento esta en lista
		 System.out.println(clie1.contains(new Cliente("115","Jorge",21)));
		 System.out.println("El cliente  Jorge se encuentra en la lista " +clie1.contains(new Cliente("115","Jorge",21)));
		/**
		 * Para eliminar solo elimina el primer elemento de la lista
		 */
		clie1.remove(cliente);
		
		System.out.println(" ");
		System.out.println("---Eliminando cosas-------");
		System.out.println(" ");
		System.out.println(clie1);
		System.out.println(clie1.size());
		
		
		System.out.println("------Eliminando todo ------");
		System.out.println(" ");
		clie1.clear();
		System.out.println(clie1);

		System.out.println(" ");
		System.out.println(clie1.size());
		
		System.out.println(clie1.isEmpty()+ "  La lista esta Vacia");
		
		
		
	}

}
