package com.yaoyao.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class microservicecloudconfigeureka7001 {

	public static void main(String[] args) {
		SpringApplication.run(microservicecloudconfigeureka7001.class, args);
	}

}
