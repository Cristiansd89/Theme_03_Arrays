package Excepciones;

import java.util.Scanner;
public class PilaEstatica {
	Scanner ent = new Scanner(System.in);
	
	int cima;
	char Pila[];
	int TamMax;
	
	public PilaEstatica()
	{
		System.out.println("introduce el tamaño del Array");
		TamMax = ent.nextInt();
		Pila = new char[TamMax];
		cima = 0;
		
	}
	public boolean PilaVacia() 
	{
		return (cima ==0);
	}
	
	public boolean PilaLLena() 
	{
		return (cima == TamMax);
	}
	
	public void insertar(char letra) {
		
		
		if(PilaLLena()) {
			System.out.println("La Pila esta llena ");
		}else {
			Pila[cima] = letra;
			cima++;
		}
		
	}
	public char sacar() 
	{
		
		if(PilaVacia()) {
			System.out.println("La pila esta vacia");
			return 0;
		}else {
			cima--;
			return Pila[cima] ;
			
		}
	}
	
	public void Rellenar() 
	{
		for(char letra = 'a'; letra < 'z';letra ++ ) 
		{
			insertar(letra);
		}
		
		
	}
	public void Vaciar() {
		while(!PilaVacia()) {
			System.out.println(sacar());
		}
			
		}
}

