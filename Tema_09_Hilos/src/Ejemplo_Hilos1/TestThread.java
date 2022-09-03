package Ejemplo_Hilos1;

// THREAD

// Para probar ThreadSimple

public class TestThread
{
	public static void main(String arg[])
	{
		
		// Se definen los Thread
		
		ThreadSimple miThread=new ThreadSimple("Mi Thread");
		ThreadSimple tuThread=new ThreadSimple("Tu Thread");
		ThreadSimple suThread=new ThreadSimple("Su Thread");
		
		// Se ejecutan los Thread
		
		miThread.start();
		tuThread.start();
		suThread.start();

	} // main
} // class