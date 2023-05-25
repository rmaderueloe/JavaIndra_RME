package indra.talentCamp.layers.persistence;

import java.util.*;

import org.apache.commons.lang3.NotImplementedException;

import indra.talentCamp.layers.models.Jedi;
import indra.talentCamp.layers.persistence.interfaces.Repo;

public class JediMockRepo implements Repo<Jedi>{
	
	private List<Jedi> jedis = new LinkedList<Jedi>();
	
	private int lastId() {
		return this.jedis.stream().mapToInt(j ->j.getId()).max().orElse(0);
	}
	

	public List<Jedi> findAll(){
		return Collections.unmodifiableList(this.jedis);
	}

	public Jedi findById(int id) throws NotFoundException{
		return this.jedis.stream()
				.filter(j-> j.getId()==id)
				.findFirst()
				.orElseThrow(() -> new NotFoundException());
	}

	public void save(Jedi jedi)  throws SaveErrorException  {
		jedi.setId(this.lastId() + 1);
		this.jedis.add(jedi);
	}

	
	public void delete(int id) throws NotFoundException{
		Jedi j = this.findById(id);
		this.jedis.remove(j);
	}

	public void update(Jedi jedi) {
		throw new NotImplementedException();
		
	}

}
