package ColaDinamica;

public class ColaDInamica 
{
	///Atributos 
	private Nodo Primero;
	private Nodo Ultimo;
	
	public ColaDInamica()
	{
		
		Primero = null;
		Ultimo = null;
		
	}
	
	public boolean ColaVacia() 
	{
		return (Primero == null);
		
	}
	//aqui no tiene sentido preguntar si no hay espacio por que es dinamica
	public void meter(Object obj)
	
	{
		Nodo nuevo = new Nodo(obj,null);
		
		if(ColaVacia())
		{
			Primero = nuevo;
			

		}else 
		{
			//Enalazamos el ultimo nodo con el nuevo
			Ultimo.enlace = nuevo;
			
		}
		Ultimo = nuevo;
	}
	
	public Object sacar()
	{
		if(ColaVacia()) 
		{
			System.out.println("la cola esta Vacia");
			return null;
		}else 
		{
			Object aux = Primero.info;
			//Hacemos que primero apunte al siguiente Nodo
			Primero = Primero.enlace;
			return aux;
			
		}
		
	}
		public void rellenar() {
			for (char letra = 'a'; letra <= 'z'; letra++) {
				meter(letra);
			}
			
		}
		public void vaciar() {
			while(!ColaVacia()) {
				System.out.println(sacar()+ "");
			}
		
		
		
	}

}
