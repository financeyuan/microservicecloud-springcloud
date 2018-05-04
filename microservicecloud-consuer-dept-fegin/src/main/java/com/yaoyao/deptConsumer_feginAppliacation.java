package com.yaoyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.yaoyao"})
@ComponentScan("com.yaoyao")
public class deptConsumer_feginAppliacation {

	public static void main(String[] args) {
		SpringApplication.run(deptConsumer_feginAppliacation.class, args);
	}

}
