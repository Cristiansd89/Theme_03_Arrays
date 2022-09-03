package Practica1.controller;

import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import Practica1.config.Practica1Config;
import ch.qos.logback.classic.Logger;

@RestController
public class PracticaController {
	
	private static Logger LOG  = (Logger) LoggerFactory.getLogger(Practica1Config.class);
	
	@Autowired
	private MessageSource messageSource;
	
	
	@GetMapping("/messages")
	public String getMesage(@RequestParam (value = "Messege", defaultValue = "World")String messege) {
		String greeting = messageSource.getMessage("geeting", null, LocaleContextHolder.getLocale());
		messege = String.format("%s %s", greeting, messege);
		LOG.debug(messege);
		return messege;
	}

}
