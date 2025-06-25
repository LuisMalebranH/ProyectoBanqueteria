
package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.MedidaIngrediente;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.util.List;
import javax.swing.JOptionPane;

public class CrearIngrediente extends javax.swing.JFrame {

    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private final ServicioCantidad servicioCantidad;
    private final ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;
    
    List<MedidaIngrediente> ListaMedIng;

    public CrearIngrediente(
            ServicioCantidad servicioCantidad,
            ServicioCategoria servicioCategoria,
            ServicioIngrediente servicioIngrediente, 
            ServicioProducto servicioProducto,
            ServicioListaIngredientes servicioListaIngredientes,
            ServicioMedidaIngrediente servicioMedidaIngrediente) {
        this.servicioCantidad = servicioCantidad;
        this.servicioCategoria = servicioCategoria;
        this.servicioIngrediente = servicioIngrediente;
        this.servicioProducto = servicioProducto;
        this.servicioListaIngredientes = servicioListaIngredientes;
        this.servicioMedidaIngrediente = servicioMedidaIngrediente;
        initComponents();
        
        llenarMedidas();
        
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        cbcanting = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        textprecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        textcantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(220, 209, 199));
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre Ingrediente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 130, 30));
        jPanel1.add(textnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 160, 30));

        jLabel2.setText("Medida Ingrediente");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 130, 30));

        cbcanting.setBackground(new java.awt.Color(255, 255, 254));
        cbcanting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbcanting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbcantingActionPerformed(evt);
            }
        });
        jPanel1.add(cbcanting, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 160, 30));

        jLabel3.setText("Precio Ingrediente ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 130, 30));

        textprecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textprecioActionPerformed(evt);
            }
        });
        jPanel1.add(textprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 160, 30));

        jLabel4.setText("Cantidad");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 130, 30));

        textcantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textcantidadActionPerformed(evt);
            }
        });
        jPanel1.add(textcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 160, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 254));
        jButton1.setText("Agregar");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 233, 110, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        
        if(validarCamposVacios()){
        
            Ingrediente ing = new Ingrediente();
        
            String nombre = this.textnombre.getText();
            ing.setNombre(nombre);

            String precio = this.textprecio.getText();
            ing.setPrecio(precio);

            String cantidad = this.textcantidad.getText();
            ing.setCantidad(cantidad);

            String medida = this.cbcanting.getSelectedItem().toString();
            MedidaIngrediente mi = new MedidaIngrediente();
            mi.setId(obtenerIdMedida(medida));
            mi.setDetalle(medida);
            ing.setMedidaingrediente(mi);

            servicioIngrediente.save(ing);
            dispose();
        
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbcantingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbcantingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbcantingActionPerformed

    private void textprecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textprecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textprecioActionPerformed

    private void textcantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textcantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textcantidadActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbcanting;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textcantidad;
    private javax.swing.JTextField textnombre;
    private javax.swing.JTextField textprecio;
    // End of variables declaration//GEN-END:variables

    private Long obtenerIdMedida(String nombre){
        
        ListaMedIng = servicioMedidaIngrediente.getAll();
        
        for(MedidaIngrediente mi : ListaMedIng){
            if(mi.getDetalle().equals(nombre)){
                return mi.getId();
            }
        }
        return null;
    }
    
    private void llenarMedidas (){
    
        ListaMedIng = servicioMedidaIngrediente.getAll();
        
        for(MedidaIngrediente mi : ListaMedIng){
            this.cbcanting.addItem(mi.getDetalle());
        }
        
    }
    
    private boolean validarCamposVacios(){
        
        if(this.textnombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"El ingrediente debe tener un nombre","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(this.textprecio.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"El ingrerdiente debe tener un precio","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else if(this.textcantidad.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"El ingrediente debe tener una cantidad asociada","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
            return true;
        }
    }

}
