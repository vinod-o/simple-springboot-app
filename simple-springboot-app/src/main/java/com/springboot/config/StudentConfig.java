package com.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.springboot.interceptor.RequestHeaderInterceptor;

@Configuration
public class StudentConfig implements WebMvcConfigurer {

	@Autowired
	private RequestHeaderInterceptor requestHeaderInterceptor;

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		//i am adding version
		//hello i am ad st
		// i am revert
		// hii now i am reset
	
		registry.addInterceptor(requestHeaderInterceptor);
	}
}
