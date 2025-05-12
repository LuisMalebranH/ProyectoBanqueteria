package com.banqueteria.recetario.cantidad;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Baxkill
 */
@Service
public class ServicioCantidad{
    @Autowired
    private CantidadRepositorio repo;

    public List<Cantidad> getAll() {
        return repo.findAll();
    }

    public Cantidad save(Cantidad cantidad) {
        return repo.save(cantidad);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<Cantidad> get(Long id) {
        return repo.findById(id);
    }
}