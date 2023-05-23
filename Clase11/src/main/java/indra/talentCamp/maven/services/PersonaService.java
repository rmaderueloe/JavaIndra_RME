package indra.talentCamp.maven.services;

import java.util.*;

import indra.talentCamp.maven.models.Persona;
import indra.talentCamp.maven.persistence.PersonaRepo;

public class PersonaService {

	private PersonaRepo repo;

	public PersonaService() {
		this.repo = new PersonaRepo();
	}
	
	public List<Persona> showAllPersonas() {
		List<Persona> personas = this.repo.findAll();
		// ...
		return null;
	}
	
	public void registerPersona(Persona p) {
		// funcionalidades adicionales a añadir respecto al repo (persistence)
		
		if(p.getNombre() == null) {
			//throw Exception;
		}
		
		this.repo.saveP(p);
	}
	

}
