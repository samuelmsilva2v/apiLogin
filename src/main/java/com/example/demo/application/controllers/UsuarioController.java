package com.example.demo.application.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.application.dtos.AutenticarUsuarioRequestDto;
import com.example.demo.application.dtos.AutenticarUsuarioResponseDto;
import com.example.demo.application.dtos.CriarUsuarioRequestDto;
import com.example.demo.application.dtos.CriarUsuarioResponseDto;
import com.example.demo.domain.services.interfaces.UsuarioDomainService;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioDomainService usuarioDomainService;
	
	@Operation(summary = "Serviço para criação de usuários.")
	@PostMapping("criar")
	public ResponseEntity<CriarUsuarioResponseDto> create(@RequestBody @Valid CriarUsuarioRequestDto request) {
		
		var response = usuarioDomainService.criarUsuario(request);
		return ResponseEntity.ok(response);
	}
	
	@Operation(summary = "Serviço para autenticação de usuários.")
	@PostMapping("autenticar")
	public ResponseEntity<AutenticarUsuarioResponseDto> autenticar(@RequestBody @Valid AutenticarUsuarioRequestDto request) {
		
		var response = usuarioDomainService.autenticarUsuario(request);
		return ResponseEntity.ok(response);
	}	
}
