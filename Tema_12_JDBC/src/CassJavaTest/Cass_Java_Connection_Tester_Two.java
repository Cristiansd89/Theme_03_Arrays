package CassJavaTest;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;

public class Cass_Java_Connection_Tester_Two {

	public static void main(String[] args) {

		Cluster cluster; // Através del cluster nosotros nos Conectaremos a la BBDD
		Session session;
		
		cluster = Cluster.builder().addContactPoint("127.0.0.1").build();
		session = cluster.connect("practica");
		System.out.println("Conexion a la BBDD");
		
		/*
		ResultSet res = session.execute("SELECT titulo_curso, creditos_curso FROM ejercicio_b "
				+ " WHERE nota_exam = 'C' "
				+ " order by creditos_curso desc");
		
			for( Row fila : res) {
				System.out.println(fila.getString("titulo_curso") +" " +fila.getInt("creditos_curso"));
			}
			
			*/
	}

	}


