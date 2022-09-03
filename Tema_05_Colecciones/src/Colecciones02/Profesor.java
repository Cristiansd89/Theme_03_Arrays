package Colecciones02;
import java.util.*;

public class Profesor extends Persona 
{
	
	
	String departamento;
	String asignatura;
	
	//Primer Constructor
	public Profesor () 
	{
		
		super();
		Scanner ent = new Scanner(System.in);
		System.out.println("Introcuce el Departamento :");
		this.departamento =ent.nextLine();
		
		System.out.println("");
		System.out.println("introduce la asignatura");
		this.asignatura = ent.nextLine();
	}
	//Segundo Constructor
	public Profesor(String dni,String nombre,int edad,String departamento,String asignatura) {
		
		super(dni,nombre,edad);
		this.departamento = departamento;
		this.asignatura = asignatura;
		
	}
	@Override
	public String toString() {
		
		return super.toString()+"Departamento [" +departamento+ " ]\nAsignatura [" +asignatura+ "]\n"; 
	}

	

}
