package indra.talentCamp.springBoot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class RegistrarCocheResult {		//DTO = DATA TRANSFER OBJECT
	private boolean operacion;
	private String txt;
}
