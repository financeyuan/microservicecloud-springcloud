package com.yaoyao.api.entity;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain=true)
@Data
@SuppressWarnings("unused")
public class Dept implements Serializable{
	
	private static final long serialVersionUID = 1L;

	//主键
	
	private Long depeno;
	
	//名称
	private String dname;
	
	//数据库
	private String db_source;
	
}
