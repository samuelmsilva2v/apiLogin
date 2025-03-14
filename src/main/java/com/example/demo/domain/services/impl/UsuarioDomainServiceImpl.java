package com.example.demo.domain.services.impl;

import java.time.Instant;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.application.dtos.AutenticarUsuarioRequestDto;
import com.example.demo.application.dtos.AutenticarUsuarioResponseDto;
import com.example.demo.application.dtos.CriarUsuarioRequestDto;
import com.example.demo.application.dtos.CriarUsuarioResponseDto;
import com.example.demo.domain.models.entities.Usuario;
import com.example.demo.domain.services.interfaces.UsuarioDomainService;
import com.example.demo.insfrastructure.components.SHA256Component;
import com.example.demo.insfrastructure.repositories.PerfilRepository;
import com.example.demo.insfrastructure.repositories.UsuarioRepository;

@Service
public class UsuarioDomainServiceImpl implements UsuarioDomainService {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PerfilRepository perfilRepository;
	
	@Autowired
	private SHA256Component sha256Component;
	
	@Override
	public CriarUsuarioResponseDto criarUsuario(CriarUsuarioRequestDto request) {
		
		// Verificar se o e-mail já está cadastrado no banco de dados
		if (usuarioRepository.findByEmail(request.getEmail()) != null)
			throw new IllegalArgumentException("O e-mail informado já está cadastrado, tente outro.");
		
		// Capturar os dados do usuário
		var usuario = new Usuario();
		usuario.setId(UUID.randomUUID());
		usuario.setNome(request.getNome());
		usuario.setEmail(request.getEmail());
		usuario.setSenha(sha256Component.encrypt(request.getSenha()));
		usuario.setPerfil(perfilRepository.findByNome("Operador"));
		
		// Gravar os dados do usuário
		usuarioRepository.save(usuario);
		
		// Retornar os dados do usuário
		var response = new CriarUsuarioResponseDto();
		response.setId(usuario.getId());
		response.setNome(usuario.getNome());
		response.setEmail(usuario.getEmail());
		response.setDataCriacao(Instant.now());
		response.setPerfil(usuario.getPerfil().getNome());
		
		return response;
	}

	@Override
	public AutenticarUsuarioResponseDto autenticarUsuario(AutenticarUsuarioRequestDto request) {
		// TODO Auto-generated method stub
		return null;
	}

}
