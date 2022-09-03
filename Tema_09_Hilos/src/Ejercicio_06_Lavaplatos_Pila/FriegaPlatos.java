package Ejercicio_06_Lavaplatos_Pila;

public class FriegaPlatos {

    private int [] platos;
    private int primero;
    private boolean estaLleno;
    private boolean estaVacio;
    private final int tamMax;

    public FriegaPlatos(){

        tamMax = 10;
        platos = new int[tamMax];
        estaLleno = false;
        estaVacio = true;
        primero = 0;

    }

    public synchronized void meterPlatos(int plato){

        platos[primero] = plato;
        primero++;

    }

    public synchronized int sacarPlatos(){

        primero--;
        int aux = platos[primero];
        return aux;
    }


    public boolean friegaPlatosVacio(){
        return estaVacio;
    }

    public boolean friegaPlatosLleno(){
        return estaLleno;
    }

    public void setEstaLleno(boolean estaLleno) {
        this.estaLleno = estaLleno;
    }

    public void setEstaVacio(boolean estaVacio) {
        this.estaVacio = estaVacio;
    }

    public int getTamMax (){
        return this.tamMax;
    }





}
