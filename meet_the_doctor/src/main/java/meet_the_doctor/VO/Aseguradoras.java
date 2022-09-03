package meet_the_doctor.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity  //Reconocemos como entidad
@Table(name ="aseguradoras") //nombre tabla
public class Aseguradoras {
	
	
	@Id //Marcamos como id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Le indicamos que la estrategia va ser un campo autoincrementable
	private int idAseguradora;
	
	@NotNull  //No permite utilizar nulos
	@Column( name = "nombre_aseguradora",length = 100)
	private String nombreAseguradora;
	
	@ManyToOne(fetch = FetchType.LAZY,optional = false) // FetchType.LAZY establecemos  que la llamada de esos datos son opcionales(Esta mal)
	@JoinColumn(name = "id_aseguradora")
	@JsonProperty(access =  Access.WRITE_ONLY) // Evitar que salte la excepcion de Lazy
	private SanitariosAseguradoras sanitarioAseguradora;
	
	public Aseguradoras(int idAseguradora, String nombreAseguradora) {
		super();
		this.idAseguradora = idAseguradora;
		this.nombreAseguradora = nombreAseguradora;
	}
	
	public int getIdAseguradora() {
		return idAseguradora;
	}
	
	public void setIdAseguradora(int idAseguradora) {
		this.idAseguradora = idAseguradora;
	}
	
	public String getNombreAseguradora() {
		return nombreAseguradora;
	}
	
	public void setNombreAseguradora(String nombreAseguradora) {
		this.nombreAseguradora = nombreAseguradora;
	}
		
}
