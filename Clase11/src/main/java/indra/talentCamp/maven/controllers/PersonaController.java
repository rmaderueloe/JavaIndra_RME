package indra.talentCamp.maven.controllers;

import java.util.*;

import indra.talentCamp.maven.models.Persona;
import indra.talentCamp.maven.services.PersonaService;

public class PersonaController {

	private PersonaService service;

	public PersonaController(PersonaService service) {
		this.service = new PersonaService();
	}
	
	public String mostrarTodas() {
		List<Persona> personas = this.service.showAllPersonas();
		
		StringBuilder builder = new StringBuilder();
		builder.append("<table>");
		//...
		builder.append("<table2>");
		return builder.toString();
		
	}
	
}
