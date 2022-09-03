package meet_the_doctor.VO;

public class Comentarios {

	
	private int idComentario;
	private int idUsuario;
	private int numeroColegiado;
	private int nota;
	private String comentario;
	
	
	
	
	
	public Comentarios(int idComentario, int idUsuario, int numeroColegiado, int nota, String comentario) {
		super();
		this.idComentario = idComentario;
		this.idUsuario = idUsuario;
		this.numeroColegiado = numeroColegiado;
		this.nota = nota;
		this.comentario = comentario;
	}
	
	public int getIdComentario() {
		return idComentario;
	}
	public void setIdComentario(int idComentario) {
		this.idComentario = idComentario;
	}
	public int getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	public int getNumeroColegiado() {
		return numeroColegiado;
	}
	public void setNumeroColegiado(int numeroColegiado) {
		this.numeroColegiado = numeroColegiado;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	
	
}
