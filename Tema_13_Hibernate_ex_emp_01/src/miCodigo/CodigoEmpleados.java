package miCodigo;

import singleton.*;




import database.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.Query;
import org.hibernate.HibernateException;

public class CodigoEmpleados {

	private static Session session;
	private static Transaction tx;
	
	public static void main(String[] args) {
		
		//Obtener la sesióon actual.
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		//Crear la sesión.
		 session = sesion.openSession();
		//Crear una transación de la sesión.
         tx = session.beginTransaction();
        

         //datos_empleados(101);
         //transladar_empleado(9, 2700);
         borrar_dependiente(10);
         
	}
	
	
	public static void datos_empleados( int cod_emp) {
		
		Query q = (Query) session.createQuery("FROM Employees WHERE employee_id = :codigo"); // Solicito la sentencia
		q.setParameter("codigo",cod_emp);  // Le paso el parametro
		
		
		ArrayList<Employees> empleados= (ArrayList<Employees>) q.list();  // Introducimos el resultado dentro del Objeto Employes
		if(empleados.isEmpty()) {
			System.out.println("Ese Empleado no Existe");
			
		}else {
			Employees empleado = empleados.get(0);
			Jobs job = empleado.getJobs(); // Introducimos dentro de la varibale job la referencia del objeto empleado
			
			Employees jefe = empleado.getEmployees(); // Introduzco el Objeto con la referencia del jefe
			Employees  jefe_id = session.get(Employees.class, jefe.getEmployeeId()); //Realizo una Busqueda con el id del jefe
			
			System.out.println(" Jefe :"+jefe.getFirstName());
			System.out.println("Cargo : "  +job.getJobTitle());
			//System.out.println("Jefe : "  +jefe.getFirstName()+ " "+jefe.getLastName());

			Departments departamento = empleado.getDepartments(); // Introducimos un Objeto departamentos sacado del Objeto empleado
			System.out.println("Departamento :" +departamento.getDepartmentName());
			
			Locations localizacion = departamento.getLocations();
			System.out.println("Ciudad : " +localizacion.getCity());
		}
		
		
	}
	
	public static void  transladar_empleado(int departamento, int localizacion) {
		
		Query q = session.createQuery("FROM Departments WHERE departmentId = :departamento");
		q.setParameter("departamento",departamento);
		
		ArrayList< Departments> departa = (ArrayList<Departments>) q.list();
		if(departa.isEmpty()) {
			System.out.println("Ese departamento no existe");
		}else {
			Departments depart = departa.get(0);
			
			Locations loca = depart.getLocations();
			
			Countries pais = loca.getCountries();
			
			
			System.out.println(" Ciudad Origen: " +loca.getCity());
			System.out.println("Pais Origen : " +pais.getCountryName());
			
			//Pregunta al Rumano
			Locations loc_des = session.get(Locations.class, localizacion);
			Departments destino = (Departments) loc_des.getDepartmentses();
			
			depart.setLocations(destino.getLocations());
			session.save(destino);
		}
		
		
		q = session.createQuery("FROM Departments WHERE departmentId = :departamento");
		q.setParameter("departamento",departamento);
		
		departa = (ArrayList<Departments>) q.list();
		if(departa.isEmpty()) {
			System.out.println("Ese departamento no existe");
		}else {
			Departments depart = departa.get(0);
			
			Locations loca = depart.getLocations();
			
			Countries pais = loca.getCountries();
			
			
			System.out.println(" Ciudad Destino: " +loca.getCity());
			System.out.println("Pais Destino : " +pais.getCountryName());
		
		
		
		}
		tx.commit();
	}
	
	public static void borrar_dependiente(int cod_empl) {
		
		Query q = session.createQuery("FROM Dependents WHERE dependent_id = :codigo");
		q.setParameter("codigo", cod_empl);
		
		ArrayList<Dependents> dependiente = (ArrayList<Dependents>) q.list();
		
		if(dependiente.isEmpty()) {
			System.out.println("Ese Persona Dependiente no Existe");
			
			
		}else {
			Dependents persona_dep= dependiente.get(0); //Introducimos el objeto selecionado de la lista
			
			System.out.println("Dependiente :" +persona_dep.getFirstName() +" "+persona_dep.getLastName());
			System.out.println("Relacion : " +persona_dep.getRelationship());
			
			
			
			
			
			Employees empleado = persona_dep.getEmployees(); //Introducimos un Objeto Empleado para extraer su id
			Employees nombreEmp = session.get(Employees.class, empleado.getEmployeeId()); // Realizamos una busqueda por el ide del empleado
			
			
			
			System.out.println("Nombre empleado : " +nombreEmp.getFirstName()+ " " +nombreEmp.getLastName());
			
			
			session.delete(persona_dep); // Pasamos el Objeto que hemos sacado del ArryList
			
			
			
			
		}
		   tx.commit();
		  	  
		  	  session.close(); // Cierra La session
		
		
		
	}
	
	

}
