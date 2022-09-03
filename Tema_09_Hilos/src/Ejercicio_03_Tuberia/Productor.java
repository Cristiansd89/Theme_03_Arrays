package Ejercicio_03_Tuberia;

public class Productor extends Thread {
	//Declarmos un objeto tipo Tuberia;
	public Tuberia tuberia;
	private String abc ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	private int n;
	
	public Productor (Tuberia tuberia, int n) {
		this.tuberia = tuberia;
		this.n = n;
	}
	public void run() {
		
		for(int i =0; i<10; i++) {
			//La posicion va ser un numero entre 0 y la longitud maxima del Array que es 6
			int posicion =  (int)(Math.random()*abc.length());
			char letra = abc.charAt(posicion);
			System.out.println(i+ " =>Productor "  +n+ " : produce " +letra );
			
			tuberia.set(letra);
			
			try {
				sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
}
