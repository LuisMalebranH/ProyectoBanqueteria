
package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.Categoria;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.ServicioProducto;
import javax.swing.JOptionPane;

public class CrearCategoría extends javax.swing.JFrame {

    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private final ServicioCantidad servicioCantidad;
    private final ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;

    public CrearCategoría(ServicioCantidad servicioCantidad,
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
        
        this.setLocationRelativeTo(null);
    }

    CrearCategoría(ServicioCantidad servicioCantidad, ServicioCategoria servicioCategoria, ServicioIngrediente servicioIngrediente, ServicioProducto servicioProducto) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        textnombre = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre Categoría");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 110, 30));
        jPanel1.add(textnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 62, 160, 30));

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(this.textnombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null,"Debe darle un nombre a la nueva categoría","Alerta",JOptionPane.INFORMATION_MESSAGE);
        }else{
            String nuevaCategoria = this.textnombre.getText();
            Categoria cat = new Categoria();
            cat.setDetalle(nuevaCategoria);
            servicioCategoria.save(cat);
            dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField textnombre;
    // End of variables declaration//GEN-END:variables
}
