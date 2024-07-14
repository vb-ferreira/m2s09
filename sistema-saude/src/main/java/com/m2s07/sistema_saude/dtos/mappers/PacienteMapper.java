package com.m2s07.sistema_saude.dtos.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m2s07.sistema_saude.dtos.PacienteRequestDTO;
import com.m2s07.sistema_saude.dtos.PacienteResponseDTO;
import com.m2s07.sistema_saude.models.Paciente;

@Component
public class PacienteMapper {
	
	@Autowired
	private ModelMapper mapper;
	
	// Single Resources
	
	public Paciente pacienteToEntity(PacienteRequestDTO dto) {
		Paciente entity = mapper.map(dto, Paciente.class);
		return entity;
	}
	
	public PacienteResponseDTO pacienteToDTO(Paciente entity) {
		PacienteResponseDTO dto = mapper.map(entity, PacienteResponseDTO.class);
		return dto;
	}

}
