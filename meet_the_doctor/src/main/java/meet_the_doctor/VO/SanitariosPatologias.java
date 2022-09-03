package meet_the_doctor.VO;

public class SanitariosPatologias {

	
	private int numeroColegiado;
	private String nombrePatologia;
	
	public SanitariosPatologias(int numeroColegiado, String nombrePatologia) {
		super();
		this.numeroColegiado = numeroColegiado;
		this.nombrePatologia = nombrePatologia;
	}
	
	public int getNumeroColegiado() {
		return numeroColegiado;
	}


	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}


	public String getNombrePatologia() {
		return nombrePatologia;
	}


	public void setNombrePatologia(String nombrePatologia) {
		this.nombrePatologia = nombrePatologia;
	}


	
	
	
	
}
