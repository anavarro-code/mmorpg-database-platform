# Aethoria Chronicles Database Platform

Plataforma web de base de datos para el videojuego MMORPG ficticio 
Aethoria Chronicles. Proyecto Intermodular de 1º DAW.


## ¿Qué es este proyecto?

Plataforma web que centraliza y organiza toda la información relevante 
del juego: clases, roles, habilidades e items. Incluye una interfaz web 
pública para consulta y una aplicación Java para la gestión del contenido.


## Tecnologías utilizadas

- HTML5 + CSS3
- Java + JDBC
- MySQL (Docker)
- Maven
- GitHub


## Estructura del repositorio

mmorpg-database-platform/
├── /web        → Interfaz web HTML+CSS
├── /src        → Aplicación Java con Maven
├── /sql        → Scripts de base de datos
└── /docs       → Documentación del proyecto
├── /sistemas       → Informe técnico
└── /empleabilidad  → Perfil profesional y portfolio


## Cómo ejecutar el proyecto

**1. Levantar la base de datos con Docker**

docker run --name mysql-aethoria -e MYSQL_ROOT_PASSWORD=aethoria123 -e MYSQL_DATABASE=aethoria_db -p 3307:3306 -d mysql:8.0

**2. Ejecutar los scripts SQL**
Conectarse con TablePlus y ejecutar en orden:
1. `sql/crear_tablas.sql`
2. `sql/insertar_datos.sql`

**3. Ejecutar la aplicación Java**
Abrir el proyecto `src/aethoria-app` en IntelliJ IDEA y ejecutar `App.java`

**4. Abrir la web**
Abrir `web/index.html` en el navegador


## Autor

Adrián Navarro Urbistondo — 1º DAW
Prometeo by The Power — 2025