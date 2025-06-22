package com.banqueteria.recetario.transformacionunidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
@Entity
public class TransformacionUnidades {
    
    @Id
    @Column(length = 20)
    private String nombre;
    
    @Column(length = 10)
    private float mililitro;
    
    @Column(length = 10)
    private float litro;
    
    @Column(length = 10)
    private float gramo;
    
    @Column(length = 10)
    private float kilo;
    
    @Column(length = 10)
    private float unidad;

    public float getGramo() {
        return gramo;
    }

    public float getKilo() {
        return kilo;
    }

    public float getLitro() {
        return litro;
    }

    public float getMililitro() {
        return mililitro;
    }

    public String getNombre() {
        return nombre;
    }

    public float getUnidad() {
        return unidad;
    }

    public void setGramo(float gramo) {
        this.gramo = gramo;
    }

    public void setKilo(float kilo) {
        this.kilo = kilo;
    }

    public void setLitro(float litro) {
        this.litro = litro;
    }

    public void setMililitro(float mililitro) {
        this.mililitro = mililitro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidad(float unidad) {
        this.unidad = unidad;
    }
    
}
