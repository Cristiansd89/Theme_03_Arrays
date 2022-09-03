package ListaEnlazadaSimple;
/**
 * Fecha : 12/02/ 2021
 * una lista enlazada simple es una sevcuencia de nodos. Cada nodo tendrá un apar de atributos: uno de ellos guarda 
 * la informacion y le vamos a llamar "info y el otro guardaria la referencia la ra otro nodo; lamos a llamar "enlace"
 * @author cristian
 *
 *Tendremos una referencia llamada inicio que apuntará siempre al primer nodo de la lista.
 *
 *
 *
 *el final de lista lo sabemos por que  el ultimo nodo , en el atributo enlace , tendrá un "null"
 */
public class listaEnalazada {
	
	///atributos
	
	Nodo inicio;//Apunta o referencia el primer nodo de la lista
	 
	/**constructor */
	public listaEnalazada() {
		inicio = null;
		
	}
	/**Este metodo inserta un nodo al principio de la lista */
	public void insertarPrincipio(Object obj) {
		//Creamos un nuevo nodo
		Nodo nuevoNodo = new Nodo(obj,inicio);
		//Actualizamos inicio
		inicio = nuevoNodo;
	}
	
	/**visialuza en pantalla el contenido de la lista*/
	public void verLista()
	{
		
		//nos situamos en el primer nodo de la lista .
		Nodo actual = inicio;
		// Recorremos toda la lista
		while(actual != null)
		{
		System.out.println(actual.info);	
		actual = actual.enlace;
		}
		
	}
	public boolean listVacia() 
	{
		return (inicio == null);
	}
	/**
	 * Este método inserta un nodo al final de la lista 
	 */
	public void insertarFinal(Object obj)
	{
		//Creamos un nuevo nodo
		
		Nodo nuevo = new Nodo(obj, null);//tienes que meter dos parametros
		//comprobamos si esta la lista vacia
		if(listVacia()) {
			inicio = nuevo;
		}else{
			//Enlazamos el ultimo nodo con el nuevo
			//Nos situamos en el ultimo nodo
			Nodo actual = inicio;
			
			
			while (actual.enlace != null) {
				//avanzamos al siguiente nodo
				actual=  actual.enlace;
				
			}
			//Enlazamo con el ultimo nodo
			actual.enlace = nuevo;
		}
		
	}
	/**
	 * Este metodo elimina un metodo de la lista 
	 * Vamos a plantearnos que variable necesitamos
	 * Para recorer la lista nos hara falta un booleano que detecte si ha encontra o no le elemntos aeliminar
	 * Una vez encontrado , me  planteo si es el primero, si es asi Inicio deberia apuntar al siguiente nodo. Sino es 
	 * el primero enlazamos el nodo anterior con el siguiente
	 */
	public boolean eliminar(Object obj)
	{
	//Variables que necesito
		boolean encontrado = false;
		Nodo actual = inicio;
		Nodo anterior = null;
		//Recorremos la lista
		
		while(actual != null && !encontrado) 
		{
			//Comprobamos si el elemento buscado coindidi con la informacion  que esta en el nodo
			
			if(obj.equals(actual.info))
			{
				encontrado =true;
			}else 
			{
				//Avanzamos al siguiente nodo
				anterior = actual;
				actual = actual.enlace;
			}
			
		}
		//comprobamos si lo ha encontrado
		if(encontrado) 
		{
			//Comprobamos si es el primero
			if (actual == inicio)
			{
				inicio = inicio.enlace;
			}else {
				//Enalazamos el nodo anterior con el siguiente
				anterior.enlace = actual.enlace;
			}
		}
		return encontrado;
	}
	/**
	 * Creamos un metodo que haga una busqueda dentro de la lista
	 * @param obj
	 * @return
	 */
	
	public Nodo Busqueda (Object obj) 
	{
			//Me sitio al principio de la lista
		Nodo actual = inicio;
		while (actual != null) 
		{
			if (actual.info.equals(obj)) 
				{
					return actual;
				}
			actual = actual.enlace;
		}
		return null;
		}
	public Nodo busquedaFor(Object obj) 
	{
		
		for(Nodo actual = inicio; actual != null;actual = actual.enlace) 
		{
			if (actual.info.equals(obj)) 
			{
				return actual;
			}
			
		}
		return null;
	}
	
}
