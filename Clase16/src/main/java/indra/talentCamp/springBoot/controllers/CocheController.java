package indra.talentCamp.springBoot.controllers;


import org.apache.logging.log4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import indra.talentCamp.springBoot.dto.RegistrarCocheParams;
import indra.talentCamp.springBoot.dto.RegistrarCocheResult;
import indra.talentCamp.springBoot.models.Coche;
import indra.talentCamp.springBoot.services.CocheService;

@RestController
public class CocheController {
	
	@Autowired
	private CocheService service;
	
	@RequestMapping(value = "/api/coche", method = RequestMethod.POST)	//@RequestBody permite obtener datos del body con POST 
	public RegistrarCocheResult registrarCoche(@RequestBody RegistrarCocheParams params) {
		try {
			// mostrar informacion por consola
			Logger logger = LogManager.getLogger(CocheController.class);
			logger.log(Level.INFO, "POST /api/coche -- Body " + params);
			
			assert params.getMarca() != null;
			assert params.getMatricula() != null;
			
			Coche coche = new Coche() {{
				setMarca(params.getMarca());
				setMatricula(params.getMatricula());
			}};
			
			this.service.registrarCoche(coche);
			return new RegistrarCocheResult(true, "Coche registrado correctamente con id " + coche.getId());
		} catch (Throwable e) {
			return new RegistrarCocheResult(false, "Coche no registrado" + e.getMessage());
		}
	}
}
