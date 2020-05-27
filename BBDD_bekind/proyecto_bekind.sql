-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-05-2020 a las 14:11:25
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto_bekind`
--
CREATE DATABASE IF NOT EXISTS `proyecto_bekind` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `proyecto_bekind`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ayudantes`
--

CREATE TABLE `ayudantes` (
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(25) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `email` varchar(30) NOT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `contraseña` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(25) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `email` varchar(30) NOT NULL,
  `telefono` int(11) NOT NULL,
  `dirección` varchar(40) NOT NULL,
  `contraseña` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `codigo` varchar(9) NOT NULL,
  `punto_recogida` varchar(30) NOT NULL,
  `destino` varchar(30) NOT NULL,
  `hora` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicita`
--

CREATE TABLE `solicita` (
  `dni_clientes` varchar(9) NOT NULL,
  `codigo_servicios` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ayudantes`
--
ALTER TABLE `ayudantes`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`codigo`);

--
-- Indices de la tabla `solicita`
--
ALTER TABLE `solicita`
  ADD PRIMARY KEY (`dni_clientes`,`codigo_servicios`),
  ADD KEY `codigo_servicios` (`codigo_servicios`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `ayudantes`
--
ALTER TABLE `ayudantes`
  ADD CONSTRAINT `ayudantes_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `servicio` (`codigo`);

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `clientes_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `solicita` (`dni_clientes`);

--
-- Filtros para la tabla `solicita`
--
ALTER TABLE `solicita`
  ADD CONSTRAINT `solicita_ibfk_1` FOREIGN KEY (`codigo_servicios`) REFERENCES `servicio` (`codigo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
