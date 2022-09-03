package Ejemplo_Hilos3;

public class TestHebraContador {

	public static void main(String[] args) {
		
		Thread hebra;
		
		for(int i=0; i< 5;i++) {
			//llamamos a la clase tipo HebraContador
			hebra =new HebraContador();
			hebra.start();
			
		}

	}

}
