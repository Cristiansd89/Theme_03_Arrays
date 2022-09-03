package Practica1.config;

import java.util.Locale;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.WebProperties.LocaleResolver;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import Practica1.Practica1Application;
import ch.qos.logback.classic.Logger;

@Configuration
public class Practica1Config {

	private static Logger LOG  = (Logger) LoggerFactory.getLogger(Practica1Config.class);
	
	@Value ("${spring.locale.default}")
	private String locale ;
	
	
	@Value ("${spring.messages.basename}")
	private String basename ;
	
	@Bean
	public MessageSource messageSource() {
		LOG.info("set locale to :"+locale);
		Locale.setDefault(new Locale(locale));
		
		ResourceBundleMessageSource source = new ResourceBundleMessageSource();
		source.setBasename(basename);
		source.setUseCodeAsDefaultMessage(true);
		return source;
	}
	
	@Bean
	public SessionLocaleResolver localeResolver() {
		
		SessionLocaleResolver slr = new SessionLocaleResolver();
		slr.setDefaultLocale(new Locale(locale));
		return slr;
	}
}
