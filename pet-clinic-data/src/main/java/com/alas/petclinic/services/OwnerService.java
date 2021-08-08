package com.alas.petclinic.services;


import com.alas.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
	
}
