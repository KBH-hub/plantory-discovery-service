package org.zero.plantorydiscoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PlantoryDiscoveryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlantoryDiscoveryServiceApplication.class, args);
	}

}
