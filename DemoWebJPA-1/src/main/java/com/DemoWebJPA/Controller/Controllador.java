package com.DemoWebJPA.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.DemoWebJPA.Modelo.Persona;
import com.DemoWebJPA.Repository.IPersonaRepository;

@Controller
public class Controllador {
	
	@Autowired
	private IPersonaRepository repositorio;

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		
		//Logica
		
		Persona p = new Persona();  //Creo la instancia
		p.setIdPersona(3); //Introduzco el id
		p.setNombre("Jaime"); // El nombre
		repositorio.save(p);   // Lo alamaceno	
		model.addAttribute("name", name);
		return "greeting";
	}
	
	@GetMapping("/listar")
	public String greeting( Model model) {
		
		//Logica
		
		
		model.addAttribute("personas", repositorio.findAll());
		return "greeting";
	}


}
