package com.banqueteria.recetario.transformacionunidades;

import com.banqueteria.recetario.producto.*;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Baxkill
 */
@Service
public class ServicioTransformacionUnidades{
    @Autowired
    private TransformacionUnidadesRepositorio repo;

    public List<TransformacionUnidades> getAllTransformacionUnidades() {
        return repo.findAll();
    }

    public TransformacionUnidades save(TransformacionUnidades transformacionUnidades) {
        return repo.save(transformacionUnidades);
    }

    public void delete(String nombre) {
        repo.deleteById(nombre);
    }

    public Optional<TransformacionUnidades> get(String nombre) {
        return repo.findById(nombre);
    }
    
    @Transactional
      public TransformacionUnidades update(TransformacionUnidades transformacionUnidades) {
    if (!repo.existsById(transformacionUnidades.getNombre())) {
        throw new EntityNotFoundException("No se encontró el producto con ID: " + transformacionUnidades.getNombre());
    }
    return repo.save(transformacionUnidades);
}
    
}
