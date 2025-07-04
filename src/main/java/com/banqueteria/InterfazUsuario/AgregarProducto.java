package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.Cantidad;
import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.Categoria;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.detalleencargo.ServicioDetalleEncargo;
import com.banqueteria.recetario.encargo.ServicioEncargo;
import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ListaIngredientes;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.MedidaIngrediente;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.Producto;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AgregarProducto extends javax.swing.JFrame {

    DefaultTableModel tablaIng;
    DefaultTableModel ListaIng;
    List<Ingrediente> ingredientes;
    List<Categoria> categorias;
    List<Cantidad> cantidades;
    List<ListaIngredientes> ListaIngredientes;
    List<ListaIngredientes> ListaIngredientesFiltrado;
    List<MedidaIngrediente> ListaMedIng;
    
    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private ServicioCantidad servicioCantidad;
    private ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;
    private ServicioEncargo servicioEncargo;
    private ServicioDetalleEncargo servicioDetalleEncargo;

    public AgregarProducto(
            ServicioCantidad servicioCantidad,
            ServicioCategoria servicioCategoria,
            ServicioIngrediente servicioIngrediente, 
            ServicioProducto servicioProducto,
            ServicioListaIngredientes servicioListaIngredientes,
            ServicioMedidaIngrediente servicioMedidaIngrediente,
            ServicioEncargo servicioEncargo,
            ServicioDetalleEncargo servicioDetalleEncargo) {
        this.servicioCantidad = servicioCantidad;
        this.servicioCategoria = servicioCategoria;
        this.servicioIngrediente = servicioIngrediente;
        this.servicioProducto = servicioProducto;
        this.servicioListaIngredientes = servicioListaIngredientes;
        this.servicioMedidaIngrediente = servicioMedidaIngrediente;
        this.servicioEncargo = servicioEncargo;
        this.servicioDetalleEncargo = servicioDetalleEncargo;
        initComponents();
        
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        
        llenarTabla();
        llenarCategorias();
    }

    AgregarProducto(){
    
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenuIng = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        popmenuProd = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        PanelAP = new javax.swing.JPanel();
        jPanel_Ingredientes = new javax.swing.JPanel();
        TextoNombre = new javax.swing.JTextField();
        jlbl_NombreProducto = new javax.swing.JLabel();
        jLbl_Categoria = new javax.swing.JLabel();
        CBCategoria = new javax.swing.JComboBox<>();
        jBttn_NuevaCategoria = new javax.swing.JButton();
        jLbl_Ingrediente = new javax.swing.JLabel();
        TextoIng = new javax.swing.JTextField();
        jBttn_NuevoIngrediente = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaIngredientes = new javax.swing.JTable();
        jBttn_ActualizarPantalla = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoReceta = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaListaIng = new javax.swing.JTable();
        jBtn_GuardarProducto = new javax.swing.JButton();
        labelid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textPorcionesProd = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        textPrecioIng = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textPrecioProd = new javax.swing.JTextField();
        jBtn_Cancelar = new javax.swing.JButton();

        popmenuIng.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                popmenuIngMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Agregar a la receta");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        popmenuIng.add(jMenuItem1);

        jMenuItem4.setText("Modificar Ingrediente");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        popmenuIng.add(jMenuItem4);

        jMenuItem2.setText("Editar ingrediente");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        popmenuProd.add(jMenuItem2);

        jMenuItem3.setText("Retirar ingrediente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        popmenuProd.add(jMenuItem3);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelAP.setBackground(new java.awt.Color(220, 209, 199));
        PanelAP.setPreferredSize(new java.awt.Dimension(1200, 800));
        PanelAP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel_Ingredientes.setBackground(new java.awt.Color(159, 173, 138));
        jPanel_Ingredientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel_Ingredientes.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 30));

        jlbl_NombreProducto.setText("Nombre Producto");
        jPanel_Ingredientes.add(jlbl_NombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 30));

        jLbl_Categoria.setText("Categoría ");
        jPanel_Ingredientes.add(jLbl_Categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, 30));

        CBCategoria.setBackground(new java.awt.Color(255, 255, 254));
        CBCategoria.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCategoriaActionPerformed(evt);
            }
        });
        jPanel_Ingredientes.add(CBCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 160, 30));

        jBttn_NuevaCategoria.setBackground(new java.awt.Color(255, 255, 254));
        jBttn_NuevaCategoria.setText("Nueva Categoría");
        jBttn_NuevaCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttn_NuevaCategoriaActionPerformed(evt);
            }
        });
        jPanel_Ingredientes.add(jBttn_NuevaCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 160, -1));

        jLbl_Ingrediente.setText("Ingrediente");
        jPanel_Ingredientes.add(jLbl_Ingrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 30));

        TextoIng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoIngKeyReleased(evt);
            }
        });
        jPanel_Ingredientes.add(TextoIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 160, 30));

        jBttn_NuevoIngrediente.setBackground(new java.awt.Color(255, 255, 254));
        jBttn_NuevoIngrediente.setText("Nuevo Ingrediente");
        jBttn_NuevoIngrediente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttn_NuevoIngredienteActionPerformed(evt);
            }
        });
        jPanel_Ingredientes.add(jBttn_NuevoIngrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 160, -1));

        TablaIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingredientes", "Precio", "Cantidad", "Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaIngredientes.setComponentPopupMenu(popmenuIng);
        TablaIngredientes.setSelectionBackground(new java.awt.Color(159, 173, 138));
        jScrollPane1.setViewportView(TablaIngredientes);
        if (TablaIngredientes.getColumnModel().getColumnCount() > 0) {
            TablaIngredientes.getColumnModel().getColumn(0).setResizable(false);
            TablaIngredientes.getColumnModel().getColumn(1).setResizable(false);
            TablaIngredientes.getColumnModel().getColumn(2).setResizable(false);
            TablaIngredientes.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel_Ingredientes.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 340, 420));

        jBttn_ActualizarPantalla.setBackground(new java.awt.Color(186, 192, 165));
        jBttn_ActualizarPantalla.setText("Actualizar");
        jBttn_ActualizarPantalla.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBttn_ActualizarPantalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttn_ActualizarPantallaActionPerformed(evt);
            }
        });
        jPanel_Ingredientes.add(jBttn_ActualizarPantalla, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 710, 140, 30));

        PanelAP.add(jPanel_Ingredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 770));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Preparación");
        PanelAP.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 340, 30));

        TextoReceta.setColumns(20);
        TextoReceta.setLineWrap(true);
        TextoReceta.setRows(5);
        TextoReceta.setWrapStyleWord(true);
        jScrollPane2.setViewportView(TextoReceta);

        PanelAP.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 70, 340, 320));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Listado de ingredientes");
        PanelAP.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 340, 30));

        TablaListaIng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaListaIng.setComponentPopupMenu(popmenuProd);
        TablaListaIng.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaListaIng.setSelectionBackground(new java.awt.Color(159, 173, 138));
        TablaListaIng.setShowGrid(true);
        jScrollPane3.setViewportView(TablaListaIng);
        if (TablaListaIng.getColumnModel().getColumnCount() > 0) {
            TablaListaIng.getColumnModel().getColumn(0).setResizable(false);
            TablaListaIng.getColumnModel().getColumn(1).setResizable(false);
            TablaListaIng.getColumnModel().getColumn(2).setResizable(false);
        }

        PanelAP.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 340, 610));

        jBtn_GuardarProducto.setBackground(new java.awt.Color(159, 173, 138));
        jBtn_GuardarProducto.setText("Guardar Prodcuto");
        jBtn_GuardarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_GuardarProductoActionPerformed(evt);
            }
        });
        PanelAP.add(jBtn_GuardarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 710, 140, 40));
        PanelAP.add(labelid, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 190, 30));

        jLabel4.setText("Cantidad de porciones");
        PanelAP.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 420, 140, 30));
        PanelAP.add(textPorcionesProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, 160, 30));
        PanelAP.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 490, 340, 10));

        jLabel5.setText("Gasto de ingredientes");
        PanelAP.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 530, 130, 30));

        textPrecioIng.setEditable(false);
        textPrecioIng.setText("0");
        PanelAP.add(textPrecioIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 530, 160, 30));

        jLabel8.setText("Precio del producto");
        PanelAP.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 610, 130, 30));
        PanelAP.add(textPrecioProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 610, 160, 30));

        jBtn_Cancelar.setBackground(new java.awt.Color(159, 173, 138));
        jBtn_Cancelar.setText("Cancelar");
        jBtn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_CancelarActionPerformed(evt);
            }
        });
        PanelAP.add(jBtn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 710, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelAP, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAP, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBttn_NuevaCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttn_NuevaCategoriaActionPerformed
        CrearCategoría crear = new CrearCategoría(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        crear.setVisible(true);
    }//GEN-LAST:event_jBttn_NuevaCategoriaActionPerformed

    private void jBttn_NuevoIngredienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttn_NuevoIngredienteActionPerformed
        CrearIngrediente crear = new CrearIngrediente(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        crear.setVisible(true);
    }//GEN-LAST:event_jBttn_NuevoIngredienteActionPerformed

    private void popmenuIngMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_popmenuIngMouseClicked
       
    }//GEN-LAST:event_popmenuIngMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       CantidadIngrediente abrir = new CantidadIngrediente(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
       abrir.setVisible(true); 
       abrir.setLocation(obtenerPosicionX(), obtenerPosicionY());
       abrir.nombre.setText((String) this.TablaIngredientes.getValueAt(this.TablaIngredientes.getSelectedRow(),0));
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Inicio abrir;
        abrir = new Inicio(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        abrir.setVisible(true);
        dispose();
    }                                                           

    private void TextoIngKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoIngKeyReleased
        String texto = this.TextoIng.getText();
        filtrar(texto);
    }//GEN-LAST:event_TextoIngKeyReleased

    private void jBttn_ActualizarPantallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttn_ActualizarPantallaActionPerformed
        String id = this.labelid.getText();
        String nom = this.TextoNombre.getText();
        int cat = this.CBCategoria.getSelectedIndex();
        String preparacion = this.TextoReceta.getText();
        String porciones = this.textPorcionesProd.getText();
        String precio = this.textPrecioProd.getText();
        
        Double precioS = 0.0;
        List<String[]>IngredientesAgregados = new ArrayList<>();
        for(int i = 0;i<this.TablaListaIng.getRowCount();i++){
            String ingrediente = (String) TablaListaIng.getValueAt(i, 0);
            String cantidad = (String) TablaListaIng.getValueAt(i, 1);
            String medida = (String) TablaListaIng.getValueAt(i, 2);
            String [] dato = {ingrediente,cantidad,medida};
            IngredientesAgregados.add(dato);
            
            Long idmedida = obtenerIngrediente(ingrediente).getMedidaingrediente().getId();
            String medida2 = obtenerMedidaIngrediente(idmedida);
            int cantidadIng = Integer.parseInt(obtenerIngrediente(ingrediente).getCantidad());
            double precioIng = Double.parseDouble(obtenerIngrediente(ingrediente).getPrecio());
            
            precioS = redondear(precioS + obtenerPrecio(medida,medida2,corregirDecimales(cantidad),precioIng,cantidadIng));
            
        }
        
        AgregarProducto abrir = new AgregarProducto(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        
        abrir.labelid.setText(id);
        abrir.TextoNombre.setText(nom);
        abrir.CBCategoria.setSelectedIndex(cat);
        tablaIng = (DefaultTableModel) this.TablaListaIng.getModel();
        for(int i = 0;i<IngredientesAgregados.size();i++){
            tablaIng.addRow(IngredientesAgregados.get(i));
        }
        abrir.TextoReceta.setText(preparacion);
        abrir.textPorcionesProd.setText(porciones);
        abrir.textPrecioIng.setText(String.valueOf(precioS));
        abrir.textPrecioProd.setText(precio);
        
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBttn_ActualizarPantallaActionPerformed

    private void jBtn_GuardarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_GuardarProductoActionPerformed
        
        ListaIngredientesFiltrado = new ArrayList<>();
        
        if(validaciones()){
            //Si todos los campos están llenos, comienzo a guardar la información del producto
            String nombreProd = this.TextoNombre.getText();
            String receta = this.TextoReceta.getText();
            String porciones = this.textPorcionesProd.getText();
            String precio = this.textPrecioProd.getText();
        
            String cat = this.CBCategoria.getSelectedItem().toString();
            Categoria c = new Categoria();
            c.setId(buscarCategoria(cat).getId());
            c.setDetalle(cat);
        
            Producto p = new Producto();
            p.setNombre(nombreProd);
            p.setReceta(receta);
            p.setCategoria(c);
            p.setPorciones(porciones);
            p.setPrecio(precio);
            
            if(!this.labelid.getText().isEmpty()){
                //En caso de que exista un id, guardo el dato y luego actualizo el producto
                Long id = Long.parseLong(this.labelid.getText());
                p.setId(id);
                
                servicioProducto.save(p);     
                //Traigo un listado de todos los ingredientes de todos los productos, y los filtro para ese producto en particular
                ListaIngredientes = servicioListaIngredientes.getAll();
                    
                for(ListaIngredientes listIng : ListaIngredientes){
                    if(listIng.getProducto().getId().equals(id)){
                        ListaIngredientesFiltrado.add(listIng);
                    }
                }
                
                List<Long> ingredientesEnTabla = new ArrayList<>();
                //Creo una lista y la lleno con los ingredientes de la tabla que hay en ese momento
                for (int i = 0; i < ListaIng.getRowCount(); i++) {
                    String nombreIng = (String) ListaIng.getValueAt(i, 0);
                    Long idIng = buscarIngrediente(nombreIng).getId();
                    ingredientesEnTabla.add(idIng);
                }
                //Comparo los ingredientes de la tabla (ingredientesEnTabla) vs los ingredientes bajados de la base de datos (ListaIngredientesFiltrado)
                //Si algún ingrediente que está en la base de datos, no está en la tabla, se elimina de la base de datos
                for (ListaIngredientes existente : ListaIngredientesFiltrado) {
                    Long idIngExistente = existente.getIngrediente().getId();
                    if (!ingredientesEnTabla.contains(idIngExistente)) {
                        servicioListaIngredientes.delete(existente.getId());
                    }
                }
                //Recorro la tabla y creo un nuevo objeto del tipo "ListaIngredientes"
                for (int i = 0; i < ListaIng.getRowCount(); i++) {
                    Ingrediente ing = new Ingrediente();
                    String nombreIng = (String) ListaIng.getValueAt(i, 0);
                    ing.setId(buscarIngrediente(nombreIng).getId());
                    ing.setNombre(nombreIng);

                    String cantidad = (String) ListaIng.getValueAt(i, 1);

                    Cantidad m = new Cantidad();
                    String medida = (String) ListaIng.getValueAt(i, 2);
                    m.setId(buscarCantidadUsoIngredientes(medida).getId());
                    m.setDescripcion(medida);

                    ListaIngredientes li = new ListaIngredientes();
                    li.setCantidad(cantidad);
                    li.setIngrediente(ing);
                    li.setMedida(m);
                    li.setProducto(p);

                    boolean encontrado = false;
                    //Si el objeto se encuentra en la base de datos, obtengo su id
                    for (ListaIngredientes lif : ListaIngredientesFiltrado) {
                        if (lif.getIngrediente().getId().equals(ing.getId())) {
                            li.setId(lif.getId());
                            encontrado = true;
                            //Si el objeto encontrado tiene el valor de cantidad o medida diferente a la base de datos, el objeto se actualiza
                            if (!lif.getCantidad().equals(li.getCantidad()) ||
                                !lif.getMedida().getId().equals(li.getMedida().getId())) {
                                servicioListaIngredientes.save(li);
                            }
                            //Si el objeto encontrado en la base de datos tiene toda su información igual, no se hace nada
                            break;
                        }
                    }
                    //Si el objeto no se encuentra en la base de datos, se agrega
                    if(!encontrado){
                        servicioListaIngredientes.save(li);
                    }
                    
                }    
                
            } else {
                //Si no existe un valor de id, se guarda la información del producto y se vuelve a la ventana de inicio
                servicioProducto.save(p);       
        
                for(int i=0;i<ListaIng.getRowCount();i++){
                    Ingrediente ing = new Ingrediente();
                    String nombreing = (String) ListaIng.getValueAt(i,0);
                    ing.setId(buscarIngrediente(nombreing).getId());
                    ing.setNombre(nombreing);
            
                    String cantidad = (String) ListaIng.getValueAt(i,1);
            
                    Cantidad m = new Cantidad();
                    String medida = (String) ListaIng.getValueAt(i,2);
                    m.setId(buscarCantidadUsoIngredientes(medida).getId());
                    m.setDescripcion(medida);
            
                    ListaIngredientes li = new ListaIngredientes();
                    li.setCantidad(cantidad);
                    li.setIngrediente(ing);
                    li.setMedida(m);
                    li.setProducto(p);
                    servicioListaIngredientes.save(li);

                }
                            
            }  
            
            Inicio abrir = new Inicio(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
            abrir.setVisible(true);
            dispose();
            
        }
        
        
        
    }//GEN-LAST:event_jBtn_GuardarProductoActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        String nombre = (String) this.TablaListaIng.getValueAt(this.TablaListaIng.getSelectedRow(), 0);
        String cantidad = (String) this.TablaListaIng.getValueAt(this.TablaListaIng.getSelectedRow(), 1);
        double cant = corregirDecimales(cantidad);
        double precioIng = Double.parseDouble(obtenerIngrediente(nombre).getPrecio());
        Long id = obtenerIngrediente(nombre).getMedidaingrediente().getId();
        String medida = obtenerMedidaIngrediente(id);
        int cantidadIng = Integer.parseInt(obtenerIngrediente(nombre).getCantidad());
        
        double precioProd = obtenerPrecio((String) this.TablaListaIng.getValueAt(this.TablaListaIng.getSelectedRow(), 2),
                                                       medida,
                                                       cant,
                                                       precioIng,
                                                       cantidadIng);
        double precioProdfinal = redondear(precioProd);        
        
        CantidadIngrediente2 abrir = new CantidadIngrediente2(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        abrir.setVisible(true); 
        abrir.setLocation(obtenerPosicionX(), obtenerPosicionY());
        abrir.nombre.setText((String) this.TablaListaIng.getValueAt(this.TablaListaIng.getSelectedRow(), 0));
        abrir.textprecioingrediente.setText(String.valueOf(precioProdfinal));
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

        String nombre = (String) this.TablaListaIng.getValueAt(this.TablaListaIng.getSelectedRow(), 0);
        String cantidad = (String) this.TablaListaIng.getValueAt(this.TablaListaIng.getSelectedRow(), 1);
        double cant = corregirDecimales(cantidad);
        double precioIng = Double.parseDouble(obtenerIngrediente(nombre).getPrecio());
        Long id = obtenerIngrediente(nombre).getMedidaingrediente().getId();
        String medida = obtenerMedidaIngrediente(id);
        int cantidadIng = Integer.parseInt(obtenerIngrediente(nombre).getCantidad());
        
        double precioProd = Double.parseDouble(this.textPrecioIng.getText());
        precioProd = precioProd - obtenerPrecio((String) this.TablaListaIng.getValueAt(this.TablaListaIng.getSelectedRow(), 2),
                                                       medida,
                                                       cant,
                                                       precioIng,
                                                       cantidadIng);
        double precioProdfinal = redondear(precioProd);
        
        tablaIng = (DefaultTableModel) this.TablaListaIng.getModel();
        servicioListaIngredientes.delete(buscarIngrediente((String) this.TablaListaIng.getValueAt(this.TablaListaIng.getSelectedRow(), 0)).getId());
        tablaIng.removeRow(this.TablaListaIng.getSelectedRow());
        this.textPrecioIng.setText(String.valueOf(precioProdfinal));
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        String nombre = this.TablaIngredientes.getValueAt(this.TablaIngredientes.getSelectedRow(),0).toString();
        String precio = this.TablaIngredientes.getValueAt(this.TablaIngredientes.getSelectedRow(),1).toString();
        String cantidad = this.TablaIngredientes.getValueAt(this.TablaIngredientes.getSelectedRow(),2).toString();
        String medida = this.TablaIngredientes.getValueAt(this.TablaIngredientes.getSelectedRow(),3).toString();
        String id = String.valueOf(obtenerIngrediente(nombre).getId());
        
        
        
        CrearIngrediente abrir = new CrearIngrediente(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        abrir.setVisible(true);
        
        abrir.textnombre.setText(nombre);
        abrir.textprecio.setText(precio);
        abrir.cantidad.setValue(Integer.parseInt(cantidad));
        int index = 0;
            for(int a = 0;a<abrir.cbcanting.getItemCount();a++){
                if(abrir.cbcanting.getItemAt(index).equals(medida)){
                    abrir.cbcanting.setSelectedIndex(index);
                }else{
                    index = index + 1;
                }
            }
        abrir.labelid.setText(id);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed
    private void CBCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCategoriaActionPerformed

    private void jBtn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_CancelarActionPerformed
        
        Inicio abrir = new Inicio(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        
        abrir.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jBtn_CancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> CBCategoria;
    public static javax.swing.JPanel PanelAP;
    private javax.swing.JTable TablaIngredientes;
    public static javax.swing.JTable TablaListaIng;
    public static javax.swing.JTextField TextoIng;
    public static javax.swing.JTextField TextoNombre;
    public static javax.swing.JTextArea TextoReceta;
    private javax.swing.JButton jBtn_Cancelar;
    private javax.swing.JButton jBtn_GuardarProducto;
    private javax.swing.JButton jBttn_ActualizarPantalla;
    private javax.swing.JButton jBttn_NuevaCategoria;
    private javax.swing.JButton jBttn_NuevoIngrediente;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLbl_Categoria;
    private javax.swing.JLabel jLbl_Ingrediente;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel_Ingredientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jlbl_NombreProducto;
    public static javax.swing.JLabel labelid;
    private javax.swing.JPopupMenu popmenuIng;
    private javax.swing.JPopupMenu popmenuProd;
    public static javax.swing.JTextField textPorcionesProd;
    public static javax.swing.JTextField textPrecioIng;
    public static javax.swing.JTextField textPrecioProd;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla (){    
        
        tablaIng = (DefaultTableModel) this.TablaIngredientes.getModel();
        
        while(tablaIng.getRowCount()>0)tablaIng.removeRow(0);
        
        String nombre;
        String precio;
        String cantidad;
        String medida;
        ingredientes = servicioIngrediente.getAll();
        
        for(int i = 0; i<ingredientes.size();i++){
            nombre = ingredientes.get(i).getNombre();
            precio = ingredientes.get(i).getPrecio();
            cantidad = ingredientes.get(i).getCantidad();
            medida = obtenerMedidaIngrediente(ingredientes.get(i).getMedidaingrediente().getId());
            String[] dato = {nombre, precio, cantidad, medida};
            tablaIng.addRow(dato);
        }
        
    }

    private int obtenerPosicionY(){
        Point mouse1 = this.PanelAP.getMousePosition();
        Point mouse2 = this.PanelAP.getLocationOnScreen();
        int y = mouse1.y + mouse2.y;
        return y;
    }

    private int obtenerPosicionX(){
        Point mouse1 = this.PanelAP.getMousePosition();
        Point mouse2 = this.PanelAP.getLocationOnScreen();
        int x = mouse1.x + mouse2.x;
        return x;
    }

    public void llenarCategorias(){
        
        this.CBCategoria.removeAllItems();    
    
        categorias = servicioCategoria.getAll();
        for(int i=0;i<categorias.size();i++){
            this.CBCategoria.addItem(categorias.get(i).getDetalle());
        }
        
    }
    
    private void filtrar(String texto){
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tablaIng);
        this.TablaIngredientes.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(texto));
        
    }
    
    private Categoria buscarCategoria(String nombre){
    
        for(int i=0;i<categorias.size();i++){
            if(categorias.get(i).getDetalle().equals(nombre)){
                return categorias.get(i);
            }
        }
        return null;
    }
    
    private Ingrediente buscarIngrediente(String nombre){
    
        for(int i=0;i<ingredientes.size();i++){
            if(ingredientes.get(i).getNombre().equals(nombre)){
                return ingredientes.get(i);
            }
        }        
        return null;
    }

    private Cantidad buscarCantidadUsoIngredientes(String nombre){
        
        cantidades = servicioCantidad.getAll();
        
        for(int i=0;i<cantidades.size();i++){
            if(cantidades.get(i).getDescripcion().equals(nombre)){
                return cantidades.get(i);
            }
        }
        return null;
    }
    
    private Ingrediente obtenerIngrediente(String nombre){
    
        List<Ingrediente> ing = new ArrayList<>();
        ing = servicioIngrediente.getAll();
        for(Ingrediente i : ing){
            if(i.getNombre().equals(nombre)){
                return i;
            }
        }
        return null;
    }
    
    private String obtenerMedidaIngrediente(Long id){
    
        ListaMedIng = servicioMedidaIngrediente.getAll();
        for(MedidaIngrediente mi : ListaMedIng){
            if(mi.getId().equals(id)){
                return mi.getDetalle();
            }
        }
        return null;
    }
    
    private double obtenerPrecio(String desde, String hasta, double cantidad, double precio, int cantidadIng){
    
        switch (desde) {
            case "taza":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 250;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        cantidad = cantidad * 0.25;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        cantidad = cantidad * 125;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        cantidad = cantidad * 0.125;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "unidad":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            case "unidad":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;;
                        return precio;
                    case "unidad":
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            case "cucharada":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 15;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        cantidad = cantidad * 0.015;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "unidad":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            case "criterio propio":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "unidad":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            case "mililitro":
                switch (hasta) {
                    case "mililitro":
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        cantidad = cantidad * 0.001;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "unidad":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            case "litro":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 1000;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "unidad":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            case "gramos":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        cantidad = cantidad * 0.001;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "unidad":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            case "kilo":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        cantidad = cantidad * 1000;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "unidad":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            case "diente":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "litro":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "gramos":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "kilo":
                        cantidad = cantidad * 0;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    case "unidad":
                        cantidad = cantidad * 0.2;
                        precio = (precio * cantidad)/cantidadIng;
                        return precio;
                    default:
                        throw new AssertionError();
                }
            default:
                throw new AssertionError();
        }
        
    }

    private double corregirDecimales(String cantidad){
    
        cantidad = cantidad.trim();
        
        if(cantidad.matches("\\d+\\s+\\d+/\\d+")){
            
            String[] partes = cantidad.split("\\s+");
            double entero = Double.parseDouble(partes[0]);
            String[] fraccion = partes[1].split("/");
            double numerador = Double.parseDouble(fraccion[0]);
            double denominador = Double.parseDouble(fraccion[1]);
            return entero + (numerador / denominador);
            
        }else if(cantidad.matches("\\d+/\\d+")){
        
            String[] fraccion = cantidad.split("/");
            double numerador = Double.parseDouble(fraccion[0]);
            double denominador = Double.parseDouble(fraccion[1]);
            return numerador / denominador;
        
        }else{
        
            return Double.parseDouble(cantidad);
            
        }
        
    }
    
    private double redondear(double valor){
        
        double redondeado = Math.round(valor * 10.0) / 10.0;
        return redondeado;
    }
    
    private boolean validaciones(){
        
        ListaIng = (DefaultTableModel) this.TablaListaIng.getModel();
        int filas = this.ListaIng.getRowCount();
        
        if(this.TextoNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"El producto debe tener un nombre","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(this.TextoReceta.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"El producto debe tener una preparación","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(filas==0){
            JOptionPane.showMessageDialog(null,"El producto debe tener al menos un ingrediente","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(this.textPorcionesProd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"El producto debe especificar una cantidad de porciones","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(!this.textPorcionesProd.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(null,"Las porciones sólo pueden ser de caracter numércio","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(this.textPrecioProd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"El producto debe tener un precio","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(!this.textPrecioProd.getText().matches("\\d+")){
            JOptionPane.showMessageDialog(null,"El precio debe ser de caracter numérico","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            return true;
        }
    }
    
}


