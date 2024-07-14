package com.m2s07.sistema_saude.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.m2s07.sistema_saude.models.Paciente;

public interface PacienteRepository extends JpaRepository<Paciente, Long> {

}
