package Tema_1_EstructurasControl;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		
		int numero = PedirNumero();
		esPar(numero);
		

	}
	public static int PedirNumero() {
		Scanner ent = new Scanner(System.in);
		int numero;
		System.out.println("introduce un numero :");
		return numero = ent.nextInt();
		
	}
	
	public static void esPar(int numero) {
		
		
		if (numero%2==0) {
			System.out.println("El numero " +numero + "  es par");
			
		}else {
			System.out.println("El numero " +numero + "  es impar");
		}
	}

}
