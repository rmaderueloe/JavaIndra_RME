package indra.talentCamp.dependencyInjection.field;

public class DatabaseRepo implements Repo{

	public void save() {
		System.out.println("Save (INSERT) y grabo en la BBDD");
		
	}

}
