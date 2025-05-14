package com.banqueteria.recetario.listaingredientes;


import com.banqueteria.recetario.cantidad.Cantidad;
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
    
    @Column(length = 3)
    private String cantidad;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="tipo_cantidad_ing")
    private Cantidad medida;

    public String getCantidad() {
        return cantidad;
    }

    public Long getId() {
        return id;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public Cantidad getMedida() {
        return medida;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public void setMedida(Cantidad medida) {
        this.medida = medida;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    
}