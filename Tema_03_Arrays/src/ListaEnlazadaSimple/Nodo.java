package ListaEnlazadaSimple;

public class Nodo {
	//Atributos
	Object info;
	Nodo enlace;
	
	
	
	//Metodo COnstructor
	public Nodo(Object info, Nodo enlace) 
	{
		this.info = info;
		this.enlace = enlace;
	}
}
