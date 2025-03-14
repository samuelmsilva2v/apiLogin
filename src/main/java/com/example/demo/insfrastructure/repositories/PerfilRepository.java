package com.example.demo.insfrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.models.entities.Perfil;

public interface PerfilRepository extends JpaRepository<Perfil, UUID> {

	@Query("""
			SELECT p FROM Perfil p
			WHERE p.nome = :nome
			""")
	Perfil findByNome(@Param("nome") String nome);
}
