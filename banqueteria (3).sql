-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-06-2025 a las 08:25:35
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `banqueteria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cantidad`
--

CREATE TABLE `cantidad` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `cantidad`
--

INSERT INTO `cantidad` (`id`, `descripcion`) VALUES
(1, 'taza'),
(2, 'unidad'),
(3, 'cucharada'),
(4, 'A criterio propio'),
(5, 'kilo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `detalle` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id`, `detalle`) VALUES
(23, 'postres'),
(24, 'comida rapida'),
(28, 'prueba'),
(30, 'asdf');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_encargo`
--

CREATE TABLE `detalle_encargo` (
  `id` bigint(20) NOT NULL,
  `id_encargo` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` varchar(3) DEFAULT NULL,
  `tipo_cantidad_prod` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `encargo`
--

CREATE TABLE `encargo` (
  `id` int(11) NOT NULL,
  `cliente` varchar(20) NOT NULL,
  `fecha_entrega` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingrediente`
--

CREATE TABLE `ingrediente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `medida_ing` int(11) NOT NULL,
  `precio` varchar(20) DEFAULT NULL,
  `cantidad` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ingrediente`
--

INSERT INTO `ingrediente` (`id`, `nombre`, `medida_ing`, `precio`, `cantidad`) VALUES
(1, 'marganina', 1, '0', NULL),
(2, 'azúcar', 1, '0', NULL),
(3, 'huevo', 1, '0', NULL),
(4, 'harina sin polvos', 1, '0', NULL),
(5, 'polvo de hornear', 1, '0', NULL),
(6, 'leche', 1, '0', NULL),
(7, 'mantequilla', 1, '0', NULL),
(8, 'harina', 1, '0', NULL),
(9, 'maicena', 1, '0', NULL),
(10, 'esencia de vainilla', 1, '0', NULL),
(11, 'manjar', 1, '0', NULL),
(12, 'nueces', 1, '0', NULL),
(13, 'azúcar flor', 1, '0', NULL),
(14, 'ingrediente de prueba', 1, '0', NULL),
(15, 'ing prueba 2', 1, '0', NULL),
(16, 'prueba n3', 1, '0', NULL),
(17, 'ingrediente 4', 1, '0', NULL),
(18, 'pan vegano', 1, '0', NULL),
(19, 'vienesa vegana', 1, '0', NULL),
(20, 'peperoni', 1, '0', NULL),
(21, 'pan', 1, '0', NULL),
(22, 'margarina', 1, '0', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_ingredientes`
--

CREATE TABLE `lista_ingredientes` (
  `id` bigint(20) NOT NULL,
  `id_prod` int(11) NOT NULL,
  `id_ingrediente` int(11) NOT NULL,
  `cantidad` varchar(10) DEFAULT NULL,
  `tipo_cantidad_ing` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `lista_ingredientes`
--

INSERT INTO `lista_ingredientes` (`id`, `id_prod`, `id_ingrediente`, `cantidad`, `tipo_cantidad_ing`) VALUES
(23, 15, 2, '1', 1),
(24, 15, 3, '2', 2),
(25, 15, 4, '3', 1),
(26, 15, 5, '1', 3),
(27, 15, 6, '2', 1),
(32, 20, 2, '1', 1),
(33, 21, 8, '1', 1),
(35, 23, 12, '2 1/2', 1),
(36, 24, 1, '3', 1),
(37, 24, 8, '3', 2),
(38, 24, 11, '4', 3),
(39, 24, 16, '1', 4),
(63, 29, 17, '5 3/4', 5),
(65, 29, 14, '1', 4),
(66, 19, 7, '4 1/2', 1),
(68, 24, 8, '3', 2),
(69, 24, 11, '4', 3),
(70, 24, 1, '3', 1),
(71, 24, 11, '4', 3),
(72, 24, 1, '3', 1),
(73, 24, 8, '3', 2),
(74, 24, 1, '3', 1),
(75, 24, 8, '3', 2),
(76, 24, 11, '4', 3),
(85, 19, 3, '3', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medida_ingredientes`
--

CREATE TABLE `medida_ingredientes` (
  `id` int(11) NOT NULL,
  `detalle` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `medida_ingredientes`
--

INSERT INTO `medida_ingredientes` (`id`, `detalle`) VALUES
(1, 'Kilo'),
(2, 'paquete'),
(3, 'Botella'),
(4, 'Gramos'),
(5, 'Litro');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `receta` varchar(5000) NOT NULL,
  `categoria` int(11) NOT NULL,
  `precio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `receta`, `categoria`, `precio`) VALUES
(15, 'queque', '1: Precalienta tu horno a 180º grados.\r\n2:En un bol bate la margarina con la taza de azúcar hasta que se mezclen totalmente.\r\n3: Añade los huevos a la mezcla uno a uno y encárgate de ir batiendo.\r\n4: Luego agrega la harina y los polvos de hornear ya cernidos y comienza a verter la leche de forma pausada mientras sigues batiendo.\r\n5: Lo importante es que no queden grumos en la masa.\r\n6: Finalmente, enmantequilla un molde y dispón de la preparación\r\n7: Deja el molde dentro del horno por al menos \r\n30 minutos.', 23, 0),
(19, 'prueba', 'jajant', 28, 0),
(20, 'asdf', 'es leche con azucar no mmes', 23, 0),
(21, 'qwer', 'qwer', 30, 0),
(23, 'zxcv', 'aaaaaaa', 24, 0),
(24, 'qazwsx', 'ctm', 28, 0),
(29, 'prueba 6', 'jhfbvjdfsvdmsf', 28, 0);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cantidad`
--
ALTER TABLE `cantidad`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `detalle_encargo`
--
ALTER TABLE `detalle_encargo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_encargo` (`id_encargo`),
  ADD KEY `id_encargo_prod` (`id_producto`);

--
-- Indices de la tabla `encargo`
--
ALTER TABLE `encargo`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `ingrediente`
--
ALTER TABLE `ingrediente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `med_ing` (`medida_ing`);

--
-- Indices de la tabla `lista_ingredientes`
--
ALTER TABLE `lista_ingredientes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_ingrediente` (`id_ingrediente`),
  ADD KEY `tipo_cantidad` (`tipo_cantidad_ing`),
  ADD KEY `id_prod_list` (`id_prod`);

--
-- Indices de la tabla `medida_ingredientes`
--
ALTER TABLE `medida_ingredientes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tipo_categoria` (`categoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cantidad`
--
ALTER TABLE `cantidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;

--
-- AUTO_INCREMENT de la tabla `detalle_encargo`
--
ALTER TABLE `detalle_encargo`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `encargo`
--
ALTER TABLE `encargo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ingrediente`
--
ALTER TABLE `ingrediente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23;

--
-- AUTO_INCREMENT de la tabla `lista_ingredientes`
--
ALTER TABLE `lista_ingredientes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=86;

--
-- AUTO_INCREMENT de la tabla `medida_ingredientes`
--
ALTER TABLE `medida_ingredientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=30;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `detalle_encargo`
--
ALTER TABLE `detalle_encargo`
  ADD CONSTRAINT `id_encargo` FOREIGN KEY (`id_encargo`) REFERENCES `encargo` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_encargo_prod` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `ingrediente`
--
ALTER TABLE `ingrediente`
  ADD CONSTRAINT `med_ing` FOREIGN KEY (`medida_ing`) REFERENCES `medida_ingredientes` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `lista_ingredientes`
--
ALTER TABLE `lista_ingredientes`
  ADD CONSTRAINT `id_ingrediente` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingrediente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_prod_list` FOREIGN KEY (`id_prod`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `tipo_cantidad` FOREIGN KEY (`tipo_cantidad_ing`) REFERENCES `cantidad` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `tipo_categoria` FOREIGN KEY (`categoria`) REFERENCES `categoria` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
