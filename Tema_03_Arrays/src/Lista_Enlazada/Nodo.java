package Lista_Enlazada;

public class Nodo {
	//Atributos
	
	
	Object info; //Esta variable va alamacenar cualquier tipo de informacion
	Nodo Enlace; ///Este el puntero  que va a puntar al siguiente enlace
	
	public Nodo (Object objeto) {
		this.info = info;
		this.Enlace = null;
	}

	public void Siguente(Nodo Enlace) {
		this.Enlace = Enlace;
	}

	
}
