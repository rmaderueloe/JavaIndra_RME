package indra.talentCamp.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import indra.talentCamp.banco.*;

public class ClienteTests {
	
	@Test
	public void testValidateClientCreation(){
		assertThrows(AssertionError.class, () -> Cliente.builder().setNumeroIdentificacion("mal").build());
		assertThrows(AssertionError.class, () -> Cliente.builder().setNombre("mal").build());
		assertThrows(AssertionError.class, () -> Cliente.builder().setNombre("mal").setNumeroIdentificacion("123").build());
		//assertThrows(AssertionError.class, () -> Cliente.builder().setNombre(" ").setNumeroIdentificacion(" ").build());
	}
}
