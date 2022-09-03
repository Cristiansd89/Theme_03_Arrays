package EjerciciosMatrices;

public class Matriz05_Diagonal {

	public static void main(String[] args) {
		
		int matriz [] [];
		matriz = new int [7][7];
		
		
		for(int i = 0; i< 7;i++) 
		{
			for(int j = 0; j< 7; j++) 
			{
				if(i == j) 
				{
					matriz[i][j] = 1;
				}else{
					
					matriz [i][j] = 0;
				}
			}
		}
		
		for(int i = 0; i < 7; i++) 
		{		
			System.out.println(" ");
			for(int j = 0; j < 7 ; j++) {
				System.out.print(matriz[i][j]);
			}
		}

	}

}
