# 🧠 ForoHub API — Challenge Backend - #AluraLatam

**ForoHub** es una API REST desarrollada con **Spring Boot 3** que simula el funcionamiento de un foro de discusión. Permite la gestión integral de tópicos mediante operaciones CRUD, incorporando autenticación, validaciones de negocio y documentación interactiva.

---

## 🚀 Características Principales

- Arquitectura **RESTful** conforme a estándares de la industria
- Gestión completa de **tópicos**: crear, consultar, actualizar y eliminar
- Sistema de **autenticación y autorización** con JWT
- Validaciones de negocio integradas
- Persistencia con base de datos relacional
- Documentación interactiva con **Swagger/OpenAPI**

---

## 🛠️ Tecnologías Utilizadas

| Tecnología         | Propósito                            |
|--------------------|--------------------------------------|
| Java 17+           | Lenguaje principal                   |
| Spring Boot 3.x    | Framework backend                    |
| Spring Security    | Autenticación y autorización (JWT)  |
| Spring Data JPA    | Acceso a datos                      |
| Hibernate          | ORM para persistencia               |
| Flyway             | Migraciones de base de datos        |
| Lombok             | Reducción de código repetitivo      |
| Swagger/OpenAPI    | Documentación de endpoints          |
| JUnit              | Pruebas unitarias                   |
| Maven              | Gestión de dependencias             |
| MySQL / PostgreSQL / H2 | Bases de datos compatibles     |

---

## 📋 Requisitos Previos

- Java 17 o superior
- Maven 3.6+
- Base de datos (MySQL, PostgreSQL, H2)
- IDE recomendado: IntelliJ IDEA, Eclipse o VSCode

---

## ⚙️ Instalación y Configuración

### 1. Clonar el repositorio

```bash
git clone https://github.com/CloRevollo/challenge-foro-hub.git
cd forohub-api
```

### 2. Configurar base de datos
Edita el archivo `application.properties`:
```bash
spring.datasource.url=jdbc:mysql://localhost:3306/forohub
spring.datasource.username=tu_usuario
spring.datasource.password=tu_password
```

La API se ejecuta por defecto en: `http://localhost:8080`

## Documentación de la API

### Endpoints Principales

| Método | Endpoint | Descripción |
|--------|----------|-------------|
| `GET` | `/topicos` | Listar todos los tópicos |
| `GET` | `/topicos/{id}` | Obtener tópico por ID |
| `POST` | `/topicos` | Crear nuevo tópico |
| `PUT` | `/topicos/{id}` | Actualizar tópico |
| `DELETE` | `/topicos/{id}` | Eliminar tópico |
| `POST` | `/login` | Autenticación de usuario |

### Ejemplo de Uso: Crear un nuevo tópico

Endpoint: POST /topicos 
Headers:
- Content-Type: application/json
- Authorization: Bearer {token}

```json
{
  "titulo": "¿Cómo implementar Spring Security?",
  "mensaje": "Necesito ayuda para configurar autenticación JWT",
  "fecha": "2025-08-17T23:15:01",
  "status": "CERRADO",
  "curso": {
    "id": 1
  },
  "usuario": {
    "id": 1
  }
}
```
