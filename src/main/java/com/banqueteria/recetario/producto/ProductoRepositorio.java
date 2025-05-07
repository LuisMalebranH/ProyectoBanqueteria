package com.banqueteria.recetario.producto;

import com.banqueteria.recetario.ingrediente.*;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Baxkill
 */
public interface ProductoRepositorio extends JpaRepository <Producto,Long>{}