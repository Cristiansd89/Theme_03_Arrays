package Ejercicio_06_Lavaplatos_Pila;



public class secadorConsumidor extends Thread {

    private FriegaPlatos fp;

    public secadorConsumidor(FriegaPlatos fp) {

        this.fp = fp;
    }

    public void run(){

        while(fp.friegaPlatosVacio()){
            try {
                fp.wait();
            } catch (InterruptedException e){
                System.err.println(e.getMessage());
            }
        }
        
        
        fp.sacarPlatos();



    }


}
