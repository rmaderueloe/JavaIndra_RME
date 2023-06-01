package indra.talentCamp.bbdd.persistence;
import indra.talentCamp.bbdd.models.Persona;
import lombok.Getter;
import lombok.Setter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class PersonaRepo implements Repository<Persona>{
	
	@Getter @Setter
	private String connString;
	//"jdbc:sqlite:indra.db"

	@Override
	public void save(Persona nuevo) throws SaveErrorException {
		
	}

	@Override
	public void update(Persona nuevo) throws UpdateErrorException {
		
	}

	@Override
	public void delete(int id) throws NotFoundException {
		
	}

	@Override
	public List<Persona> findAll() {
		List<Persona> resultP = new ArrayList<Persona>();
		Connection conn = null;
		try {
			try {
				conn = DriverManager.getConnection(this.connString);
				Statement select = conn.createStatement();
				ResultSet resultSet = select.executeQuery("SELECT * FROM Persona");
				
				while (resultSet.next()) {
					Persona crack = Persona.builder() // LOMBOK
							.id(resultSet.getInt("id"))
							.nombre(resultSet.getString("nombre"))
							.edad(resultSet.getInt("edad"))
							.build();
					resultP.add(crack);
				}
			} finally {
				if (conn != null) conn.close();
			}
		} catch (Exception e) {
			throw new Error(e.getMessage());
		}
		return resultP;
	}

	@Override
	public Persona findById(int id) throws NotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
