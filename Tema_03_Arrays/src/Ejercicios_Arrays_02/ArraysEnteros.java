package Ejercicios_Arrays_02;

import java.util.Scanner;

public class ArraysEnteros {
	Scanner ent = new Scanner(System.in);
	//Atributos
	
	
	 private int Array [];
	 private int numElem;
	 private int tamMax;
	 
	 
	///Creo un metodo constructor sin parametros introduciendo  directamente 
	//pidiendo directamente los datos
	public ArraysEnteros () 
	{
		
		System.out.println("Tamaño del Array: ");
		tamMax = ent.nextInt();
		Array = new int [tamMax];
		numElem = 0;
		
		
	}
	
	public ArraysEnteros(int tamMax) 
	{
		this.tamMax = tamMax;
		Array = new int [tamMax];
		numElem = 0;
	}
	
	//Metodo Constructor copia del anterior
	public ArraysEnteros(ArraysEnteros copia) {
		this.numElem = copia.numElem;
		this.Array[numElem] = copia.Array[numElem];
		
	}
	//Pedimos un el contenido del Array
	public void PedirArray() {
		
		boolean salir = false;
		int num;
		Scanner entrada = new Scanner(System.in);
		System.out.println("El tamaño maximo del array es " + tamMax);
		do{
			System.out.println("Introduce un numero, 999 para terminar: ");
			num = entrada.nextInt();
			
			if(num == 999 || numElem == tamMax) {
				salir = true;
			}else {
				Array[numElem] = num;
				numElem++;
			}
			
		}while(!salir);
		
	}
	
	
	
	
	//Creamos un Metodo para mostrar los datos introducidos
		public void MostrarArray() 
		{
			
			System.out.println("Lista de datos introducidos ");
			for(int i = 0;i < numElem ;i++) {
				System.out.print(Array[i]+" - ");
				
			}
		}
		//Insertamos dato en la posicion espefeicficada
		public void InsertarDato(int dato) 
		{
			/*Pedimos por teclado la posicion, tiene que estar previamente ocupada */
			int pos;
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce la posicion en la que quieras insertar un nuevo dato");
			boolean posicionValida;
			do {
				pos = entrada.nextInt();
				posicionValida = (pos >= 0 && pos < numElem);
				if(!posicionValida) {
					System.out.println("La posición no es valida.");
				}
			} while (!posicionValida);
			// Movemos los elementos e Insertamos el elemento en la posicion indicada
			for(int i = numElem; i > pos; i--) 
			{
				Array[i] = Array[i-1];
			}
			Array[pos] = dato;
			numElem++;
		}
		//Creamos un metodo para eliminar datos dentro del Array
		public void EliminarPosicion() 
		{
			int posicion;
			
			do 
			{
				System.out.println(" Que posicion quieres eliminar:");
				posicion = ent.nextInt();
				if(posicion < 0 || posicion > numElem) 
				{
					System.out.println("Tiene que ser una posicion Dentro del Array");
				}
			}while(posicion < 0 || posicion > numElem);
			
			
			//Arrancamos desde la posicion que queremos eliminar
			for(int i = posicion;i < numElem;i++) 
			{
				Array[i] = Array[i+ 1];
			}
			numElem--;
			
		}
		///dale caña a la busqueda secuencial
		
		public int BusquedaSecuencial(int buscado)
		{
			for (int i = 0; i < numElem; i++)
			{
				if (buscado == Array[i])
				{
					return i; 
				}
			}
			return -1;
		}
		
		
		public int BusquedaSecuencial2(int buscado) 
		{
			
			
			int i = 0;
			boolean encontrado = false;
			while(i < numElem || !encontrado ) 
			
			{
				//comparamos el elemento buscado con el del Array
				if(buscado == Array[i]) 
				{
					encontrado = true;
				}
				else
				{
					i++;
				}
				
			}///////////////////while
			if(encontrado) 
			{
				return i;
				
			}
			return -1;
				
				
		}/////////////////////////
		
		public int BusquedaBinaria(int buscando) 
		{
				int primero = 0;
				int ultimo = numElem - 1;
				int central;
				do {
					//Calculamos la posición central
					central = (primero + ultimo) / 2;
					if(buscando > Array[central])
						primero = central + 1;
					else if(buscando < Array[central])
						ultimo = central -1;
					
				}while(primero <= ultimo && buscando != Array[central]);
				//Si lo ha encontrado, devolvemos la posición en la que esta
				if(buscando == Array[central]) {
					return central;
				}else {
					return -1;
				}
					
			
		}
		/**
		 * Utilizamos el metodo burbuja para ordenar ascendentemente 
		 * el array
		 * @return
		 */
		public void metodoBurbuja()
		{
			
			int aux;
		
			boolean hayIntercambio;
			
			do {
				hayIntercambio = false;
				for(int i = 0; i < numElem-1; i++) 
				{
					if(Array[i] > Array[i+1]) 
					{
						aux = Array[i];
						Array[i] = Array[i+1];
						Array[i+1] = aux;
						hayIntercambio = true;
					}
				}
			}while(hayIntercambio);
			
		}

		public ArraysEnteros fusion(ArraysEnteros Array2) {
			
			//creamos un tercer Array
			ArraysEnteros array3 = new ArraysEnteros(numElem + Array2.numElem);
			
			//Inicializamos los indices de los arrays
			int i = 0; //primer Array
			int j = 0;//Segundo Array
			int k = 0; //Tercer Array
			
			
			while (i < numElem && j < Array2.numElem) 
			{
				if(Array[i] < Array2.Array[j]) 
				{
					array3.Array[k] = Array[i];
					 i++;
					 k++;
				} 
				else
				 {
					 array3.Array[k] = Array2.Array[j];
					 j++;
					 k++;
				 }
				// copiamos los elemntos del array mas grande
				
			}
			 // copiamos los elemntos del array mas grande 
			 while(i < numElem)
			 {
				 array3.Array[k] = Array[i];
				 i++;
				 k++;
			 }
			 
			 while(j < Array2.numElem)
			 {
				 array3.Array[k] = Array2.Array[j];
				 j++;
				 k++;
				 
			 }
			 array3.numElem = k;
			 return array3;
			 
		}
		public void paresImpares ()
	    {
		
			int contPares = 0;
			int contImpares = 0;
			for (int i = 0; i < numElem; i++)
			{
				
				if (Array[i] % 2 == 0) 
				{
					contPares++;
				}
				else 
				{
					contImpares++;
				}
				
			}
			System.out.println("pares:"+ contPares);
			System.out.println("impares:"+ contImpares);
			
		}
			
}
			
		

