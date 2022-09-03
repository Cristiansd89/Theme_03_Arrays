package Ejercicios_Arrays_02;

public class TestArrayIntBusquedaSecuencial {

	public static void main(String[] args) {
		
		///Creamos un objeto
		ArraysEnteros Array = new ArraysEnteros();
		
		//Introducimos los datos en el Array
		Array.PedirArray();
		
		
		//Enviamos los datos por pantalla
		Array.MostrarArray();
		
		
		System.out.println("Busqueda Secuencial 1");
		int buscando = 3;
		int pos = Array.BusquedaSecuencial(buscando);
		boolean existe = (pos != -1);
		
		if(existe) 
		{
			System.out.println(buscando + "Esta en la posicion" + pos);
			
		}else 
		{
		}
		System.out.println("No esta en el Array");
		}
		

	}


