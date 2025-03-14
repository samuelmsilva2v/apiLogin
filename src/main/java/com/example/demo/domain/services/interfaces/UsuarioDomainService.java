package com.example.demo.domain.services.interfaces;

import com.example.demo.application.dtos.AutenticarUsuarioResponseDto;
import com.example.demo.application.dtos.CriarUsuarioRequestDto;
import com.example.demo.application.dtos.CriarUsuarioResponseDto;

public interface UsuarioDomainService {

	CriarUsuarioResponseDto criarUsuario(CriarUsuarioRequestDto request);
	
	AutenticarUsuarioResponseDto autenticarUsuario(AutenticarUsuarioResponseDto request);
}
