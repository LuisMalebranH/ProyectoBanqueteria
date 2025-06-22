package com.banqueteria.recetario.transformacionunidades;


public class Unidades {
    
    private String nombre;
    
    private double mililitro;
    
    private double litro;
    
    private double gramo;
    
    private double kilo;
    
    private double unidad;

    public Unidades(String nombre, double mililitro, double litro, double gramo, double kilo, double unidad) {
        this.nombre = nombre;
        this.mililitro = mililitro;
        this.litro = litro;
        this.gramo = gramo;
        this.kilo = kilo;
        this.unidad = unidad;
    }

    public Unidades() {
    }

    public double getGramo() {
        return gramo;
    }

    public double getKilo() {
        return kilo;
    }

    public double getLitro() {
        return litro;
    }

    public double getMililitro() {
        return mililitro;
    }

    public String getNombre() {
        return nombre;
    }

    public double getUnidad() {
        return unidad;
    }

    public void setGramo(double gramo) {
        this.gramo = gramo;
    }

    public void setKilo(double kilo) {
        this.kilo = kilo;
    }

    public void setLitro(double litro) {
        this.litro = litro;
    }

    public void setMililitro(double mililitro) {
        this.mililitro = mililitro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidad(double unidad) {
        this.unidad = unidad;
    }
    
}
