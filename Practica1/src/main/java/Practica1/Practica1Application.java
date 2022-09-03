package Practica1;

import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class Practica1Application {
	
	private static Logger LOG  = (Logger) LoggerFactory.getLogger(Practica1Application.class);
	
	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Practica1Application.class);
		ConfigurableApplicationContext context = app.run(args);
		Environment env = context.getEnvironment();
		String protocol  = "http";
		
		
	}

}
