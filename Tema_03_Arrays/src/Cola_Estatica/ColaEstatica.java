package Cola_Estatica;
/**
 * Una cola es un estructura en la cual el primero en entrar es el primero en salir
 * (FIFO)
 * Vamos a emlear una cola lineal  sobre un array
 * @author cristian
 *
 */

	public class ColaEstatica {
	
	///Atributos
	
	private int fin;
	private int inicio;
	private int tamMax;
	private char cola [];
	
	public ColaEstatica () {
	fin = 0;
	inicio = 0;
	tamMax = 'z'-'a' +1;
	cola = new char [tamMax];
	}


/**
 * hacemos un metodo para comprobar si la cola esta llena
 * 
 */
	public boolean colaLlena()
	{
	return (fin == tamMax);
	}
	
	
	public void meter(char letra) 
	{
		if(colaLlena()) {
			System.err.println("ERROr : la cola esta llena");
		}else {
			cola[fin] = letra;
				fin++;
		}
	}
	//hacemos un metodo que compruebe si la cola esta vacia
	public boolean colaVacia() 
	{
		return (inicio == fin);
	}
	
	
	public char sacar() 
	{
		if(colaVacia()) {
			System.err.println("Error: la cola esta vacia");
			return 0;
		}else {
			inicio ++;
			return cola[inicio-1];
		}
	}
	//hacemos un metodo para rellenar la cola con las letras del abcedario
	public void rellenar() {
		for (char letra = 'a'; letra <= 'z'; letra++) {
			meter(letra);
		}
		
	}
	public void vaciar() {
		while(!colaVacia()) {
			System.out.println(sacar()+ "");
		}
	}
}