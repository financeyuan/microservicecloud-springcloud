package com.yaoyao.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class configClientRest {
	
	@Value("${spring.application.name}")
	private String applicationname;
	
	@Value("${eureka.client.server-url.defaultZone}")
	private String eurekaServers;
	
	@Value("${server.port}")
	private String serverPort;
	
	@GetMapping("/config")
	public String getConfig() {
		String str = "applicationname: "+applicationname+"\t eurekaServers: "+eurekaServers+"\t serverPort: "+serverPort;
		System.out.println(str);
		return str;
	}
}
