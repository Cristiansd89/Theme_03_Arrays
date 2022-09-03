package Ejercicio_12_Lavaplatos_Gonzalo;



public class Consumidor extends Thread {

    private FriegaPlatos fp;
    private final int platosSucios;

    public Consumidor(FriegaPlatos fp, int platosSucios) {
        this.platosSucios = platosSucios;
        this.fp = fp;
    }

    public void run() {





            for (int i = 1; i <= platosSucios; i++) {

                if (fp.friegaPlatosVacio()) {
                    synchronized (fp) {
                        try {
                            fp.wait();
                        } catch (InterruptedException e) {
                            System.err.println(e.getMessage());
                        }
                    }
                }

                int aux = fp.sacarPlatos();
                System.out.println("Saco el plato: " + aux);


                synchronized(fp) {
                    fp.notifyAll();
                }


            }


        }
    }


