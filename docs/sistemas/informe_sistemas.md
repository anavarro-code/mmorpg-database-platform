# Informe Técnico de Entorno de Ejecución
## Aethoria Chronicles Database Platform


## 1. Tipo de sistema donde se ejecuta

El proyecto Aethoria Chronicles Database Platform se ejecuta en un **PC de usuario** con conexión a internet. Se ha elegido este tipo de sistema porque el proyecto está pensado para ser usado de forma local durante su desarrollo, sin necesidad de un servidor dedicado ni infraestructura compleja. La interfaz web se abre directamente desde el navegador y la aplicación Java se ejecuta desde el propio equipo del desarrollador.


## 2. Requisitos de hardware

| Componente | Mínimo | Recomendado |

| CPU | Intel Core i3 o equivalente | Intel Core i5 o superior |
| RAM | 4 GB | 8 GB |
| Almacenamiento | 5 GB libres | 10 GB libres |
| Conexión a internet | Necesaria para Google Fonts | Necesaria para Google Fonts |


## 3. Sistema operativo recomendado

El sistema operativo utilizado para el desarrollo ha sido **Windows 11**. Se ha elegido porque es el sistema operativo del equipo de desarrollo, es compatible con todas las herramientas utilizadas en el proyecto (IntelliJ IDEA, Docker Desktop, TablePlus, VS Code y GitHub Desktop) y es uno de los sistemas más extendidos en entornos de desarrollo web.


## 4. Instalación del entorno

Para poner en marcha el proyecto en otro equipo hay que seguir estos pasos en orden:

**Paso 1 — Instalar Java JDK**
Descargar e instalar Java JDK 17 o superior desde:
https://www.oracle.com/java/technologies/downloads/

**Paso 2 — Instalar IntelliJ IDEA**
Descargar e instalar IntelliJ IDEA Community Edition desde:
https://www.jetbrains.com/idea/

**Paso 3 — Instalar Docker Desktop**
Descargar e instalar Docker Desktop desde:
https://www.docker.com/products/docker-desktop/

**Paso 4 — Levantar el contenedor de MySQL**
Abrir una terminal y ejecutar:
docker run --name mysql-aethoria -e MYSQL_ROOT_PASSWORD=aethoria123 -e MYSQL_DATABASE=aethoria_db -p 3307:3306 -d mysql:8.0

**Paso 5 — Ejecutar los scripts SQL**
Conectarse a la base de datos con TablePlus y ejecutar en orden:
1. `sql/crear_tablas.sql`
2. `sql/insertar_datos.sql`

**Paso 6 — Ejecutar la aplicación Java**
Abrir IntelliJ IDEA, importar el proyecto `aethoria-app` desde la carpeta `/src` y ejecutar la clase `App.java`.

**Paso 7 — Abrir la web**
Abrir el archivo `index.html` de la carpeta `/web` directamente en el navegador.


## 5. Usuarios, permisos y estructura

| Usuario | Permisos | Descripción |

| root | Total | Administrador de la base de datos MySQL |
| Usuario web | Solo lectura | Cualquier persona que accede a la web |
| Desarrollador | Total | Gestiona el contenido desde la aplicación Java |

### Estructura de carpetas del proyecto

mmorpg-database-platform/
├── /web        → Interfaz web HTML+CSS
├── /src        → Aplicación Java con Maven
├── /sql        → Scripts de base de datos
└── /docs       → Documentación del proyecto
└── /sistemas   → Informe técnico

Los datos se almacenan en el contenedor Docker de MySQL. No se realizan copias de seguridad automáticas en esta versión del proyecto.


## 6. Mantenimiento básico

| Tarea | Frecuencia |

| Comprobar que Docker está activo | Antes de cada uso |
| Verificar que el contenedor mysql-aethoria está corriendo | Antes de cada uso |
| Actualizar Java JDK si hay parches de seguridad | Mensualmente |
| Revisar que los enlaces de Google Fonts siguen activos | Mensualmente |

### ¿Qué hacer si falla la conexión?

1. Verificar que Docker Desktop está abierto y corriendo
2. Comprobar que el contenedor `mysql-aethoria` está activo con `docker ps`
3. Si el contenedor está parado, iniciarlo con `docker start mysql-aethoria`
4. Verificar que el puerto 3307 está disponible



## 7. Evidencias

*(Insertar capturas de pantalla de la aplicación Java funcionando y de la web abierta en el navegador)*