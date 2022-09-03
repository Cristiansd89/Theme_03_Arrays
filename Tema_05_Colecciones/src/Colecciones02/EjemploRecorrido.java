package Colecciones02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Marina
 */
public class EjemploRecorrido {
    
    public static void main(String[] args) {
        
        ejemplo1Recorrido();
       
        
        
    }

    
    private static void ejemplo1Recorrido() {
        
        ArrayList<Integer> numeros = new ArrayList();
        numeros.add(1);
        numeros.add(10);
        numeros.add(11);
        numeros.add(21);
        numeros.add(31);
        numeros.add(41);
      
        System.out.println("Ha introducido: " + numeros.size() + " números");
       
        //mostrar el arrayList completo
        System.out.println(numeros);
       
        //recorrido usando un bucle for
        System.out.println("--- 1 Recorrido usando un bucle for:");
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(i));
        }
        
        //recorrido usando un bucle foreach
        System.out.println("--- 2 Recorrido usando un bucle foreach:");
        for(Integer num: numeros){
             System.out.println(num);
        }
        
        //recorrido usando un iterador para mostrar un elemento por línea
        System.out.println("--- 3 Recorrido usando Iterator");
        Iterator it = numeros.iterator();
        while(it.hasNext()) {
              System.out.println(it.next());
        }
        //recorrido usando un ListIterator para mostrar un elemento por línea
        System.out.println("--- 4 Recorrido usando ListIterator");
        ListIterator ltr = numeros.listIterator();
        while(ltr.hasNext()){
                System.out.println(ltr.next());
        }
       
    }
    
 
    



}