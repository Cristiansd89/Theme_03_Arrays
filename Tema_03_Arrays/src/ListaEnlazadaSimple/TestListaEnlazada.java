package ListaEnlazadaSimple;

import java.util.Scanner;
public class TestListaEnlazada {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		listaEnalazada  lista = new listaEnalazada();
		
		lista.insertarPrincipio("Maria");
		lista.insertarPrincipio("Luismi");
		lista.verLista();
		System.out.println("\n\n");
		lista.insertarFinal("Carlos");
		lista.insertarFinal("Rebeca");
		lista.insertarFinal("Luismi");
		lista.verLista();
		lista.eliminar("Carlos");
		System.out.println("\n\n");
		lista.verLista();
		System.out.println(lista.eliminar("Luismi"));
		System.out.println("introduce nombre a buscar");
		String buscado = ent.nextLine();
		
		Nodo referencia = lista.Busqueda(buscado);
		
		boolean existe = (referencia != null);
		if(existe)
		{
			System.out.println(buscado+" esta en la lista");
			
		}else 
		{
			System.out.println( buscado+ " no esta en la lista");
		}
		
		
		
		 referencia = lista.busquedaFor(buscado);
		
		System.out.println("introduce nombre a buscar");
		
		if(existe)
		{
			System.out.println(buscado+" esta en la lista");
			
		}else 
		{
			System.out.println( buscado+ " no esta en la lista");
		}
	}

}
