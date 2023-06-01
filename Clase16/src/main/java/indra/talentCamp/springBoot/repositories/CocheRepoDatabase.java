package indra.talentCamp.springBoot.repositories;

import java.util.*;

import org.springframework.stereotype.Repository;

import indra.talentCamp.springBoot.models.Coche;

@Repository
public class CocheRepoDatabase implements CocheRepo{
	
	private static List<Coche> coches = new ArrayList<>();
	
	private static int ULTIMO_ID = 1;

	@Override
	public Coche findById(int id) {
		return new Coche() {{
			setId(id);
			setMarca("Tesla");
			setMatricula("43674MD");
			setElectrico(true);
		}};
	}

	@Override
	public void save(Coche coche) {
		coche.setId(ULTIMO_ID);
		ULTIMO_ID++;
		this.coches.add(coche);
	}

}
