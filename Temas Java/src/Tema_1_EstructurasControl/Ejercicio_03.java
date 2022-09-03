package Tema_1_EstructurasControl;


import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) {
		int numero = PedirNumero();
		esMayor(numero);
	}
	
	public static int PedirNumero() {
		Scanner ent = new Scanner(System.in);
		int numero;
		System.out.println("introduce un numero :");
		return numero = ent.nextInt();
		
	}
	
	public static void esMayor(int numero) {
		 if (numero > 0) {
			 System.out.println("El numero " +numero+ " Es mayor que 0");
		 }else {
			 System.out.println("El numero " +numero+ " Es menor que 0");
		 }
		
	}
}
