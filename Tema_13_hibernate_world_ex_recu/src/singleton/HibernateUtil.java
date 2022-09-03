package singleton;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.boot.registry.internal.StandardServiceRegistryImpl;
import org.hibernate.cfg.Configuration;


//Patrón de diseño.
public class HibernateUtil {

	private static final SessionFactory SESSION_FACTORY = buildSessionFactory();
	
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory(new StandardServiceRegistryBuilder().configure().build());
		}
		catch(Throwable ex){
			System.err.println("Conexión fallida "+ ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return SESSION_FACTORY;
	}
}