package com.yaoyao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.yuan.myRule;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=myRule.class)
public class deptConsumerAppliacation {

	public static void main(String[] args) {
		SpringApplication.run(deptConsumerAppliacation.class, args);
	}

}
