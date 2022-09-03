package Ejercicio_07_Procesos;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;



///Procesos en javaaaaa
public class EjercicioProcesos_ {

	public static void main(String[] args) {
		Process process;
		
		try {
			if(args.length !=1) {
				throw new ErrorArgumentos();
			}else {
				  
				Runtime run1 = Runtime.getRuntime();
				
				Process proc = run1.exec(args[0]);
								
				System.out.println(proc.exitValue());
				leerComando(proc);
			}
			
			
			
			
		} catch (ErrorArgumentos e) {
			System.out.println("Falla el numero de argumentos");
		}catch (Exception e) {
		}

	}
	//Le paso el objeto process
	public static void leerComando (Process proceso) {
		
		
		try{
			String contenido;
			final String eof = null;
			InputStreamReader archivo = new InputStreamReader(proceso.getInputStream());
			
			BufferedReader leer = new BufferedReader(archivo);
			
			contenido = leer.readLine();
			while(contenido != eof) {
				System.out.println(contenido);
				contenido = leer.readLine();
				
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}

class ErrorArgumentos extends Exception{
	public ErrorArgumentos() {
		super();
	}
	
	
}
