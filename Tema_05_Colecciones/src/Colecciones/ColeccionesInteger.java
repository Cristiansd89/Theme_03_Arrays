package Colecciones;

import java.util.ArrayList;
import java.util.Iterator;

public class ColeccionesInteger
{

	public static void main(String[] args)
	{
		ArrayList <Integer> num = new ArrayList<Integer>();
		
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(7);
		num.add(33);
		num.add(98);
		num.add(154);
		num.add(76);
		
		System.out.println(num.get(4));
		
		System.out.println(" ");
		//Este metodo Machaca el numero que le marquemos en la posicion
		num.set(3, 69);
		num.add(4, -99);
		System.out.println(" ");
		Iterator<Integer> it = num.iterator();
		while (it.hasNext())
		{
			Integer numero = it.next();
			System.out.println(numero);
		}
		
		
		num.remove(4);
		System.out.println("");
		System.out.println(num);
	}
}
