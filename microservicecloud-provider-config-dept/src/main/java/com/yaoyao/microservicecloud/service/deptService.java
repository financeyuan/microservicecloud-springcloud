package com.yaoyao.microservicecloud.service;

import java.util.List;

import com.yaoyao.api.entity.Dept;

public interface deptService {

	Dept findById(Long id);

	List<Dept> findAll();

	boolean add(Dept dept);
}
