package Ejemplo_Hilos2;

// THREAD implementando el interfaz runnable()

public class RunnableSimple implements Runnable
{
	String nombreThread;
	
	// constructor
	
	public RunnableSimple(String s)
	{
		nombreThread=new String(s);
		
	} // constructor
	
	public void run()
	{
		for (int i=0;i<5;i++)
			System.out.println("Este es el Hilo "+nombreThread);
	} // run
} // class