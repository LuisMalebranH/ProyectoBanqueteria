package com.banqueteria.recetario.listaingredientes;


import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.producto.Producto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import static org.hibernate.query.results.Builders.fetch;

@Entity
public class ListaIngredientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_prod")
    private Producto producto;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_ingrediente")
    private Ingrediente ingrediente;
    
    
    
    
    
    
    // Getters & setters



}