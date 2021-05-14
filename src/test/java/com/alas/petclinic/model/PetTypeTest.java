package com.alas.petclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PetTypeTest {
	
	PetType felin = new PetType();
	
	@Test
	final void testClassPetType() {
		assertTrue( felin instanceof PetType);
	}
	
	@Test
	final void testGetName() {
		felin.setName("felin");
	}

	@Test
	final void testSetName() {
		felin.getName();
	}

}
