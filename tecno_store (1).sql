-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 18-11-2021 a las 17:47:25
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tecno_store`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administradores`
--

CREATE TABLE `administradores` (
  `ID` varchar(20) NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `APELLIDO` varchar(100) NOT NULL,
  `USUARIO` varchar(100) NOT NULL,
  `CONTRA` varchar(100) NOT NULL,
  `IDENTIFICACION` varchar(20) NOT NULL,
  `CIUDAD` varchar(100) NOT NULL,
  `TELEFONO` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `administradores`
--

INSERT INTO `administradores` (`ID`, `NOMBRE`, `APELLIDO`, `USUARIO`, `CONTRA`, `IDENTIFICACION`, `CIUDAD`, `TELEFONO`) VALUES
('kkkkk', 'dcddv', 'ooo', 'dvdvdvdvv', 'vdvdvvdv', '', '', ''),
('aaaaa', 'pedro', 'dvdvdvvdv', 'dvdvdvdvv', 'vdvdvvdv', 'dvdvdvvdv', 'mckscmskc', ''),
('1', 'Jhojan', 'grisales', 'reich', 'reich0319', '1122509531', 'villavicencio', '3144169450');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `ID_CLIE` varchar(100) NOT NULL,
  `NOMBRE` varchar(100) NOT NULL,
  `APELLIDO` varchar(100) NOT NULL,
  `USUARIO` varchar(100) NOT NULL,
  `CONTRASEÑA` varchar(100) NOT NULL,
  `IDENTIFICACION` varchar(100) NOT NULL,
  `CIUDAD` varchar(100) NOT NULL,
  `TELEFONO` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`ID_CLIE`, `NOMBRE`, `APELLIDO`, `USUARIO`, `CONTRASEÑA`, `IDENTIFICACION`, `CIUDAD`, `TELEFONO`) VALUES
('1', 'juan', 'ortiz', 'orcher', '12120121', '1122080922', 'villavo', '3144169450'),
('2', 'david', 'ortega', 'davied', 'dodo', '121200', 'villavo', '31029090'),
('3', 'pepo', 'piña', 'bobi', '121212', '1212080992', 'villavo', '310292090');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `NUM_PRODUC` varchar(100) NOT NULL,
  `PRODUCTO` varchar(100) NOT NULL,
  `TIPO` varchar(100) NOT NULL,
  `EMPRESA` varchar(100) NOT NULL,
  `PRECIO` varchar(100) NOT NULL,
  `HECHO` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`NUM_PRODUC`, `PRODUCTO`, `TIPO`, `EMPRESA`, `PRECIO`, `HECHO`) VALUES
('10', 'RYZEN2600', 'PROCESADOR', 'RYZEN', '540000', 'ESTADOS UNIDOS'),
('28', 'PANTALLA LG4K', 'PANTALLAS', 'LG', '200000', 'KOREA'),
('12', 'LOGITECH12', 'PERIFERICO', 'LOGITECH', '900000', 'MEXICO'),
('22', 'LOGITECH20', 'PERIFERICO', 'LOGITECH', '12000', 'ESTADOS UNIDOS');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
