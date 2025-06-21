package com.banqueteria.recetario.ingrediente;

import com.banqueteria.recetario.medidaingredientes.MedidaIngrediente;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="medida_ing", referencedColumnName="id")
    private MedidaIngrediente medidaingrediente;
    
    
    @Column(length = 20)
    private String precio;
    @Column(length = 10)
    private String cantidad;
    @Column(length = 20)

    // Getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public MedidaIngrediente getMedidaingrediente() {
        return medidaingrediente;
    }

    public void setMedidaingrediente(MedidaIngrediente medidaingrediente) {
        this.medidaingrediente = medidaingrediente;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

}