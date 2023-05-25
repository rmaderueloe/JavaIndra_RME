package indra.talentCamp.layers.persistence;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.interfaces.Repo;

public class JediFileRepo implements Repo<Jedi> {

	private int getJediCount() {
		File archivo = new File("./jedis");
		return archivo.listFiles().length;
	}

	public Jedi findById(int id) throws NotFoundException {
		File archivo = new File(String.format("./jedis/%d.txt", id));
		
		if (!archivo.exists()) {
			throw new NotFoundException();
		}
		
		try {
			try (BufferedReader reader = new BufferedReader(new FileReader(archivo))) {
				String linea = reader.readLine();
				String[] lineas= linea.split(";");
				
				Jedi jedi = new Jedi(lineas[1], 
						Integer.parseInt(lineas[2]),
						new Color(Integer.parseInt(lineas[3])));	
				jedi.setId( Integer.parseInt(lineas[0]));
				
				return jedi;
			}
		} catch (Exception e) {
			throw new NotFoundException();
		}
	}

	public List<Jedi> findAll(){
		try {
			List<Jedi> jedis = new ArrayList<Jedi>();
			
			File dir = new File("./jedis");
			File[] archivos = dir.listFiles();
			for(File archivo : archivos) {
				String nombre = archivo.getName();
				nombre = nombre.replaceAll(".txt", "");
				Jedi jedi = this.findById(Integer.parseInt(nombre));
				jedis.add(jedi);
			}
			
				
			return jedis;
		} catch(Exception ex) {
			throw new Error("Esto es inesperado");
		}
	}

	public void save(Jedi jedi) throws SaveErrorException {
		// save data in package jedis
		jedi.setId(this.getJediCount() + 1); // empezara en 1 siempre el ID

		File archivo = new File(String.format("./jedis/%d.txt", jedi.getId()));
		try {
			archivo.createNewFile();
			try (FileWriter writer = new FileWriter(archivo)) {
				writer.write(String.format("%d;%s;%d;%d;", 
						jedi.getId(), 
						jedi.getNombre(), 
						jedi.getNivelDeFuerza(),
						jedi.getColorLightSaber().getRGB()));
			}
		} catch (Exception ex) {
			throw new SaveErrorException();
		}
	}
	
	public void delete(int id) throws NotFoundException  {
		File file = new File(String.format("%d.txt", id));
		if (!file.exists()) {
			throw new  NotFoundException();
		}
		System.out.println("Archivo eliminado: " + id + ".txt");
		file.delete();
	}
	
	public void update(Jedi jedi) {
		// TODO Auto-generated method stub
	}


}
