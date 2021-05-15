package com.alas.petclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VetTest {
	Vet camille= new Vet();
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	final void test() {
		assertTrue(camille instanceof Person);
		
	}

}
