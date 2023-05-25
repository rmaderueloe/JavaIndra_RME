package indra.talentCamp.dependencyInjection.reflection;

public class ReflectionInjectionDemo2 {
	public static void aTodoGas() {
		// configuracion
		PartyService2.registerRepoClass("indra.talentCamp.dependencyInjection.reflection.DatabaseRepo");
		
		// ejecucion
		PartyService2 service = new PartyService2();
		service.haveFun();
	}

}
