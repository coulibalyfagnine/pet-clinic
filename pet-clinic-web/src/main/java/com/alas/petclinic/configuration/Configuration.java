package com.alas.petclinic.configuration;

import org.springframework.context.annotation.Bean;

import com.alas.petclinic.services.map.OwnerServiceMap;
import com.alas.petclinic.services.map.VetServiceMap;

@org.springframework.context.annotation.Configuration
public class Configuration {

	
	@Bean
	public OwnerServiceMap ownerServiceMap() {
		return new OwnerServiceMap();
	}
	
	@Bean
	public VetServiceMap VetServiceMap() {
		return new VetServiceMap();
	}
}
