package CodigoOficina;


/*
 * Otros Paquetes
 */
import singleton.*;


import HibernateOficina.*;



import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.hibernate.HibernateException;

public class Main {

	public static void main(String[] args) {
		
		
				//Obtener la sesióon actual.
				Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
				SessionFactory sesion = HibernateUtil.getSessionFactory();
				//Crear la sesión.
				Session session = sesion.openSession();
				//Crear una transación de la sesión.
		        Transaction tx = session.beginTransaction();
		        
		        try {
		        	
		        
		        
		        /*
		         *  System.out.println("Inserto una fila en la tabla DEPARTAMENTOS");
		        
		        Departamentos dep = new Departamentos();
		        dep.setDeptNo((byte) 62);
		        dep.setDnombre("Marketing");
		        dep.setLoc("Gualadajara");
		        //Salvamos.
		        session.save(dep);
		        
		        tx.commit();
		        session.close();
		         */
		        
		       
		        
		        
		        /*
		        System.out.println("Inserto una fila en la tabla DEPARTAMENTOS");
		        
		        Departamentos dep2 = new Departamentos();
		        dep2.setDeptNo((byte) 63);
		        dep2.setDnombre("Administracion");
		        dep2.setLoc("Madrid");
		        //Salvamos.
		        session.save(dep2);
		        
		        */
		        
		        	
		        //Vamos a crear una lista de Departamentos (Serian Select)
		        
		        	/*
		        ArrayList<Departamentos> listadodep = new ArrayList<>();
		        Query q = (Query) session.createQuery("FROM Departamentos");
		        listadodep = (ArrayList<Departamentos>) q.list();
		        for(Departamentos d : listadodep) {
		        	System.out.println(d.getDnombre());
		        }
		        System.out.println("Muestra el departamento con Código 63");
		        Departamentos dep = (Departamentos) session.load(Departamentos.class, (byte)63);
		        System.out.println(dep.getDnombre());
		        
		        
		        System.out.println("Muestra los departamentos de Madrid");
		        q = (Query) session.createQuery("FROM Departamentos WHERE loc ='Madrid");
		        listadodep = (ArrayList<Departamentos>) q.list();
		        for(Departamentos d : listadodep)
		        	System.out.println(dep.getDnombre());
		        
		        
		        */
		        /*
		         * Modificar registros
		         */
		        
		        
		        System.out.println("Modificar el sueldo  de un empleado");
		        Empleados emp = (Empleados) session.load(Empleados.class, (short)12);
		        emp.setSalario((float)4000);
		        session.save(emp);
		        
		        
		        /*
		         * Borrar Registros
		         */
		        System.out.println("Borrar un departamentocon Código 32");
		        Departamentos dep = (Departamentos) session.load(Departamentos.class, (byte)32);
		        session.delete(dep);
		        tx.commit();
		        
			}catch(HibernateException e) {
				e.printStackTrace();
			}finally {
		        session.close();
	
			}
		        

		        
		        System.out.println("Inserto una fila en la tabla EMPLEADOS");
		        Empleados emp = new Empleados();
		        emp.setEmpNo((byte) 1);
		        emp.setApellido("Yzaguirre");
		        emp.setSalario((float) 5500);
		        
		        Departamentos dep = new Departamentos((byte)63); //Le pasamos la pk de la tabla empleados.
		        dep.setDeptNo((byte) 12);
		        dep.setDnombre("Direccion");
		        dep.setLoc("Salamanca");
		        
		        //Salvamos.
		        session.save(emp);
		        
		        tx.commit();
		        session.close();   
		        

	}

}
