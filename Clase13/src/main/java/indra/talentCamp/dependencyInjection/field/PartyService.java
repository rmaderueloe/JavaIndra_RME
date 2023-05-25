package indra.talentCamp.dependencyInjection.field;

import indra.talentCamp.dependencyInjection.field.Repo;

public class PartyService {
	
	private Repo repo;
	
	public PartyService() {
		this.repo = null;	
	}
	
	public void setRepo(Repo repo) {
		this.repo = repo;
	}
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("Despues deladiversion guardar en el repositorio");
		this.repo.save();
	}
}
