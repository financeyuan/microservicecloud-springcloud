package com.yaoyao.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yaoyao.api.entity.Dept;
import com.yaoyao.api.service.DeptClientService;

@RestController
public class DeptController_Consumer {

	@Resource
	private DeptClientService deptClientService;

	@PostMapping("/consumer/dept/add")
	public boolean add(Dept dept) {
		return this.deptClientService.add(dept);
	}

	@GetMapping("/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id) {
		 return this.deptClientService.findById(id);
	}

	@GetMapping("/consumer/dept/list")
	public List<Dept> list() {
		 return this.deptClientService.findAll();
	}
	
}
