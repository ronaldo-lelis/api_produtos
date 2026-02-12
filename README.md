# 📦 API REST com Spring Boot – Curso Concluído

Projeto desenvolvido como parte do curso de **Criação de API REST com Spring Boot**, 
com foco em boas práticas, persistência de dados e documentação automática utilizando **Swagger (OpenAPI)**.

- ✅ Spring Boot rodando corretamente
- ✅ PostgreSQL conectado
- ✅ JPA / Hibernate configurado
- ✅ CRUD de entidades funcional
- ✅ Springdoc OpenAPI integrado
- ✅ Swagger UI acessível
- ✅ Documentação automática da API

📌 Endpoint da documentação: http://localhost:8080/swagger-ui/index.html

## 🛠 Tecnologias Utilizadas:
- Java 17+
- Spring Boot
- Spring Web
- Spring Data JPA
- PostgreSQL
- Hibernate
- Springdoc OpenAPI (Swagger UI)
- Maven
- 
---

## 📚 O que aprendi neste curso:

- Criar uma **API REST do zero com Spring Boot**
- Configurar conexão com banco de dados PostgreSQL
- Utilizar o **Hibernate/JPA** para:
  - Criar tabelas automaticamente
  - Mapear entidades com `@Entity`, `@Id`, `@GeneratedValue`
- Implementar um **CRUD completo**
- Entender o papel de:
  - `Controller`
  - `Service`
  - `Repository`
- Diferença entre ferramentas de documentação:
  - ❌ **Springfox** → legado e incompatível com Spring Boot 3+
  - ✅ **Springdoc OpenAPI** → moderno, simples e compatível
- Utilizar **injeção de dependência**, principalmente com:
  - `@Autowired`
  - `@RequiredArgsConstructor`
- Documentar endpoints automaticamente com Swagger

---

## 📷 Documentação da API (Swagger)

A API possui documentação automática gerada pelo Springdoc OpenAPI:

<img width="1463" height="699" alt="swagger-produto" src="https://github.com/user-attachments/assets/842f13a5-0d77-436b-a358-dee80e2086d3" />

---

## ❓ Principais Dúvidas durante o curso:

## O que significa essa linha e o que ela faz?
- private static final long serialVersionUID = 1L;
- Principalmente esse 1L, o que é isso?;

## Por que a tipagem: long não é com L maiúsculo? igual as demais.
- Datetime data; String nome; ---> long id;

## O pacote resources é a mesma coisa que um pacote controller, certo?
- Outros vídeos que assisti ele é sempre nomeado como controller;
- Não existe então um padrão na comunidade?;

## Por que teve que criar manualmente o método findById?
- Antes da gente criar manualmente o método findById no Repository
 ao digitar o produtoRepository e colocar o . --> ele exibe já um método do próprio Jpa;
- Não era possível usar esse método?;


-------------------------------------------------------------------------------------------------

Autor: Ronaldo de Lélis - contato: lelisartefinal@gmail.com

-------------------------------------------------------------------------------------------------

