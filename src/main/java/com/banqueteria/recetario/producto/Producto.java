package com.banqueteria.recetario.producto;

import com.banqueteria.recetario.categoria.Categoria;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String nombre;
    
    
    @Column (length = 5000)
    private String receta;
    
    
    @Column(length = 11)
    private String precio;
    
    @Column(length = 11)
    private String porciones;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="categoria")
    private Categoria categoria;
   

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

    public String getReceta() {
        return receta;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getPorciones() {
        return porciones;
    }

    public void setPorciones(String porciones) {
        this.porciones = porciones;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    

}
