package Lista_Enlazada;

public class ListaEnlazada 
{
	///atributos
	Nodo inicio;//referencia de donde queremos que apunte
	
	
	//metodo Contrsuctor
	public ListaEnlazada() {
		inicio = null;
		
	}
	public boolean estaVacia() 
	{
		return(inicio == null);
	

	}
	
	public void insertar(Object datos) 
	{
		Nodo nuevoNodo = new Nodo(datos);
		if(this.inicio == null) 
		{ //Si inicio  es igual a null quiere decir que esta vacia y hay que 
			//crear un nodo
			this.inicio = nuevoNodo;
		}else {
			Nodo nodoActual = inicio.Enlace; 
			if(nodoActual == null) 
			{
				inicio.Siguente(nuevoNodo);
			}else 
			{
				while(nodoActual.Enlace != null) {
					nodoActual = nodoActual.Enlace;
					
				}
				nodoActual.Siguente(nuevoNodo);
			}
		}
	}
	//No esta acabado
	public void mostrarElementos() {
		Nodo nodoActual = inicio.Enlace;
		while(nodoActual.Enlace != null) {
			System.out.println(nodoActual);
			nodoActual = nodoActual.Enlace;
		}		
	}
		
	
		
	
}
