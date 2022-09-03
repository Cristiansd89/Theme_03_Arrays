package com.DemoConsola.Repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.demoConsola.DemoConsolaApplication;

@Repository 
public class PersonaRepository implements IPersonaRepository {

	
	private static Logger LOG  = LoggerFactory.getLogger(DemoConsolaApplication.class);

	@Override
	public void registrar(String nombre) {

		LOG.info("Se registro a " +nombre);
	}
}
