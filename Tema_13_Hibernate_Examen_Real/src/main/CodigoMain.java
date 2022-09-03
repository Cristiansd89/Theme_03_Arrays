package main;

import singleton.*;
import database.*;


import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class CodigoMain {
	/*
	 * YO utilizo el jar 26
	 */
	
	private static Session session;
	private static Transaction tx;

	public static void main(String[] args) {
		
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		try {
			SessionFactory sesion = HibernateUtils.getSessionFactory();
			//Crear la sesión.
			 session = sesion.openSession();
			//Crear una transación de la sesión.
	         tx = session.beginTransaction();
	         
	         System.out.println("------------Ejercicio 1 -------------");
	         buscaEmpleados("Patterson");
	         buscaEmpleados("Morales");
	         
	         System.out.println("------------Ejercicio 2 -----------------");
	        
	         modificaCustomer("Raanan Stores, Inc", 1323);
	         System.out.println("-------------------");
	         modificaCustomer("Osaka Souveniers Co.", 13);
	         System.out.println("-------------------");
	         modificaCustomer("El Corte Ingles ", 1);
	         
	         System.out.println("------------Ejercicio 3 -----------------");
	         
	         listaEmpleadosOficina("France", "75017");
	         listaEmpleadosOficina("Madrid", "28032");
	         
	         
	         System.out.println("------------Ejercicio 4 -----------------");
	         
	         stockMenorque("500");
	         stockMenorque("10");
	         
	         tx.commit(); //Esto es obligatorio si no se ejecuta nada
	         
		}catch(HibernateException e) {
		e.printStackTrace();	
		}finally {
			session.close();
		}

	}
	
	
	public static void buscaEmpleados(String apellido ) {
		Query q = session.createQuery("FROM Employees WHERE lastName =:apellido");
		q.setParameter("apellido", apellido);
		
		
		
		ArrayList<Employees> listaEmpleados = (ArrayList<Employees>) q.list();
		
		
		if(listaEmpleados.isEmpty()) {
			System.out.println("No existen empleados con ese apellido");
		}else {
				
			for(Employees empleado : listaEmpleados) {
				System.out.println("Empleado :"+empleado.getFirstName()+ " " + empleado.getLastName());
				Set<Employees> jefes = empleado.getEmployeeses();
				for(Employees jefe : jefes) {
					System.out.println(" Reportan :"  +jefe.getFirstName() +" "+jefe.getLastName());
					
					
				}
				
				
			}
		}
	}
	
	
	public static void modificaCustomer(String nombrecliente,int codigoEmpleado) {
		Query q = session.createQuery("FROM Customers WHERE customerName =:nombre");
		q.setParameter("nombre", nombrecliente);
		
		ArrayList<Customers> listaClientes = (ArrayList<Customers>) q.list();
		
		
		if(listaClientes.isEmpty()) {
			System.out.println("No existen Clientes con ese apellido");
		}else {
			

			Customers cliente = listaClientes.get(0);
			Employees empleado = cliente.getEmployees();
			if(empleado == null) {
				System.out.println("Salta una Excepcion");
			}else {
				
				Query q2 = session.createQuery("FROM Employees WHERE employeeNumber =:codigoEmpleado");
				q2.setParameter("codigoEmpleado", codigoEmpleado);
				
				ArrayList<Employees> listaEmpleados = (ArrayList<Employees>) q.list();
				
				if(listaEmpleados.isEmpty()) {
					System.out.println("Ese Empleado no Existe");
				}else {
					System.out.println("Empleado antiguo: "+empleado.getFirstName()+ " " + empleado.getLastName()  +" Cliente "+ cliente.getContactFirstName()+" " +cliente.getContactLastName());
					
					Employees nuevoEmployees = session.get(Employees.class, codigoEmpleado);

					
					empleado.setEmployees(nuevoEmployees);
					session.save(empleado);
					
					Query q3= session.createQuery("FROM Customers WHERE customerName =:nombre");
					q3.setParameter("nombre", nombrecliente);
					
					ArrayList<Customers> listaClientes2 = (ArrayList<Customers>) q.list();
					
					
					if(listaClientes.isEmpty()) {
						System.out.println("No existen Clientes con ese apellido");
					}else {
						Customers cliente2 = listaClientes2.get(0);
						Employees empleado2 = cliente.getEmployees();
						System.out.println("Empleado nuevo: "+empleado2.getFirstName()+ " " + empleado2.getLastName());
					}
					
				}
				
				

			}
			
			
	
			
		
	}
		
	}
	
	
	public static void  listaEmpleadosOficina(String pais, String codigoPostal ) {

		Query q = session.createQuery("FROM Offices WHERE country =:pais and postalCode = :codigoPostal");
		q.setParameter("pais", pais);
		q.setParameter("codigoPostal", codigoPostal);
		
		ArrayList<Offices> listaOficinas = (ArrayList<Offices>) q.list();
		
		if(listaOficinas.isEmpty()) {
			System.out.println("Esa Oficina no existe");
		}else {
			
			Offices oficina = listaOficinas.get(0);
			
			Set<Employees> empleados = oficina.getEmployeeses();
			
			for(Employees empleado : empleados) {
				System.out.println("Empleados :"  +empleado.getFirstName()+ " " +empleado.getLastName());
			}
			
			
		}
	}
	
	
	public static void stockMenorque(String cantidad) {
		
		short stock = Short.parseShort(cantidad);// Transformamos a short
		Query q = session.createQuery("FROM Products WHERE quantityInStock <= :cantidad ");
		q.setParameter("cantidad",stock);
		
		ArrayList<Products> listaProductos = (ArrayList<Products>) q.list();
		
		
		if(listaProductos.isEmpty()) {
			System.out.println("No Quedan productos con esa cantidad");
		}else {
			
			for(Products producto : listaProductos) {
				System.out.println("Productos "  +producto.getProductName());
				Set<Orderdetails> facturas = producto.getOrderdetailses();
				if(facturas.isEmpty()) {
					System.out.println("No tiene ningun pedido");
					
				}else {
					int cont = 0;
					for(Orderdetails factura : facturas) {
						factura.getQuantityOrdered();
						cont++;
					}
					System.out.println("Productos "  +producto.getProductName() +" hay "+ producto.getQuantityInStock() +"  Aparece en  " +cont+ " en pedidos" );
					
				}
				
			}
		
		}
		
	}
		
	
	

}
