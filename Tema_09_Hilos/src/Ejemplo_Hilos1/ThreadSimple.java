package Ejemplo_Hilos1;

// THREAD

// Hereda de la clase Thread
import java.lang.*;

public class ThreadSimple extends Thread
{
	
	// Constructor que recibe un String para identificar la tarea
	
	public ThreadSimple(String s)
	{
		super(s);
		
	} // Constructor
		
	public void run()
	{
		for (int i=0;i<5;i++)
		{
			System.out.println("Este es el Thread "+getName());
			
			/* Detiene el proceso. Controlamos el error para que no d�
				 error en en compilaci�n en el m�todo sleep() */
			
			 try
			 {	 

			   sleep((long)(Math.random()*500));
			
		//	yield(); // Cede tiempo de procesador a otro proceso
			
			} // try
			
			 catch (InterruptedException error)
			 {
			 }// catch
		
		} // for
	} // run
	
} // class