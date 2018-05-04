package com.yaoyao.microservicecloud.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.yaoyao.api.entity.Dept;


@Mapper
public interface deptDao {
	
	Dept findById(Long id);
	
	List<Dept> findAll();
	
	boolean add(Dept dept);
}
