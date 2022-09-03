package ColaDinamica;

public class Nodo {
	/**
	 * Este nodo
	 */
	Object info;
	Nodo enlace;
	
	
	
	//Metodo COnstructor
	public Nodo(Object info, Nodo enlace) 
	{
		this.info = info;
		this.enlace = enlace;
	}
}
