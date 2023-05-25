package indra.talentCamp.dependencyInjection.contructor;

public class PartyService {
	
	private Repo repo;

	public PartyService(Repo repo) {
		this.repo = repo;	
	}
	
	public void haveFun() {
		assert this.repo != null;  // verificar que no es vacio
		
		System.out.println("Everybody have fun tonight");
		System.out.println("Despues deladiversion guardar en el repositorio");
		this.repo.save();
	}
}
