# Aethoria Chronicles — Aplicación Java

Aplicación de gestión interna de la plataforma Aethoria Chronicles
Database Platform, desarrollada en Java con conexión a base de datos
mediante JDBC.


## ¿Qué hace la aplicación?

Permite a los desarrolladores del juego gestionar el contenido de la
base de datos mediante un menú por consola. Incluye operaciones de
consulta, inserción y eliminación de datos sobre las entidades
principales del juego.


## Cómo ejecutarla

**Requisitos previos:**
- Java JDK 17 o superior
- IntelliJ IDEA
- Docker Desktop con el contenedor mysql-aethoria corriendo

**Pasos:**
1. Asegurarse de que Docker Desktop está abierto y el contenedor
   mysql-aethoria está activo
2. Abrir el proyecto en IntelliJ IDEA
3. Ejecutar la clase `App.java`


## Funcionalidades

- Ver todas las clases del juego con su rol
- Ver el catálogo completo de items
- Ver las habilidades por clase
- Añadir nuevas clases
- Añadir nuevos items
- Eliminar clases
- Eliminar items


## Entidades que gestiona

- CLASE → clases jugables del juego
- ROL → roles de cada clase (Tanque, DPS, Healer)
- HABILIDAD → habilidades asociadas a cada clase
- ITEM → items disponibles en el juego
- TIPO_ITEM → categorías de items


## Parte que usa la base de datos

Toda la aplicación trabaja con datos reales almacenados en MySQL
mediante conexión JDBC. La clase `Conexion.java` gestiona la
conexión y todas las operaciones se realizan directamente sobre
la base de datos `aethoria_db`.


## Estructura del código

src/aethoria-app/
├── src/main/java/com/biblioteca/
│   ├── App.java              → Clase principal
│   ├── conexion/
│   │   └── Conexion.java     → Gestión de la conexión JDBC
│   ├── modelo/
│   │   ├── Clase.java        → Modelo de clase
│   │   ├── Item.java         → Modelo de item
│   │   └── Habilidad.java    → Modelo de habilidad
│   └── menu/
│       └── Menu.java         → Menú por consola y operaciones CRUD
└── pom.xml                   → Dependencias Maven


## Autor

Adrián Navarro Urbistondo — 1º DAW
Prometeo by The Power — 2025