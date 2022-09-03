package meet_the_doctor.VO;

public class SanitariosCentros {

	
	private int numeroColegiado;
	private String nombreCentro;
	
	public SanitariosCentros(int numeroColegiado, String nombreCentro) {
		super();
		this.numeroColegiado = numeroColegiado;
		this.nombreCentro = nombreCentro;
	}

	public int getNumeroColegiado() {
		return numeroColegiado;
	}

	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}

	public String getNombreCentro() {
		return nombreCentro;
	}

	public void setNombreCentro(String nombreCentro) {
		this.nombreCentro = nombreCentro;
	}
	
	
	
}
