package com.ust.AirlinesServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AirlinesServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirlinesServerApplication.class, args);
	}

}
