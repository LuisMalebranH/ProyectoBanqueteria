package com.banqueteria.recetario.detalleencargo;


import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicioDetalleEncargo{
    @Autowired
    private DetalleEncargoRepositorio repo;

    public List<DetalleEncargo> getAll() {
        return repo.findAll();
    }

    public DetalleEncargo save(DetalleEncargo detalleEncargo) {
        return repo.save(detalleEncargo);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<DetalleEncargo> get(Long id_prod) {
        return repo.findById(id_prod);
    }
    @Transactional
      public DetalleEncargo update(DetalleEncargo detalleEncargo) {
    if (!repo.existsById(detalleEncargo.getId())) {
        throw new EntityNotFoundException("No se encontró el producto con ID: " + detalleEncargo.getId());
    }
    return repo.save(detalleEncargo);
    }
    
    
}