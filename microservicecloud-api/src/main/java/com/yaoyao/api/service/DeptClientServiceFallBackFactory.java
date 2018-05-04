package com.yaoyao.api.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.yaoyao.api.entity.Dept;

import feign.hystrix.FallbackFactory;

@Component
public class DeptClientServiceFallBackFactory implements FallbackFactory<DeptClientService>{

	public DeptClientService create(Throwable cause) {
		return new DeptClientService() {
			
			public Dept findById(Long id) {
				throw new RuntimeException("service not exits");
			}
			
			public List<Dept> findAll() {
				return null;
			}
			
			public boolean add(Dept dept) {
				return false;
			}
		};
	}

}
