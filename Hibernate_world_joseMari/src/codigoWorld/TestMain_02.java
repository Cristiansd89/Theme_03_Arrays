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
import java.util.Scanner;

import org.hibernate.HibernateException;

public class TestMain_02 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		
		Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		Session session = sesion.openSession();
		Transaction tx = session.beginTransaction();

		
		
		try {
			
			
			
			
			City ciudad = new City(); // Creamos un objeto tipo City
			
			System.out.println("nombre de la ciudad : ");
			String nombreCiudad = ent.next();
			
			
			System.out.println("Pais :");
			String pais = ent.next();
			
			
			
			Query query = session.createQuery("FROM city WHERE CountryCode = :pais"); 
			
			query.setParameter("pais", pais);		
					
			System.out.println("Comunidad Autonoma :");
			String Comunidad = ent.next();
			
			
			
			
			ciudad.setName("nombreCiudad");
			ciudad.setCountry("ESP");
			ciudad.setDistrict("Castilla y leon");
			ciudad.setPopulation(251);
			
			
			
			
			tx.commit();
		}catch(HibernateException e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
	}

}
