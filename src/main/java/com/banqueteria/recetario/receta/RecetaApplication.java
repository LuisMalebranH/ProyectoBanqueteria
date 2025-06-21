package com.banqueteria.recetario.receta;



import com.banqueteria.InterfazUsuario.Inicio;
import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.ServicioProducto;
import javax.swing.SwingUtilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {
    "com.banqueteria.recetario.cantidad",
    "com.banqueteria.recetario.ingrediente",
    "com.banqueteria.recetario.producto",
    "com.banqueteria.recetario.categoria",
    "com.banqueteria.recetario.listaingredientes",
    "com.banqueteria.recetario.medidaingredientes"})
@EnableJpaRepositories(basePackages = {
    "com.banqueteria.recetario.cantidad",
    "com.banqueteria.recetario.ingrediente",
    "com.banqueteria.recetario.producto",
    "com.banqueteria.recetario.categoria",
    "com.banqueteria.recetario.listaingredientes",
    "com.banqueteria.recetario.medidaingredientes"})
@EntityScan(basePackages = "com.banqueteria.recetario")
public class RecetaApplication {

	public static void main(String[] args) {
            System.setProperty("java.awt.headless", "false");
                    System.out.println("SI SIGUE CRASHEANDO ACA ME PEGO UN TIRO");
                ConfigurableApplicationContext context = SpringApplication.run(RecetaApplication.class, args);
                
                System.out.println("partio Spring ahora parte el servicio");
                ServicioCantidad servicioCantidad = context.getBean(ServicioCantidad.class);
                ServicioIngrediente servicioIngrediente = context.getBean(ServicioIngrediente.class);
                ServicioProducto servicioProducto = context.getBean(ServicioProducto.class);
                ServicioCategoria servicioCategoria = context.getBean(ServicioCategoria.class);
                ServicioListaIngredientes servicioListaIngredientes = context.getBean(ServicioListaIngredientes.class);
                ServicioMedidaIngrediente servicioMedidaIngrediente = context.getBean(ServicioMedidaIngrediente.class);
                
                System.out.println("AVER SI SALTA ESTA ESTUPIDEZ DE");
            SwingUtilities.invokeLater(() -> {
            new Inicio(servicioCantidad,servicioCategoria,servicioIngrediente,servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente).setVisible(true);
                System.out.println("SE SUPONE QUE PARTE LA VENTANA DESGRACIADA");
        });
    }
}


