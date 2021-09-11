package com.alas.petclinic.services.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import com.alas.petclinic.model.BaseEntity;



public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

	protected Map<Long, T> map = new HashMap<>();
	
	public Set<T> findAll() {
		return new HashSet<>(map.values());
	}

	public T findById(ID id) {
		return map.get(id);
	}

	public T save(T object){
		try {
			if(object ==null)
				throw new RuntimeException("object can't be null");
			
			if(object.getId()==null) 
				object.setId(getNextId());
			
			map.put(object.getId(), object);
		
		}catch (RuntimeException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		
		return object;
	}

	public void delete(T object) {
		map.entrySet().removeIf(entry-> entry.getValue().equals(object));
	}

	public void deleteById(ID id) {
		map.remove(id);		
	}
	
	private Long getNextId(){
		Long nextId;
		
		try {
			nextId = Collections.max(map.keySet()) +1;	
		}catch (NoSuchElementException e) {
			
			nextId = 1L;
		}
	
		return nextId;
	}

}
