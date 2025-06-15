package com.banqueteria.recetario.encargo;


import com.banqueteria.recetario.producto.*;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Baxkill
 */
public interface EncargoRepositorio extends JpaRepository <Encargo,Long>{}