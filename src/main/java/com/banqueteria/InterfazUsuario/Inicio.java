package com.banqueteria.InterfazUsuario;


import Modelo.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.producto.Producto;
import com.banqueteria.recetario.producto.ServicioProducto;
import com.banqueteria.recetario.receta.ServicioReceta;
import java.awt.Image;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


public class Inicio extends javax.swing.JFrame {
    
    DefaultTableModel tabla;
    List<Producto> productos;
    
    private ServicioReceta servicioReceta;
    private ServicioProducto servicioProducto;
    private ServicioIngrediente servicioIngrediente;

    public Inicio(ServicioReceta servicioReceta, ServicioIngrediente servicioIngrediente, ServicioProducto servicioProducto) {
        this.servicioReceta = servicioReceta;
        this.servicioProducto = servicioProducto;
        this.servicioIngrediente = servicioIngrediente;
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        this.setSize(1200, 800);
        
        corregirImagen(this.labeld,"src/imagenes/imagend.png");
        corregirImagen(this.labeli,"src/imagenes/imageni.png");
        
        llenarTabla();
        
        
        
    }

    Inicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new javax.swing.JPanel();
        PanelCalculo = new javax.swing.JPanel();
        labeli = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
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

        PanelFondo.add(PanelCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 740));

        labeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/imageni.png"))); // NOI18N
        labeli.setAutoscrolls(true);
        labeli.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeli.setPreferredSize(new java.awt.Dimension(35, 15));
        labeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labeliMouseClicked(evt);
            }
        });
        PanelFondo.add(labeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 50, -1, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelFondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 140, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 100));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelFondo.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 50, 150, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 100));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelFondo.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 150, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel4.setPreferredSize(new java.awt.Dimension(150, 100));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        PanelFondo.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 50, 150, -1));

        labeld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/imagend.png"))); // NOI18N
        labeld.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        labeld.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeld.setPreferredSize(new java.awt.Dimension(35, 15));
        labeld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeldMouseEntered(evt);
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

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Productos"
            }
        ));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);

        PanelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 340, 450));

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
        this.PanelCalculo.setSize(300, 780);        
    }//GEN-LAST:event_PanelCalculoMouseEntered

    private void PanelCalculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCalculoMouseExited
        this.PanelCalculo.setSize(100, 780);        
    }//GEN-LAST:event_PanelCalculoMouseExited

    private void labeldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeldMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_labeldMouseEntered

    private void TextBuscarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBuscarProdMouseClicked
        this.TextBuscarProd.setText("");
    }//GEN-LAST:event_TextBuscarProdMouseClicked

    private void btnAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdActionPerformed
        AgregarProducto abrir = new AgregarProducto();
        abrir.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnAgregarProdActionPerformed

    private void labeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeliMouseClicked
        this.labeli.setBorder(new EtchedBorder());
    }//GEN-LAST:event_labeliMouseClicked

    private void TextBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBuscarProdKeyReleased
        String texto = this.TextBuscarProd.getText();
        filtrar(texto);
    }//GEN-LAST:event_TextBuscarProdKeyReleased

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked
        mostrarPreparacion();
    }//GEN-LAST:event_TablaProductosMouseClicked


    
    
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
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
        
    private void llenarTabla(){
    
        String dato;
        productos = servicioProducto.getAllProducto();
        
        for (int i = 0; i<productos.size();i++){
            dato = productos.get(i).getNombre();
            String[] prod = {dato};
            tabla = (DefaultTableModel) this.TablaProductos.getModel();
            tabla.addRow(prod);
        }
    
    }    

    private void filtrar(String texto){
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tabla);
        this.TablaProductos.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(texto));
        
    }
    
    private void listarIngredientes(){
        
        
    
    }
    
    private void mostrarPreparacion(){
    
        Producto prod = new Producto();
        prod.setNombre((String) this.tabla.getValueAt(this.TablaProductos.getSelectedRow(), this.TablaProductos.getSelectedColumn()));
        String[] nombre = {prod.getNombre()}; 
        prod.setReceta(productos.get(productos.indexOf(nombre)).getReceta());
        String receta = prod.getReceta();
        this.TextoPreparacion.setText(receta);
        
    }

}
