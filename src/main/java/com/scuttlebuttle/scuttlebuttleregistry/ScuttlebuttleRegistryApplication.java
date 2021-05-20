package com.scuttlebuttle.scuttlebuttleregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ScuttlebuttleRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScuttlebuttleRegistryApplication.class, args);
	}

}
