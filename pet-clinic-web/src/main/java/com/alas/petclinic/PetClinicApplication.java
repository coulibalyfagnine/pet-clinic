package com.alas.petclinic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.alas.petclinic.model.Person;

@SpringBootApplication
public class PetClinicApplication  {

	public static void main(String[] args) {
		ApplicationContext ctx =  SpringApplication.run(PetClinicApplication.class, args);
		System.out.println("pet clinic");
		System.out.println(ctx);
		
		Person paul = new Person();
		System.out.println(paul.getFirstName());
		
	}

}
