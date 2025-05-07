package com.banqueteria.recetario.receta;


import com.banqueteria.InterfazUsuario.InterfazUsuario;
import javax.swing.SwingUtilities;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class Main {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RecetaApplication.class, args);
        ServicioReceta servicioReceta = context.getBean(ServicioReceta.class);

        SwingUtilities.invokeLater(() -> {
            new InterfazUsuario(servicioReceta).setVisible(true);
        });
    }
}