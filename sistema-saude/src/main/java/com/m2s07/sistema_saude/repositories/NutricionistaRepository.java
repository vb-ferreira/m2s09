package com.m2s07.sistema_saude.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2s07.sistema_saude.models.Nutricionista;

public interface NutricionistaRepository extends JpaRepository<Nutricionista, Long> {
	
	Optional<Nutricionista> findByNome(String nome);

}
