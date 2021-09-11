package com.alas.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alas.petclinic.services.VetService;

@RequestMapping("vets")
@Controller
public class VetController {

	private final VetService vetService;
	
	public VetController(VetService vetService) {
		super();
		this.vetService = vetService;
	}



	@RequestMapping({"", "/index", "/index.html"})
	public String listOfVets(Model model) {
		
		model.addAttribute("vets", vetService.findAll());
		return "vets/index";
	} 
}
