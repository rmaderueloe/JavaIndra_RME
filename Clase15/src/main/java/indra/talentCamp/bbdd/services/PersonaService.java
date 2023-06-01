package indra.talentCamp.bbdd.services;

import java.util.List;

import indra.talentCamp.bbdd.models.Persona;
import indra.talentCamp.bbdd.persistence.PersonaRepo;

public class PersonaService {
	
	private PersonaRepo repo;
	
	public List<Persona> cracksDeJava(){
		return this.repo.findAll();
	}
}
