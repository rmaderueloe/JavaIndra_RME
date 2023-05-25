package indra.talentCamp.dependencyInjection.field.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import indra.talentCamp.dependencyInjection.field.MockRepo;
import indra.talentCamp.dependencyInjection.field.PartyService;

public class PartyServiceTest {
	
	PartyService service;
	
	@BeforeEach
	public void configure() {
		// tiempo de configuracion (usar MOCK noestamos en produccion al hacer tests)
		service = new PartyService();
		service.setRepo(new MockRepo());
	}
	
	@Test
	public void test() {
		//tiempo de ejecucion
		service.haveFun();
		
		assertEquals(true, true);  // asserts correspondientes
	}
}
