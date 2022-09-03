package Ejercicio_12_Lavaplatos_Gonzalo;

public class TestFriegaPlatos {

    public static void main(String[] args) {

        FriegaPlatos friegaPlatos = new FriegaPlatos();

        Lava l = new Lava(friegaPlatos, 10);
        Consumidor c = new Consumidor(friegaPlatos, 10);

        l.start();
        c.start();


    }


}
