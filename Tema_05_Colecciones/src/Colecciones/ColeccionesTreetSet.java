package Colecciones;

import java.util.TreeSet;

public class ColeccionesTreetSet {

	public static void main(String[] args) {
		
		/**
		 * Metodo para insertar en un orden determinado
		 */
		TreeSet<Cliente> c1 = new TreeSet<Cliente>();
		
		c1.add(new Cliente("111","Marta",20));
		c1.add(new Cliente("115","Jorge",21));
		c1.add(new Cliente("112","Carlos",18));
		
		System.out.println(c1);
		
		/**
		 * Intentamos insertar otro nombre repetido pero el interfaz no lo introduce
		 */
		boolean insertado = c1.add(new Cliente("111","Marta",20));
		
		System.out.println(insertado);
		System.out.println(c1);
		
		
	
		
	}
	

}
