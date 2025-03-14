package com.example.demo.insfrastructure.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.domain.models.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {

	@Query("""
			SELECT u FROM Usuario u
			WHERE u.email = :email
			""")
	Usuario findByEmail(@Param("email") String email);

	@Query("""
			SELECT u FROM Usuario u
			WHERE u.email = :email
			AND u.senha = :senha
			""")
	Usuario findByEmailAndSenha(@Param("email") String email, @Param("senha") String senha);

}
