package com.demoConsola;

import org.slf4j.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.DemoConsola.service.IPersonaService;




@SpringBootApplication
public class DemoConsolaApplication implements CommandLineRunner {

	
	private static Logger LOG  = LoggerFactory.getLogger(DemoConsolaApplication.class);
	@Autowired
	private IPersonaService service;
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoConsolaApplication.class, args);
	}
	
	
	/*
	 * Esta sobreescribiendo el metodo run
	 */
	@Override
	public void run(String... args) throws Exception {

		System.out.println("Hola mundo Spring");
		LOG.info("Hola desde log");
		LOG.warn(" Log de Errores");
		//service = new PersonaService();
		service.registrar("Cristian");
		
	}

}
