package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.Cantidad;
import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.Categoria;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ListaIngredientes;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.producto.Producto;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.awt.Point;
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
    }

    AgregarProducto(){
    
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
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
        TablaListaIng = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

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

        TablaListaIng.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Medida"
            }
        ));
        TablaListaIng.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        TablaListaIng.setShowGrid(true);
        jScrollPane3.setViewportView(TablaListaIng);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 70, 320, 610));

        jButton4.setText("Guardar producto");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 710, -1, 30));

        jButton5.setText("Cancelar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 710, 130, 30));

        jButton3.setText("Actualizar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 710, 140, 30));

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
       CantidadIngrediente abrir = new CantidadIngrediente(
               servicioCantidad,servicioCategoria,
                servicioIngrediente,servicioProducto, servicioListaIngredientes);
       abrir.setVisible(true); 
       abrir.setLocation(obtenerPosicionX(), obtenerPosicionY());
       abrir.nombre.setText(AgregarIngrediente());
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Inicio abrir;
        abrir = new Inicio(
                servicioCantidad,servicioCategoria,
                servicioIngrediente,servicioProducto,
                servicioListaIngredientes);
        abrir.setVisible(true);
        dispose();
// TODO add your handling code here:
    }                                                           

    private void TextoIngKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextoIngKeyReleased
        String texto = this.TextoIng.getText();
        filtrar(texto);
    }//GEN-LAST:event_TextoIngKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AgregarProducto abrir = new AgregarProducto(servicioCantidad,servicioCategoria,
                                                    servicioIngrediente,servicioProducto,
                servicioListaIngredientes);
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        
//        if(this.TextoNombre.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null,"El producto debe tener un nombre","Alerta",JOptionPane.INFORMATION_MESSAGE);
//        }
//        
//        if(this.TextoReceta.getText().isEmpty()){
//            JOptionPane.showMessageDialog(null,"El producto debe tener una receta","Alerta",JOptionPane.INFORMATION_MESSAGE);
//        }
//        
//        ListaIng = (DefaultTableModel) this.TablaListaIng.getModel();
//        int filas = this.ListaIng.getRowCount();
//        
//        if(filas==0){
//            JOptionPane.showMessageDialog(null,"El producto debe tener al menos un ingrediente","Alerta",JOptionPane.INFORMATION_MESSAGE);
//        }
        
        if(validarCamposVacios()){
            
            String nombreProd = this.TextoNombre.getText();
            String receta = this.TextoReceta.getText();
        
            String cat = this.CBCategoria.getSelectedItem().toString();
            Categoria c = new Categoria();
            c.setId(buscarCategoria(cat).getId());
            c.setDetalle(cat);
        
            Producto p = new Producto();
            p.setNombre(nombreProd);
            p.setReceta(receta);
            p.setCategoria(c);
        
            servicioProducto.save(p);       
        
            for(int i=0;i<ListaIng.getRowCount();i++){
                Ingrediente ing = new Ingrediente();
                String nombreing = (String) ListaIng.getValueAt(i,0);
                ing.setId(buscarIngrediente(nombreing).getId());
                ing.setNombre(nombreing);
            
                String cantidad = (String) ListaIng.getValueAt(i,1);
            
                Cantidad m = new Cantidad();
                String medida = (String) ListaIng.getValueAt(i,2);
                m.setId(buscarCantidad(medida).getId());
                m.setDescripcion(buscarCantidad(medida).getDescripcion());
            
                ListaIngredientes li = new ListaIngredientes();
                li.setCantidad(cantidad);
                li.setIngrediente(ing);
                li.setMedida(m);
                li.setProducto(p);
                servicioListaIngredientes.save(li);
                
                Inicio abrir = new Inicio();
                abrir.setVisible(true);
                dispose();

            }
            
        }else{
            
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> CBCategoria;
    private javax.swing.JTable TablaIngredientes;
    public static javax.swing.JTable TablaListaIng;
    public static javax.swing.JTextField TextoIng;
    public static javax.swing.JTextField TextoNombre;
    private javax.swing.JTextArea TextoReceta;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
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

    private Cantidad buscarCantidad(String nombre){
        
        cantidades = servicioCantidad.getAll();
    
        for(int i=0;i<cantidades.size();i++){
            if(cantidades.get(i).getDescripcion().equals(nombre)){
                return cantidades.get(i);
            }
        }
        return null;
    }
    
    private boolean validarCamposVacios(){
        
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
        }else{
            return true;
        }
    }
    
}


