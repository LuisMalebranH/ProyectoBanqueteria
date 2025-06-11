package com.banqueteria.recetario.listaingredientes;

import jakarta.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ServicioListaIngredientes{
    @Autowired
    private ListaIngredientesRepositorio repo;

    public List<ListaIngredientes> getAll() {
        return repo.findAll();
    }

    public ListaIngredientes save(ListaIngredientes listaIngredientes) {
        return repo.save(listaIngredientes);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public Optional<ListaIngredientes> get(Long id_prod) {
        return repo.findById(id_prod);
    }
    @Transactional
      public ListaIngredientes update(ListaIngredientes listaIngredientes) {
    if (!repo.existsById(listaIngredientes.getId())) {
        throw new EntityNotFoundException("No se encontró el producto con ID: " + listaIngredientes.getId());
    }
    return repo.save(listaIngredientes);
    }
    
    
}