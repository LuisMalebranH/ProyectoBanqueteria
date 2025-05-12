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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class ListaIngredientes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20)
    private String descripcion;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_producto")
    private Producto producto;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="id_ingrediente")
    private Ingrediente ingrediente;
      
    @Column(length = 11)
    private Integer cantidad;
    
    @ManyToOne(fetch=FetchType.EAGER)
    @JoinColumn (name="tipo_cantidad_ing")
    private Cantidad tipo_cantidad_ing;
    
    
    // Getters & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Ingrediente getIngrediente() {
        return ingrediente;
    }

    public void setIngrediente(Ingrediente ingrediente) {
        this.ingrediente = ingrediente;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Cantidad getTipo_cantidad_ing() {
        return tipo_cantidad_ing;
    }

    public void setTipo_cantidad_ing(Cantidad tipo_cantidad_ing) {
        this.tipo_cantidad_ing = tipo_cantidad_ing;
    }

    

}