package com.banqueteria.recetario.listaingredientes;



import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Baxkill
 */
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

    public Optional<ListaIngredientes> get(Long id) {
        return repo.findById(id);
    }
}