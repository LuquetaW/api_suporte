# Sistema de Suporte CRUD

Este projeto é um sistema de suporte desenvolvido como parte de um trabalho acadêmico para a faculdade. Ele utiliza Spring Boot, JPA, MySQL e Docker para fornecer uma API RESTful para gerenciamento de usuários, chamados e respostas.

## Objetivo

O objetivo deste sistema é permitir o cadastro, consulta e gerenciamento de usuários, chamados de suporte e respostas, servindo como base para estudos e práticas de desenvolvimento backend com Java e Spring Boot.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.5.0
- Spring Data JPA
- MySQL
- Docker (para banco de dados)
- Lombok

## Pré-requisitos

- [Java 21+](https://adoptium.net/)
- [Docker](https://www.docker.com/)
- [Maven](https://maven.apache.org/) (ou utilize o wrapper `mvnw` incluso no projeto)
- [Git](https://git-scm.com/)

## Como executar o projeto

### 1. Suba o banco de dados MySQL com Docker

No terminal, execute:

```sh
docker compose up -d
```
O banco estará disponível em localhost:3307 (porta externa).

2. Configure o acesso ao banco
O arquivo src/main/resources/application.properties já está configurado para:

spring.datasource.url=jdbc:mysql://localhost:3306/suporte_crud
spring.datasource.username=root
spring.datasource.password=root
<<<<<<< HEAD
**Importante criar o banco de dados conforme tratado acima, ou configure conforme sua prefereência**
=======
>>>>>>> fa399a7cbeb410bba729d1d4d6d70ecdcfd44081

3. Compile e execute a aplicação
No terminal, execute:
```
./mvnw spring-boot:run
```

ou, no Windows:
[mvnw.cmd](http://_vscodecontentref_/1) spring-boot:run

A aplicação estará disponível em http://localhost:8080.

Endpoints principais
POST /usuarios — Cria um novo usuário
GET /usuarios?id={id} — Busca usuário por ID
POST /chamados — Cria um novo chamado
GET /chamados — Lista todos os chamados
POST /respostas — Cria uma nova resposta
...

Observações
Este projeto é exclusivamente para fins acadêmicos.

Sinta-se à vontade para adaptar e evoluir o código conforme as necessidades do seu trabalho.
Autor
Desenvolvido por:
-Lucas Wessendorf de Araujo
-Helio Manoel Wojciki
-Victor Gabriel Alves Carneiro
-Felipe Graniska
-Eduardo Alan Dos Santos