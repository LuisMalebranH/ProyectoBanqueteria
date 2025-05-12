package com.banqueteria.recetario.listaingredientes;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class ListaIngredientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String descripcion;
    
    @OneToOne(fetch:FetchType.LAZY)
    @JoinColumn()
    
    
    
    // Getters & setters



}