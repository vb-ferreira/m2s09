package com.m2s07.sistema_saude.configurations;
//package configurations;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

	@Bean
	public ModelMapper modelMapper() {
//		return new ModelMapper();
		var mapper = new ModelMapper();
		mapper.getConfiguration().setAmbiguityIgnored(true);
		return mapper;
	}
	
}
