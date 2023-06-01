package indra.talentCamp.bbdd.persistence;

import java.util.*;

public interface Repository<T> {
	//modificaciones
	public void save(T nuevo) throws SaveErrorException;
	public void update(T nuevo) throws UpdateErrorException;
	public void delete(int id) throws NotFoundException;
	
	//busquedas
	public List<T> findAll();
	public T findById(int id) throws NotFoundException;
}
