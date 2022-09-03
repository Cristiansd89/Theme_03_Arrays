package Excepciones;

import java.io.IOException;

public class Ejemplo_03 {

	public static void main(String[] args) 
	{
		//Creamos unaa funcion  E respuesta

		char Respuesta = getRespuesta();
		
		
	}
	
	public static char getRespuesta () 
	{
		
		boolean ResValida = false;
		char Respuesta ='a';
		System.out.println("¿Quieres serguir? Introduce s o n");
		do 
		{
			try 
			{
	
				Respuesta =(char)System.in.read();
				Respuesta = Character.toLowerCase(Respuesta);
				//Limpiamos el buffer
				System.in.skip(2);
				ResValida = (Respuesta == 'n' || Respuesta =='s');
				//Comprobamos la respuesta
				if (!ResValida) 
				{
					System.out.println("Error, la repuesta no es Valida , introduduzca s o n");
				}
			
			}
			catch (IOException error) 
			{
				System.err.println("Error entrada y salida:" +" " +error.getMessage());
			}
			
			
		}while (!ResValida);
		System.out.println("Fin del programa");
		return Respuesta;
			

	}
	}


