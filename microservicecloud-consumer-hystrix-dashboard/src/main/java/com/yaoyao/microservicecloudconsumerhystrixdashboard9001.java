package com.yaoyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard
public class microservicecloudconsumerhystrixdashboard9001 {

	public static void main(String[] args) {
		SpringApplication.run(microservicecloudconsumerhystrixdashboard9001.class, args);
	}

}
