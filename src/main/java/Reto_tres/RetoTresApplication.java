package Reto_tres;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
@EntityScan(basePackages = {"Reto_tres.Modelo"})
public class RetoTresApplication {

	public static void main(String[] args) {
		SpringApplication.run(RetoTresApplication.class, args);
	}

}
