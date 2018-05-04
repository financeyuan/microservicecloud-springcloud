package com.yaoyao.microservicecloud.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.yaoyao.api.entity.Dept;
import com.yaoyao.microservicecloud.service.deptService;

@RestController
public class deptController {
	
	@Resource
	private deptService service;
	
	@Resource
	private DiscoveryClient discoveryClient;
	
	
	@GetMapping("/dept/get/{id}")
	public Dept get(@PathVariable("id")Long id) {
		return service.findById(id);
	}
	
	@GetMapping("/dept/list")
	public List<Dept> list(){
		return service.findAll();
	}
	
	@PostMapping("/dept/add")
	public boolean add(@RequestBody Dept dept) {
		return service.add(dept);
	}
	
	@GetMapping("/dept/discovery")
	public Object discovery() {
		/*List<String> list = discoveryClient.getServices();
		
		List<ServiceInstance> servList = discoveryClient.getInstances("MICROSERVICECLOUD-DEPT");*/
		
		return this.discoveryClient;
	}
	

}
