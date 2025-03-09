/*
-- Inserts para la tabla Usuarios
INSERT INTO usuarios (id_usuario, nombre_de_usuario,correo, password, role, fecha_de_creacion) VALUES
                                                                                                    (1, 'admin', 'password123', 'admin@example.com', 'ADMIN', '2023-01-01 10:00:00'),
                                                                                                    (2, 'usuario1', 'userpass456', 'user1@example.com', 'USER', '2023-02-01 11:00:00'),
                                                                                                    (3, 'usuario2', 'testpass789', 'user2@example.com', 'USER', '2023-03-01 12:00:00');

-- Inserts para la tabla Clientes
INSERT INTO clientes (id_cliente, nombre_cliente, direccion_cliente, telefono_cliente) VALUES
                                                                                           (1, 'Cliente A', 'Av. Siempre Viva 123', '123456789'),
                                                                                           (2, 'Cliente B', 'Calle Falsa 456', '987654321'),
                                                                                           (3, 'Cliente C', 'Plaza Central 789', '456789123');

-- Inserts para la tabla Productos
INSERT INTO productos (id_producto, nombre_producto) VALUES
                                                         (1, 'Andamio Estándar'),
                                                         (2, 'Andamio Modular'),
                                                         (3, 'Escalera de Aluminio'),
                                                         (4, 'Plataforma de Trabajo');

-- Inserts para la tabla Alquileres
INSERT INTO alquileres (id_alquiler, usuariod_id, cliente_id, fecha, payment_status) VALUES
                                                                                         (1, 1, 1, '2023-12-01 10:00:00', 'PAID'),
                                                                                         (2, 2, 2, '2023-12-02 11:00:00', 'PENDING'),
                                                                                         (3, 3, 3, '2023-12-03 12:00:00', 'CANCELLED');

-- Inserts para la tabla Detalle_Alquiler
INSERT INTO detalle_alquiler (id_detalle_alquiler, alquiler_id, producto_id, cantidad, precio_unitario, dias, total) VALUES
                                                                                                                         (1, 1, 1, 10, 10.00, 5, (10 * 10.00) * 5),
                                                                                                                         (2, 2, 2, 5, 10.00, 3, (5 * 10.00) * 3),
                                                                                                                         (3, 3, 3, 20, 10.00, 7, (20 * 10.00) * 7);
/*
