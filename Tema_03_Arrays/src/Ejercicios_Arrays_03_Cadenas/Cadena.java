package Ejercicios_Arrays_03_Cadenas;

import java.io.IOException;
import java .util.Scanner;

public class Cadena {
	Scanner ent = new Scanner(System.in);
		///Atributos
	
	 private int numElem;
	 private char caracter [];
		
		///Metodo COsntructuctor
	public Cadena(int numElem) 
	{
		this.numElem = numElem;
		
		
		caracter = new char [numElem+1];
	}
	//Copia del metodo Constructor
	public Cadena(Cadena copia) 
	
	{	
		this.numElem = copia.numElem;
		caracter[numElem] = caracter[numElem+1];
		int i;
		for( i = 0; copia.caracter[i] != '\0'; i++) 
		{
			caracter[i] = copia.caracter[i];
		}
		caracter[i] = '\0';
	}
	/**
	 * Este metodo se utiliza para introducir los datos dentro del Arrays
	 * @throws IOException
	 */
	public void  leerCadena() throws IOException
	{
		System.out.println("Introduce una cedena :");
		int i = 0;
		char letra = (char)System.in.read();
		while(i < numElem && letra != '\n')
		{
			caracter[i] = letra;
			i++;
			letra = (char)System.in.read();			
		}
		caracter[i] = '\0';
		
	}
	/**
	 * Este metodo para mostrar la  cadena intorducida
	 */
	public void mostrarCadena () {
		 
		for (int i = 0; caracter[i] != '\0'; i++)
		{
			System.out.print(caracter[i]);
		}
	}
	
	/**
	 * Con este metedo a veriguamos la longitud de la cadena
	 * @return
	 */
	public int  LongitudCadena() 
	{
		
		int i = 0;
		while(caracter[i] != '\0') 
		{
			i++;
		}
		System.out.println("La longitud de la cadenas es :" +i);
		return i;
	}
	public void eliminarVocales() 
	{
		
		for(int i = 0; caracter[i] != '\0'; i++) 
		{	//EsVocal es un metodo
			if(esVocal(caracter[i])) 
			{
				for(int j = i; caracter[j] != '\0'; j++) 
				{
					caracter[j] = caracter[j+1];
				}
				
			}
		}
	}
/**
 * Este metodo que utilizamos es para ver si es o no es una  vocal
 * @param letra
 * @return
 */
	public boolean esVocal(char letra)
	{
		letra = Character.toLowerCase(letra);
		return(letra == 'a' || letra =='e' || letra == 'i' || letra =='o' || letra == 'u');
	}
	
	/**
	 * Metodo par ver si la palabara es o no es un palindromo
	 */
	public boolean esPalindromo() 
	{
		int ultimaPoscion = LongitudCadena()-1;
		
		for(int i = 0; 1 < ultimaPoscion/2; i++)
		{
			if(caracter[i] != caracter[ultimaPoscion -1])
			{
				return false;
			}
		}
		return true;
	}
	
	public void eliminarBlancos() {
		
		for(int i = 0; caracter[i] != '\0'; i++)
		{
			if(!esVocal(caracter[i]))
			{
				
				
			}
		}
	}
}
