package indra.talentCamp.dependencyInjection.reflection;

public class ReflectionInjectionDemo {
	public static void aTodoGas() {
		// configuracion
		PartyService.registerRepoClass(DatabaseRepo.class);
		
		// ejecucion
		PartyService service = new PartyService();
		service.haveFun();
	}

}
