package com.alas.petclinic.model;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

class PersonTest {

	Person paul = new Person();

	

	@Test
	final void testGetFirstName() {
		paul.setFirstName("paul");
		assertEquals(paul.getFirstName(), "paul");
		
	}

	@Test
	final void testSetFirstName() {
		paul.setFirstName("paul");
		assertEquals(paul.getFirstName(), "paul");
	}

	@Test
	final void testGetLastName() {
		paul.setLastName("Dumeaux");
		assertEquals(paul.getLastName(), "Dumeaux");
	}

	@Test
	final void testSetLastName() {
		paul.setLastName("Dumeaux");
		assertEquals(paul.getLastName(), "Dumeaux");
	}

}
