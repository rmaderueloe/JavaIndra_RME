package indra.talentCamp.bbdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import indra.talentCamp.bbdd.models.Persona;
import indra.talentCamp.bbdd.services.PersonaService;

public class App {

	public static void main(String[] args) {
		System.out.println("JCBC es la Hostia!");

		Connection conn = null;
		ApplicationContext iocContainer = null;

		try {
			try {
				//iocContainer = new FileSystemXmlApplicationContext("appContext.xml");
				//Persona daniel = (Persona) iocContainer.getBean("dani");
				//System.out.println("Mi bean creado por spring!");
				//System.out.println(daniel);
				
				
				conn = DriverManager.getConnection("jdbc:sqlite:indra.db");
				System.out.println("Creando la BBDD!");
				
				Statement createStatement =  conn.createStatement();
				String query = "CREATE TABLE IF NOT EXISTS Persona(" +
                        "ID INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "Nombre TEXT NOT NULL," +
                        "Edad INTEGER NOT NULL)";
	            createStatement.executeUpdate(query);

        		System.out.println("BBDD creada correctamente!");
        		
        		System.out.println("Insertando a algunas de personas!");
        		String elegidos = "Angello, Rafa, Pepe, Wessal";
        		
        		for (String elegido : elegidos.split(",")) {
        			System.out.println("Añadiendo a: " + elegido);
            		PreparedStatement insert = 
            				conn.prepareStatement("INSERT INTO Persona (Nombre, Edad) VALUES (?, ?)");
            		insert.setString(1, elegido);
            		insert.setInt(2, 23);
            		insert.executeUpdate();
				}
        		System.out.println("Personas insertadas correctamente!");
        		
        		
				Statement selectStatement = conn.createStatement();
				ResultSet result = selectStatement.executeQuery("SELECT * FROM Persona");
				
				List<Persona> cracksDeJava = new ArrayList<Persona>();
				while (result.next()) {
					/*Persona crack = new Persona();
					crack.setId(result.getInt("id"));
					crack.setNombre(result.getString("nombre"));
					crack.setEdad(result.getInt("edad"));*/
					Persona crack = Persona.builder()		// LOMBOK
							.id(result.getInt("id"))
							.nombre(result.getString("nombre"))
							.edad(result.getInt("edad"))
							.build();
					cracksDeJava.add(crack);
				}
				cracksDeJava.forEach(System.out::println);
				
				System.out.println("Cambiando la edad de Angello!");
				PreparedStatement update = 
						conn.prepareStatement("UPDATE Persona SET edad = ? WHERE Nombre = ?");
        		update.setInt(1, 69);
        		update.setString(2, "Angello");
        		update.executeUpdate();
        		
				ResultSet result2 = selectStatement.executeQuery("SELECT * FROM Persona");
				List<Persona> cracksDeJava2 = new ArrayList<Persona>();
				while (result2.next()) {
					Persona crack = new Persona();
					
					crack.setId(result2.getInt("id"));
					crack.setNombre(result2.getString("nombre"));
					crack.setEdad(result2.getInt("edad"));
					cracksDeJava2.add(crack);
				}
				cracksDeJava2.forEach(System.out::println);
				
				iocContainer = new FileSystemXmlApplicationContext("appContext.xml");
				PersonaService services = (PersonaService) iocContainer.getBean("personaService");
				List<Persona> cracksDeJavaBean = services.cracksDeJava();
				cracksDeJavaBean.forEach(System.out::println);
			} finally {
				if (conn != null) conn.close();
			}
		} catch (SQLException e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
