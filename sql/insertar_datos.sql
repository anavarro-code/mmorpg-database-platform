-- =============================================
-- Aethoria Chronicles Database Platform
-- Script de inserción de datos de ejemplo
-- =============================================

USE aethoria_db;


INSERT INTO ROL (nombre, descripcion) VALUES
('Tanque', 'Clase defensiva encargada de absorber el daño y proteger al grupo'),
('DPS', 'Clase ofensiva especializada en infligir el máximo daño posible'),
('Healer', 'Clase de soporte encargada de curar y mantener con vida al grupo');


INSERT INTO CLASE (nombre, descripcion, id_rol) VALUES
('Guerrero', 'Maestro del combate cuerpo a cuerpo, especializado en resistir golpes y proteger a sus aliados', 1),
('Mago', 'Wielder de poderosa magia arcana capaz de devastar a sus enemigos desde la distancia', 2),
('Sacerdote', 'Canalizador de energía divina capaz de sanar heridas y resucitar a sus compañeros caídos', 3);


INSERT INTO HABILIDAD (nombre, descripcion, daño, id_clase) VALUES
('Golpe Escudo', 'Golpea al enemigo con el escudo aturdíendolo brevemente', 150, 1),
('Grito de Guerra', 'Aumenta la defensa de todos los aliados cercanos durante 30 segundos', 0, 1),
('Postura Defensiva', 'El guerrero adopta una postura que reduce el daño recibido un 30%', 0, 1),
('Bola de Fuego', 'Lanza una esfera de fuego que explota al impactar causando daño en área', 850, 2),
('Rayo de Hielo', 'Dispara un rayo de hielo que congela al enemigo durante 3 segundos', 600, 2),
('Tormenta Arcana', 'Desata una tormenta de energía arcana que daña a todos los enemigos cercanos', 1200, 2),
('Luz Sanadora', 'Canaliza energía divina para restaurar la vida de un aliado', 0, 3),
('Resurrección', 'Devuelve la vida a un aliado caído con el 50% de su vida máxima', 0, 3),
('Escudo Divino', 'Rodea a un aliado de un escudo de luz que absorbe daño durante 10 segundos', 0, 3);

INSERT INTO TIPO_ITEM (nombre) VALUES
('Arma'),
('Armadura'),
('Accesorio'),
('Poción');


INSERT INTO ITEM (nombre, descripcion, rareza, id_tipo) VALUES
('Espada del Alba', 'Una espada forjada con el primer rayo de sol, emite un suave resplandor dorado', 'Épico', 1),
('Bastón de Cristal', 'Bastón tallado en cristal puro que amplifica el poder mágico de su portador', 'Raro', 1),
('Martillo Sagrado', 'Martillo bendecido por los dioses, capaz de desterrar a los no muertos', 'Legendario', 1),
('Armadura de Placas', 'Armadura completa de acero que ofrece una protección excepcional', 'Común', 2),
('Túnica Arcana', 'Túnica imbuida de energía mágica que potencia los hechizos de su portador', 'Raro', 2),
('Manto Sagrado', 'Manto tejido con hilos de luz divina que aumenta el poder de curación', 'Épico', 2),
('Anillo de Fuerza', 'Anillo que otorga una fuerza sobrenatural a quien lo porta', 'Raro', 3),
('Amuleto de Sabiduría', 'Amuleto antiguo que amplifica la inteligencia y el poder mágico', 'Épico', 3),
('Poción de Vida', 'Restaura 500 puntos de vida al ser consumida', 'Común', 4),
('Poción de Maná', 'Restaura 300 puntos de maná al ser consumida', 'Común', 4);


INSERT INTO USUARIO (nombre, email, fecha_registro) VALUES
('Adrián Navarro', 'adrian@aethoria.com', '2025-01-15'),
('Elena Martínez', 'elena@aethoria.com', '2025-02-03'),
('Carlos López', 'carlos@aethoria.com', '2025-03-20');


INSERT INTO DESARROLLADOR (nombre, email) VALUES
('Dev Aethoria', 'dev@aethoria.com'),
('Game Master', 'gm@aethoria.com');