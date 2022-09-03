package Ejercicios_Arrays_01;

public class Arreglos04For_each {

	public static void main(String[] args) {
		String [] nombre = {"Alejandro","maria","luisa","Narcisa","Carlos","Rebeca",};
		//tienes que poner al iterador [i] el mismo tipo de dato
		for (String i : nombre) {
			System.out.println("Nombre: " +i);
			//con el iterador i te muestra todos lo ELementos del arreglo
		}
	}

}
