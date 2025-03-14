package com.example.demo.application.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CriarUsuarioRequestDto {

	@Size(min = 8, max = 150, message = "O nome de usuário deve ter no mínimo 8 caracteres.")
	@NotEmpty(message = "Por favor, informe o nome do usuário.")
	private String nome;

	@Email(message = "Por favor, informe um endereço de e-mail válido.")
	@NotEmpty(message = "Por favor, informe o e-mail do usuário.")
	private String email;

	@Pattern(regexp = "^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$%^&+=!])(?!.*\\s).{8,}$", message = "Informe a senha com letras minúsculas, maiúsculas, números, símbolos e pelo menos 8 caracteres.")
	@NotEmpty(message = "Por favor, informe a senha do usuário.")
	private String senha;
}
