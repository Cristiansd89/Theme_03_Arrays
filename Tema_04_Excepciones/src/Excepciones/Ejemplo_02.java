package Excepciones;

import java.io.IOException;

public class Ejemplo_02 {

	public static void main(String[] args) throws IOException {
		//Creamos unaa funcion  E respuesta

		char Respuesta = getRespuesta();
		
		
		
		
		
		
	}
	public void setRespuesta() {
		
		
		
	}
	public static char getRespuesta () throws IOException
	{
		
		boolean ResValida = false;
		char Respuesta ;
		do {
		System.out.println("¿Quieres serguir? Introduce s o n");
		Respuesta =(char)System.in.read();
		//Limpiamos el buffer
		System.in.skip(2);
		ResValida = (Respuesta == 'n' || Respuesta =='s');
		//Comprobamos la respuesta
		if (!ResValida) {
			System.out.println("Error, la repuesta no es Valida , introduduzca s o n");
		}
		
	}while (!ResValida);
	return Respuesta;
	}
}
		
	