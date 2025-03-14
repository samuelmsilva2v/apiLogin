package com.example.demo.insfrastructure.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {

	@Bean
	OpenAPI customOpenApi() {

		var openApi = new OpenAPI().components(new Components())
				.info(new Info().title("Login API")
						.description("API Spring Boot para criação e autenticação de usuários").version("v1"));

		return openApi;
	}
}
