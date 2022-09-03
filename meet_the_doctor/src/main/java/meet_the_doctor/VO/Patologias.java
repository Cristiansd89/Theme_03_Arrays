package meet_the_doctor.VO;

public class Patologias {
	
	private int id;
	private String nombrePatologia;
	
	public Patologias(int id, String nombrePatologia) {
		super();
		this.id = id;
		this.nombrePatologia = nombrePatologia;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombrePatologia() {
		return nombrePatologia;
	}

	public void setNombrePatologia(String nombrePatologia) {
		this.nombrePatologia = nombrePatologia;
	}
	
	
	
	
}
