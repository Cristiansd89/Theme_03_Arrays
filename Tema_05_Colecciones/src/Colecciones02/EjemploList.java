package Colecciones02;

	import java.util.ArrayList;
	import java.util.LinkedList;
	import java.util.Vector;

	/**
	 *
	 * @author Marina
	 */
public class EjemploList
{
	    
	   
	  
		public static void main(String[] args) 
		{ 
	            ejemploArraylist();
	            ejemplolinkedList();
	          
		} 
	        
	        
	        
	        private static void ejemploArraylist() {
	            System.out.println("ut11colecciones.EjemploList1.ejemploArraylist()");
	            ArrayList l = new ArrayList();//crea uno vacío.
	            l.add("S");
	            l.add("R");
	            l.add("I");
	            l.add("H");
	            l.add("A");
	            l.add(null);
	            System.out.println(l); //[S, R, I, H, A, null]
	            l.remove(2);
	            System.out.println(l);//[S, R, H, A, null]
	            l.add(2,"j");
	            l.add("win");
	            System.out.println(l); //[S, R, j, H, A, null, win]
	        }
	        
	        private static void ejemplolinkedList() {
	            System.out.println("ut11colecciones.EjemploList1.ejemplolinkedList()");
	            LinkedList l = new LinkedList();
	            l.add("S");
	            l.add("R");
	            l.add("I");
	            l.add("H");
	            l.add("A");
	            l.add(null);
	            System.out.println(l); //[S, R, I, H, A, null]
	            l.removeLast(); 
	            System.out.println(l);//[S, R, I, H, A]
	            l.addFirst("j");
	            l.addLast("win");
	            System.out.println(l); //[j, S, R, I, H, A, win]
	            l.removeFirst();
	            System.out.println(l); //[S, R, I, H, A, win]
	            System.out.println(l.getLast()); //win
	        }
	        
	       
	                
	}


