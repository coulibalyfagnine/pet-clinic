package com.alas.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alas.petclinic.model.Owner;
import com.alas.petclinic.model.PetType;
import com.alas.petclinic.model.Vet;
import com.alas.petclinic.services.OwnerService;
import com.alas.petclinic.services.PetTypeService;
import com.alas.petclinic.services.VetService;


@Component
public class Dataloader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	private final PetTypeService petTypeService;
	
	
	
	public Dataloader(OwnerService ownerService, VetService vetService, PetTypeService petTypeService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
		this.petTypeService = petTypeService;
	}


	


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Loading the data ...");
		
		System.out.println("**************** loading the owners *******************");
		
		Owner owner1 = new Owner();
		Owner owner2 = new Owner();
		Owner owner3 = new Owner();
		
		owner1.setFirstName("Djiby");
		owner1.setLastName("Couby");				
		ownerService.save(owner1);
		
		
		owner2.setFirstName("Ibo");
		owner2.setLastName("Couby");				
		ownerService.save(owner2);
		ownerService.save(owner3);
		
		ownerService.findAll().forEach((e) -> System.out.println(e.getFirstName()));
		
		System.out.println("**************** loading the vets *******************");
		
		Vet vet1 = new Vet();
		vet1.setFirstName("Kokofianan");
		vet1.setLastName("Soro");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setFirstName("Tchéwôh");
		vet2.setLastName("Couby");
		vetService.save(vet2);
		
		Vet vet3 = new Vet();
		vet3.setId(3L);
		vet3.setFirstName("Tanco");
		vet3.setLastName("Fof");
		vetService.save(vet3);
		
		vetService.findAll().forEach(e-> System.out.println(e.getFirstName()));
		
		System.out.println("**************** loading the PetType *******************");
		PetType petType = new PetType();
		PetType petType1 = new PetType();
		petType.setName("Carnivore");
		petType1.setName("Mammifere");
		petTypeService.save(petType);
		petTypeService.save(petType1);
		petTypeService.findAll().forEach(e ->System.out.println(e.getId()));
		
		System.out.println("**************** End) loading the PetType *******************");
		
	}

}
