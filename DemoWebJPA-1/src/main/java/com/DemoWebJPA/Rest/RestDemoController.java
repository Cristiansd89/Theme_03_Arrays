package com.DemoWebJPA.Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DemoWebJPA.Modelo.Persona;
import com.DemoWebJPA.Repository.IPersonaRepository;

import java.util.List;


/*
 * Para listas informacion en formato JSON
 */
@RestController
@RequestMapping("/personas")
public class RestDemoController {
	
	@Autowired
	private IPersonaRepository repo;
	
	
	/*
	 *	@GetMapping Para Listar datos
	 */
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();
	}
	
	/*
	 *	Con @RequestBody vamos a transformar un JSON en un objeto Java
	 *	@PostMapping se utiliza para insertar datos
	 */
	@PostMapping
	public void insertar(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	/*
	 *	@PutMapping se usa para modificar objeto 
	 * 
	 */
	
	@PutMapping
	public void Modificar(@RequestBody Persona persona) {
		repo.save(persona);
	}
	
	/*
	 * 
	 *	Cuando despues de la barra le pasemos un id, que va capturar con @PathVariable
	 *	el dato y eliminara el objeto con ese identificador
	 * 
	 */
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id) {
		repo.deleteById(id);
	}

}
