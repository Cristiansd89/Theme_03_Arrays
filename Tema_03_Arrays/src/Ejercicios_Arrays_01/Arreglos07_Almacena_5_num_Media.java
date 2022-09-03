package Ejercicios_Arrays_01;

import java.util.Scanner;
public class Arreglos07_Almacena_5_num_Media {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		float numero[] = new float[5];
		
		float suma_positivos = 0;
		float suma_negativos = 0;
		float media_positivos, media_negativos;
		int contador_positivos = 0;
		int contador_negativos = 0;
		int contador_ceros = 0;
		
		System.out.println("Guarda los numeros en el Array");
		for (int i = 0; i< 5; i++) {
			System.out.print("introduce el numero "+(i+1)+ ":");
			numero[i] = ent.nextFloat();
			
			if(numero[i] == 0) {
				contador_ceros++;
			}
			else if (numero[i] > 0) {
				suma_positivos+= numero[i];
				contador_positivos++;
			}
			else {
				suma_negativos+= numero[i];
				contador_negativos++;
				
			}
		}
		//Media de los numeros positivos
		
		if(contador_positivos == 0) {
			System.out.println("No se puede Sacar la media de numeros positivos");
			
		}else {
			media_positivos = suma_positivos/contador_positivos;
			System.out.println("La media de numeros positivos es: " +media_positivos);
		}
		//Media de Numeros Negativos
		if(contador_negativos == 0) {
			System.out.println("No se puede Sacar la media de numeros negativos");
			
		}else {
			media_negativos = suma_negativos/contador_negativos;
			System.out.println("La media de numeros negativos es: " +media_negativos);
		}
		System.out.println("Cantidad de ceros: " +contador_ceros);
	}

}
