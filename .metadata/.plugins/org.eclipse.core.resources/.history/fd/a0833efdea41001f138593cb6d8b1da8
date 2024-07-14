package dtos.mappers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dtos.ConsultaRequestDTO;
import dtos.ConsultaResponseDTO;
import models.Consulta;

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

}
