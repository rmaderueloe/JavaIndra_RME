package indra.talentCamp.springBoot.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import indra.talentCamp.springBoot.models.Coche;
import indra.talentCamp.springBoot.repositories.CocheRepo;

@Service
public class CocheServiceImplementation implements CocheService{
	
	@Autowired
	private CocheRepo repo;
	
	@Override
	public Coche cocheDeElon() {
		/*return new Coche() {{
			setId(1);
			setMarca("Tesla");
			setMatricula("1234 jkh");
			setElectrico(true);
		}};*/
		return this.repo.findById(1);
	}

	@Override
	public void registrarCoche(Coche coche) {
		if(coche.getMarca().equalsIgnoreCase("tesla")) {
			coche.setElectrico(true);
		}else {
			coche.setElectrico(false);
		}
		
	}
}
