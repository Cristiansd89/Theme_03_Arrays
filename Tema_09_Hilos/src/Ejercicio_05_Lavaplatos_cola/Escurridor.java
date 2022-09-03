package Ejercicio_05_Lavaplatos_cola;

public class Escurridor {
	
	//Atributos
	private int platos[];
	private int primero;
	private int ultimo;
	private int tamMax;
	
	/* Constructor (al ser una cola, necesito que el tamaño del array sea tan grande como el nº de platos que quiero lavar, 
	 * ya que las posiciones utilizadas 1 vez no se pueden reutilizar) */
	public Escurridor() {
		this.tamMax = 15;
		this.primero = 0;
		this.ultimo = 0;
		this.platos = new int[tamMax];
	}
	
	public boolean estaLleno() {
		return ultimo == tamMax;
	}
	
	public boolean estaVacio() {
		return primero == ultimo;
	}
	
	//Al lavar el plato, lo pongo en el siguiente lugar disponible del escurridor y avanzo esa posición
	public void lavar(int plato) {
		platos[ultimo] = plato;
		ultimo++;
	}
	
	//Al secar un plato, avanzo una posición y devuelvo el valor de la anterior (el plato que acabo de secar)
	public int secar() {
		primero++;
		return(platos[primero-1]);
	}
}