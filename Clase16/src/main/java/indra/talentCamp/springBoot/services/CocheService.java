package indra.talentCamp.springBoot.services;

import indra.talentCamp.springBoot.models.Coche;

public interface CocheService {
	public void registrarCoche(Coche coche);
	public Coche cocheDeElon();
}