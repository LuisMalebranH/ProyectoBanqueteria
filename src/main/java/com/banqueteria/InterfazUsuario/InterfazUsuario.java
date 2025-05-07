/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.receta.Receta;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import com.banqueteria.recetario.receta.ServicioReceta;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 *
 * @author Baxkill
 */
public class InterfazUsuario extends JFrame {
    private ServicioReceta service;

    public InterfazUsuario(ServicioReceta service) {
        this.service = service;

        setTitle("Recipe Manager");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JButton loadButton = new JButton("Load Recipes");
        JTextArea area = new JTextArea();

        loadButton.addActionListener(e -> {
            List<Receta> recetas = service.getAll();
            area.setText("");
            for (Receta r : recetas) {
                area.append(r.getNombre() + "\n");
            }
        });

        add(loadButton, BorderLayout.NORTH);
        add(new JScrollPane(area), BorderLayout.CENTER);
    }
}