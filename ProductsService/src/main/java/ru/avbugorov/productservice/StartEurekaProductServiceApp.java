package ru.avbugorov.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class StartEurekaProductServiceApp {
	public static void main(String[] args) {
		SpringApplication.run(StartEurekaProductServiceApp.class, args);
	}
}

