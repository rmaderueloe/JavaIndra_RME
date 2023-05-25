package indra.talentCamp.dependencyInjection.reflection;

public class PartyService2 {
	
	static private String repoClass = null;
	
	public static void registerRepoClass(String repoClass){
		PartyService2.repoClass = repoClass;
	}
	
	private Repo repo;
	
	public PartyService2() {
		if(repoClass == null) {
			throw new Error("Te olvidaste de configurar el PartyService.");
		}
		
		try {
			Class<? extends Repo> clase = (Class<? extends Repo>) Class.forName(repoClass);
			this.repo = clase.getConstructor().newInstance(null);
		} catch (Exception e) {
			throw new Error("No se encuentra la clase" + this.repoClass);
		}
	}
	
	public void haveFun() {
		System.out.println("Everybody have fun tonight");
		System.out.println("Despues deladiversion guardar en el repositorio");
		this.repo.save();
	}
}
