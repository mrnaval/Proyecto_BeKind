-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 03-06-2020 a las 18:21:23
-- Versión del servidor: 10.4.11-MariaDB
-- Versión de PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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
  `id` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(25) NOT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `ayudantes`
--

INSERT INTO `ayudantes` (`id`, `email`, `dni`, `nombre`, `apellidos`, `telefono`, `direccion`) VALUES
(1, '', 'l12345678', 'Lauren', 'Ciucan', 666666666, 'dfb'),
(3, 'navalet@gmail.com', 'i875234', 'Marc', 'naval', 123412, 'si'),
(4, 'pablete@gamil.com', 'x12345678', 'Pablo', 'Langa', 56758697, 'ASMR'),
(5, 'alex@gmail.com', 'i456678', 'alex', 'Nose', 88888888, 'ASMR');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `email` varchar(30) NOT NULL,
  `nombre` varchar(25) NOT NULL,
  `apellidos` varchar(25) NOT NULL,
  `telefono` int(11) NOT NULL,
  `direccion` varchar(40) NOT NULL,
  `contraseña` varchar(20) NOT NULL,
  `dni` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`email`, `nombre`, `apellidos`, `telefono`, `direccion`, `contraseña`, `dni`) VALUES
('alex@gmail.com', 'alex', 'Nose', 88888888, 'ASMR', '123456', 'i456678'),
('laurentiuciucan@hotmail.es', 'Lauren', 'Ciucan', 77777777, 'ASMR', '123456', 'i12345678'),
('navalet@gmail.com', 'Marc', 'naval', 123412, 'si', '123456', 'i875234'),
('pablete@gamil.com', 'Pablo', 'Langa', 56758697, 'ASMR', '123456', 'x12345678');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `servicio`
--

CREATE TABLE `servicio` (
  `punto_recogida` varchar(30) NOT NULL,
  `destino` varchar(30) NOT NULL,
  `hora` time NOT NULL DEFAULT current_timestamp(),
  `id` int(11) NOT NULL,
  `email` varchar(30) NOT NULL,
  `EmailAceptado` varchar(30) DEFAULT NULL,
  `tipo` varchar(15) NOT NULL,
  `aceptada` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `servicio`
--

INSERT INTO `servicio` (`punto_recogida`, `destino`, `hora`, `id`, `email`, `EmailAceptado`, `tipo`, `aceptada`) VALUES
('Si', 'prueba', '21:03:00', 17, 'pablete@gamil.com', NULL, 'Transporte', '0'),
('hola', 'que tal', '04:06:00', 18, 'pablete@gamil.com', 'navalet@gmail.com', 'Transporte', '1'),
('massa', 'no', '00:00:20', 19, 'navalet@gmail.com', NULL, 'Transporte', '0'),
('asdfdafh', 'adfhdh', '12:56:00', 20, 'navalet@gmail.com', 'alex@gmail.com', 'Transporte', '1'),
('sgds', 'sdhsdfh', '12:45:00', 21, 'navalet@gmail.com', NULL, 'Transporte', '0'),
('agaw', 'shgsf', '12:34:00', 22, 'navalet@gmail.com', 'navalet@gmail.com', 'Transporte', '1'),
('asmr', 'asmr', '05:34:00', 23, 'alex@gmail.com', NULL, 'Transporte', '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `solicita`
--

CREATE TABLE `solicita` (
  `id_ayudantes` int(11) NOT NULL,
  `id_servicio` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ayudantes`
--
ALTER TABLE `ayudantes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`email`);

--
-- Indices de la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD PRIMARY KEY (`id`),
  ADD KEY `email` (`email`);

--
-- Indices de la tabla `solicita`
--
ALTER TABLE `solicita`
  ADD PRIMARY KEY (`id_ayudantes`,`id_servicio`),
  ADD KEY `id_servicio` (`id_servicio`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ayudantes`
--
ALTER TABLE `ayudantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `servicio`
--
ALTER TABLE `servicio`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `servicio`
--
ALTER TABLE `servicio`
  ADD CONSTRAINT `servicio_ibfk_1` FOREIGN KEY (`email`) REFERENCES `clientes` (`email`);

--
-- Filtros para la tabla `solicita`
--
ALTER TABLE `solicita`
  ADD CONSTRAINT `solicita_ibfk_2` FOREIGN KEY (`id_servicio`) REFERENCES `servicio` (`id`),
  ADD CONSTRAINT `solicita_ibfk_3` FOREIGN KEY (`id_ayudantes`) REFERENCES `ayudantes` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
