package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class Colecciones2 
{

	public static void main(String[] args) 
	{
		ArrayList<Cliente> cliente = new ArrayList<Cliente>();
		
		cliente.add(new Cliente ("113","juan",43));
		cliente.add(new Cliente ("123","Carla",25));
		cliente.add(new Cliente ("141","Luis",45));
		cliente.add(new Cliente ("154","Francisco",28));
		cliente.add(new Cliente ("176","Enrique",32));
		cliente.add(new Cliente ("198","Pilar",38));
		cliente.add(new Cliente ("232","juana",76));
		cliente.add(new Cliente ("245","Isabel",55));
		cliente.add(new Cliente ("152","Rocio",44));
		
		
		
		System.out.println(cliente);
		
		//Esto es un iterador
		Iterator<Cliente> it = cliente.iterator();
		// hasnNext comprueba si quedan elementos por visitar devuelve True o False 
		while(it.hasNext())
		{
			///next devuelve una copia del siguente elemento  y avanza una posicion
			Cliente Clie = it.next();
			if(Clie.edad < 50)
			{
				System.out.println(Clie.nombre);
			}
			
				
		}
			
			
		}
	}


