package ejercicioCassandra;



import com.datastax.driver.core.Cluster;



import com.datastax.driver.core.Session;
import com.datastax.driver.core.ResultSet;
import com.datastax.driver.core.Row;

public class Cass_Java_Connection_Tester {
	
	public static Cluster cluster;
	public static Session session;

	public static void main(String[] args) {
		
		
		
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();// Através del cluster nosotros nos Conectaremos a la BBDD
		session = cluster.connect("practica"); // Atraves de la Session nos conectaremos al Keyspace
		mostrarDatos();	
	}
	
	
	public static void mostrarDatos() {
		
		System.out.println("Conexion a la BBDD");
		
		
		ResultSet res = session.execute("SELECT titulo_curso, creditos_curso FROM ejercicio_b "
				+ " WHERE nota_exam = 'C' "
				+ " order by creditos_curso desc");
		
			for( Row fila : res) {
				System.out.println(fila.getString("titulo_curso") +" " +fila.getInt("creditos_curso"));
			}
			
			
	}
	
	
	
	
	public static void insertarDatos() {
		
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();// Através del cluster nosotros nos Conectaremos a la BBDD
		session = cluster.connect("practica"); // Atraves de la Session nos conectaremos al Keyspace
		mostrarDatos();	
		
		System.out.println("Insertar Datos  ");
		
		session.execute("");
	}

}
