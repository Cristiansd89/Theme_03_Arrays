package Tema_1_EstructurasControl;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
			
			int altura = pideAltura();
			int base = pideBase();
			int Area = calcularArea(altura, base);
			int Perimetro = calcularPerimetro(altura, base);
			mostrarResultado(Area,Perimetro);
			
	}
	
	
	public static int pideAltura() {
		Scanner ent = new Scanner(System.in);
		int altura;
		
		System.out.println("Introduce el Base :");
		 return altura = ent.nextInt();
	}
	public static int pideBase() {
		Scanner ent = new Scanner (System.in);
		
		int Base;
		
		System.out.println("introcue el Base:");
		return Base = ent.nextInt();
	}
	
	public static int calcularArea(int altura,int base) {
		int Area ;
		
		 return Area = base * altura; 
		
		
	}
	public static int calcularPerimetro(int altura,int base) {
		
		int perimetro;
		
		 return perimetro = (base*2)+ (altura*2);
		
		
		
		
	}
	public static void mostrarResultado(int Area,int perimetro) {
		System.out.println("El Perimetro del rectangulo es : " +perimetro);
		System.out.println("El Area del rectangulo es : " +Area);
	}

}
