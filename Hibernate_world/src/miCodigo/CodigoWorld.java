package miCodigo;
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

public class CodigoWorld {

	public static void main(String[] args) {
		
		//Obtener la sesióon actual.
		Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		//Crear la sesión.
		Session session = sesion.openSession();
		//Crear una transación de la sesión.
        Transaction tx = session.beginTransaction();

	}

}
