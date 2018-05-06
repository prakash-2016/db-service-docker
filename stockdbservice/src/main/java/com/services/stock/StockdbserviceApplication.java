package com.services.stock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan("com.services.*")
@EnableJpaRepositories(basePackages = "com.services.repository")
@SpringBootApplication
@EntityScan("com.services.model")   
public class StockdbserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(StockdbserviceApplication.class, args);
	}
}
