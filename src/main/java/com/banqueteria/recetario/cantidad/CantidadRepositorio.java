package com.banqueteria.recetario.cantidad;



import com.banqueteria.recetario.categoria.*;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Baxkill
 */
public interface CantidadRepositorio extends JpaRepository <Cantidad,Long>{}