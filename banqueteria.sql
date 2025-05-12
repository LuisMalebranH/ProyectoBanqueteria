-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 10, 2025 at 04:14 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `banqueteria`
--

-- --------------------------------------------------------

--
-- Table structure for table `cantidad`
--

CREATE TABLE `cantidad` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `categoria`
--

CREATE TABLE `categoria` (
  `id` int(11) NOT NULL,
  `detalle` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `categoria`
--

INSERT INTO `categoria` (`id`, `detalle`) VALUES
(1, 'Pasteleria');

-- --------------------------------------------------------

--
-- Table structure for table `detalle_encargo`
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
-- Table structure for table `encargo`
--

CREATE TABLE `encargo` (
  `id` int(11) NOT NULL,
  `cliente` varchar(20) NOT NULL,
  `fecha_entrega` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `ingrediente`
--

CREATE TABLE `ingrediente` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `precio` int(5) NOT NULL DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `lista_ingredientes`
--

CREATE TABLE `lista_ingredientes` (
  `id` int(11) NOT NULL,
  `id_producto` int(11) NOT NULL,
  `id_ingrediente` int(11) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `tipo_cantidad_ing` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `producto`
--

CREATE TABLE `producto` (
  `id` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `receta` varchar(500) NOT NULL,
  `categoria` int(11) NOT NULL,
  `precio` int(11) DEFAULT NULL,
  `receta_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `producto`
--

INSERT INTO `producto` (`id`, `nombre`, `receta`, `categoria`, `precio`, `receta_id`) VALUES
(2, 'Torta de Chocolate', '    Comienza juntando en un jarro la leche tibia con el vinagre y deja reposar 15 minutos o hasta que se corte la leche y reserva. Mientras, junta en un bowl el azúcar con la vainilla y el aceite de canola y bate solo hasta integrar bien. Agrega los huevos, repite lo mismo y finaliza agregando el chocolate amargo derretido, mezcla bien y agrega la leche que preparaste. Una vez tengas una mezcla homogénea, agrega la harina con el polvo de horneo IMPERIAL®, el bicarbonato y el cacao. Mezcla todo m', 1, 101010101, 1);

-- --------------------------------------------------------

--
-- Table structure for table `receta`
--

CREATE TABLE `receta` (
  `id` bigint(20) NOT NULL,
  `categoria` varchar(1000) DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `preparacion` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `receta`
--

INSERT INTO `receta` (`id`, `categoria`, `nombre`, `preparacion`) VALUES
(1, 'Pasteleria', 'Torta', 'yayyaydaysdgjasgfkasfjksahfjkasfas'),
(2, 'Pasteleria', 'Torta Chocolate', '    Comienza juntando en un jarro la leche tibia con el vinagre y deja reposar 15 minutos o hasta que se corte la leche y reserva. Mientras, junta en un bowl el azúcar con la vainilla y el aceite de canola y bate solo hasta integrar bien. Agrega los huevos, repite lo mismo y finaliza agregando el chocolate amargo derretido, mezcla bien y agrega la leche que preparaste. Una vez tengas una mezcla homogénea, agrega la harina con el polvo de horneo IMPERIAL®, el bicarbonato y el cacao. Mezcla todo muy bien y deja reposar por 30 minutos. Precalienta tu horno a 170°C y engrasa un molde rectangular grande con mantequilla y una capita de harina o bien puedes usar papel mantequilla. Vierte la mezcla y hornea por 35 a 40 min. Retira y deja enfriar. (corrobora la cocción enterrando un palito, si este sale limpio, está listo)\r\n\r\nPaso 2\r\n\r\n    2.Mientras, calienta la crema NESTLÉ® y junta con el chocolate amargo para derretir y luego agrega la gelatina. Procesa con ayuda de una minipimer pero sin m');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cantidad`
--
ALTER TABLE `cantidad`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `detalle_encargo`
--
ALTER TABLE `detalle_encargo`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_producto` (`id_producto`),
  ADD KEY `id_encargo` (`id_encargo`);

--
-- Indexes for table `encargo`
--
ALTER TABLE `encargo`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `ingrediente`
--
ALTER TABLE `ingrediente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lista_ingredientes`
--
ALTER TABLE `lista_ingredientes`
  ADD PRIMARY KEY (`id`),
  ADD KEY `id_ingrediente` (`id_ingrediente`),
  ADD KEY `tipo_cantidad` (`tipo_cantidad_ing`),
  ADD KEY `id_prod_list` (`id_producto`);

--
-- Indexes for table `producto`
--
ALTER TABLE `producto`
  ADD PRIMARY KEY (`id`),
  ADD KEY `tipo_categoria` (`categoria`),
  ADD KEY `FKoug9w3p6qwyhi5ogt6806xkaj` (`receta_id`);

--
-- Indexes for table `receta`
--
ALTER TABLE `receta`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `cantidad`
--
ALTER TABLE `cantidad`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `detalle_encargo`
--
ALTER TABLE `detalle_encargo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `encargo`
--
ALTER TABLE `encargo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `ingrediente`
--
ALTER TABLE `ingrediente`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `lista_ingredientes`
--
ALTER TABLE `lista_ingredientes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `producto`
--
ALTER TABLE `producto`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `receta`
--
ALTER TABLE `receta`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `detalle_encargo`
--
ALTER TABLE `detalle_encargo`
  ADD CONSTRAINT `id_encargo` FOREIGN KEY (`id_encargo`) REFERENCES `encargo` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_producto` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `lista_ingredientes`
--
ALTER TABLE `lista_ingredientes`
  ADD CONSTRAINT `id_ingrediente` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingrediente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `id_prod_list` FOREIGN KEY (`id_producto`) REFERENCES `producto` (`id`),
  ADD CONSTRAINT `tipo_cantidad` FOREIGN KEY (`tipo_cantidad_ing`) REFERENCES `cantidad` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `FKoug9w3p6qwyhi5ogt6806xkaj` FOREIGN KEY (`receta_id`) REFERENCES `receta` (`id`),
  ADD CONSTRAINT `tipo_categoria` FOREIGN KEY (`categoria`) REFERENCES `categoria` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
