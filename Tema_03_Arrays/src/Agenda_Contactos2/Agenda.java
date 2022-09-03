package Agenda_Contactos2;

import java.util.Scanner;

public class Agenda {
	Contacto Array [];
	int numElem;
	
	public Agenda () {
		numElem = 0;
		Array = new Contacto [numElem];
	}
	/**
	 * Este metodo comprueba si la agenda esta vacia
	 * @return
	 */
	 public boolean AgendaVacia()
	 {
		 return (numElem == 0);
	 }
	 /**
	  * Este metodo llama al menu
	  * @return
	  */
	 public void Menu() 
	 { 
		String menu [] = {"1. Añadir contacto" ,"2. Editar contacto", "3. Eliminar contacto" ,"4. Consultar contacto" ,"5.Ver Agenda","6. Abandonar la aplicación"};
		 System.out.println("Menu de operaciones :");
		 System.out.println("");
		 
		 for (String i : menu) 
		 {
			 System.out.println(i);
		 }
		
		 
	 }
	 public int Accion() 
	 {
		 Scanner ent = new Scanner(System.in);
		 
		 Menu();
		 System.out.println(" ");
		 System.out.println("Elige una opcion : ");
		 int opcion = ent.nextInt();
		 return opcion;
	 }
	 /**
	  * Metodo desde donde vamos a arrancar la aplicacion
	  */
	
		
	
	 
	 /**
	  * Metodo para crear un espacio menos en  memoria del Array
	  * @param aux
	  */
	 public void UnElementoMenos (Contacto aux[]) 
	 {
		 int k = 0;
		 Array = new Contacto [numElem -1];
		 for (int i = 0; i < numElem ; i++) 
		 {
			 if (aux[i] != null)
			{
				 Array[k] = aux[i];
				 k++;
			 }
				
		}
		 numElem--;
	 }
	 /**
	  * Metodo para solicitar  los datos del contacto que queremos introducir
	  * @return
	  */
	 public Contacto DatosContacto() {
		 Scanner ent = new Scanner(System.in);
		 System.out.println("Nombre");
		 String nombre = ent.nextLine();
		 
		 System.out.println("Telefono :");
		 String telefono = ent.nextLine();
		 
		 System.out.println("Email");
		 String Email = ent.nextLine();
		 
		 
		return new Contacto(nombre,telefono,Email);
		 
		
		 
	 }
	 /**
	  * 1º Establecemos el metodo para pedir un Espacio mas
	  * Metodo para crear un espacio mas en el Array
	  * @param aux
	  */
	 public void UnElementosMas (Contacto aux[]) {
		 //Pedimos espacio en memoria para un elemento mas
		Array = new Contacto [numElem +1];
		for (int i = 0; i < numElem ; i++) {
			Array[i] = aux[i];
		}
		
		numElem++;
		
	 }
	 /**
	  * 2º Metodo donde decimos en la poscicion que queremos insertar
	  * @param contacto
	  */
	 
	 public void Insertar(Contacto contacto) 
	 {
		 	UnElementosMas(Array);
		 	Array [numElem-1] = contacto;
	 }
		 
	 
	 /**
	  * Con este metodo introducimos un nuevoContacto en la agenda
	  */
	 public void nuevoContacto()
	 {
		Contacto contacto = DatosContacto();
		if(AgendaVacia()) {
			Insertar(contacto);
		}else 
		{

			int posicion = busquedaContacto(contacto.GetNombre());
			if (posicion == -1) 
			{
				Insertar(contacto);
			}else 
			{
				System.out.println("Ese contacto ya existe en la agenda");
				
			}
		}
	 }
	 
	 
	 public String pedirNombre() 
	 {
		 Scanner ent = new Scanner(System.in);
		 String nombre ;
		 System.out.println("Que nombre quieres Buscar");
		 nombre = ent.nextLine();
		 return nombre;
	 }
	 /**
	  * Busqueda secuencial para buscar un nombre
	  * @param nombre
	  * @return
	  */
	 
	 public int busquedaContacto(String nombre) 
	 {
		 for (int i = 0; i < numElem; i++) 
		 {
			 if (Array[i].GetNombre().equals(nombre))
			 {
				 return i; 
			 }
		 }
		 
		 return -1;
	 }
	 
	 
	 /**
	  * Con este metodo unimos los 2 anteriores para  hacer una consulta en la agenda
	  */
	 public void consultarContacto() 
	 {
		String nombre = pedirNombre();
		int posicion = busquedaContacto(nombre);
		if (posicion != -1) {
			System.out.println("El Contacto "+nombre +"Se encuentra en la agenda");
			System.out.println(" ");
			System.out.println(Array[posicion].toString());
		}else {
			System.out.println("El Contacto que Buscas no se encuentra en la agenda");
		}
		 
	
	 }
	 public  void editarContacto()
	 {
		 Scanner ent = new Scanner(System.in);
		 boolean salir = false;
		 String nombre = pedirNombre();
		  int posicion = busquedaContacto(nombre);
		  if (posicion != -1) {
			  System.out.println("Que quieres editar :");
			  System.out.println(" ");
			  do 
			  {
				  
				  System.out.println("1-Editar Nombre");
				  System.out.println("2-Editar Telefono");
				  System.out.println("3-Editar Email");
				  System.out.println("4-Para Terminar");
				  int editar = ent.nextInt(); 
				// Limpiamos el buffer
				  ent.nextLine();
				  	switch (editar)
				  	{
					  case 1:
						  System.out.println("introduce El nuevo Nombre :");
						  String nombreN;
						  Array[posicion].setNombre(nombreN = ent.nextLine());
						  break;
					  case 2:
						  System.out.println("introduce El nuevo Telefono :");
						  String telefono;
						  Array[posicion].setTelefono(telefono= ent.nextLine());
						  break;
						  
					  case 3:
						  System.out.println("introduce El nuevo Email :");
						  String Email;
						  Array[posicion].setEmail(Email= ent.nextLine());
						  break;
						  
					  case 4:
						 salir = true;
						 
					  default:
							 System.out.println("Opcion Incorrecta :");
							
					 }
			 
			  }while(!salir);
		 }else {
			 System.out.println("El contacto no Esta en la agenda");
		 }
		  
		 System.out.println("Los datos son " +Array[posicion].toString() + " ");
	 }
	 
	 
	 public void eliminarContacto() 
	 {
		 String nombre = pedirNombre();
		 int posicion = busquedaContacto(nombre);
		 if(posicion != -1) {
			 Marcar(posicion);
			 System.out.println("El registro ha sido Eliminado");
		 }else {
			 System.out.println("El contacto no existe");
		 }
		 
	 }
	 
	 public void Marcar(int posicion) 
	 {
		Array[posicion] = null;
		UnElementoMenos(Array);
	 }
	 /**
	  * Con estes metodo conseguimos  ver toda la agenda
	  */
	 public void verAgenda() 
	 {
		 if(AgendaVacia())
		 {
			 System.out.println("la agenda está Vacia"); 
		 }else 
		 {
			 System.out.println("La Lista de contactos :");
			 for (int i = 0 ; i < numElem; i++) 
			 {
				 System.out.println(Array[i]);
			 }
		 }
	 }
	 public void Arrancar()
		{
			boolean salir = false;
			
			do 
			{
				int opcion = Accion();
				switch (opcion) 
				{
				case 1:
					nuevoContacto();
					break;
				case 2:
					///Te quedan hacer estos 2 metodos
					editarContacto();
					break;
				case 3:
					eliminarContacto();
					break;
				case 4:
					consultarContacto();
					break;
				case 5:
					verAgenda();
					break;	
				case 6:
					salir = true;
				}
			}while(!salir);
				
			System.out.println("Fin del programa");
		}
}
