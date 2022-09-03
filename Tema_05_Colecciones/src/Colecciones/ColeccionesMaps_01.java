package Colecciones;
import java.util.*;

public class ColeccionesMaps_01 {

	public static void main(String[] args) {
		HashMap<String, Empleado> personal = new HashMap<String, Empleado>();
		personal.put("145", new Empleado("Carlos"));
		personal.put("146", new Empleado("Juan"));
		personal.put("147", new Empleado("Francisco"));
		personal.put("148", new Empleado("Rebeca"));
		personal.put("149", new Empleado("Hernesto"));
		personal.put("150", new Empleado("Victor "));
		
		
		
		System.out.println(personal);
		personal.remove("147");
		
		System.out.println(" ");
		System.out.println("-------Aplicando Remove------------");
		System.out.println(personal);
		
		
		System.out.println(" ");
		System.out.println("-----Remplazando --------");
		personal.put("150", new Empleado("Vanesa"));
		
		System.out.println(personal);
		
		
		System.out.println(" ");
		System.out.println("-----ENTRY SET --------");
		
		//System.out.println(personal.entrySet());
		for(Map.Entry<String, Empleado> entrada : personal.entrySet()){
			
			String clave = entrada.getKey();
			Empleado valor = entrada.getValue();
			
			
			System.out.println(" Clave=" +clave+ " , Valor "  +valor);
			
		}
		
	}

}
class Empleado{
	
	private String nombre;
	
	private double sueldo;
	
	public Empleado(String n)
	{
		nombre = n;
		sueldo = 2000;

	}
	
	
	public String toString() {
		return (" [El empleado se llama "+nombre+ " y cobra " +sueldo+ " ]\n");
	}
}
