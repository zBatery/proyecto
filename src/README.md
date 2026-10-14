+++SQL PARA LA BASE DE DATOS+++

    CREAR BASE DE DATOS
        CREATE DATABASE climed;

    CREAR TABLA DE USUARIOS
        CREATE TABLE usuarios (
            id INT AUTO_INCREMENT PRIMARY KEY,
            nombre_usuario VARCHAR(50) NOT NULL UNIQUE,
            password VARCHAR(255) NOT NULL,
            fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
            codigo VARCHAR(50),
            nombre_apellido VARCHAR(500),
            rol VARCHAR(50);
        );

