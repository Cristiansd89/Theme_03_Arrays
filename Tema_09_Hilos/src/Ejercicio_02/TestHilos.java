package Ejercicio_02;

public class TestHilos {

	public static void main(String[] args) {
		
		int[] Array1 =new int[10];
		int[] Array2 =new int[10];
		
		long tiempoInicial;
		
		for(int i = 0 ; i< Array1.length; i++) {
			Array1[i] = (int) (Math.random() * 10);
		}
		
		for(int i = 0; i < Array2.length; i++) {
			Array2[i] = (int) (Math.random() * 10);
		}
		
		tiempoInicial = System.currentTimeMillis();
		
		
		burbuja(Array1);
		burbuja(Array2);
		
		
		
		
		System.out.println("Tiempo de ejecuci�n: " + (System.currentTimeMillis()
				- tiempoInicial) + " ms");

	}
	public static void burbuja(int[] Arreglo) {
		
		
		boolean hayIntercambio = false;
		do {
			hayIntercambio = false;
			
			for (int i= 0; i < Arreglo.length -1;i++) {
				
				if(Arreglo[i]> Arreglo [i+1]) {
					int aux = Arreglo[i];
					Arreglo[i] = Arreglo[i+1];
					Arreglo[i+1] =aux;
					hayIntercambio = true;
							
				}
			}
			

		}while(hayIntercambio);
		
		for(int i = 0; i < Arreglo.length;i++) {
			System.out.println(Arreglo[i]);
		}
		
	}
	


}
