package com.banqueteria.recetario.receta;



import com.banqueteria.InterfazUsuario.Inicio;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.producto.ServicioProducto;
import javax.swing.SwingUtilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = {"com.banqueteria.recetario.ingrediente", "com.banqueteria.recetario.receta", "com.banqueteria.recetario.producto"})
@EnableJpaRepositories(basePackages = {
    "com.banqueteria.recetario.ingrediente",
    "com.banqueteria.recetario.producto",
    "com.banqueteria.recetario.receta"
})
@EntityScan(basePackages = "com.banqueteria.recetario")
public class RecetaApplication {

	public static void main(String[] args) {
            System.setProperty("java.awt.headless", "false");
                    System.out.println("SI SIGUE CRASHEANDO ACA ME PEGO UN TIRO");
                ConfigurableApplicationContext context = SpringApplication.run(RecetaApplication.class, args);
                
                System.out.println("partio Spring ahora parte el servicio");
                ServicioReceta servicioReceta = context.getBean(ServicioReceta.class);
                ServicioIngrediente servicioIngrediente = context.getBean(ServicioIngrediente.class);
                ServicioProducto servicioProducto = context.getBean(ServicioProducto.class);
                
                System.out.println("AVER SI SALTA ESTA ESTUPIDEZ DE");
            SwingUtilities.invokeLater(() -> {
            new Inicio(servicioReceta, servicioIngrediente, servicioProducto).setVisible(true);
                System.out.println("SE SUPONE QUE PARTE LA VENTANA DESGRACIADA");
        });
    }
}


