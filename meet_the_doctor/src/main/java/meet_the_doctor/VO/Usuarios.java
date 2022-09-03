package meet_the_doctor.VO;

public class Usuarios {
	
	private int id;
	private String correo;
	private String nombre;
	private String apellidos;
	private String contraseña;
	
	
	public Usuarios(int id, String correo, String nombre, String apellidos, String contraseña) {
		super();
		this.id = id;
		this.correo = correo;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contraseña = contraseña;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getContraseña() {
		return contraseña;
	}


	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
	
	
	

}
