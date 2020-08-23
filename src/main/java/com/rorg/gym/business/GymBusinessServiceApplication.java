package com.rorg.gym.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient

@EntityScan({ "com.rorg.gym.commons.domain"})
public class GymBusinessServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(GymBusinessServiceApplication.class, args);
	}

}
