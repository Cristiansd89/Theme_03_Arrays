package Colecciones;

public class Cliente implements Comparable
{
	String dni;
	String nombre;
	int edad;
	
	
	Cliente(String dni,String nombre,int edad){
		this.dni = dni;
		this.nombre = nombre;
		this.edad = edad;
		
	}
	
	/**
	 * Este metodo compara el dni de un cliente con el de otro cliente
	 * 
	 */
	@Override
	public boolean equals(Object ob) {
		return dni.equals(((Cliente) ob).dni);
	}
	
	public int compareTo(Object ob) {
		return dni.compareTo(((Cliente) ob).dni);
	}
	
	@Override
	public String toString() 
	{
		return "Dni " +dni+ " Nombre : "  +nombre+ "  Edad : " +edad+ "\n";
	}

}
