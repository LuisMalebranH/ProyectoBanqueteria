-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 14-05-2025 a las 13:19:11
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
(1, 'postre'),
(18, 'vegano');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `detalle_encargo`
--

CREATE TABLE `detalle_encargo` (
  `id` int(11) NOT NULL,
  `id_encargo` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `tipo_cantidad_prod` int(11) NOT NULL
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
  `precio` int(5) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `ingrediente`
--

INSERT INTO `ingrediente` (`id`, `nombre`, `precio`) VALUES
(1, 'marganina', 0),
(2, 'azúcar', 0),
(3, 'huevo', 0),
(4, 'harina sin polvos', 0),
(5, 'polvo de hornear', 0),
(6, 'leche', 0),
(7, 'mantequilla', 0),
(8, 'harina', 0),
(9, 'maicena', 0),
(10, 'esencia de vainilla', 0),
(11, 'manjar', 0),
(12, 'nueces', 0),
(13, 'azúcar flor', 0),
(14, 'ingrediente de prueba', 0),
(15, 'ing prueba 2', 0),
(16, 'prueba n3', 0),
(17, 'ingrediente 4', 0),
(18, 'pan vegano', 0),
(19, 'vienesa vegana', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lista_ingredientes`
--

CREATE TABLE `lista_ingredientes` (
  `id` bigint(20) NOT NULL,
  `id_prod` int(11) NOT NULL,
  `id_ingrediente` int(11) NOT NULL,
  `cantidad` varchar(3) DEFAULT NULL,
  `tipo_cantidad_ing` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `lista_ingredientes`
--

INSERT INTO `lista_ingredientes` (`id`, `id_prod`, `id_ingrediente`, `cantidad`, `tipo_cantidad_ing`) VALUES
(1, 3, 2, '1', 1),
(2, 3, 4, '2', 1),
(3, 3, 4, '2', 1),
(4, 3, 5, '1', 3),
(5, 3, 6, '1', 1),
(6, 4, 7, '1', 4),
(7, 4, 8, '1', 1),
(8, 4, 9, '1', 1),
(9, 4, 5, '1', 3),
(10, 4, 3, '8', 2),
(11, 4, 2, '1', 1),
(12, 4, 11, '1', 5),
(13, 4, 13, '1', 4),
(15, 12, 18, '1', 2),
(16, 12, 19, '1', 2);

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
(3, 'queque', 'Precalienta tu horno a 180º grados.\r\nEn un bol bate la margarina con la taza de azúcar hasta que se mezclen totalmente.\r\nAñade los huevos a la mezcla uno a uno y encárgate de ir batiendo.\r\nLuego agrega la harina y los polvos de hornear ya cernidos y comienza a verter la leche de forma pausada mientras sigues batiendo.\r\nLo importante es que no queden grumos en la masa.\r\nFinalmente, enmantequilla un molde y dispón de la preparación\r\nDeja el molde dentro del horno por al menos 30 minutos.', 1, 5000),
(4, 'brazo de reina', 'Precalentar el horno a 180C.  Poner papel mantequilla a una bandeja de horno* de 40 x 25 cms y luego enmantequillar el papel.\r\nEn un bol, cernir la harina junto a la maicena y los Polvos de Hornear Gourmet.\r\nEn otro recipiente, batir las claras a nieve e incorporar suavemente el azúcar, mientras se siguen batiendo las claras. Seguir batiendo y agregar las yemas de a una, y la Esencia de Vainilla Gourmet. Finalmente integrar con una espátula la mezcla de harina.\r\nVaciar la mezcla sobre la bandeja preparada, emparejar y llevar al horno por 8 a 10 minutos (sin dorar). Una vez listo, volcar la masa horneada sobre un papel mantequilla espolvoreado con azúcar flor, despegando la masa del papel en el cual se horneó.\r\nEnrollar la masa rápidamente ayudándose con el papel mantequilla y dejar enfriar.\r\nDesenrollar la masa, rellenar con manjar y volver a enrollar. Por último, espolvorear con azúcar flor o tapar con manjar y decorar con nueces picadas.', 1, 4000),
(12, 'Completo vegano', '', 18, 0);

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
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `lista_ingredientes`
--
ALTER TABLE `lista_ingredientes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_ingrediente` (`id_ingrediente`),
  ADD KEY `tipo_cantidad` (`tipo_cantidad_ing`),
  ADD KEY `id_prod_list` (`id_prod`);

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
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `detalle_encargo`
--
ALTER TABLE `detalle_encargo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `encargo`
--
ALTER TABLE `encargo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `ingrediente`
--
ALTER TABLE `ingrediente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=20;

--
-- AUTO_INCREMENT de la tabla `lista_ingredientes`
--
ALTER TABLE `lista_ingredientes`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

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
