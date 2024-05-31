
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
    Fecha_Registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Rango ENUM('Administrador', 'Usuario') DEFAULT 'Usuario'
);
INSERT INTO Usuarios (Nombre, Apellido, Email, Contraseña, Rango) 
VALUES ('Bryan', 'Vera', 'meownager@gmail.com', 'meownager', 'Administrador');

-- Crear tabla de Clientes
CREATE TABLE Clientes(
    ID_Cliente INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Apellido VARCHAR(50) NULL,
    Email VARCHAR(100) UNIQUE,
    Telefono VARCHAR(20) NULL,
    Direccion VARCHAR(255),
    Fecha_Registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Estado ENUM('Activo', 'Inactivo', 'Suspendido', 'Bloqueado') DEFAULT 'Activo'
);
INSERT INTO Clientes (Nombre, Apellido, Email, Telefono, Direccion) 
VALUES ('María', 'López', 'maria@example.com', '+569 12345678', 'Calle Principal 123');

-- Crear Tabla de Proveedores --
CREATE TABLE Proveedores(
	ID_Proveedor INT AUTO_INCREMENT PRIMARY KEY,
    Rut VARCHAR(15) NOT NULL UNIQUE,
    Nombre VARCHAR(50) NOT NULL,
	Email VARCHAR(100) NOT NULL UNIQUE,
    Telefono VARCHAR(20) NOT NULL,
	Direccion VARCHAR(255),
    Fecha_Registro TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Estado ENUM('Activo', 'Inactivo', 'Suspendido', 'Bloqueado') DEFAULT 'Activo'
);
INSERT INTO Proveedores (Rut, Nombre, Email, Telefono, Direccion) 
VALUES ('77.879.240-0', 'Samsung Electronics Chile Ltda.', 'samsung.ElectronicChile@example.com', '562 2485 8500', 'Cerro El Plomo 6000, Las Condes, Región Metropolitana');

-- Crear Tabla de Categorias --
CREATE TABLE Categorias(
	ID_Categoria INT AUTO_INCREMENT PRIMARY KEY,
    Nombre VARCHAR(50) NOT NULL,
    Descripcion VARCHAR(255)
);
INSERT INTO Categorias (Nombre, Descripcion) 
VALUES ('Dispositivos mobiles', 'Dispositivos portatiles mobile etc...');

-- Crear Tabla de Productos --
CREATE TABLE Productos(
	ID_Producto INT AUTO_INCREMENT PRIMARY KEY,
    ID_Proveedor INT NOT NULL,
    ID_Categoria INT NOT NULL,
    Nombre VARCHAR(255) NOT NULL, 
    Descripcion VARCHAR(255),
    Codigo_Producto VARCHAR(13) NOT NULL,
    Precio DECIMAL(13,3) NOT NULL,
    Stock INT NOT NULL,
    FOREIGN KEY (ID_Proveedor) REFERENCES Proveedores (ID_Proveedor),
    FOREIGN KEY (ID_Categoria) REFERENCES Categorias (ID_Categoria)
);

-- Crear tabla Ventas --
CREATE TABLE Ventas(
    ID_Venta INT AUTO_INCREMENT PRIMARY KEY,
    ID_Cliente INT NOT NULL,
    Fecha_Venta TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    Total DECIMAL(13,3) NOT NULL,
    FOREIGN KEY (ID_Cliente) REFERENCES Clientes(ID_Cliente)
);


-- Crear tabla DetalleVentas --
CREATE TABLE DetalleVentas(
    ID_DetalleVenta INT AUTO_INCREMENT PRIMARY KEY,
    ID_Venta INT NOT NULL,
    ID_Producto INT NOT NULL,
    Cantidad INT NOT NULL,
    Precio_Unitario DECIMAL(13,3) NOT NULL,
    FOREIGN KEY (ID_Venta) REFERENCES Ventas(ID_Venta),
    FOREIGN KEY (ID_Producto) REFERENCES Productos(ID_Producto)
);
