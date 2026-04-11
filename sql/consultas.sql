-- =============================================
-- Aethoria Chronicles Database Platform
-- Script de consultas
-- =============================================

USE aethoria_db;

-- Consulta 1: Listar todas las clases con su rol
SELECT c.nombre AS clase, r.nombre AS rol, c.descripcion
FROM CLASE c
JOIN ROL r ON c.id_rol = r.id_rol;

-- Consulta 2: Listar todas las habilidades con su clase
SELECT h.nombre AS habilidad, c.nombre AS clase, h.descripcion, h.daño
FROM HABILIDAD h
JOIN CLASE c ON h.id_clase = c.id_clase
ORDER BY c.nombre;

-- Consulta 3: Listar todos los items con su tipo
SELECT i.nombre AS item, t.nombre AS tipo, i.rareza, i.descripcion
FROM ITEM i
JOIN TIPO_ITEM t ON i.id_tipo = t.id_tipo
ORDER BY t.nombre;

-- Consulta 4: Listar items por rareza
SELECT nombre, rareza, descripcion
FROM ITEM
ORDER BY rareza;

-- Consulta 5: Contar habilidades por clase
SELECT c.nombre AS clase, COUNT(h.id_habilidad) AS total_habilidades
FROM CLASE c
LEFT JOIN HABILIDAD h ON c.id_clase = h.id_clase
GROUP BY c.nombre;

-- Consulta 6: Listar clases de tipo DPS
SELECT c.nombre AS clase, c.descripcion
FROM CLASE c
JOIN ROL r ON c.id_rol = r.id_rol
WHERE r.nombre = 'DPS';

-- Consulta 7: Listar usuarios registrados
SELECT nombre, email, fecha_registro
FROM USUARIO
ORDER BY fecha_registro;

-- Consulta 8: Habilidades que hacen daño
SELECT h.nombre, h.daño, c.nombre AS clase
FROM HABILIDAD h
JOIN CLASE c ON h.id_clase = c.id_clase
WHERE h.daño > 0
ORDER BY h.daño DESC;