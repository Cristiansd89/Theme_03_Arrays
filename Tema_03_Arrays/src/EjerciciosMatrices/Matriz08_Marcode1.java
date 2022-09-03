package EjerciciosMatrices;

public class Matriz08_Marcode1 
{

	public static void main(String[] args) 
	{
		int matriz [][];
		matriz = new int [5][5];
		 
		 
		 /**
		  * Rellenamos la matriz
		  */
		 for(int i = 0; i< 5 ;i++) 
		 {
			 for(int j = 0; j< 5; j++) 
			 {
				 
				 if(i == 0 || i == 4)
				 {
					 matriz[i][j] = 1;
				 }else if(j == 0 || j == 4)
				 {
					 matriz[i][j] = 1;
				 }else 
				 {
					 matriz[i][j] = 0;
				 }
			 }
		 }
		 System.out.println("la matriz es ");
		 for(int i = 0;i < 5 ;i++) 
		 {
			 System.out.println("");
			 for(int j= 0;j< 5; j++) {
				 System.out.print(matriz[i][j]+" ");
			 }
		
		 }
	}

}
