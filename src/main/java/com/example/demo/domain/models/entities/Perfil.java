package com.example.demo.domain.models.entities;

import java.util.List;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class Perfil {

	@Id
	private UUID id;
	
	@Column(length = 25, nullable = false, unique = true)
	private String nome;
	
	@OneToMany(mappedBy = "perfil")
	private List<Usuario> usuarios;
}
