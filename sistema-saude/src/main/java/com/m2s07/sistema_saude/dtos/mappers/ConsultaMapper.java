package com.m2s07.sistema_saude.dtos.mappers;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m2s07.sistema_saude.dtos.ConsultaRequestDTO;
import com.m2s07.sistema_saude.dtos.ConsultaResponseDTO;
import com.m2s07.sistema_saude.models.Consulta;

@Component
public class ConsultaMapper {

	@Autowired
	private ModelMapper mapper;
	
	// Single Resources
	
	public Consulta consultaToEntity(ConsultaRequestDTO dto) {
		Consulta entity = mapper.map(dto, Consulta.class);
		return entity;
	}
	
	public ConsultaResponseDTO consultaToDTO(Consulta entity) {
		ConsultaResponseDTO dto = mapper.map(entity, ConsultaResponseDTO.class);
		return dto;
	}
	
	// Collection Resources
	
	public List<ConsultaResponseDTO> consultasToDTO(List<Consulta> consultasList) {
		return consultasList.stream()
				.map(consulta -> consultaToDTO(consulta))
				.collect(Collectors.toList());
	}

}
