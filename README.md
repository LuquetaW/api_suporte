
# 🛠️ Sistema de Suporte CRUD

Este projeto é um sistema de suporte desenvolvido como parte de um trabalho acadêmico. Ele utiliza **Spring Boot**, **JPA**, **MySQL** e **Docker** para fornecer uma **API RESTful** voltada ao gerenciamento de usuários, chamados e respostas.

---

## 🎯 Objetivo

Permitir o cadastro, consulta e gerenciamento de:

- Usuários  
- Chamados de suporte  
- Respostas  

O sistema serve como base para **estudos e práticas** de desenvolvimento **back-end com Java e Spring Boot**.

---

## 🚀 Tecnologias Utilizadas

- ✅ Java 21  
- ✅ Spring Boot 3.5.0  
- ✅ Spring Data JPA  
- ✅ MySQL  
- ✅ Docker (para banco de dados)  
- ✅ Lombok  

---

## 📦 Pré-requisitos

Certifique-se de ter as seguintes ferramentas instaladas:

- [Java 21+](https://adoptium.net/)
- [Docker](https://www.docker.com/)
- [Maven](https://maven.apache.org/) (ou utilize o wrapper `./mvnw`)
- [Git](https://git-scm.com/)

---

## ⚙️ Como Executar o Projeto

### 1️⃣ Suba o banco de dados MySQL com Docker

No terminal:

```bash
docker compose up -d
```

O banco estará disponível em: `localhost:3307`

---

### 2️⃣ Configure o acesso ao banco

O arquivo `src/main/resources/application.properties` já está configurado da seguinte forma:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/suporte_crud
spring.datasource.username=root
spring.datasource.password=root
```

> **⚠️ Certifique-se de criar o banco de dados com o nome `suporte_crud`, ou ajuste as configurações conforme sua preferência.**

---

### 3️⃣ Compile e execute a aplicação

No terminal:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

A aplicação ficará disponível em: [http://localhost:8080](http://localhost:8080)

---

## 📡 Endpoints Principais

| Método | Rota                      | Descrição                    |
|--------|---------------------------|------------------------------|
| POST   | `/usuarios`               | Cria um novo usuário         |
| GET    | `/usuarios?id={id}`       | Busca usuário por ID         |
| POST   | `/chamados`               | Cria um novo chamado         |
| GET    | `/chamados`               | Lista todos os chamados      |
| POST   | `/respostas`              | Cria uma nova resposta       |

---

## 📝 Observações

Este projeto é de uso **exclusivamente acadêmico**.

Sinta-se à vontade para **adaptar e evoluir** o código conforme necessário.

---

## 👨‍💻 Autores

- Lucas Wessendorf de Araujo  
- Helio Manoel Wojciki  
- Victor Gabriel Alves Carneiro  
- Felipe Graniska  
- Eduardo Alan Dos Santos
