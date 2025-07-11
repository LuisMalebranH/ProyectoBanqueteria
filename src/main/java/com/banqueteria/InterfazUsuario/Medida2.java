
package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.Cantidad;
import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.detalleencargo.ServicioDetalleEncargo;
import com.banqueteria.recetario.encargo.ServicioEncargo;
import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.MedidaIngrediente;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;


public class Medida2 extends javax.swing.JFrame {
    
    DefaultTableModel tabla;
    List<MedidaIngrediente> ListaMedIng;
    List<Cantidad> cantidades;

    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private ServicioCantidad servicioCantidad;
    private ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;
    private ServicioEncargo servicioEncargo;
    private ServicioDetalleEncargo servicioDetalleEncargo;

    public Medida2(
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
        
        llenarCantidades();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Cantidad = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        CBCantidades = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        textprecioingrediente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();
        cantidad = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(220, 209, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 100));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Cantidad.setText("Tipo de Medida");
        jPanel1.add(Cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, 30));

        jButton1.setBackground(new java.awt.Color(255, 255, 254));
        jButton1.setText("Confirmar");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 30));

        CBCantidades.setBackground(new java.awt.Color(255, 255, 254));
        CBCantidades.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBCantidades.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CBCantidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBCantidadesActionPerformed(evt);
            }
        });
        jPanel1.add(CBCantidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 110, 30));

        jButton2.setBackground(new java.awt.Color(255, 255, 254));
        jButton2.setText("Nueva medida");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 110, 30));
        jPanel1.add(textprecioingrediente, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 110, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, -1));

        jPanel2.setBackground(new java.awt.Color(196, 178, 161));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        nombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        cantidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 270, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        CrearMedidaIng abrir = new CrearMedidaIng(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        abrir.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String nombre = this.nombre.getText();
        String cantidad = this.cantidad.getText();
        double cant = corregirDecimales(cantidad);
        String tipo = this.CBCantidades.getSelectedItem().toString();
        AgregarValorTabla(nombre, cantidad, tipo);
        AgregarProducto.TextoIng.setText("");
        
        Long id = obtenerIngrediente(nombre).getMedidaingrediente().getId();
        int cantidadIng = Integer.parseInt(obtenerIngrediente(nombre).getCantidad());
        double precioIng = Double.parseDouble(obtenerIngrediente(nombre).getPrecio());
        String medida = obtenerMedidaIngrediente(id);
        double precioanterior = Double.parseDouble(this.textprecioingrediente.getText());

        double precioProd = Double.parseDouble(AgregarProducto.textPrecioIng.getText());
        
        precioProd = precioProd - precioanterior + obtenerPrecio(tipo, medida, cant, precioIng, cantidadIng);
        
        double precioProdfinal = redondear(precioProd);
        
        AgregarProducto.textPrecioIng.setText(String.valueOf(precioProdfinal));
        
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBCantidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBCantidadesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CBCantidadesActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JComboBox<String> CBCantidades;
    private javax.swing.JLabel Cantidad;
    public static javax.swing.JLabel cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel nombre;
    public static javax.swing.JLabel textprecioingrediente;
    // End of variables declaration//GEN-END:variables

    private void AgregarValorTabla(String nombre, String cantidad, String medida){
        
        tabla = (DefaultTableModel) AgregarProducto.TablaListaIng.getModel();
        for(int i = 0;i<tabla.getRowCount();i++){
            if(nombre.equals(tabla.getValueAt(i, 0))){
                tabla.setValueAt(cantidad, i, 1);
                tabla.setValueAt(medida, i, 2);
                
            }
        }
        
    }
    
    public void llenarCantidades(){
        
        this.CBCantidades.removeAllItems();
        
        cantidades = servicioCantidad.getAll();
        String nombre;
        for(int i=0;i<cantidades.size();i++){
            nombre = cantidades.get(i).getDescripcion();
            this.CBCantidades.addItem(nombre);
        }
        
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

}


