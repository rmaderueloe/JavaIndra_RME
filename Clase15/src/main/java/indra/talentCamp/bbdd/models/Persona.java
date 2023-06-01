package indra.talentCamp.bbdd.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor @NoArgsConstructor
@Builder @ToString
public class Persona {
	@Getter @Setter @NonNull
	private int id;
	@Getter @Setter @NonNull
	private String nombre;
	@Getter @Setter
	private int edad;

	
	
}
