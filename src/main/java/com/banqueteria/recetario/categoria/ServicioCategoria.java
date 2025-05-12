package com.banqueteria.recetario.categoria;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Baxkill
 */
@Service
public class ServicioCategoria{
    @Autowired
    private CategoriaRepositorio repo;

    public List<Categoria> getAll() {
        return repo.findAll();
    }

    public Categoria save(Categoria categoria) {
        return repo.save(categoria);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<Categoria> get(Long id) {
        return repo.findById(id);
    }
}