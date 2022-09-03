package Colecciones02;

import java.util.*;

public class Alumno extends Persona {
	//Atributos
	String Curso;
	boolean repetidor;
	
	public Alumno() {
		super();
		Scanner ent = new Scanner(System.in);
		System.out.println("En que curso esta: ");
		this.Curso = ent.nextLine();
		this.repetidor = false;
	}
	
	
	//Segundo Constructor
	
	public Alumno( String dni,String nombre,int edad,String Curso,boolean repetidor) 
	{
		super(dni,nombre,edad);
		this.Curso = Curso;
		this.repetidor = repetidor;
		
	}
	@Override
	public String toString() {
		return  super.toString() + "Curso [ " +Curso+ " ]  Repetidor [" +repetidor+ "]" ;
	}
}
