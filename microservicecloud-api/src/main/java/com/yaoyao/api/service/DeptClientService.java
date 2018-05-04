package com.yaoyao.api.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.yaoyao.api.entity.Dept;

@FeignClient(value="MICROSERVICECLOUD-DEPT",fallbackFactory = DeptClientServiceFallBackFactory.class)
public interface DeptClientService {
	
	@GetMapping("/dept/get/{id}")
	Dept findById(@PathVariable("id")Long id);

	@GetMapping("/dept/list")
	List<Dept> findAll();

	@PostMapping("/dept/add")
	boolean add(@RequestBody Dept dept);
	
}
