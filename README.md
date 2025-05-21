# MotoScan API 🚀

API RESTful desenvolvida em **Spring Boot** para gerenciamento de pátios e motos. Essa API oferece suporte à versão web e mobile do aplicativo MotoScan, que mapeia e organiza o pátio de motos com base em seu status, localização e disponibilidade.

---
## 👥 Integrantes

- **Nome:** Guilherme Francisco   
  **RM:** 554678 
- **Nome:** Larissa de Freitas
  **RM:** 555136
- **Nome:** João Victor Rebello de Santis  
  **RM:** 555287
  ## 🧩 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 Database  
- Bean Validation (Jakarta)  
- Spring Cache  
- Lombok  

---

## 🎯 Funcionalidades

✅ CRUD completo para duas entidades:

### 1. **Pátio**
- `POST /patios` — Criação de pátios  
- `GET /patios` — Listagem com paginação e ordenação  
- `GET /patios/{id}` — Detalhamento  
- `PUT /patios/{id}` — Atualização  
- `DELETE /patios/{id}` — Exclusão  

### 2. **Moto**
- `POST /motos` — Cadastro de motos vinculadas a um pátio  
- `GET /motos` — Listagem com paginação, ordenação, filtro por status e pátio  
- `GET /motos/{id}` — Detalhamento  
- `PUT /motos/{id}` — Atualização  
- `DELETE /motos/{id}` — Exclusão  

---

## 🔐 Requisitos Atendidos

| Requisito | Implementado |
|-----------|--------------|
| Spring Web | ✅ |
| Spring Data JPA | ✅ |
| Banco de dados H2 | ✅ |
| CRUD completo (2 entidades) | ✅ |
| Relacionamento entre entidades | ✅ (Moto → Pátio) |
| Bean Validation | ✅ (`@NotBlank`, `@Size`, `@NotNull`) |
| Paginação e Ordenação | ✅ (`Pageable`) |
| Busca por Parâmetros | ✅ (`status`, `patioId`) |
| Cache | ✅ (`@EnableCaching`, `@Cacheable`) |
| Boas práticas REST | ✅ |
| Tratamento centralizado de erros | ✅ (`@ControllerAdvice`) |
| DTOs | ✅ (`MotoDTO`, `PatioDTO`) |

---

## 🛠️ Como Rodar Localmente

### Pré-requisitos

- Java 17+
- Maven

### Passos

1. Clone o projeto:  
   ```bash
   git clone https://github.com/seu-usuario/motoscan-api.git
   cd motoscan-api
   ```

2. Execute o projeto com Maven:  
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse a API no navegador:  
   [http://localhost:8080](http://localhost:8080)

4. Console do H2 disponível em:  
   [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`  
   - Senha: (deixe em branco)

---

## 📁 Estrutura do Projeto

```
src
└── main
    └── java
        └── br.com.motoscan
            ├── config
            ├── controller
            ├── dto
            ├── exception
            ├── model
            ├── repository
            ├── service
            └── motoscan_api
```

---
# MotoScan API 🚀

API RESTful desenvolvida em **Spring Boot** para gerenciamento de pátios e motos. Essa API oferece suporte à versão web e mobile do aplicativo MotoScan, que mapeia e organiza o pátio de motos com base em seu status, localização e disponibilidade.

---
## 👥 Integrantes

- **Nome:** Guilherme Francisco   
  **RM:** 554678 
- **Nome:** Larissa de Freitas
  **RM:** 555136
- **Nome:** João Victor Rebello de Santis  
  **RM:** 555287
  ## 🧩 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 Database  
- Bean Validation (Jakarta)  
- Spring Cache  
- Lombok  

---

## 🎯 Funcionalidades

✅ CRUD completo para duas entidades:

### 1. **Pátio**
- `POST /patios` — Criação de pátios  
- `GET /patios` — Listagem com paginação e ordenação  
- `GET /patios/{id}` — Detalhamento  
- `PUT /patios/{id}` — Atualização  
- `DELETE /patios/{id}` — Exclusão  

### 2. **Moto**
- `POST /motos` — Cadastro de motos vinculadas a um pátio  
- `GET /motos` — Listagem com paginação, ordenação, filtro por status e pátio  
- `GET /motos/{id}` — Detalhamento  
- `PUT /motos/{id}` — Atualização  
- `DELETE /motos/{id}` — Exclusão  

---

## 🔐 Requisitos Atendidos

| Requisito | Implementado |
|-----------|--------------|
| Spring Web | ✅ |
| Spring Data JPA | ✅ |
| Banco de dados H2 | ✅ |
| CRUD completo (2 entidades) | ✅ |
| Relacionamento entre entidades | ✅ (Moto → Pátio) |
| Bean Validation | ✅ (`@NotBlank`, `@Size`, `@NotNull`) |
| Paginação e Ordenação | ✅ (`Pageable`) |
| Busca por Parâmetros | ✅ (`status`, `patioId`) |
| Cache | ✅ (`@EnableCaching`, `@Cacheable`) |
| Boas práticas REST | ✅ |
| Tratamento centralizado de erros | ✅ (`@ControllerAdvice`) |
| DTOs | ✅ (`MotoDTO`, `PatioDTO`) |

---

## 🛠️ Como Rodar Localmente

### Pré-requisitos

- Java 17+
- Maven

### Passos

1. Clone o projeto:  
   ```bash
   git clone https://github.com/seu-usuario/motoscan-api.git
   cd motoscan-api
   ```

2. Execute o projeto com Maven:  
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse a API no navegador:  
   [http://localhost:8080](http://localhost:8080)

4. Console do H2 disponível em:  
   [http://localhost:8080/h2-console](http://localhost:8080/h2-console)  
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa`  
   - Senha: (deixe em branco)

---

## 📁 Estrutura do Projeto

```
src
└── main
    └── java
        └── br.com.motoscan
            ├── config
            ├── controller
            ├── dto
            ├── exception
            ├── model
            ├── repository
            ├── service
            └── motoscan_api
```

---
