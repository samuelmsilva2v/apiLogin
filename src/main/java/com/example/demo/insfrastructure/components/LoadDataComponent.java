package com.example.demo.insfrastructure.components;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.example.demo.domain.models.entities.Perfil;
import com.example.demo.insfrastructure.repositories.PerfilRepository;

@Component
public class LoadDataComponent implements ApplicationRunner {

	@Autowired
	private PerfilRepository perfilRepository;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {

		var administrador = new Perfil();
		administrador.setId(UUID.fromString("cfd306c0-c516-4176-a215-bb7a49e54c6f"));
		administrador.setNome("Administrador");

		var operador = new Perfil();
		operador.setId(UUID.fromString("7f55d810-f21a-4052-9d39-6ef61cbe85b2"));
		operador.setNome("Operador");
		
		perfilRepository.save(administrador);
		perfilRepository.save(operador);
	}

}
