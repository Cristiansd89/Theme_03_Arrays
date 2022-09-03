package Colecciones02;


import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Marina
 */
public class Ejemplo0Iteradores {
     public static void main(String[] args) {
         
        
            
            conTipo();
           
            sinTipo();
            sinTipoString();
            
     }

    private static void conTipo() {
        ArrayList<Integer> lista=new ArrayList<Integer>(); 
            for (int i=0;i <10;i++) {
                lista.add(i);
            }
        Iterator<Integer>it=lista.iterator(); 
        while (it.hasNext()) { 
            Integer t=it.next(); 
            if (t%2==0) 
            	it.remove(); 
        }
        System.out.println("Con tipo: "+lista.toString());
    }

    private static void sinTipo() {
        ArrayList<Integer> lista=new ArrayList<Integer>(); 
            for (int i=0;i <10;i++) {
                lista.add(i);
            }
        
        Iterator it=lista.iterator(); 
        while (it.hasNext()) { 
            Integer t=(Integer) it.next(); 
            if (t%2==0)
            	it.remove(); 
        } 
        System.out.println("Sin tipo: "+lista.toString());
    }
    
     private static void sinTipoString() {
        ArrayList<String> lista=new ArrayList<String>(); 
        lista.add("A");
        lista.add("B");
        lista.add("C");
        lista.add("D");
        lista.add("E");
        lista.add("F");
        
        
        Iterator<String> it = lista.iterator();
        while(it.hasNext())
              System.out.println(it.next());
        
    }
    
    
}

