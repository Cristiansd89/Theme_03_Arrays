package Ejercicios_Arrays_01;

import java.util.Scanner;

public class Arreglos13_DesplazarPosicionN {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		int Tabla[] = new int [10];
		int ultimo;
		int N; //Numero de desplazamientos
		
		//Pedir los numeros para el Array
		System.out.println("Introduce los datos del Array");
		for(int i= 0 ; i < 10 ; i++) {
			System.out.println("Numero  " +(i+1)+":");
			Tabla[i] = ent.nextInt();
		
		}
		///Pedimos el numeros de posiciones que queramos mover
		System.out.println("Cuantos puestos quieres desplazar los numeros :");
		N = ent.nextInt();
		///Este for marca el numero de posiciones que se van a mover los datos
		for(int j = 0; j < N;j++) {
			ultimo =Tabla[9];
			///Este for movemos los datos de uno en uno el de fuera marcarlas veces que repetiremos esta operacion
			for(int i = 8; i>=0; i--) {
				 Tabla[i+1] = Tabla[i];
			
			}
			Tabla[0] = ultimo;
		}
		//Mostramos los movimientos del Array
		System.out.println("El Array Modificado es:");
		for(int i = 0;i < 10; i++) {
			System.out.println(Tabla[i]);
		}
		
		
		
	}

}
