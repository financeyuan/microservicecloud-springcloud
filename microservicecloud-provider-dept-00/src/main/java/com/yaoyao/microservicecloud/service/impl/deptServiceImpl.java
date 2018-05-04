package com.yaoyao.microservicecloud.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yaoyao.api.entity.Dept;
import com.yaoyao.microservicecloud.dao.deptDao;
import com.yaoyao.microservicecloud.service.deptService;

@Service
public class deptServiceImpl implements deptService {
	
	@Resource
	private deptDao dao;
	
	
	@Override
	public Dept findById(Long id) {
		return dao.findById(id);
	}

	@Override
	public List<Dept> findAll() {
		return dao.findAll();
	}

	@Override
	public boolean add(Dept dept) {
		return dao.add(dept);
	}

}
