package Ejercicio_06_Lavaplatos_Pila;

import Ejemplo_ProductoresConsumidores.Productor;
import Ejercicio_03_Tuberia.Tuberia;

public class TestFriegaPlatos {

    public static void main(String[] args) {

        FriegaPlatos maquina = new FriegaPlatos();

        LavaProductor productor = new LavaProductor(maquina); /// Hilo productor
        secadorConsumidor consumidor = new secadorConsumidor(maquina); // Hilo Consimudor

        productor.start();
        consumidor.start();


    }


}
