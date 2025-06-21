package com.banqueteria.recetario.encargo;

import com.banqueteria.recetario.producto.*;
import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Baxkill
 */
@Service
public class ServicioEncargo{
    @Autowired
    private EncargoRepositorio repo;

    public List<Encargo> getAllEncargo() {
        return repo.findAll();
    }

    public Encargo save(Encargo encargo) {
        return repo.save(encargo);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<Encargo> get(Long id) {
        return repo.findById(id);
    }
    
    @Transactional
      public Encargo update(Encargo encargo) {
    if (!repo.existsById(encargo.getId())) {
        throw new EntityNotFoundException("No se encontró el producto con ID: " + encargo.getId());
    }
    return repo.save(encargo);
}
    
}
