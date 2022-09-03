package miCodigo;

/*
 * Otros Paquetes
 */
import singleton.*;
import database.*;


import java.util.ArrayList;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.internal.build.AllowSysOut;
import org.hibernate.query.Query;

import org.hibernate.HibernateException;

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
	         
	         
	         //paises("Nauru");
	          //cambiar_idioma("Spain","Galecian");
	          //modifica("Spain","Galecian");
	          modifica("Spain","Spanish");
	          
	         tx.commit(); //Esto es obligatorio si no se ejecuta nada
	         
		}catch(HibernateException e) {
		e.printStackTrace();	
		}finally {
			session.close();
		}
		
         
        

	}
	
	public static void cambiar_idioma(String nombrePais ,String idioma) {
			Query q = session.createQuery("FROM Countries WHERE name =:pais");
			q.setParameter("pais", nombrePais);
			
			ArrayList<Countries> listapaises = (ArrayList<Countries>) q.list();
			
			if(listapaises.isEmpty()) {
				System.out.println("Ese pais no existe");
				
			}else {
				boolean exite = false;
				for (Countries pais : listapaises) {
					Set<CountryLanguages> pais_lenguaje = pais.getCountryLanguageses(); // El lenguajeses suele ir con el set
					
					for(CountryLanguages id_lenguaje : pais_lenguaje) {
						
						Languages lenguaje = id_lenguaje.getLanguages(); // Apartir de aqui solo muestra el resultado
						
						if(lenguaje.getLanguage().equals(idioma)) {
							
							if(!id_lenguaje.isOfficial()) {
								
								id_lenguaje.setOfficial(true);
								session.save(id_lenguaje);
								exite = true;
								System.out.println("Cambiado idioma oficial");
								System.out.println("Version Nueva");
							}else{
								System.out.println("ya es Oficial");
							}
							
						}
					
					}
					if(!exite) {
						System.out.println("Ese idioma no existe");
					}
			
				
					
				}
			}
		}
			
	
	
	public static void paises (String idioma) {
		
		Query q = session.createQuery("FROM Languages WHERE language= :idioma ");
		q.setParameter("idioma", idioma);
		/*
		 * Primero Creamos un arrayList
		 */
		ArrayList<Languages> listaIdiomas = (ArrayList<Languages>) q.list();
		/*
		 * Comprobamos si esta vacio
		 */
		if(listaIdiomas.isEmpty()) {
			System.out.println("Ese idioma no exite");
		}else {
			
			System.out.println("El "+idioma +"se habla");
			/*
			 * Si no esta vacio introducimos el objeto en una variable para 
			 * poder utilizarlo mas tarde
			 */
			Languages lenguaje = listaIdiomas.get(0);
			
			/*
			 * Accedemos a la tabla  CountryLanguages   pasandole a la nueva variable 
			 * la referencia de la tabla country Languages
			 */
			Set<CountryLanguages> paises_lenguaje = lenguaje.getCountryLanguageses();
			
			/*
			 * Recorremos el set para extraer
			 */
			for(CountryLanguages id_paises : paises_lenguaje) {
			
				Countries pais = id_paises.getCountries();
				System.out.println("Paises :" +pais.getName());
		
			}
			
			
		}
	
	}///Fin de paises
	
	public static void modifica(String pais, String idioma) {
		
		int cont =0;
		Query q =session.createQuery("FROM Countries  WHERE name = :pais");
		q.setParameter("pais",pais );
		
		ArrayList< Countries> listaPaises = (ArrayList<Countries>) q.list();
		
		if(listaPaises.isEmpty()) {
			System.out.println("Ese Pais no Existe ");
		}else {
			/*
			 * Introducimos el Objeto dentro del a variable countri
			 */
			Countries paisElegido = listaPaises.get(0);
			Set<CountryLanguages> id_paises_lenguajes = paisElegido.getCountryLanguageses();
			System.out.println("En " +pais);
			
			for(CountryLanguages id_lenguaje : id_paises_lenguajes) {
				Languages  lenguajes = id_lenguaje.getLanguages();
				/*
				 * incrementamos la variable si el pais es oficial
				 */
				if(id_lenguaje.isOfficial()) {
					cont++;
				
				}
			}
			if(cont > 1) {
				/*
				 * Volvemos a recorrer el set para sacar la posicion
				 */
				for(CountryLanguages id_lenguaje2 : id_paises_lenguajes) {
					Languages  lenguajes2 = id_lenguaje2.getLanguages();
					
					if(lenguajes2.getLanguage().equals(idioma)) {
						/*
						 * Modificamos la posicion
						 */
						id_lenguaje2.setOfficial(false);
						System.out.println("El "  +idioma+ " Ya no es oficial");
					}
				}

			}else {
				System.out.println("No se puede dejar el pais sin idioma oficial");
			}

		}
	}	

}
