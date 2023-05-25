package indra.talentCamp.dependencyInjection.ioc;

public class BeanFactoryV1 {
	
	//INVERSION DE CONTROL
	
	Repo repo;
	
	public void registerRepo(Repo repo) {
		this.repo = repo;
	}
	
	public PartyService createPartyService(){
		return new PartyService(this.repo);
	}
}
