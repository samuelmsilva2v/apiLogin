package com.example.demo.insfrastructure.components;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.example.demo.domain.models.entities.Usuario;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JwtTokenComponent {

	/*
	 * Método para criar e retornar um TOKEN JWT para o usuário autenticado no
	 * sistema
	 */
	public String getToken(Usuario usuario) {

		// Chave para assinatura dos tokens
		var secretKey = "468041be-f345-4188-8136-4bdeef74b376";

		return Jwts.builder().setSubject(usuario.getEmail()) // E-mail do usuário
				.claim("perfil", usuario.getPerfil().getNome()) // Perfil do usuário
				.setIssuedAt(new Date()) // Data de geração do token
				.setExpiration(new Date(System.currentTimeMillis() + 1800000)) // Data de expiração do token (30min)
				.signWith(SignatureAlgorithm.HS256, secretKey) // Chave para assinatura do token
				.compact();
	}
}
