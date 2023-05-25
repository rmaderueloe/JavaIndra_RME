package indra.tc.layers.persistence.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediMockRepo;
import indra.talentCamp.layers.persistence.NotFoundException;
import indra.talentCamp.layers.persistence.SaveErrorException;

class JediMockRepoTests {

	@Test
	void testThrowExceptionIfNotFound() {
		JediMockRepo repo = new JediMockRepo();
		assertThrows(NotFoundException.class, () -> repo.findById(28));
	}
	
	@Test
	void testSaveAndFind() throws NotFoundException, SaveErrorException {
		JediMockRepo repo = new JediMockRepo();
		Jedi joda = new Jedi("Joda", 1000, Color.GREEN);
		
		repo.save(joda);
		Jedi grogu = repo.findById(1);	// se busca por 1 ya comienza por 0 "yoda"
		assertEquals(joda.getNombre(), grogu.getNombre());
	}
}
