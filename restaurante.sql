-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 10-11-2020 a las 10:01:15
-- Versión del servidor: 10.4.14-MariaDB
-- Versión de PHP: 7.4.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `restaurante`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria_model`
--

CREATE TABLE `categoria_model` (
  `id_categoria` int(11) NOT NULL,
  `descripcion` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `nombrecat` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `nombreenc` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `categoria_model`
--

INSERT INTO `categoria_model` (`id_categoria`, `descripcion`, `nombrecat`, `nombreenc`) VALUES
(1, 'Para empezar bien el día', 'Desayuno', 'Roberto'),
(2, 'Para comer a mediodía', 'Almuerzo', 'Luis'),
(3, 'Un chocolate con Churros', 'Merienda', 'Pedro'),
(4, 'Algo ligerito', 'Cena', 'José');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contiene_model`
--

CREATE TABLE `contiene_model` (
  `id_ingrediente` int(11) NOT NULL,
  `id_plato` int(11) NOT NULL,
  `cantidad_usada` float NOT NULL,
  `unid_med` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `contiene_model`
--

INSERT INTO `contiene_model` (`id_ingrediente`, `id_plato`, `cantidad_usada`, `unid_med`) VALUES
(2, 1, 3, 'Uni'),
(4, 2, 1, 'Uni'),
(9, 1, 0.02, 'Kg'),
(9, 2, 1, 'CucP'),
(18, 1, 0.4, 'Kg'),
(23, 1, 0.15, 'Kg'),
(31, 1, 2, 'Uni'),
(34, 2, 0.2, 'L'),
(35, 1, 2, 'L'),
(41, 1, 3, 'Uni'),
(44, 2, 0.15, 'Kg'),
(45, 1, 3, 'Uni'),
(47, 1, 0.4, 'Kg'),
(48, 1, 0.2, 'Kg'),
(49, 1, 2, 'Uni'),
(50, 1, 3, 'Uni'),
(51, 1, 0.15, 'Kg'),
(52, 2, 1, 'Uni'),
(53, 2, 0.1, 'Kg'),
(54, 2, 1, 'CucP');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ingrediente_model`
--

CREATE TABLE `ingrediente_model` (
  `id_ingrediente` int(11) NOT NULL,
  `nombre_ing` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `stock_almacen` float DEFAULT NULL,
  `unidad_med` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `ingrediente_model`
--

INSERT INTO `ingrediente_model` (`id_ingrediente`, `nombre_ing`, `stock_almacen`, `unidad_med`) VALUES
(1, 'Tomate', 200, 'Kg'),
(2, 'Patata', 200, 'Kg'),
(3, 'Pimiento', 150, 'Kg'),
(4, 'Cebolla', 180, 'Kg'),
(5, 'Pepino', 100, 'Kg'),
(6, 'Lechuga', 180, 'Kg'),
(7, 'Aceite de oliva', 150, 'L'),
(8, 'Aceite de girasol', 150, 'L'),
(9, 'Sal', 100, 'Kg'),
(10, 'Pimienta negra', 15, 'Kg'),
(11, 'Pimienta blanca', 10, 'Kg'),
(12, 'Perejil', 10, 'Kg'),
(13, 'Laurel', 10, 'Kg'),
(14, 'Oregano', 10, 'Kg'),
(15, 'Albahaca', 10, 'Kg'),
(16, 'Curry', 10, 'Kg'),
(17, 'Ajo', 20, 'Kg'),
(18, 'Garbanzos', 200, 'Kg'),
(19, 'Lentejas', 200, 'Kg'),
(20, 'Arroz', 200, 'Kg'),
(21, 'Espagueti', 200, 'Kg'),
(22, 'Macarrones', 200, 'Kg'),
(23, 'Fideos Cabellín', 200, 'Kg'),
(24, 'Judías', 200, 'Kg'),
(25, 'Carne picada mixta', 200, 'Kg'),
(26, 'Champiñon', 200, 'Kg'),
(27, 'Queso rallado', 200, 'Kg'),
(28, 'Jamon Serrano', 200, 'Kg'),
(29, 'Jamon Cocido', 200, 'Kg'),
(30, 'Pollo Entero', 200, 'Kg'),
(31, 'Zanahoria', 200, 'Kg'),
(32, 'Azucar', 200, 'Kg'),
(33, 'Chocolate', 200, 'Kg'),
(34, 'Leche', 200, 'L'),
(35, 'Agua', 1000, 'L'),
(36, 'Gambas', 200, 'Kg'),
(37, 'Langostinos', 200, 'Kg'),
(38, 'Merluza', 200, 'Kg'),
(39, 'Salmón', 200, 'Kg'),
(40, 'Trucha', 200, 'Kg'),
(41, 'Chorizo fresco', 200, 'Kg'),
(42, 'Morcilla', 200, 'Kg'),
(43, 'Cochinillo', 200, 'Kg'),
(44, 'Harina', 200, 'Kg'),
(45, 'Hueso de caña con tuétano', 200, 'Uni'),
(46, 'Muslo de pollo', 200, 'Uni'),
(47, 'Morcillo de ternera', 200, 'Kg'),
(48, 'Tocino', 200, 'Kg'),
(49, 'Hueso de rodilla de ternera', 200, 'Uni'),
(50, 'Huesos de espinazo de cerdo salado', 200, 'Uni'),
(51, 'Gallina', 200, 'Kg'),
(52, 'Huevos', 100, 'Doc'),
(53, 'Pan rallado', 200, 'Kg'),
(54, 'Levadura química', 20, 'Kg');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `plato_model`
--

CREATE TABLE `plato_model` (
  `id_plato` int(11) NOT NULL,
  `descripcion` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `foto` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `nivel` int(11) DEFAULT NULL,
  `nombrepla` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `precio` float DEFAULT NULL,
  `categoria_id_categoria` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `plato_model`
--

INSERT INTO `plato_model` (`id_plato`, `descripcion`, `foto`, `nivel`, `nombrepla`, `precio`, `categoria_id_categoria`) VALUES
(1, 'Garbanzos con viandas', 'cocido.png', 3, 'Cocido Madrileño', 15, 2),
(2, 'Cebolla rebozada', 'aros_cebolla.jpg', 1, 'Aros de Cebolla', 7, 4),
(3, 'Chocolate y bizcocho', 'brownie.jpg', 4, 'Brownie', 5, 3),
(4, 'Carne de cerdo asado', 'trucha.jpg', 3, 'Cochinillo asado', 18, 2),
(5, 'Churros con chocolate', 'churros.jpg', 2, 'Churros', 3, 1),
(6, 'Buñuelos con azucar', 'buñuelos.jpg', 3, 'Buñuelos', 2, 3),
(7, 'Rosquillas de harina', 'donuts.jpg', 2, 'Donuts', 2, 1),
(8, 'Hortalizas con bonito', 'ensalada.jpg', 2, 'Ensalada mixta', 8, 4),
(9, 'Ternera al punto', 'entrecot.jpg', 3, 'Entrecot de ternera', 15, 2),
(10, 'Pasta con nata y queso', 'espaguetis.jpg', 3, 'Espaguetis Carbonara', 8, 2),
(11, 'Ternera con hortalizas', 'hamburguesa.jpg', 2, 'Hamburgesa', 4, 2),
(12, 'Lentejas con chorizo', 'lentejas.jpg', 3, 'Lentejas Estilo Provenzal', 15, 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `rol`
--

CREATE TABLE `rol` (
  `id_rol` int(11) NOT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `roles`
--

CREATE TABLE `roles` (
  `user_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `apellido` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `contraseña` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `email` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `nombre` varchar(255) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria_model`
--
ALTER TABLE `categoria_model`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `contiene_model`
--
ALTER TABLE `contiene_model`
  ADD PRIMARY KEY (`id_ingrediente`,`id_plato`),
  ADD KEY `FKl8pmfpg30a4eap53m25h7sxcl` (`id_plato`);

--
-- Indices de la tabla `ingrediente_model`
--
ALTER TABLE `ingrediente_model`
  ADD PRIMARY KEY (`id_ingrediente`);

--
-- Indices de la tabla `plato_model`
--
ALTER TABLE `plato_model`
  ADD PRIMARY KEY (`id_plato`),
  ADD KEY `FKbwyfnfidq6m2p65e5ddgrdfwx` (`categoria_id_categoria`);

--
-- Indices de la tabla `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indices de la tabla `roles`
--
ALTER TABLE `roles`
  ADD KEY `FK6jbs0hn4t7gy4oq0oja5jghng` (`role_id`),
  ADD KEY `FKb1e6ivx545tngxtmt8ibhx7m5` (`user_id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `UK5171l57faosmj8myawaucatdw` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ingrediente_model`
--
ALTER TABLE `ingrediente_model`
  MODIFY `id_ingrediente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=55;

--
-- AUTO_INCREMENT de la tabla `plato_model`
--
ALTER TABLE `plato_model`
  MODIFY `id_plato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contiene_model`
--
ALTER TABLE `contiene_model`
  ADD CONSTRAINT `FKh1dbwmqb3q8b7sbltvud0nvp8` FOREIGN KEY (`id_ingrediente`) REFERENCES `ingrediente_model` (`id_ingrediente`),
  ADD CONSTRAINT `FKl8pmfpg30a4eap53m25h7sxcl` FOREIGN KEY (`id_plato`) REFERENCES `plato_model` (`id_plato`);

--
-- Filtros para la tabla `plato_model`
--
ALTER TABLE `plato_model`
  ADD CONSTRAINT `FKbwyfnfidq6m2p65e5ddgrdfwx` FOREIGN KEY (`categoria_id_categoria`) REFERENCES `categoria_model` (`id_categoria`);

--
-- Filtros para la tabla `roles`
--
ALTER TABLE `roles`
  ADD CONSTRAINT `FK6jbs0hn4t7gy4oq0oja5jghng` FOREIGN KEY (`role_id`) REFERENCES `rol` (`id_rol`),
  ADD CONSTRAINT `FKb1e6ivx545tngxtmt8ibhx7m5` FOREIGN KEY (`user_id`) REFERENCES `usuario` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
