package indra.talentCamp.dependencyInjection.constructor.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import indra.talentCamp.dependencyInjection.contructor.MockRepo;
import indra.talentCamp.dependencyInjection.contructor.PartyService;

public class PartyServiceTest {
	
	@Test
	public void test() {
		// tiempo de configuracion (usar MOCK noestamos en produccion al hacer tests)
		PartyService service = new PartyService(new MockRepo());
		
		//tiempo de ejecucion
		service.haveFun();
		
		assertEquals(true, true);  // asserts correspondientes
	}
}
