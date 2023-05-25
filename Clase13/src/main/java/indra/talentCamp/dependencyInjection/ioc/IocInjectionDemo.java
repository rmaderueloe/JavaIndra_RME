package indra.talentCamp.dependencyInjection.ioc;

public class IocInjectionDemo {
	public static void aTodoGas() {
		//configuracion
		BeanFactoryV1 factory = new BeanFactoryV1();
		factory.registerRepo(new DatabaseRepo());
		
		//ejecucion
		PartyService service = factory.createPartyService();
		service.haveFun();
	}

}
