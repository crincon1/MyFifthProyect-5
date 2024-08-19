package co.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@ComponentScan(basePackages = {"co.edu.ue","co.edu.ue.service","co.edu.ue.controller","co.edu.ue.repositories"})
public class MunicipioApplication {

	public static void main(String[] args) {
		SpringApplication.run(MunicipioApplication.class, args);
	}
	@Bean
	public RestTemplate template(){
		return new RestTemplate();
	}

}
