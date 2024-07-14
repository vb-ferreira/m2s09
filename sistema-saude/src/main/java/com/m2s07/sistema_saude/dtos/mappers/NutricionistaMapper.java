package com.m2s07.sistema_saude.dtos.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m2s07.sistema_saude.dtos.NutricionistaRequestDTO;
import com.m2s07.sistema_saude.dtos.NutricionistaResponseDTO;
import com.m2s07.sistema_saude.models.Nutricionista;

@Component
public class NutricionistaMapper {

	@Autowired
	private ModelMapper mapper;
	
	// Single Resources
	
	public Nutricionista nutricionistaToEntity(NutricionistaRequestDTO dto) {
		Nutricionista entity = mapper.map(dto, Nutricionista.class);
		return entity;
	}
	
	public NutricionistaResponseDTO nutricionistaToDTO(Nutricionista entity) {
		NutricionistaResponseDTO dto = mapper.map(entity, NutricionistaResponseDTO.class);
		return dto;
	}
		
}
