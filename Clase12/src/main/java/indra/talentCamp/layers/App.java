package indra.talentCamp.layers;

import java.awt.Color;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.JediFileRepo;
import indra.talentCamp.layers.persistence.JediMockRepo;
import indra.talentCamp.layers.persistence.NotFoundException;
import indra.talentCamp.layers.persistence.SaveErrorException;
import indra.talentCamp.layers.persistence.interfaces.Repo;

public class App {

	public static void main(String[] args) throws SaveErrorException, NotFoundException {

		JediFileRepo fileRepo = new JediFileRepo();
		//Repo<Jedi> fileRepo = new Repo<>();
		Jedi joda = new Jedi("Joda", 1000, Color.GREEN);
		//fileRepo.save(joda);
		System.out.println(fileRepo.findById(1));
		fileRepo.delete(2);
	}

}
