package indra.talentCamp.dependencyInjection.ioc;

public class PartyService {
	
	private Repo repo;
	
	// package protected (seguridad con otros paquetes)
	PartyService(Repo repo) {
		this.repo = repo;
	}

	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("Despues de la diversion guardar en el repositorio");
		this.repo.save();
	}
}
