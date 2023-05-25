package indra.talentCamp.layers.services;

import java.awt.Color;
import java.util.Random;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediMockRepo;
import indra.talentCamp.layers.persistence.SaveErrorException;
import indra.talentCamp.layers.persistence.interfaces.Repo;

public class JediService {
	
	//private JediMockRepo repository;
	private Repo<Jedi> repo;

	public JediService(Repo<Jedi> repo) {
		super();
		// dependencia fija, establecida en el constructor
		this.repo = repo;
	}

	private int calcularNivelDeFuerza() {
		return new Random().nextInt(1_000, 1_000_000);
	}
	
	private Color crearSableNuevo() {
		return Color.PINK;
	}

	public void alistar(String name) {
		Jedi newJedi = new Jedi(name, crearSableNuevo());
		newJedi.setNivelDeFuerza(this.calcularNivelDeFuerza());
		try {
			this.repo.save(newJedi);
		} catch (SaveErrorException e) {
			e.printStackTrace();
		}
	}

}
