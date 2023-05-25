package indra.talentCamp.dependencyInjection.reflection.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import indra.talentCamp.dependencyInjection.reflection.PartyService2;

public class PartyServiceTest2 {
		
	@BeforeEach
	public void configure() {
		// tiempo de configuracion (usar MOCK no estamos en produccion al hacer tests)
		PartyService2.registerRepoClass("indra.talentCamp.dependencyInjection.reflection.MockRepo");
	}
	
	@Test
	public void test() {
		//tiempo de ejecucion
		PartyService2 service = new PartyService2();
		service.haveFun();
		
		assertEquals(true, true);  // asserts correspondientes
	}
}
