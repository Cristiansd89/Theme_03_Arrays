package Ejercicio_06_Lavaplatos_Pila;

public class LavaProductor extends Thread {

    private final FriegaPlatos friegaPlatos;

    public LavaProductor(FriegaPlatos friegaPlatos) {
        this.friegaPlatos = friegaPlatos;

    }

    public void run() {

        while(friegaPlatos.friegaPlatosLleno()){
            try {
                friegaPlatos.wait();
            }catch (InterruptedException error){
                System.err.println(error.getMessage());
            }
        }

        for(int i = 0; i < 10; i++) {
            System.out.println("Meto el plato: " + i);
            friegaPlatos.meterPlatos(i);

            if(friegaPlatos.getTamMax() == i){
                friegaPlatos.setEstaLleno(true);
            }
            friegaPlatos.setEstaVacio(false);
            notifyAll();

        }

    }

}
