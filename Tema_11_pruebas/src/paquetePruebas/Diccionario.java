package paquetePruebas;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Diccionario {

	public static void main(String[] args) {
		
	 ;
		
		Map<String , Integer> PrecioProductos = new HashMap<String , Integer>(); //Diccionario
		String productos [] = {"Manzana","Peras","Naranjas","Patatas","Limones", "Melones", "Cebollas","Ajo","Platanos"};
		int precios []= {1,2,3,2,1,4,3,1,5};
		
		
		 for (int i = 0; i< productos.length ; i++) { // Introducimos los precios dentro del diccionario
				String	producto = productos[i]; // Pasamos a una variable individual para poder introducirlo en
				int precio = precios[i]; // el diccionario
				
				PrecioProductos.put(producto,precio); //
			}
		 
		 
		 
		 for (Entry<String, Integer> producto : PrecioProductos.entrySet()) {
			 
			    System.out.println("clave= " + producto.getKey() + ", valor= " + producto.getValue());
			}


	}

}
