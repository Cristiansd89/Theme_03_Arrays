package Agenda_Contactos;

public class Contacto 
{
	
	private String nombre;
	private String telefono;
	private String Email;
	
	
	public Contacto (String nombre,String telefono,String Email)
	{
		this.nombre = nombre;
		this.telefono = telefono;
		this.Email = Email;
		
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	
	}
	public String GetNombre()
	{
		return nombre;
		
	}
	public void setTelefono(String telefono) 
	{
		this.telefono = telefono;
		
	}
	public String GetTelefono() 
	{
		return telefono;
	}
	public String getEmail() 
	{
		return Email;
	}
	public void setEmail(String Email) 
	{
		this.Email = Email;
	}
	public String toString() 
	{
		String	cadena = "Nombre :" +nombre+ " , telefono " +telefono+ " , Email : " +Email;
		return cadena;
	}
	
	public int compareTo(Contacto contacto) 
	{
		return nombre.compareTo(contacto.GetNombre());
		
	}
	
	
	
}
