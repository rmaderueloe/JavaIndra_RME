package indra.talentCamp.dependencyInjection.reflection;

public class PartyService {
	
	static private Class<? extends Repo> repoClass = null;
	
	public static void registerRepoClass(Class<? extends Repo> repoClass){
		PartyService.repoClass = repoClass;
	}
	
	private Repo repo;
	
	public PartyService() {
		if(PartyService.repoClass == null) {
			throw new Error("Te olvidaste de configurar el PartyService.");
		}
		
		try {
			// esta forma sirve solamente para las clases con constructores sin parametros
			this.repo = PartyService.repoClass.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}
	
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("Despues deladiversion guardar en el repositorio");
		this.repo.save();
	}
}
