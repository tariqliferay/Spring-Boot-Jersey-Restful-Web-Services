package com.tariq.rest;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.ext.ContextResolver;
import javax.ws.rs.ext.Provider;

@Component
@ApplicationPath("/rest")
public class ServiceConfig extends ResourceConfig {

	public ServiceConfig() {
		
	}
	
	@PostConstruct
	public void setUp() {
		packages("com.tariq.rest.controller");
		register(ObjectMapperContextResolver.class);
	}

	@Provider
	public static class ObjectMapperContextResolver implements
			ContextResolver<ObjectMapper> {

		private final ObjectMapper mapper;

		public ObjectMapperContextResolver(ObjectMapper mapper) {
			this.mapper = mapper;
		}

		@Override
		public ObjectMapper getContext(Class<?> type) {
			return mapper;
		}
	}
}
