package com.alas.petclinic.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OwnerTest {
	Owner lea= new Owner();
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	final void test() {
		assertTrue(lea instanceof Person);
		
	}

}
