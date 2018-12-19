package com.eureka.docker.EurekaMsDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMsDemoApplication.class, args);
	}

}

