
/**
 * Author:  Bryan Vera
 * Created: 22-05-2024
 */

-- Crear base de datos --
CREATE DATABASE IF NOT EXISTS Meownager;
USE Meownager;

-- Crear Tabla de Usuarios --
CREATE TABLE Usuarios(
    ID_Usuario INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellido VARCHAR(50),
    Email VARCHAR(100) NOT NULL UNIQUE,
    Contraseña VARCHAR(60) NOT NULL,
    Celular VARCHAR(25) UNIQUE,
    Fecha_Registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Rango ENUM('Administrador', 'Usuario') DEFAULT 'Usuario'
);

