package com.oracle.diva.objectService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.oracle.diva"})
@EntityScan("com.oracle.diva.model")
@EnableJpaRepositories("com.oracle.diva.repository")
public class ObjectServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObjectServiceApplication.class, args);
	}
}
