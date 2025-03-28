# API Login
![GitHub repo size](https://img.shields.io/github/repo-size/samuelmsilva2v/apiLogin?style=for-the-badge)
![GitHub language count](https://img.shields.io/github/languages/count/samuelmsilva2v/apiLogin?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/samuelmsilva2v/apiLogin?style=for-the-badge)
![Bitbucket open issues](https://img.shields.io/bitbucket/issues/samuelmsilva2v/apiLogin?style=for-the-badge)
![Bitbucket open pull requests](https://img.shields.io/bitbucket/pr-raw/samuelmsilva2v/apiLogin?style=for-the-badge)

[🇺🇸 Read in English](#login-api)

🔐 Esta é uma API RESTful de logins que permite a criação e autenticação de usuários, garantindo a segurança das credenciais por meio da criptografia de senhas utilizando SHA256.

## Funcionalidades
* Cadastrar de novos usuários com os seguintes atributos
  * Nome
  * E-mail (o endereço de e-mail deve ser válido)
  * Senha (a senha precisa conter no mínimo 8 caracteres, letras maiúsculas e minúsculas, números e caracteres especiais)

* Autenticação de usuários através de um token JWT.

## Tecnologias Utilizadas
* Java 21
* Spring Boot
* Spring Data JPA
* Spring Security
* JWT (JSON Web Tokens)
* SHA256 (para criptografia de senhas)
* Hibernate
* MySQL
* Docker (para virtualização do banco de dados)
* Swagger (para documentação)

## Instalação e Configuração

### Pré-requisitos
- Docker e Docker Compose
- Java 21
- Spring Boot
- MySQL Workbench

**1. Clonar o Repositório**
```bash
 git clone https://github.com/samuelmsilva2v/apiLogin.git
 cd apiLogin
```

**2. Virtualizar o Banco de Dados**
```bash
docker-compose up -d
```

**3. Executar**
```bash
mvn spring-boot:run
```
A Supermarket API estará disponível em http://localhost:8081/swagger-ui/index.html#/

--

# Login API
[🇧🇷 Leia em Português](#api-login)

🔐 This is a RESTful login API that allows the creation and authentication of users, ensuring credential security through password encryption using SHA256.

## Features
* Register new users with the following attributes:
  * Name
  * Email (must be a valid email address)
  * Password (must contain at least 8 characters, uppercase and lowercase letters, numbers, and special characters)

* User authentication via a JWT token.

## Technologies Used
* Java 21
* Spring Boot
* Spring Data JPA
* Spring Security
* JWT (JSON Web Tokens)
* SHA256 (for password encryption)
* Hibernate
* MySQL
* Docker (for database virtualization)
* Swagger (for documentation)

## Installation and Configuration

### Prerequisites
- Docker e Docker Compose
- Java 21
- Spring Boot
- MySQL Workbench

**1. Clone the Repository**
```bash
 git clone https://github.com/samuelmsilva2v/apiLogin.git
 cd apiLogin
```

**2. Virtualize the Database**
```bash
docker-compose up -d
```

**3. Run the Application**
```bash
mvn spring-boot:run
```
The API will be available at: http://localhost:8081/swagger-ui/index.html#/
