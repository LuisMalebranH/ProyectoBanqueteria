package com.banqueteria.recetario.ingrediente;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Baxkill
 */
@Service
public class ServicioIngrediente{
    @Autowired
    private IngredienteRepositorio repo;

    public List<Ingrediente> getAll() {
        return repo.findAll();
    }

    public Ingrediente save(Ingrediente ingrediente) {
        return repo.save(ingrediente);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<Ingrediente> get(Long id) {
        return repo.findById(id);
    }
}