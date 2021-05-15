package com.alas.petclinic.model;



import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PetTest {
	
	Pet boss = new Pet();
	LocalDate birthDate;

	@BeforeEach
	void setUp() throws Exception {
	}

	
	
	@Test
	final void testGetBirthDate() {
		
		boss.setBirthDate(birthDate);
		System.out.println(boss.getBirthDate());
	}

	@Test
	final void testSetBirthDate() {
		boss.setBirthDate(birthDate);
		System.out.println(boss.getBirthDate());
	}

}
