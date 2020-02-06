package com.charlie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ApplicationPayment {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationPayment.class, args);
	}
}
