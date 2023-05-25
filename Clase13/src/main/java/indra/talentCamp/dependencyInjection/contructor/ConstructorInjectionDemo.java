package indra.talentCamp.dependencyInjection.contructor;

public class ConstructorInjectionDemo {
	public static void aTodoGas() {
		// tiempo de configuracion
		PartyService service = new PartyService(new DatabaseRepo());
		
		//tiempo de ejecucion
		service.haveFun();
	}
}
