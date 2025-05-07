package com.banqueteria.recetario.receta;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicioReceta{
    @Autowired
    private RecetaRepositorio repo;

    public List<Receta> getAll() {
        return repo.findAll();
    }

    public Receta save(Receta receta) {
        return repo.save(receta);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<Receta> get(Long id) {
        return repo.findById(id);
    }
}