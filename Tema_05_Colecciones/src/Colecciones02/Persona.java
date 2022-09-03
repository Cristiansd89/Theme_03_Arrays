package Colecciones02;
import java.util.*;

public class Persona {
	//Atributos
	protected String dni;
	protected String nombre;
	protected int edad;
	
	////Metodo constructor
	public Persona() 
	{
		Scanner ent = new Scanner(System.in);
		System.out.println("Dni :");
		this.dni = ent.nextLine();
		
		System.out.println("Nombre :");
		this.nombre=  ent.nextLine();
		
		
		System.out.println(" Edad : ");
		this.edad = ent.nextInt();
	}
	public Persona( String dni,String nombre,int edad) 
	{
		this.dni = dni;
		this.edad = edad;
		this.nombre = nombre;
		
	}
	
	
	public String toString() {
		return "Dni ["+dni+ "]\nNombre [" +nombre+ "]\nEdad [" +edad+ " ]\n";
	}
	
	
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int compareTo(Persona ob) {
		return (dni.compareTo(ob.getDni()));
	}
}
