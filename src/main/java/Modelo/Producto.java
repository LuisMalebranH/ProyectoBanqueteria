
package Modelo;


public class Producto {
    
    private String nombre;
    private String categoria;
    private String receta;

    public Producto() {
    }

    public Producto(String nombre, String categoria, String receta) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.receta = receta;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getReceta() {
        return receta;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setReceta(String receta) {
        this.receta = receta;
    }
    
    
    
}
