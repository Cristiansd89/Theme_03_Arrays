package meet_the_doctor.VO;

public class SanitariosAseguradoras {
	
	private int idAseguradora;
	private int numeroColegiado;
	

	public SanitariosAseguradoras(int idAseguradora, int numeroColegiado) {
		super();
		this.idAseguradora = idAseguradora;
		this.numeroColegiado = numeroColegiado;
	}
	
	public int getIdAseguradora() {
		return idAseguradora;
	}
	public void setIdAseguradora(int idAseguradora) {
		this.idAseguradora = idAseguradora;
	}
	public int getNumeroColegiado() {
		return numeroColegiado;
	}
	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}
	
}
