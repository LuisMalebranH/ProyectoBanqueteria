package com.banqueteria.recetario.ingrediente;

import com.banqueteria.recetario.receta.*;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Baxkill
 */
public interface IngredienteRepositorio extends JpaRepository <Ingrediente,Long>{}