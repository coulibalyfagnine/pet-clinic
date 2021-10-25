package com.alas.petclinic.services.map;

import org.springframework.stereotype.Service;

import com.alas.petclinic.model.PetType;
import com.alas.petclinic.services.PetTypeService;

@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> 
implements PetTypeService{

}
