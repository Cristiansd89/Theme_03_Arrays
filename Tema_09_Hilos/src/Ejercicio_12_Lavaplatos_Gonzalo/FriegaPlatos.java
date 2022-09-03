package Ejercicio_12_Lavaplatos_Gonzalo;

public class FriegaPlatos {

    private int [] platos;
    private int primero;
    private final int tamMax;


    public FriegaPlatos(){

        tamMax = 10;
        platos = new int[tamMax];
        primero = 0;

    }

    public synchronized void meterPlatos(int plato){

        platos[primero] = plato;
        primero++;

    }

    public synchronized int sacarPlatos() {

        primero--;
        int aux = platos[primero];
        return aux;
    }


    public boolean friegaPlatosVacio(){
        return this.primero == 0;


    }

    public boolean friegaPlatosLleno(){
        return this.primero == this.tamMax;
    }


    public int getTamMax (){
        return this.tamMax;
    }

    public int getPrimero (){
        return this.primero;
    }

    public void setPrimero(int primero){
        this.primero = primero;
    }





}
