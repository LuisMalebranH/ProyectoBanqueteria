
package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.detalleencargo.ServicioDetalleEncargo;
import com.banqueteria.recetario.encargo.ServicioEncargo;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.awt.Point;


public class CantidadIngrediente2 extends javax.swing.JFrame {

    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private ServicioCantidad servicioCantidad;
    private ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;
    private ServicioEncargo servicioEncargo;
    private ServicioDetalleEncargo servicioDetalleEncargo;

    public CantidadIngrediente2(
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
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLbl_Cantidad = new javax.swing.JLabel();
        valorEntero = new javax.swing.JSpinner();
        jBttn_ConfirmarCantidad = new javax.swing.JButton();
        valorDecimal = new javax.swing.JComboBox<>();
        textprecioingrediente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(220, 209, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLbl_Cantidad.setText("Cantidad");
        jPanel1.add(jLbl_Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 16, 63, 28));
        jPanel1.add(valorEntero, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 19, 80, -1));

        jBttn_ConfirmarCantidad.setBackground(new java.awt.Color(255, 255, 254));
        jBttn_ConfirmarCantidad.setText("Confirmar");
        jBttn_ConfirmarCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBttn_ConfirmarCantidadActionPerformed(evt);
            }
        });
        jPanel1.add(jBttn_ConfirmarCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(94, 69, -1, -1));

        valorDecimal.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1/4", "1/2", "3/4" }));
        valorDecimal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        valorDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorDecimalActionPerformed(evt);
            }
        });
        jPanel1.add(valorDecimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 19, 80, -1));
        jPanel1.add(textprecioingrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 70, 70, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, -1));

        jPanel2.setBackground(new java.awt.Color(196, 178, 161));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBttn_ConfirmarCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBttn_ConfirmarCantidadActionPerformed
        Medida2 abrir = new Medida2(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        abrir.setVisible(true);
        abrir.setLocation(obtenerPosicionX(), obtenerPosicionY());
        abrir.nombre.setText(this.nombre.getText());
        abrir.textprecioingrediente.setText(this.textprecioingrediente.getText());
        
        if(this.valorDecimal.getSelectedItem().toString().equals("0")){
            abrir.cantidad.setText(this.valorEntero.getValue().toString());
        }else{
            String cant = this.valorEntero.getValue()+" "+this.valorDecimal.getSelectedItem().toString();
            abrir.cantidad.setText(cant);
        }
                
        dispose();
    }//GEN-LAST:event_jBttn_ConfirmarCantidadActionPerformed

    private void valorDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorDecimalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorDecimalActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBttn_ConfirmarCantidad;
    private javax.swing.JLabel jLbl_Cantidad;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel nombre;
    public static javax.swing.JLabel textprecioingrediente;
    private javax.swing.JComboBox<String> valorDecimal;
    public static javax.swing.JSpinner valorEntero;
    // End of variables declaration//GEN-END:variables

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

}
