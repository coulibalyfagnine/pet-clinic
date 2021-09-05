package com.alas.petclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.alas.petclinic.model.Owner;
import com.alas.petclinic.model.Vet;
import com.alas.petclinic.services.OwnerService;
import com.alas.petclinic.services.VetService;
import com.alas.petclinic.services.map.OwnerServiceMap;
import com.alas.petclinic.services.map.VetServiceMap;

@Component
public class Dataloader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	
	
	public Dataloader() {
		super();
		this.ownerService = new OwnerServiceMap();
		this.vetService = new VetServiceMap();
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Loading the data ...");
		
		System.out.println("**************** loading the owners *******************");
		
		Owner owner1 = new Owner();
		Owner owner2 = new Owner();
		owner1.setId(1L);
		owner1.setFirstName("Djiby");
		owner1.setLastName("Couby");				
		ownerService.save(owner1);
		
		owner2.setId(2L);
		owner2.setFirstName("Ibo");
		owner2.setLastName("Couby");				
		ownerService.save(owner2);
		
		ownerService.findAll().forEach((e) -> System.out.println(e.getFirstName()));
		
		System.out.println("**************** loading the vets *******************");
		
		Vet vet1 = new Vet();
		vet1.setId(1L);
		vet1.setFirstName("Kokofianan");
		vet1.setLastName("Soro");
		vetService.save(vet1);
		
		Vet vet2 = new Vet();
		vet2.setId(2L);
		vet2.setFirstName("Tchéwôh");
		vet2.setLastName("Couby");
		vetService.save(vet2);
		
		Vet vet3 = new Vet();
		vet3.setId(3L);
		vet3.setFirstName("Tanco");
		vet3.setLastName("Fof");
		vetService.save(vet3);
		
		vetService.findAll().forEach(e-> System.out.println(e.getFirstName()));
		
	}

}
