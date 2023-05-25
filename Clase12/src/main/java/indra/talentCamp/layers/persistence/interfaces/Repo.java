package indra.talentCamp.layers.persistence.interfaces;

import java.util.*;


import indra.talentCamp.layers.persistence.*;

public interface Repo<T> {
	
	public void save(T newObject) throws SaveErrorException;
	public void update(T newObject);
	public void delete(int id) throws NotFoundException;
	public T findById(int id) throws NotFoundException;
	public List<T> findAll();
}
