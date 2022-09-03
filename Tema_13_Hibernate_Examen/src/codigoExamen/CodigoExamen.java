package codigoExamen;

import singleton.*; // Copia y pega de otra clase

import database.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;


public class CodigoExamen {

	public static void main(String[] args) {
		
		datos_empleado(101);
				
			
			        
			        
			       
	}
	
	
	
	public static void datos_empleado(int cod_empleado) {

		//Obtener la sesióon actual.
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		
		
		
		ArrayList<Employees> listadoEmp = new ArrayList<>(); //ArrayList donde introduciremos los empleados
	    Query query = (Query) session.createQuery("FROM Employees WHERE Employee_id = :idEmpleado"); //Introducimos  dentro de la variable query el
	        
	    //resultado de la sentencia
	    query.setParameter("idEmpleado", cod_empleado); // Esto es un hasmap
	        
	    
	    listadoEmp = (ArrayList<Employees>) query.list();// Inrroducimos dentro de la lista el objeto tipo empleado
	        if(listadoEmp.isEmpty()) {
	        	System.out.println("Ese Empleado no Existe");
	        }else {
	        	for(Employees empleado : listadoEmp) {
	        		
	        		/* Esto devuelve la direccion de memoria del Objeto 
	        		 * y lo introduce en la variable 
	        		 * 
	        		 */
	        		  Jobs job_id = empleado.getJobs(); //  Introducimos el nombre del cargo dentro de la variable
	        		  Jobs trabajo = (Jobs) session.load(Jobs.class, job_id.getJobId()); //hay que cargar el objeto dentro de la variable
	        		  String cargo = trabajo.getJobTitle();
	        		  
	        	  
	        		  System.out.println("cargo: " +cargo);
	        		  
	        		  
	        		 Employees emplJefe = empleado.getEmployees(); // Primero Introduzco el Objeto
	        		 Employees jefe =  session.load(Employees.class, emplJefe.getEmployeeId()); //  y luego  cargo el id del objeto
	        		 
	        		 System.out.println( "Nombre Departamento: " +jefe.getFirstName()+ " " + jefe.getLastName());
	        		 
	        		 
	        		 
	        		 Departments depart = empleado.getDepartments(); //Introduzco el objeto
	        		 Departments departamento = session.load(Departments.class, depart.getDepartmentId());
	        		 
	        		 System.out.println("Departamento: " +departamento.getDepartmentName());
	        		 
	        		 
	        		 
	        		 
	        		 Locations loc = depart.getLocations(); // Introduzco el Objeto  en la variable
	        		 Locations localizacion = session.load(Locations.class, loc.getLocationId());
	        		 
	        		 System.out.println("Ciudad: " +localizacion.getCity());
	        		 
	        		 
	        		 
	        		 
	        		  
		        }
	        }
	        
		
		
	}

}
