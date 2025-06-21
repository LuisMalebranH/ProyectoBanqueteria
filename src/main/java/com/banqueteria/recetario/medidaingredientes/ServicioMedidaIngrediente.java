package com.banqueteria.recetario.medidaingredientes;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Baxkill
 */
@Service
public class ServicioMedidaIngrediente{
    @Autowired
    private MedidaIngredienteRepositorio repo;

    public List<MedidaIngrediente> getAll() {
        return repo.findAll();
    }

    public MedidaIngrediente save(MedidaIngrediente medidaIngrediente) {
        return repo.save(medidaIngrediente);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<MedidaIngrediente> get(Long id) {
        return repo.findById(id);
    }
}