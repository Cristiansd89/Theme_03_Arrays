package Ejemplo_Hilos2;

public class TestRunnableSimple
{
	public static void main(String arg[])
	{
		
		// Declaramos los objetos RunnableSimple
		
		RunnableSimple r=new RunnableSimple("Primer Runnable");
		RunnableSimple s=new RunnableSimple("Segundo Runnable");

		// Nos creamos los objetos RunnableSimple
		
		Thread t1=new Thread(r);
		Thread t2=new Thread(s);
		
		// Se inician los Thread
		
		t1.start();
		t2.start();

	} // main
} // class