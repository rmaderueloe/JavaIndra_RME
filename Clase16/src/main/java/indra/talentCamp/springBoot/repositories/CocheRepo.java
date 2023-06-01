package indra.talentCamp.springBoot.repositories;

import indra.talentCamp.springBoot.models.Coche;

public interface CocheRepo {

	public Coche findById(int id);	
	public void save(Coche coche);
	
}
