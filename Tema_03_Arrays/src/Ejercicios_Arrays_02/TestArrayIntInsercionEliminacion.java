package Ejercicios_Arrays_02;

public class TestArrayIntInsercionEliminacion {

	public static void main(String[] args) {
		///Creamos un objeto
		ArraysEnteros array = new ArraysEnteros();
		
		//Introducimos datos en el array
		array.PedirArray();
		
		//Enviamos a pantalla el contaenido del array
		array.MostrarArray();
		
		//Insertamos un dato
		array.InsertarDato(3);
		
		array.MostrarArray();
		array.EliminarPosicion();
		array.MostrarArray();
	}	

	}


