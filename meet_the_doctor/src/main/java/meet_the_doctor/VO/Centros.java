package meet_the_doctor.VO;

public class Centros {

	private String nombreCentro;
	private String direcion;
	private String telefono;
	
	
	public Centros(String nombreCentro, String direcion, String telefono) {
		super();
		this.nombreCentro = nombreCentro;
		this.direcion = direcion;
		this.telefono = telefono;
		
	}


	public String getNombreCentro() {
		return nombreCentro;
	}


	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}


	public String getDirecion() {
		return direcion;
	}


	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	
	
}
