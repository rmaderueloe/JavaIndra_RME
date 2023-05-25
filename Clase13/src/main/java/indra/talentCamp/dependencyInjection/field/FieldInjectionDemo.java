package indra.talentCamp.dependencyInjection.field;

import indra.talentCamp.dependencyInjection.field.DatabaseRepo;
import indra.talentCamp.dependencyInjection.field.PartyService;

public class FieldInjectionDemo {
	public static void aTodoGas() {
		// tiempo de configuracion
		PartyService service = new PartyService();
		service.setRepo(new DatabaseRepo());
		
		
		//tiempo de ejecucion
		service.haveFun();
	}
}
