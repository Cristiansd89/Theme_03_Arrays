package meet_the_doctor.VO;

public class Especialidades {
	
	private int id;
	private String nombreEspecialidad;
	
	public Especialidades(String nombreEspecialidad) {
		super();
		this.id = id;
		this.nombreEspecialidad = nombreEspecialidad;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombreEspecialidad() {
		return nombreEspecialidad;
	}
	public void setNombreEspecialidad(String nombreEspecialidad) {
		this.nombreEspecialidad = nombreEspecialidad;
	}
	
}
