package meet_the_doctor.VO;

public class Sanitarios {

	private int numeroColegiado;
	private String nombre;
	private String apellidos;
	private String correo;
	private String imagen;
	private String contraseña;
	private int idEspecialidad;
	
	public Sanitarios(int numeroColegiado, String nombre, String apellidos, String correo, String imagen,
			String contraseña, int idEspecialidad) {
		super();
		this.numeroColegiado = numeroColegiado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.imagen = imagen;
		this.contraseña = contraseña;
		this.idEspecialidad = idEspecialidad;
	}

	public int getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
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

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getIdEspecialidad() {
		return idEspecialidad;
	}

	public void setIdEspecialidad(int idEspecialidad) {
		this.idEspecialidad = idEspecialidad;
	}
	
	
	
	
	
}
