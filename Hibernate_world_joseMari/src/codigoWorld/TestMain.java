package codigoWorld;

import singleton.*; // Copia y pega de otra clase

import database.*;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;  // Para poder utllizar las  listas

import org.hibernate.HibernateException;

public class TestMain {

	public static void main(String[] args) {
		
		//Obtener la sesióon actual.
		Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();
		
		try {
			 
			String pais = "Spain";
			Query query = session.createQuery("FROM Country WHERE name =:pais"); // :nombre para parametrizar (Como la interrogacion de jdbc)
			query.setParameter("pais", pais); // Es como un hasMAp para pasar el dato 
			
			List listaPaises = query.list();
			if(listaPaises.isEmpty()) { // Si la lista esta vacia
				System.out.println("No existe ese País");
			}else {
				Country miPais = (Country) listaPaises.get(0); // ME va devolver el Objeto que tenga en esa posicion
				System.out.println("Codigo: " + miPais.getCode()); // Me devuelve el dato de ese Objeto
				
				query = session.createQuery("FROM City WHERE CountryCode  = :codigo");
				query.setParameter("codigo", miPais.getCode());
				
				List listaCiudades = query.list(); // Declaramos una lista de Ciudades
				if(listaCiudades.isEmpty()) {
					System.out.println("No hay Ciudades Para ese pais");
				}else {
					for(int i = 0; i<listaCiudades.size();i++) { //Recorremos la lista
						City unaCiudad = (City)listaCiudades.get(i); // Devuelve el objeto que tiene en esa posicion
						System.out.println(unaCiudad.getName()); // Devuelve el nombre
					}
				}
			}
			
			tx.commit();
		}catch(HibernateException e) {
			
		}finally {
			session.close(); // Cierra La session
		}
		
	}

}
