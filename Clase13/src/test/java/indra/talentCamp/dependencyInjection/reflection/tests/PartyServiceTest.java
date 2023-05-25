package indra.talentCamp.dependencyInjection.reflection.tests;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import indra.talentCamp.dependencyInjection.reflection.MockRepo;
import indra.talentCamp.dependencyInjection.reflection.PartyService;

public class PartyServiceTest {
		
	@BeforeEach
	public void configure() {
		// tiempo de configuracion (usar MOCK no estamos en produccion al hacer tests)
		PartyService.registerRepoClass(MockRepo.class);
	}
	
	@Test
	public void test() {
		//tiempo de ejecucion
		PartyService service = new PartyService();
		service.haveFun();
		
		assertEquals(true, true);  // asserts correspondientes
	}
}
