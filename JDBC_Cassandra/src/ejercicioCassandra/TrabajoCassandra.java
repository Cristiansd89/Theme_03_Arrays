package ejercicioCassandra;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

public class TrabajoCassandra {

	public static void main(String[] args) {

		Cluster cluster; // Através del cluster nosotros nos Conectaremos a la BBDD
		Session session; // Le indicamos el keySpace que queremos utilizar
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("practica"); 
		System.out.println("Conexion a la BBDD");
		
		
		ResultSet res = session.execute("SELECT titulo_curso, creditos_curso FROM ejercicio_b "
				+ " WHERE nota_exam = 'C' "
				+ " order by creditos_curso desc");
		
			for( Row fila : res) {
				System.out.println(fila.getString("titulo_curso") +" " +fila.getInt("creditos_curso"));
			}
			
			
	}
	

	public static void mostrar() {
		
		Cluster cluster; 
		Session session; 
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("practica"); 
		System.out.println("Conexion a la BBDD");
		
		
		ResultSet res = session.execute("SELECT * FROM ejercicio_a ");
		
			for( Row fila : res) {
				System.out.format("%s %d\n",fila.getString("titulo_curso"),fila.getInt("idC_curso"),fila.getInt("creditos_curso"),
						fila.getString("profesor_curso"),fila.getString("nombre_estudiante"),fila.getInt("idE_estudiante"));
			}
		
		

		
	}
	
	
public static void mostrarAllow() {
		
		Cluster cluster; 
		Session session; 
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("practica"); 
		System.out.println("Conexion a la BBDD");
		
		
		ResultSet res = session.execute("  select * from ejercicio_a where profesor_curso='Daniel Pérez' ALLOW FILTERING;");
		
			for( Row fila : res) {
				System.out.format("%s %d\n",fila.getString("titulo_curso"),fila.getInt("idC_curso"),fila.getInt("creditos_curso"),
						fila.getString("nombre_estudiante"),fila.getInt("idE_estudiante"),fila.getString("profesor_curso"));
			}
		
		

		
	}

public static void modificar() {
	
	Cluster cluster; 
	Session session; 
	
	cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
	session = cluster.connect("practica"); 
	System.out.println("Conexion a la BBDD");
	
	
	session.execute("SELECT UPDATE ejercicio_a SET profesor_curso = 'Xesus Cortinhas' "
			+ "WHERE idc_curso in (102) and ide_estudiante in (201) and titulo_curso='Griego moderno';");
	
	ResultSet res = session.execute("  select * from ejercicio_a where profesor_curso='Daniel Pérez' ALLOW FILTERING;");
	
		for( Row fila : res) {
			System.out.format("%s %d\n",fila.getString("titulo_curso"),fila.getInt("idC_curso"),fila.getInt("creditos_curso"),
					fila.getString("nombre_estudiante"),fila.getInt("idE_estudiante"),fila.getString("profesor_curso"));
		}
	
	

	
}
	public static void eliminar() {
		
		Cluster cluster; 
		Session session; 
		
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("practica"); 
		System.out.println("Conexion a la BBDD");
		
		
		session.execute("DELETE FROM ejercicio_a where idc_curso=106 "
				+ "    and ide_estudiante=202  "
				+ "    and titulo_curso='Teorías literarias';");
		
	
		session.close();
		
		

	
	}
	
	
	public static void insertar() {
		
		Cluster cluster; 
		Session session; 
		
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("practica"); 
		
		session.execute("insert into ejercicio_a (idE_estudiante, idC_curso, titulo_curso, "
				+ "    creditos_curso, profesor_curso, nombre_estudiante ) "
				+ "    values (201,101,'Filología románica',7,'Sara Martínez','Maria Mestre');");
		
		
		session.close();
	}
	
	
	
	
public static void insercionTTL() {
		
		Cluster cluster; 
		Session session; 
		
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("practica"); 
		
		session.execute("insert into ejercicio_a (idE_estudiante, idC_curso, titulo_curso,creditos_curso, profesor_curso, nombre_estudiante) "
				+ "values (201,101,'Filología románica',7,'Sara Martínez','Maria Mestre') USING TTL 87900;");
		
		
		session.close();
	}





}





