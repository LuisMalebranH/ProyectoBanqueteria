
package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.ServicioCantidad;
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
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ValidarProductoEncontrado extends javax.swing.JFrame {
    
    List<ListaIngredientes> listaingredientes;
    List<ListaIngredientes> listaingredientesfiltrados;

    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private ServicioCantidad servicioCantidad;
    private ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;
    private ServicioEncargo servicioEncargo;
    private ServicioDetalleEncargo servicioDetalleEncargo;

    public ValidarProductoEncontrado(
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
        
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
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

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("El Producto seleccionado ya se encuentra ingresado en el encargo");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 10, 380, 28));

        jButton1.setText("Reemplazar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("¿Qué desea hacer?");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 329, 28));

        jButton2.setText("Sumar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 100, 90, -1));

        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });
        jPanel1.add(btncancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 100, 90, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 130));

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
                .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 400, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(validaciones()){
            
            String nombre = this.nombre.getText();
            int cant = Integer.parseInt(this.cantidad.getText());
            int cantv = 0;
            
            for(int i = 0;i<Inicio.TablaProductos.getRowCount();i++){
                if(Inicio.TablaProductos.getValueAt(i,0).equals(nombre)){
                    int porciones = Integer.parseInt(Inicio.TablaProductos.getValueAt(i,1).toString());
                    int precioprod = Integer.parseInt(Inicio.TablaProductos.getValueAt(i,2).toString());
                    int precioencargo = Integer.parseInt(Inicio.textprecio.getText());
                    
                    porciones = porciones*cant;
                    
                    String porcion = String.valueOf(porciones);
                    String cantidadprod = String.valueOf(cant);
                    String precio = "";                   
                    
                    DefaultTableModel tabla = (DefaultTableModel) Inicio.TablaEncargo.getModel();
                    
                    for(int q = 0;q<tabla.getRowCount();q++){
                        if(tabla.getValueAt(q,0).equals(nombre)){
                            cantv = Integer.parseInt(tabla.getValueAt(q,1).toString());
                            tabla.setValueAt(cantidadprod,q,1);
                            tabla.setValueAt(porcion,q,2);
                            precioencargo = precioencargo - (precioprod*cantv) + (precioprod*cant);
                            precio = String.valueOf(precioencargo); 
                        }
                    }
                    
                    Inicio.textprecio.setText(precio);
                    
                    //------------------------------------------
                    
                    DefaultTableModel tablaingi = (DefaultTableModel) Inicio.TablaIngredientes.getModel();                  
                    DefaultTableModel tablaingf = (DefaultTableModel) Inicio.TablaIngEncargo.getModel();
                    
                    for(int a = 0;a<tablaingi.getRowCount();a++){
                        boolean encontrado = false;
                        
                        for(int b = 0;b<tablaingf.getRowCount();b++){
                            if(tablaingi.getValueAt(a,0).equals(tablaingf.getValueAt(b,0))){
                                
                                double cantidadf = Double.parseDouble(tablaingf.getValueAt(b,1).toString());
                                String desde = tablaingi.getValueAt(a,2).toString();
                                String hasta = obtenerMedida(tablaingi.getValueAt(a,0).toString());
                                double cantidadi = corregirDecimales(tablaingi.getValueAt(a,1).toString());
                                cantidadf = redondear(cantidadf + (obtenerCantidad(desde,hasta,cantidadi)*cant)-(obtenerCantidad(desde,hasta,cantidadi)*cantv));
                                tablaingf.setValueAt(String.valueOf(cantidadf), b, 1);
                                
                                encontrado = true;
                                break;
                                
                            }
                        }
                        
                        if(!encontrado){
                        
                            String nombreing = tablaingi.getValueAt(a,0).toString();
                            double cantidading = corregirDecimales(tablaingi.getValueAt(a,1).toString());
                            String medidaing = obtenerMedida(tablaingi.getValueAt(a,0).toString());
                            double cantidadingf = redondear(obtenerCantidad(tablaingi.getValueAt(a,2).toString(),medidaing,cantidading)*cant);

                            String[] nuevoing = {nombreing,String.valueOf(cantidadingf),medidaing};
                            tablaingf.addRow(nuevoing);
                        
                        }                                                
                    }
                    
                    dispose();
                    
                }
            }
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btncancelarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(validaciones()){
            
            String nombre = this.nombre.getText();
            int cant = Integer.parseInt(this.cantidad.getText());
            
            for(int i = 0;i<Inicio.TablaProductos.getRowCount();i++){
                if(Inicio.TablaProductos.getValueAt(i,0).equals(nombre)){
                    int porciones = Integer.parseInt(Inicio.TablaProductos.getValueAt(i,1).toString());
                    int precioprod = Integer.parseInt(Inicio.TablaProductos.getValueAt(i,2).toString());
                    
                    int precioencargo = Integer.parseInt(Inicio.textprecio.getText());                                        
                    
                    String precio = "";                   
                    
                    DefaultTableModel tabla = (DefaultTableModel) Inicio.TablaEncargo.getModel();
                    
                    for(int q = 0;q<tabla.getRowCount();q++){
                        if(tabla.getValueAt(q,0).equals(nombre)){
                            
                            int cantf = cant + Integer.parseInt(tabla.getValueAt(q,1).toString());
                            porciones = porciones*cantf;
                            String porcion = String.valueOf(porciones);
                            tabla.setValueAt(porcion,q,2);
                            
                            String cantidadprod = String.valueOf(cantf);
                            tabla.setValueAt(cantidadprod,q,1);
                            
                            precioencargo = precioencargo + precioprod*cant;
                            precio = String.valueOf(precioencargo); 
                        }
                    }
                    
                    Inicio.textprecio.setText(precio);
                    
                    //------------------------------------------
                    
                    DefaultTableModel tablaingi = (DefaultTableModel) Inicio.TablaIngredientes.getModel();                  
                    DefaultTableModel tablaingf = (DefaultTableModel) Inicio.TablaIngEncargo.getModel();
                    
                    for(int a = 0;a<tablaingi.getRowCount();a++){
                        boolean encontrado = false;
                        
                        for(int b = 0;b<tablaingf.getRowCount();b++){
                            if(tablaingi.getValueAt(a,0).equals(tablaingf.getValueAt(b,0))){
                                
                                double cantidadf = Double.parseDouble(tablaingf.getValueAt(b,1).toString());
                                String desde = tablaingi.getValueAt(a,2).toString();
                                String hasta = obtenerMedida(tablaingi.getValueAt(a,0).toString());
                                double cantidadi = corregirDecimales(tablaingi.getValueAt(a,1).toString());
                                cantidadf = redondear(cantidadf + (obtenerCantidad(desde,hasta,cantidadi)*cant));
                                tablaingf.setValueAt(String.valueOf(cantidadf), b, 1);
                                
                                encontrado = true;
                                break;
                                
                            }
                        }
                        
                        if(!encontrado){
                        
                            String nombreing = tablaingi.getValueAt(a,0).toString();
                            double cantidading = corregirDecimales(tablaingi.getValueAt(a,1).toString());
                            String medidaing = obtenerMedida(tablaingi.getValueAt(a,0).toString());
                            double cantidadingf = redondear(obtenerCantidad(tablaingi.getValueAt(a,2).toString(),medidaing,cantidading)*cant);

                            String[] nuevoing = {nombreing,String.valueOf(cantidadingf),medidaing};
                            tablaingf.addRow(nuevoing);
                        
                        }                                                
                    }
                    
                    dispose();
                    
                }
            }
            
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancelar;
    public static javax.swing.JLabel cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JLabel nombre;
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
    
    private boolean validaciones(){
    
        int valor = Integer.parseInt(cantidad.getText());
        String nombre = this.nombre.getText();
        boolean encontrado = false;
        for(int i = 0;i<Inicio.TablaEncargo.getRowCount();i++){
            if(Inicio.TablaEncargo.getValueAt(i,0).equals(nombre)){
                encontrado = true;
                break;
            }
        }
        if(valor<1){
            JOptionPane.showMessageDialog(null,"La cantidad debe ser mayor a 0","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else {
            return true;
        }
        
    }
    
    private Long obtenerIdProducto(String nombre){
        
        List<Producto> productos = new ArrayList<>();
        productos = servicioProducto.getAllProducto();
        for(Producto p : productos){
            if(p.getNombre().equals(nombre)){
                return p.getId();
            }
        }
        return null;
    }
    
    private String obtenerMedida(String nombre){
    
        List<Ingrediente> ingredientes = servicioIngrediente.getAll();
        
        for(Ingrediente i :ingredientes){
            if(i.getNombre().equals(nombre)){
                Long idmedida = i.getMedidaingrediente().getId();
                
                List<MedidaIngrediente> lista = servicioMedidaIngrediente.getAll();
        
                for(MedidaIngrediente mi : lista){
                    if(mi.getId().equals(idmedida)){
                        return mi.getDetalle();
                    }
                }
            }
        }
        
        return null;
        
    }
    
    private double corregirDecimales(String cantidad){
    
        cantidad = cantidad.trim();
        
        if(cantidad.matches("\\d+\\s+\\d+/\\d+")){//2 1/2 -> 2+0.5 -> 2.5
            
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
    
    private double obtenerCantidad(String desde, String hasta, double cantidad){
    
        switch (desde) {
            case "taza":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 250;
                        return cantidad;
                    case "litro":
                        cantidad = cantidad * 0.25;
                        return cantidad;
                    case "gramos":
                        cantidad = cantidad * 125;
                        return cantidad;
                    case "kilo":
                        cantidad = cantidad * 0.125;
                        return cantidad;
                    case "unidad":
                        cantidad = cantidad * 0;
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            case "unidad":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "litro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "gramos":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "kilo":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "unidad":
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            case "cucharada":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 15;
                        return cantidad;
                    case "litro":
                        cantidad = cantidad * 0.015;
                        return cantidad;
                    case "gramos":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "kilo":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "unidad":
                        cantidad = cantidad * 0;
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            case "criterio propio":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "litro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "gramos":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "kilo":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "unidad":
                        cantidad = cantidad * 0;
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            case "mililitro":
                switch (hasta) {
                    case "mililitro":
                        return cantidad;
                    case "litro":
                        cantidad = cantidad * 0.001;
                        return cantidad;
                    case "gramos":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "kilo":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "unidad":
                        cantidad = cantidad * 0;
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            case "litro":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 1000;
                        return cantidad;
                    case "litro":
                        return cantidad;
                    case "gramos":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "kilo":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "unidad":
                        cantidad = cantidad * 0;
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            case "gramos":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "litro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "gramos":
                        return cantidad;
                    case "kilo":
                        cantidad = cantidad * 0.001;
                        return cantidad;
                    case "unidad":
                        cantidad = cantidad * 0;
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            case "kilo":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "litro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "gramos":
                        cantidad = cantidad * 1000;
                        return cantidad;
                    case "kilo":
                        return cantidad;
                    case "unidad":
                        cantidad = cantidad * 0;
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            case "diente":
                switch (hasta) {
                    case "mililitro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "litro":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "gramos":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "kilo":
                        cantidad = cantidad * 0;
                        return cantidad;
                    case "unidad":
                        cantidad = cantidad * 0.2;
                        return cantidad;
                    default:
                        throw new AssertionError();
                }
            default:
                throw new AssertionError();
        }
        
    }

}
