-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 00:25:10
-- Versión del servidor: 10.4.27-MariaDB
-- Versión de PHP: 8.2.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tf_hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `id` int(10) NOT NULL,
  `dni` text NOT NULL,
  `nombre` text NOT NULL,
  `apellido` text NOT NULL,
  `edad` int(3) NOT NULL,
  `genero` varchar(1) NOT NULL,
  `añosExperiencia` int(3) NOT NULL,
  `correo` text NOT NULL,
  `contraseña` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`id`, `dni`, `nombre`, `apellido`, `edad`, `genero`, `añosExperiencia`, `correo`, `contraseña`) VALUES
(1, 'admin', 'Benji', 'Jal', 22, 'M', 15, 'benjij379@gmail.com', '123'),
(2, '12345678', 'Juan', 'Cueva', 13, 'M', 4, 'juancueva@gmail.com', '1234');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `habitaciones`
--

CREATE TABLE `habitaciones` (
  `id` int(11) NOT NULL,
  `numero` text NOT NULL,
  `piso` text NOT NULL,
  `precio_diario` text NOT NULL,
  `estado` varchar(13) NOT NULL,
  `tipo_habitacion` varchar(12) NOT NULL,
  `caracteristicas` varchar(74) NOT NULL,
  `descripcion` varchar(90) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `habitaciones`
--

INSERT INTO `habitaciones` (`id`, `numero`, `piso`, `precio_diario`, `estado`, `tipo_habitacion`, `caracteristicas`, `descripcion`) VALUES
(1, '100', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(2, '101', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(3, '102', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(4, '103', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(5, '104', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(6, '105', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(7, '106', '1', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(8, '107', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(9, '108', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(10, '109', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(11, '110', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(12, '111', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(13, '112', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(14, '113', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(15, '114', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(16, '115', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(17, '116', '1', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(18, '117', '1', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(19, '118', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(20, '119', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(21, '120', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(22, '121', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(23, '122', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(24, '123', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(25, '124', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(26, '125', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(27, '126', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(28, '127', '1', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(29, '128', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(30, '129', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(31, '130', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(32, '131', '1', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(33, '132', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(34, '133', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(35, '134', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(36, '135', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(37, '136', '1', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(38, '137', '1', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(39, '138', '1', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(40, '139', '1', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(41, '140', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(42, '141', '1', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(43, '142', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(44, '143', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(45, '144', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(46, '145', '1', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(47, '146', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(48, '147', '1', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(49, '148', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(50, '149', '1', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(51, '150', '1', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(52, '151', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(53, '152', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(54, '153', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(55, '154', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(56, '155', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(57, '156', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(58, '157', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(59, '158', '1', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(60, '159', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(61, '160', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(62, '161', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(63, '162', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(64, '163', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(65, '164', '1', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(66, '165', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(67, '166', '1', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(68, '167', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(69, '168', '1', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(70, '169', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(71, '170', '1', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(72, '171', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(73, '172', '1', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(74, '173', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(75, '174', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(76, '175', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(77, '176', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(78, '177', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(79, '178', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(80, '179', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(81, '180', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(82, '181', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(83, '182', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(84, '183', '1', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(85, '184', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(86, '185', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(87, '186', '1', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(88, '187', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(89, '188', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(90, '189', '1', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(91, '190', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(92, '191', '1', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(93, '192', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(94, '193', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(95, '194', '1', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(96, '195', '1', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(97, '196', '1', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(98, '197', '1', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(99, '198', '1', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(100, '199', '1', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(101, '200', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(102, '201', '2', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(103, '202', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(104, '203', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(105, '204', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(106, '205', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(107, '206', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(108, '207', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(109, '208', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(110, '209', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(111, '210', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(112, '211', '2', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(113, '212', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(114, '213', '2', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(115, '214', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(116, '215', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(117, '216', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(118, '217', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(119, '218', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(120, '219', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(121, '220', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(122, '221', '2', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(123, '222', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(124, '223', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(125, '224', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(126, '225', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(127, '226', '2', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(128, '227', '2', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(129, '228', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(130, '229', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(131, '230', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(132, '231', '2', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(133, '232', '2', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(134, '233', '2', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(135, '234', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(136, '235', '2', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(137, '236', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(138, '237', '2', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(139, '238', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(140, '239', '2', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(141, '240', '2', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(142, '241', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(143, '242', '2', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(144, '243', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(145, '244', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(146, '245', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(147, '246', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(148, '247', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(149, '248', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(150, '249', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(151, '250', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(152, '251', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(153, '252', '2', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(154, '253', '2', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(155, '254', '2', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(156, '255', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(157, '256', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(158, '257', '2', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(159, '258', '2', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(160, '259', '2', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(161, '260', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(162, '261', '2', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(163, '262', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(164, '263', '2', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(165, '264', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(166, '265', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(167, '266', '2', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(168, '267', '2', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(169, '268', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(170, '269', '2', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(171, '270', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(172, '271', '2', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(173, '272', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(174, '273', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(175, '274', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(176, '275', '2', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(177, '276', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(178, '277', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(179, '278', '2', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(180, '279', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(181, '280', '2', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(182, '281', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(183, '282', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(184, '283', '2', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(185, '284', '2', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(186, '285', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(187, '286', '2', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(188, '287', '2', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(189, '288', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(190, '289', '2', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(191, '290', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(192, '291', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(193, '292', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(194, '293', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(195, '294', '2', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(196, '295', '2', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(197, '296', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(198, '297', '2', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(199, '298', '2', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(200, '299', '2', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(201, '300', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(202, '301', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(203, '302', '3', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(204, '303', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(205, '304', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(206, '305', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(207, '306', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(208, '307', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(209, '308', '3', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(210, '309', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(211, '310', '3', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(212, '311', '3', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(213, '312', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(214, '313', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(215, '314', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(216, '315', '3', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(217, '316', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(218, '317', '3', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(219, '318', '3', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(220, '319', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(221, '320', '3', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(222, '321', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(223, '322', '3', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(224, '323', '3', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(225, '324', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(226, '325', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(227, '326', '3', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(228, '327', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(229, '328', '3', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(230, '329', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(231, '330', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(232, '331', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(233, '332', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(234, '333', '3', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(235, '334', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(236, '335', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(237, '336', '3', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(238, '337', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(239, '338', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(240, '339', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(241, '340', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(242, '341', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(243, '342', '3', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(244, '343', '3', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(245, '344', '3', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(246, '345', '3', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(247, '346', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(248, '347', '3', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(249, '348', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(250, '349', '3', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(251, '350', '3', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(252, '351', '3', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(253, '352', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(254, '353', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(255, '354', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(256, '355', '3', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(257, '356', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(258, '357', '3', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(259, '358', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(260, '359', '3', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(261, '360', '3', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(262, '361', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(263, '362', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(264, '363', '3', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(265, '364', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion');
INSERT INTO `habitaciones` (`id`, `numero`, `piso`, `precio_diario`, `estado`, `tipo_habitacion`, `caracteristicas`, `descripcion`) VALUES
(266, '365', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(267, '366', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(268, '367', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(269, '368', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(270, '369', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(271, '370', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(272, '371', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(273, '372', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(274, '373', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(275, '374', '3', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(276, '375', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(277, '376', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(278, '377', '3', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(279, '378', '3', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(280, '379', '3', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(281, '380', '3', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(282, '381', '3', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(283, '382', '3', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(284, '383', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(285, '384', '3', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(286, '385', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(287, '386', '3', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(288, '387', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(289, '388', '3', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(290, '389', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(291, '390', '3', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(292, '391', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(293, '392', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(294, '393', '3', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(295, '394', '3', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(296, '395', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(297, '396', '3', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(298, '397', '3', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(299, '398', '3', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(300, '399', '3', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(301, '400', '4', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(302, '401', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(303, '402', '4', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(304, '403', '4', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(305, '404', '4', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(306, '405', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(307, '406', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(308, '407', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(309, '408', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(310, '409', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(311, '410', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(312, '411', '4', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(313, '412', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(314, '413', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(315, '414', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(316, '415', '4', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(317, '416', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(318, '417', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(319, '418', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(320, '419', '4', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(321, '420', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(322, '421', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(323, '422', '4', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(324, '423', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(325, '424', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(326, '425', '4', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(327, '426', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(328, '427', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(329, '428', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(330, '429', '4', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(331, '430', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(332, '431', '4', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(333, '432', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(334, '433', '4', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(335, '434', '4', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(336, '435', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(337, '436', '4', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(338, '437', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(339, '438', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(340, '439', '4', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(341, '440', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(342, '441', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(343, '442', '4', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(344, '443', '4', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(345, '444', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(346, '445', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(347, '446', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(348, '447', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(349, '448', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(350, '449', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(351, '450', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(352, '451', '4', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(353, '452', '4', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(354, '453', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(355, '454', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(356, '455', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(357, '456', '4', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(358, '457', '4', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(359, '458', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(360, '459', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(361, '460', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(362, '461', '4', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(363, '462', '4', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(364, '463', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(365, '464', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(366, '465', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(367, '466', '4', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(368, '467', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(369, '468', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(370, '469', '4', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(371, '470', '4', '50', 'Mantenimiento', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(372, '471', '4', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(373, '472', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(374, '473', '4', '50', 'Disponible', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(375, '474', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(376, '475', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(377, '476', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(378, '477', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(379, '478', '4', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(380, '479', '4', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(381, '480', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(382, '481', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(383, '482', '4', '150', 'Ocupado', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(384, '483', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(385, '484', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(386, '485', '4', '90', 'Disponible', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(387, '486', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(388, '487', '4', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(389, '488', '4', '80', 'Mantenimiento', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(390, '489', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(391, '490', '4', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(392, '491', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(393, '492', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(394, '493', '4', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(395, '494', '4', '80', 'Disponible', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor'),
(396, '495', '4', '50', 'Ocupado', 'Individual', '1 cama, \r\nducha', 'Acogedor, y simple\r\npara la experiencia del usuario'),
(397, '496', '4', '90', 'Ocupado', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(398, '497', '4', '90', 'Mantenimiento', 'Familiar', '2 camas de 2 plazas,\r\nSmart Tv\r\nagua cliente,', 'Habitacion familiar\r\npor si llegan de visita\r\nde proporcion grande, \r\ny comodo para\r\nlos t'),
(399, '498', '4', '150', 'Disponible', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(400, '499', '4', '150', 'Mantenimiento', 'Presidencial', '2 Camas de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv,\r\nWifi, atencion 2', 'atencion A1, \r\ncon comedor incluido\r\nvista hacia la ciudad\r\nmuy buena eleccion'),
(401, '500', '5', '80', 'Ocupado', 'Matrimonial', 'Cama de 3 plazas,\r\nducha con agua cliente,\r\nSmart Tv', 'Buena eleccion \r\npara parejas, \r\namplio y acogedor');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `id` int(11) NOT NULL,
  `nombre` text NOT NULL,
  `cantidad` text NOT NULL,
  `precioUnid` text NOT NULL,
  `tipoProducto` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`id`, `nombre`, `cantidad`, `precioUnid`, `tipoProducto`) VALUES
(1, 'Coca Cola', '10', '5', 'Bebida'),
(2, 'Agua Mineral', '12', '2.50', 'Bebida'),
(3, 'Galleta soda', '5', '1.50', 'Aperitivo'),
(4, 'Guarana 400 ml', '5', '4', 'Bebida'),
(5, 'Papas Lays', '6', '2', 'Aperitivo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `reservas`
--

CREATE TABLE `reservas` (
  `id` int(11) NOT NULL,
  `habitacion` text NOT NULL,
  `piso` text NOT NULL,
  `nombre` text NOT NULL,
  `apellido` text NOT NULL,
  `dni` text NOT NULL,
  `trabajador` text NOT NULL,
  `tipo` text NOT NULL,
  `pag` text NOT NULL,
  `consumos` text NOT NULL,
  `fecha` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `reservas`
--

INSERT INTO `reservas` (`id`, `habitacion`, `piso`, `nombre`, `apellido`, `dni`, `trabajador`, `tipo`, `pag`, `consumos`, `fecha`) VALUES
(1, '101', '101', 'Benjamin', 'Atoche', '101121212', '122112', 'Individual', 'Si', '240.0', '30/06/2023'),
(2, '133', '1', 'Martin', 'Nauca', '7283923', 'Benjamin', 'Familiar', 'Si', '11.5', '30/06/2023'),
(3, '141', '1', 'Kevin', 'Pillaca', '12321321', 'sadasddsa', 'Matrimonial', 'Si', '25.0', '04/07/2023'),
(4, '243', '2', 'Martin', 'Nauca', '7283923', 'Benjamin', 'Individual', 'No', '14.0', '06/07/2023'),
(5, '247', '2', 'Luis', 'Lopez', '7283922', 'Benjamin', 'Individual', 'No', '14.0', '06/07/2023');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `reservas`
--
ALTER TABLE `reservas`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `habitaciones`
--
ALTER TABLE `habitaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=404;

--
-- AUTO_INCREMENT de la tabla `productos`
--
ALTER TABLE `productos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `reservas`
--
ALTER TABLE `reservas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
