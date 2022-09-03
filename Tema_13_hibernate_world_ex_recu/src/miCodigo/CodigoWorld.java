package miCodigo;
/*
* Otros Paquetes
*/
import singleton.*;



import database.*;



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

public class CodigoWorld {
	
	private static Session session;
	private static Transaction tx;

	public static void main(String[] args) {
		//verIdiomas("Spain");
		//grabarEstadisticas("Angola", 47350000,1281484640);
		//grabarEstadisticas("Engol", 47350000,1281484640);
		
		borrarIdioma("Spain","Catalan");
		borrarIdioma("Spain","English");
		
		
      
        
	}
	
	
	
 public static void verIdiomas(String pais) {
	 
	 
	 		//Obtener la sesióon actual.
			Logger.getLogger("org.hibernate").setLevel(Level.OFF);
			Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
			SessionFactory sesion = HibernateUtil.getSessionFactory();
			//Crear la sesión.
			 session = sesion.openSession();
			//Crear una transación de la sesión.
	         tx = session.beginTransaction();
	        
	        
	        	 
	 	       ArrayList<Countries> lisPais = new ArrayList<>();  //Creo La lista donde vamos a meter los objetos tipo empleado
	 	       
	 	       Query query =(Query) session.createQuery("FROM Countries WHERE name = :idPais"); //Creamos la query (Este en mayusculas por que es un objeto y el parametro
	 	       //por que es un atributo
	 	       
	 	       
	 	       query.setParameter("idPais",pais );// Introducimos la query
	 	       lisPais =  (ArrayList<Countries>) query.list(); //Introducimos el objeto dentro de la lista
	 	       
	 	       if(lisPais.isEmpty()) { // sila lista esta Vacia
	 	    	   System.out.println("No existe ese pais");
	 	       }else {
	 	    	 
	 	    	   for(Countries paisEsco : lisPais) {
	 	    		   
	 	    		  System.out.println( "Pais : " +paisEsco.getName());
	 	    		  
	 	    		  Countries miPais = lisPais.get(0); // Introducimos el objeto  dentro de la varible tipo Countries
	 	    		  Query q2 = session.createQuery("FROM CountryLanguages WHERE country_id =:valorId");
	 	    		  q2.setParameter("valorId", miPais.getCountryId());
	 	    		  
	 	    		 ArrayList<CountryLanguages> listaIdiomas = (ArrayList<CountryLanguages>) q2.list();  // Array lista con la lista de idiomas
	 	    		 
	 	    		 if(listaIdiomas.isEmpty()) {
	 	    			 System.out.println("No exite idiomas para ese pais");
	 	    		 }else {
	 	    			for(CountryLanguages cl : listaIdiomas) {
	 	    				Languages lang = cl.getLanguages(); // Paso un OBjeto Languaje
		 	    			  System.out.println("El lenguaje es "+lang.getLanguage()); /// Y de ese objeto saco el lenguaje
		 	    			  if (cl.isOfficial()) { // Comprueba si es oficial
		 	    				  System.out.println( "Es oficial ");
		 	    			  }
		 	    		  }
	 	    		 }
	 	    		  
	 	    		  
	  
	 	    		  
	 	    	  }
	 	    	  tx.commit();
	 	       }
	       
	        	
	       
				session.close(); // Cierra La session
			

	   
 }  
	 public static void grabarEstadisticas(String pais, int poblacion, long gdp) {
		 
		//Obtener la sesióon actual.
			Logger.getLogger("org.hibernate").setLevel(Level.OFF);
			Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
			SessionFactory sesion = HibernateUtil.getSessionFactory();
			//Crear la sesión.
			 session = sesion.openSession();
			//Crear una transación de la sesión.
	         tx = session.beginTransaction();
	        

		     int  año = 2022;
	        
	        ArrayList<Countries> lista_paises = new ArrayList<>(); // Array list donde se van a almacenar los objetos tipo Coutries
	        
	        Query q = (Query) session.createQuery("FROM Countries WHERE name = :pais"); // Cargamos la query
	        
	        q.setParameter("pais",pais); // Parametrizacion  con el valor del pais
	        
	        lista_paises = (ArrayList<Countries>) q.list();
	        
	        if(lista_paises.isEmpty()) {
	        	System.out.println(" Ese Pais no existe ");
	        }else {
	        	
	        	
	        Countries miPais = lista_paises.get(0); //
	        /*
	         * Creo el primer Objeto 
	         */
	        CountryStatsId id = new CountryStatsId(miPais.getCountryId(),año); // 
	        /*
	         * El metodo load nos permite hacer una busque por clave primaria
	         * 
	         * El metodo get funciona exactamente igual
	         */
	        CountryStats stats = (CountryStats) session.get(CountryStats.class, id); // Realizamos la busqueda para ver si exite ese Objeto si no 
	        //Debuelve  null
	        
	        if(stats != null) {
	        	System.out.println("ya existe ese registro");
	        }else {
	        	stats = new CountryStats(id, miPais, poblacion,gdp); /// Declaramos el Objeto pasamos lo parametros
	        	session.save(stats); // Y lo grabamos
	        	
	        	System.out.println("El registro de estadistica se ha grabado correctamente");
	        }
	        	
	        	/*
	        	 * No se continuar
	        	 */
	        	
	        }
	    	  tx.commit();
	    	  
	    	  session.close(); // Cierra La session
	       
	 }
	 
	public static void borrarIdioma(String pais, String idioma) {
		
		//Obtener la sesióon actual.
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		SessionFactory sesion = HibernateUtil.getSessionFactory();
		//Crear la sesión.
		 session = sesion.openSession();
		//Crear una transación de la sesión.
         tx = session.beginTransaction();
		
	
		 // Array list donde se van a almacenar los objetos tipo Coutries
        
        Query q = (Query) session.createQuery("FROM Countries WHERE name = :pais"); // Cargamos la query
        
        q.setParameter("pais",pais); // Parametrizacion  con el valor del pais
        
        List lista_paises = (ArrayList<Countries>) q.list();
        
        if(lista_paises.isEmpty()) {
        	System.out.println(" Ese Pais no existe ");
        }else {
        	Countries miPais = (Countries) lista_paises.get(0); // Introducimos el Objeto dentro de la variable
        	q = session.createQuery("FROM Languages WHERE language = :idioma");
        	q.setParameter("idioma",idioma );
        	
        	ArrayList< Languages>  listaIdiomas = (ArrayList<Languages>) q.list();
        	
        	if(listaIdiomas.isEmpty()) {
        		System.out.println("El Idioma No existe");
        	}else {
        		
        		
        		Languages miIdioma = (Languages) listaIdiomas.get(0); // Introducimos el Objeto seleccionado de la lista
        		CountryLanguagesId idl = new CountryLanguagesId(miPais.getCountryId(),miIdioma.getLanguageId()); //Creamos primero el Objeto con la Clave foranea
        		CountryLanguages registro = (CountryLanguages) session.get(CountryLanguages.class, idl); // Y le pasamos el Objeto a la Clase
        		
        		if(registro == null) {
        			System.out.println("Ese idioma no se habla en ese  pais ");
        		}else {
        			if(registro.isOfficial()) {
        				System.out.println("Es el idioma y no puedo borrarlo");
        			}else {
        				session.delete(registro);  // Borramos el Registro
        				System.out.println("Idioma Borrado");
        			}
        		}
        	}
        }
        tx.commit();
  	  
  	  session.close(); // Cierra La session
        
	}
	 
	

   
}
