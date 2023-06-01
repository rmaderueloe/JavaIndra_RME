package indra.talentCamp.springBoot.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter 	//comun a todos
@ToString
public class Coche {
	@Setter
	private int id;
	@Setter
	private String marca;
	
	private String matricula;
	@Setter
	private boolean electrico;
	
	public void setMatricula(String matricula) {
		//[0-9]{4}[A-Z]{3}
		//^[0-9][0-9][0-9][0-9] [a-z][a-z][a-z]
		if(!matricula.matches("^[0-9]{4}[A-Z]{3}")) {
			throw new Error("Matricula con formato erroneo!");
		}
		this.matricula = matricula;
	}
}
