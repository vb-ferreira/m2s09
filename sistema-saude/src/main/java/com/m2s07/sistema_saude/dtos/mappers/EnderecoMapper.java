package com.m2s07.sistema_saude.dtos.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.m2s07.sistema_saude.dtos.EnderecoRequestDTO;
import com.m2s07.sistema_saude.dtos.EnderecoResponseDTO;
import com.m2s07.sistema_saude.models.Endereco;

@Component
public class EnderecoMapper {

	@Autowired
	private ModelMapper mapper;
	
	// Single Resources
	
	public Endereco enderecoToEntity(EnderecoRequestDTO dto) {
		Endereco entity = mapper.map(dto, Endereco.class);
		return entity;
	}
	
	public EnderecoResponseDTO enderecoToDTO(Endereco entity) {
		EnderecoResponseDTO dto = mapper.map(entity, EnderecoResponseDTO.class);
		return dto;
	}
	
}
