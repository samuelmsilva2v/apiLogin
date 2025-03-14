package com.example.demo.application.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	
	@Operation(summary = "Serviço para criação de usuários.")
	@PostMapping("criar")
	public void create() {
		// TODO
	}
	
	@Operation(summary = "Serviço para autenticação de usuários.")
	@PostMapping("autenticar")
	public void autenticar() {
		// TODO
	}	
}
