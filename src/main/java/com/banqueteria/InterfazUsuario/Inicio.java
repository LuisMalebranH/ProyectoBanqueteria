package com.banqueteria.InterfazUsuario;


import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.Categoria;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.producto.Producto;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.awt.Image;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Inicio extends javax.swing.JFrame {
    
    DefaultTableModel tabla;
    List<Producto> productos;
    List<Producto> productosFiltrados;
    List<Categoria> categoria;
    
    private ServicioCantidad servicioCantidad;
    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;

    public Inicio(
            ServicioCantidad servicioCantidad,
            ServicioCategoria servicioCategoria,
            ServicioIngrediente servicioIngrediente, 
            ServicioProducto servicioProducto,
            ServicioListaIngredientes servicioListaIngredientes) {
        this.servicioCantidad = servicioCantidad;
        this.servicioCategoria = servicioCategoria;
        this.servicioIngrediente = servicioIngrediente;
        this.servicioProducto = servicioProducto;
        this.servicioListaIngredientes = servicioListaIngredientes;
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setSize(1200, 800);
        
        corregirImagen(this.labeld,"src/main/resources/static/imagend.png");
        corregirImagen(this.labeli,"src/main/resources/static/imageni.png");
        
        llenarCategorias();
        llenarTablaInicio();
        llenarProducto();
        
        ListSelectionModel model = TablaProductos.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener(){
            public void ValueChanged(ListSelectionEvent e){
                
            }

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                    int filaSeleccionada = TablaProductos.getSelectedRow();
                    if(filaSeleccionada != -1){
                        String nom = TablaProductos.getValueAt(filaSeleccionada, 0).toString();
                        String receta = buscarProducto(nom).getReceta();
                        String nombre = buscarProducto(nom).getNombre();
                        TextoPreparacion.setText(receta);
                        LabelNombreProd.setText(nombre);
                    }
                }
            }
        });
        
    }

    Inicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        PanelFondo = new javax.swing.JPanel();
        PanelCalculo = new javax.swing.JPanel();
        labeli = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cat1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cat2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cat3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cat4 = new javax.swing.JLabel();
        labeld = new javax.swing.JLabel();
        TextBuscarProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        PanelProducto = new javax.swing.JPanel();
        LabelNombreProd = new javax.swing.JLabel();
        TextoIngredientes = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        TextoReceta = new javax.swing.JScrollPane();
        TextoPreparacion = new javax.swing.JTextArea();
        btnAgregarProd = new javax.swing.JButton();
        btnIniCalculo = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setPreferredSize(new java.awt.Dimension(1200, 800));
        PanelFondo.setRequestFocusEnabled(false);
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCalculo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelCalculo.setPreferredSize(new java.awt.Dimension(100, 780));
        PanelCalculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PanelCalculoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PanelCalculoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout PanelCalculoLayout = new javax.swing.GroupLayout(PanelCalculo);
        PanelCalculo.setLayout(PanelCalculoLayout);
        PanelCalculoLayout.setHorizontalGroup(
            PanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelCalculoLayout.setVerticalGroup(
            PanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelFondo.add(PanelCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 730));

        labeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/imageni.png"))); // NOI18N
        labeli.setAutoscrolls(true);
        labeli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeli.setPreferredSize(new java.awt.Dimension(35, 15));
        labeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labeliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeliMouseExited(evt);
            }
        });
        PanelFondo.add(labeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 100));

        cat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat1, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        PanelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 140, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 100));

        cat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat2, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat2, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        PanelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 150, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 100));

        cat3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat3, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        PanelFondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 150, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 100));

        cat4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        PanelFondo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 150, -1));

        labeld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/imagend.png"))); // NOI18N
        labeld.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labeld.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeld.setPreferredSize(new java.awt.Dimension(35, 15));
        labeld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labeldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeldMouseExited(evt);
            }
        });
        PanelFondo.add(labeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 50, -1, 100));

        TextBuscarProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextBuscarProdMouseClicked(evt);
            }
        });
        TextBuscarProd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextBuscarProdKeyReleased(evt);
            }
        });
        PanelFondo.add(TextBuscarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(951, 180, 200, -1));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productos"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        PanelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 350, 450));

        PanelProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelNombreProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNombreProd.setText("Nombre Producto");
        LabelNombreProd.setToolTipText("");

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        TextoIngredientes.setViewportView(jTextArea1);

        TextoPreparacion.setEditable(false);
        TextoPreparacion.setColumns(20);
        TextoPreparacion.setRows(5);
        TextoReceta.setViewportView(TextoPreparacion);

        javax.swing.GroupLayout PanelProductoLayout = new javax.swing.GroupLayout(PanelProducto);
        PanelProducto.setLayout(PanelProductoLayout);
        PanelProductoLayout.setHorizontalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TextoReceta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                    .addComponent(TextoIngredientes, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(10, 10, 10))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProductoLayout.createSequentialGroup()
                .addComponent(LabelNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        PanelProductoLayout.setVerticalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(LabelNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(TextoIngredientes, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextoReceta, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelFondo.add(PanelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 340, 450));

        btnAgregarProd.setText("Agregar Producto");
        btnAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdActionPerformed(evt);
            }
        });
        PanelFondo.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 710, 170, -1));

        btnIniCalculo.setText("Iniciar Cálculo");
        PanelFondo.add(btnIniCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 710, 170, -1));

        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        PanelFondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelCalculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCalculoMouseEntered
        this.PanelCalculo.setSize(300, 680);        
    }//GEN-LAST:event_PanelCalculoMouseEntered

    private void PanelCalculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCalculoMouseExited
        this.PanelCalculo.setSize(100, 680);        
    }//GEN-LAST:event_PanelCalculoMouseExited

    private void labeldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeldMouseEntered
        this.labeld.setBorder(new BevelBorder(0));
    }//GEN-LAST:event_labeldMouseEntered

    private void TextBuscarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBuscarProdMouseClicked
        llenarTabla();
        this.TextBuscarProd.setText("");
    }//GEN-LAST:event_TextBuscarProdMouseClicked

    private void btnAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdActionPerformed
        AgregarProducto abrir = new AgregarProducto(
                servicioCantidad,servicioCategoria,
                servicioIngrediente,servicioProducto, servicioListaIngredientes);
        abrir.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnAgregarProdActionPerformed

    private void labeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeliMouseClicked
        Categoria c = new Categoria();
        
        c.setId(categoria.get(0).getId());
        c.setDetalle(categoria.get(0).getDetalle());
        
        categoria.remove(0);
        
        reordenarCategorias();
        
        categoria.add(c);
    }//GEN-LAST:event_labeliMouseClicked

    private void TextBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBuscarProdKeyReleased
        String texto = this.TextBuscarProd.getText();
        filtrar(texto);
    }//GEN-LAST:event_TextBuscarProdKeyReleased

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked

    }//GEN-LAST:event_TablaProductosMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jPopupMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseClicked

    }//GEN-LAST:event_jPopupMenu1MouseClicked

    private void labeliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeliMouseEntered
        this.labeli.setBorder(new BevelBorder(0));
    }//GEN-LAST:event_labeliMouseEntered

    private void labeliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeliMouseExited
        this.labeli.setBorder(new EtchedBorder());
    }//GEN-LAST:event_labeliMouseExited

    private void labeldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeldMouseExited
        this.labeld.setBorder(new EtchedBorder());
    }//GEN-LAST:event_labeldMouseExited

    private void labeldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeldMouseClicked
        Categoria cn = new Categoria();
        Categoria cv = new Categoria();
        Categoria cu = new Categoria();

        cu = categoria.getLast();
        cv = categoria.get(0);

        for(int i = 0;i<categoria.size()-1;i++){
            cn = cv;
            cv = categoria.get(i+1);
            categoria.set(i+1, cn);
        }
        
        categoria.set(0, cu);
        
        reordenarCategorias();
    }//GEN-LAST:event_labeldMouseClicked

    private void cat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat1MouseClicked
        String categoria = this.cat1.getText();
        llenarTablaPorCategoria(categoria);
    }//GEN-LAST:event_cat1MouseClicked

    private void cat2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat2MouseClicked
        String categoria = this.cat2.getText();
        llenarTablaPorCategoria(categoria);
    }//GEN-LAST:event_cat2MouseClicked

    private void cat3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat3MouseClicked
        String categoria = this.cat3.getText();
        llenarTablaPorCategoria(categoria);
    }//GEN-LAST:event_cat3MouseClicked

    private void cat4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat4MouseClicked
        String categoria = this.cat4.getText();
        llenarTablaPorCategoria(categoria);
    }//GEN-LAST:event_cat4MouseClicked

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNombreProd;
    private javax.swing.JPanel PanelCalculo;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTextField TextBuscarProd;
    private javax.swing.JScrollPane TextoIngredientes;
    private javax.swing.JTextArea TextoPreparacion;
    private javax.swing.JScrollPane TextoReceta;
    private javax.swing.JButton btnAgregarProd;
    private javax.swing.JButton btnIniCalculo;
    private javax.swing.JLabel cat1;
    private javax.swing.JLabel cat2;
    private javax.swing.JLabel cat3;
    private javax.swing.JLabel cat4;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labeld;
    private javax.swing.JLabel labeli;
    // End of variables declaration//GEN-END:variables

    private void corregirImagen(JLabel label, String root){
    
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
            image.getImage().getScaledInstance(
                label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        
    }
        
    private void llenarTablaInicio(){
        
        String nomcat=this.cat1.getText();
        String dato;
        
        productos = servicioProducto.getAllProducto();
        
        if(productos.isEmpty()){
            dato = "lista vacía";
            String[] prod = {dato};
            tabla = (DefaultTableModel) this.TablaProductos.getModel();
            tabla.addRow(prod);
        }else{
//            for(int i=0;i<productos.size();i++){
//                if(!productos.get(i).getCategoria().getId().equals(filtrarCategoria(nomcat))){
//                    productos.remove(i);
//                }
//            }
            
            for (int i = 0; i<productos.size();i++){
                dato = productos.get(i).getNombre();
                String[] prod = {dato};
                tabla = (DefaultTableModel) this.TablaProductos.getModel();
                tabla.addRow(prod);
            }
            
        }
           
    }
    
    private void llenarTabla(){
        
        tabla = (DefaultTableModel) this.TablaProductos.getModel();
        
        while(tabla.getRowCount()>0)tabla.removeRow(0);
        
        String dato;  
        
        productos = servicioProducto.getAllProducto();
        
        for (int i = 0; i<productos.size();i++){
            dato = productos.get(i).getNombre();
            String[] prod = {dato};
            tabla = (DefaultTableModel) this.TablaProductos.getModel();
            tabla.addRow(prod);
        }
    
    }
    
    private void llenarTablaPorCategoria(String categoria){
        
        tabla = (DefaultTableModel) this.TablaProductos.getModel();
        
        while(tabla.getRowCount()>0)tabla.removeRow(0);
        
        String dato;
        
        productos = servicioProducto.getAllProducto();
        productosFiltrados = new ArrayList();
        
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getCategoria().getId().equals(filtrarCategoria(categoria))){
                productosFiltrados.add(productos.get(i));
            }
        }   
        
        for (int i = 0; i<productosFiltrados.size();i++){
            dato = productosFiltrados.get(i).getNombre();
            String[] prod = {dato};
            tabla = (DefaultTableModel) this.TablaProductos.getModel();
            tabla.addRow(prod);
        }
    
    }
    
    private Long filtrarCategoria(String nomcat){
        
        Categoria c = new Categoria();
        Long id = null;
        
        for(int i=0;i<categoria.size();i++){
            if(categoria.get(i).getDetalle().equals(nomcat)){
                c = categoria.get(i);
                id = c.getId();
            }
        }
        
        return id;
        
    }

    private void llenarProducto(){
        
        if(productos.isEmpty()){
            this.TextoPreparacion.setText("");
            this.LabelNombreProd.setText("Nombre Producto");
        }else{
            String receta = productos.get(0).getReceta();
            String nombre  = productos.get(0).getNombre();
            this.TextoPreparacion.setText(receta);
            this.LabelNombreProd.setText(nombre);
        }
        
    }
    
    private void llenarCategorias(){
    
        categoria = servicioCategoria.getAll();
        
        if (categoria.size()<5){
            this.labeli.setVisible(false);
            this.labeld.setVisible(false);
            switch (categoria.size()) {
                case 1:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    break;
                case 2:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    break;
                case 3:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    this.cat3.setText(categoria.get(2).getDetalle());
                    break;
                case 4: 
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    this.cat3.setText(categoria.get(2).getDetalle());
                    this.cat4.setText(categoria.get(3).getDetalle());
                    break;
                default:
                    break;
            }
            
        } else {
            this.labeli.setVisible(true);
            this.labeld.setVisible(true);
            this.cat1.setText(categoria.get(0).getDetalle());
            this.cat2.setText(categoria.get(1).getDetalle());
            this.cat3.setText(categoria.get(2).getDetalle());
            this.cat4.setText(categoria.get(3).getDetalle());
        }
    
    }
    
    private void reordenarCategorias(){
        
        if (categoria.size()<5){
            switch (categoria.size()) {
                case 1:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    break;
                case 2:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    break;
                case 3:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    this.cat3.setText(categoria.get(2).getDetalle());
                    break;
                case 4: 
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    this.cat3.setText(categoria.get(2).getDetalle());
                    this.cat4.setText(categoria.get(3).getDetalle());
                    break;
                default:
                    break;
            }
            
        } else {
            this.labeli.setVisible(true);
            this.labeld.setVisible(true);
            this.cat1.setText(categoria.get(0).getDetalle());
            this.cat2.setText(categoria.get(1).getDetalle());
            this.cat3.setText(categoria.get(2).getDetalle());
            this.cat4.setText(categoria.get(3).getDetalle());
        }
    
    }

    private void filtrar(String texto){
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tabla);
        this.TablaProductos.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(texto));
        
    }
    
    private void listarIngredientes(){
        
        
    
    }
    
    private Producto buscarProducto(String nombre){
        
        for (Producto p : productos){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }

}
