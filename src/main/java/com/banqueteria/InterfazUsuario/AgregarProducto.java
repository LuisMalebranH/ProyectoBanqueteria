package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.Categoria;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.awt.Point;
import java.util.List;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class AgregarProducto extends javax.swing.JFrame {

    DefaultTableModel tablaIng;
    DefaultTableModel tablaListIng;
    List<Ingrediente> ingredientes;
    List<Categoria> categorias;
    
    
    
    private ServicioIngrediente servicioIngrediente;
    private ServicioCategoria servicioCategoria;
    private ServicioCantidad servicioCantidad;
    private ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    
    public AgregarProducto(
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
        
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        
        llenarTabla();
        llenarCategorias();
        llenarTablaListIng();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TextoNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CBCategoria = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TextoIng = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaIngredientes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextoReceta = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Jtbl_listaDeIngredientes = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jBtn_Cancelaryvolverainicio = new javax.swing.JButton();

        jPopupMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPopupMenu1MouseClicked(evt);
            }
        });

        jMenuItem1.setText("Agregar");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre Producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 110, 30));
        jPanel1.add(TextoNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 30, 160, 30));

        jLabel2.setText("Categoría ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 110, 30));

        jPanel1.add(CBCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 160, 30));

        jButton1.setText("Nueva Categoría");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 160, -1));

        jLabel3.setText("Ingrediente");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 110, 30));

        TextoIng.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextoIngKeyReleased(evt);
            }
        });
        jPanel1.add(TextoIng, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 160, 30));

        jButton2.setText("Nuevo ingrediente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 210, 160, -1));

        TablaIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingredientes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaIngredientes.setComponentPopupMenu(jPopupMenu1);
        jScrollPane1.setViewportView(TablaIngredientes);
        if (TablaIngredientes.getColumnModel().getColumnCount() > 0) {
            TablaIngredientes.getColumnModel().getColumn(0).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 290, 420));

        jLabel6.setText("Preparación");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 26, 140, 30));

        TextoReceta.setColumns(20);
        TextoReceta.setRows(5);
        jScrollPane2.setViewportView(TextoReceta);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 300, 600));

        jLabel7.setText("Listado de ingredientes");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 26, 160, 30));

        Jtbl_listaDeIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Medida"
            }
        ));
        Jtbl_listaDeIngredientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Jtbl_listaDeIngredientes.setShowGrid(true);
        jScrollPane3.setViewportView(Jtbl_listaDeIngredientes);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 320, 610));

        jButton4.setText("Guardar producto");
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 710, -1, 30));

        jBtn_Cancelaryvolverainicio.setText("Cancelar");
        jBtn_Cancelaryvolverainicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_CancelaryvolverainicioActionPerformed(evt);
            }
        });
        jPanel1.add(jBtn_Cancelaryvolverainicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 710, 130, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CrearCategoría crear = new CrearCategoría(
                servicioCantidad,servicioCategoria,
                servicioIngrediente,servicioProducto,servicioListaIngredientes);
        crear.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CrearIngrediente crear = new CrearIngrediente(
                servicioCantidad,servicioCategoria,
                servicioIngrediente,servicioProducto, servicioListaIngredientes);
        crear.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jPopupMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPopupMenu1MouseClicked
       
    }//GEN-LAST:event_jPopupMenu1MouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       Cantidad abrir = new Cantidad(
               servicioCantidad,servicioCategoria,
                servicioIngrediente,servicioProducto, servicioListaIngredientes);
       abrir.setVisible(true); 
       abrir.setLocation(obtenerPosicionX(), obtenerPosicionY());
       abrir.nombre.setText(AgregarIngrediente());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void TextoIngKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoIngKeyReleased
        String texto = this.TextoIng.getText();
        filtrar(texto);
    }//GEN-LAST:event_TextoIngKeyReleased

    private void jBtn_CancelaryvolverainicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_CancelaryvolverainicioActionPerformed
      
        Inicio initback = new Inicio(servicioCantidad,
                                     servicioCategoria,
                                     servicioIngrediente,
                                     servicioProducto,
                                     servicioListaIngredientes);
        initback.setVisible(true);
        dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jBtn_CancelaryvolverainicioActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> CBCategoria;
    public static javax.swing.JTable Jtbl_listaDeIngredientes;
    private javax.swing.JTable TablaIngredientes;
    private javax.swing.JTextField TextoIng;
    public static javax.swing.JTextField TextoNombre;
    private javax.swing.JTextArea TextoReceta;
    private javax.swing.JButton jBtn_Cancelaryvolverainicio;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla (){
        
        
        tablaIng = (DefaultTableModel) this.TablaIngredientes.getModel();
        
        while(tablaIng.getRowCount()>0)tablaIng.removeRow(0);
        
        String dato;
        ingredientes = servicioIngrediente.getAll();
        
        for(int i = 0; i<ingredientes.size();i++){
            dato = ingredientes.get(i).getNombre();
            String[] ing = {dato};
            tablaIng.addRow(ing);
        }
        
    }

    private int obtenerPosicionY(){
        Point mouse1 = this.jPanel1.getMousePosition();
        Point mouse2 = this.jPanel1.getLocationOnScreen();
        int y = mouse1.y + mouse2.y;
        return y;
    }

    private int obtenerPosicionX(){
        Point mouse1 = this.jPanel1.getMousePosition();
        Point mouse2 = this.jPanel1.getLocationOnScreen();
        int x = mouse1.x + mouse2.x;
        return x;
    }

    private String AgregarIngrediente(){

        Ingrediente ing = new Ingrediente();
        ing.setNombre((String) this.TablaIngredientes.getValueAt(this.TablaIngredientes.getSelectedRow(), this.TablaIngredientes.getSelectedColumn()));
        return ing.getNombre();    

    }

    public void llenarCategorias(){
        
        this.CBCategoria.removeAllItems();
    
        categorias = servicioCategoria.getAll();
        String nombre;
        for(int i=0;i<categorias.size();i++){
            nombre = categorias.get(i).getDetalle();
            this.CBCategoria.addItem(nombre);
        }
        
    }
    
    private void filtrar(String texto){
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tablaIng);
        this.TablaIngredientes.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(texto));
        
    }

    public void llenarTablaListIng(){
        
    
    }

    
}


