package org.sid;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ControleApplication extends SpringBootServletInitializer implements CommandLineRunner {
	@Autowired
	private RessourceRepository ressourceRepository;
	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Ressource.class);
		repositoryRestConfiguration.setReturnBodyOnCreate(true);
		repositoryRestConfiguration.setReturnBodyOnUpdate(true);
		repositoryRestConfiguration.getCorsRegistry().addMapping("/**").allowedOrigins("*").allowedHeaders("*");
		
		ressourceRepository.save(new Ressource(null, "R1", new Date(), 99, 5));
		ressourceRepository.save(new Ressource(null, "R2", new Date(), 99, 10));
		ressourceRepository.save(new Ressource(null, "R3", new Date(), 99, 4));
		
		
		ressourceRepository.save(new Ressource(null,"ressource 1",new Date(), 325,32));
		ressourceRepository.save(new Ressource(null,"Pc portable lenovo",new Date(), 32,36));
		ressourceRepository.save(new Ressource(null,"souris mad catz",new Date(), 02,82));
	}

}
