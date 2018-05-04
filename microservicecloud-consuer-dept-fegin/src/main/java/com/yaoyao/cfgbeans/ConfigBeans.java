package com.yaoyao.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;

@Configuration
public class ConfigBeans {
	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
	
	/**
	 * @return 
	 */
	@Bean
	public IRule myRule() {
		//return new RoundRobinRule();//轮询算法
		//return new RandomRule();//随机算法
		return new RetryRule();
	}
}
