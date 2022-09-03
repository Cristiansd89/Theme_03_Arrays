package com.DemoConsola.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DemoConsola.Repository.IPersonaRepository;
import com.DemoConsola.Repository.PersonaRepository;

@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersonaRepository repositorio;
	@Override
	public void registrar(String nombre) {
		//repositorio = new PersonaRepository();
		repositorio.registrar(nombre);
		// TODO Auto-generated method stub
		
	}

}
