package Excepciones;

import java.util.Scanner;

public class Ejemplo_06 {

	public static void main(String[] args) {
		
		
		Scanner ent = new Scanner(System.in);
		
		int a,b;
		int c = 0;
		
		
		System.out.println("Introduzca dividendo :");
		a = ent.nextInt();
		
		
		System.out.println("Introduzca divisor :");
		b = ent.nextInt();
		
		
		
		try {
			c = a/b;
			
		}catch(ArithmeticException fallo) {
			System.out.println("Salta el error ");
			System.out.println("Nose puede dividir por cero");
			System.out.println(fallo.getMessage());
			System.out.println(fallo);
		}
		System.out.println("La division de " +a+  " / " +b+  " = "  +c);

	}

}
