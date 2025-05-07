package com.banqueteria.recetario.receta;

import com.banqueteria.InterfazUsuario.InterfazUsuario;
import javax.swing.SwingUtilities;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class RecetaApplication {

	public static void main(String[] args) {
            System.setProperty("java.awt.headless", "false");
                    System.out.println("SI SIGUE CRASHEANDO ACA ME PEGO UN TIRO");
                ConfigurableApplicationContext context = SpringApplication.run(RecetaApplication.class, args);
                
                System.out.println("partio Spring ahora parte el servicio");
                ServicioReceta servicioReceta = context.getBean(ServicioReceta.class);
                    
                System.out.println("AVER SI SALTA ESTA ESTUPIDEZ DE");
            SwingUtilities.invokeLater(() -> {
            new InterfazUsuario(servicioReceta).setVisible(true);
                System.out.println("SE SUPONE QUE PARTE LA VENTANA DESGRACIADA");
        });
    }
}


