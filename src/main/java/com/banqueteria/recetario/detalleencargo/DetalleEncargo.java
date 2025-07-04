package com.banqueteria.recetario.detalleencargo;


import com.banqueteria.recetario.cantidad.Cantidad;
import com.banqueteria.recetario.encargo.Encargo;
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
public class DetalleEncargo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_encargo")
    private Encargo encargo;
    
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_producto")
    private Producto producto;
    
    @Column(length = 3)
    private String cantidad;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Encargo getEncargo() {
        return encargo;
    }

    public void setEncargo(Encargo encargo) {
        this.encargo = encargo;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }    
    
}