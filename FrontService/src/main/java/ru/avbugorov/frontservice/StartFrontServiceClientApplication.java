package ru.avbugorov.frontservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class StartFrontServiceClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(StartFrontServiceClientApplication.class, args);
	}
}

