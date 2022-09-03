package Ejercicios_Arrays_03_Cadenas;

import java.io.IOException;

public class TestCadena {

	public static void main(String[] args) throws IOException {
		
		Cadena Array = new Cadena(20);
		
		Array.leerCadena();
		Array.mostrarCadena();
		Array.LongitudCadena();
		
		Array.eliminarVocales();
		Array.mostrarCadena();
		
		if(Array.esPalindromo()) 
		{
			System.out.println("La cadena es un palindromo");
		}else {
				System.out.println("La cadena no es un palindromo");
		}
		
		
		

	}

}
