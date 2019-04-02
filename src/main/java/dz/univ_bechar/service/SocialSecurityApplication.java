package dz.univ_bechar.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import dz.univ_bechar.service.repository.SocialRepository;

@SpringBootApplication
public class SocialSecurityApplication {

	public static SocialRepository fich;
	public static void main(String[] args) {
		ApplicationContext ctx = 
				SpringApplication.run(SocialSecurityApplication.class, args);
		
		fich =ctx.getBean(SocialRepository.class);
	
	}
}
