package com.tariq.rest;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.tariq.GenericExceptionMapper;

@Component
@ApplicationPath("/rest")
public class ServiceConfig extends ResourceConfig {

	public ServiceConfig() {
		
	}
	
	@PostConstruct
	public void setUp() {
		packages("com.tariq.rest.controller");
		register(GenericExceptionMapper.class);
	}

	
}
