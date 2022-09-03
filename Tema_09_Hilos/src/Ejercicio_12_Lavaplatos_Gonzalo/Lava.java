package Ejercicio_12_Lavaplatos_Gonzalo;

public class Lava extends Thread {

    private FriegaPlatos friegaPlatos;
    private final int platosSucios;


    public Lava(FriegaPlatos friegaPlatos, int platosSucios) {
        this.friegaPlatos = friegaPlatos;
        this.platosSucios = platosSucios;

    }

    public void run() {



            for (int i = 1; i < platosSucios; i++) {

                if (friegaPlatos.friegaPlatosLleno()) {
                    synchronized (friegaPlatos) {
                        try {
                            friegaPlatos.wait();
                        } catch (InterruptedException error) {
                            System.err.println(error.getMessage());
                        }
                    }
                }
                System.out.println("Meto el plato: " + i);
                friegaPlatos.meterPlatos(i);

                synchronized(friegaPlatos) {
                    friegaPlatos.notifyAll();
                }


            }
        }
    }


