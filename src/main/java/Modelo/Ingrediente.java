
package Modelo;


public class Ingrediente {
    
    private String nombre;
    private int cantidad;
    private String tipoMedida;

    public Ingrediente() {
    }

    public Ingrediente(String nombre, int cantidad, String tipoMedida) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.tipoMedida = tipoMedida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoMedida() {
        return tipoMedida;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoMedida(String tipoMedida) {
        this.tipoMedida = tipoMedida;
    }
    
    
    
}
