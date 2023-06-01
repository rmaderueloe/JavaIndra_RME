package indra.talentCamp.springBoot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import indra.talentCamp.springBoot.models.Coche;
import indra.talentCamp.springBoot.services.CocheService;


@RestController
public class HelloWorldController {
	
	@Autowired
	private CocheService service;

	//llamada a metodo web= http://localhost:8080/api/Hello
	@RequestMapping(value = "/api/Hello", method = RequestMethod.GET)
	public String Hello() {
		return "Hello Wessal!";
	}
	
	//llamada a metodo web= http://localhost:8080/api/coche
	//devolucion
	@RequestMapping(value = "/api/coche", method = RequestMethod.GET)
	public Coche Coche() {
		return this.service.cocheDeElon();
		/*return new Coche() {{
			setId(1);
			setMarca("Tesla");
			setMatricula("1234 jfk");
			setElectrico(true);
		}};*/
	}

	// llamada a metodo web= http://localhost:8080/api/nicehello
	// devolucion
	@RequestMapping(value = "/api/nicehello", method = RequestMethod.GET)
	public String NiceHello() {
		StringBuilder sb = new StringBuilder();
		sb.append("<html>");
		sb.append("<body>");
		sb.append("<h1>Hola mundo spring boot!</h1>");
		sb.append("</body>");
		sb.append("</html>");
		return sb.toString();
	}

}
