package CodigoLenguajes;


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


public class MiCodigo {

	private static Session session;
	private static Transaction tx;
	
	
	public static void main(String[] args) {
		Logger.getLogger("org.hibernate").setLevel(Level.OFF);
		Logger.getLogger("org.hibernate").setLevel(Level.SEVERE);
		try {
			SessionFactory sesion = HibernateUtil.getSessionFactory();
			//Crear la sesión.
			 session = sesion.openSession();
			//Crear una transación de la sesión.
	         tx = session.beginTransaction();
	         
	        verIdiomas("Spain");
	         ///verIdiomas("España");
	         
	         
	         //grabarEstadisticas("Spain", 47350000, 128148460);
	         
	         //borrar_idioma("Spain","Catalan");
	          
	         tx.commit(); //Esto es obligatorio si no se ejecuta nada
	         
		}catch(HibernateException e) {
		e.printStackTrace();	
		}finally {
			session.close();
		}
		
	}
	
	public static void verIdiomas(String nombrePais) {
		
		Query q = session.createQuery("FROM Countries WHERE name =:pais");
		q.setParameter("pais", nombrePais);
		
		ArrayList< Countries> listaPaises = (ArrayList<Countries>) q.list();
		
		if(listaPaises.isEmpty()) {
			System.out.println("Ese pais no existe");
		}else {
			Countries pais = listaPaises.get(0);
			Set<CountryLanguages> id_paises_lenguaje = pais.getCountryLanguageses();
			
			for(CountryLanguages id_paises : id_paises_lenguaje) {
				Languages id_lengua = id_paises.getLanguages();
				 
				System.out.println(id_lengua.getLanguage());
				
			}
		}
		
			
	}
	
	
	public static void grabarEstadisticas(String pais, int cifra, long productoInterior) {
		
		
		int año= 2022;
		Query q = session.createQuery("FROM  Countries WHERE name = :pais");
		q.setParameter("pais",pais );
		
		ArrayList< Countries> listaPaises = (ArrayList<Countries>) q.list(); // Saco la lista de paises
		
		if(listaPaises.isEmpty()) {
			System.out.println("Ese pais no Existe");
		}else {
			/*
			 * En resumen vas creando Objeto de cada tipo de tabla para al final
			 * si se cumplen todas las condiciones creas un objeto del tipo de tabla que quieres
			 * modificar para pasarle como parametros todos los objeto anteriores
			 */
			Countries paisSeleccionado = listaPaises.get(0);
			
			/*
			 * Creo un objeto y le paso los parametos del id de CountriStatsID
			 * 
			 */
			CountryStatsId id_pais = new CountryStatsId(paisSeleccionado.getCountryId(),año); 
			
			/*
			 * Se realiza una busqueda de un Objeto tipo CountryStats  pasandole la referencia del 
			 * Objeto CountryStatsID
			 */
			CountryStats miPais = session.get(CountryStats.class, id_pais); // Esto Busca por Clave primaria
			
			
			
			if(miPais != null) {
				System.out.println("Ese registro ya existe");
			}else {
				CountryStats nuevoRegisto = new CountryStats(id_pais,paisSeleccionado,cifra,productoInterior);
				session.save(nuevoRegisto);
				System.out.println("El registro de estadistica se ha grabado correctamente");
			}
			
				
			}
		}
	
	
	
	public static void borrar_idioma(String pais,String lengua) {
		
			Query q = session.createQuery("FROM  Countries WHERE name =:pais");
			q.setParameter("pais",pais );
			
			ArrayList< Countries> listaPaises = (ArrayList<Countries>) q.list(); // Saco la lista de paises
			if(listaPaises.isEmpty()) {
				System.out.println("Ese pais no Existe");
			}else {
				Countries paisElegido = listaPaises.get(0);
				Set<CountryLanguages> lista_ids = paisElegido.getCountryLanguageses();
				boolean existe = false;
				for(CountryLanguages id_paises_lenguajes : lista_ids) {
					Languages lenguas = id_paises_lenguajes.getLanguages();
					if(lenguas.getLanguage().equals(lengua)) {
						existe = true;
						
						
						if(id_paises_lenguajes.isOfficial()) {
							System.out.println(" Es un idioma oficial no se puede cambiar");
						}else {
							session.delete(id_paises_lenguajes); // Le tengo que pasar la referencia de la tabla no el idioma
							System.out.println("Idioma Eliminado");
						}
						
					}
					
					
				}///FOR
				if(!existe) {
					System.out.println("Ese idioma no existe o no es de ese pais");
				}
				
			}
			
	}
}
