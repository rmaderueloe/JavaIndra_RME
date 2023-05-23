import static org.junit.Assert.assertEquals;

import java.util.Properties;
import org.junit.jupiter.api.Test;	//pom junit5
import com.google.gson.Gson;
import indra.talentCamp.maven.models.Persona;
public class GsonTests {
    String json = "{\"nombre\":\"pepe\",\"edad\":23}";
    Gson gson = new Gson();

	@Test
	public void testReadPropertiesFromJson() {
        Properties p = gson.fromJson(json, Properties.class);
        assertEquals("pepe", p.getProperty("nombre"));
        assertEquals("23", p.getProperty("edad"));
        /*System.out.println("El nombre es: " + p.getProperty("nombre"));
        System.out.println("La edad es: " + p.getProperty("edad"));
        System.out.println("JSON: " + p.toString());
        System.out.println();*/
	}
	
	@Test
	public void testReadCustomObjFromJson() {
        Persona persona = gson.fromJson(json, Persona.class);
        assertEquals("pepe", persona.getNombre());
        assertEquals(23, persona.getEdad());
        /*System.out.println("El nombre es: " + persona.getNombre());
        System.out.println("La edad es: " + persona.getEdad());
        System.out.println("JSON: " + persona.toString().toUpperCase());*/
	}
}
