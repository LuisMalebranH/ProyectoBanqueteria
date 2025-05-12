package com.banqueteria.recetario.producto;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Baxkill
 */
@Service
public class ServicioProducto{
    @Autowired
    private ProductoRepositorio repo;

    public List<Producto> getAllProducto() {
        return repo.findAll();
    }

    public Producto save(Producto producto) {
        return repo.save(producto);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<Producto> get(Long id) {
        return repo.findById(id);
    }
    
}
