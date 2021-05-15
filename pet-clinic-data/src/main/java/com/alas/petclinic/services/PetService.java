package com.alas.petclinic.services;

import java.util.Set;

import com.alas.petclinic.model.Pet;

public interface PetService {
	
	
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
