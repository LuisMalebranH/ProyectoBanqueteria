
package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.ServicioCategoria;
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


public class CantidadProducto extends javax.swing.JFrame {
    
    List<ListaIngredientes> listaingredientes;
    List<ListaIngredientes> listaingredientesfiltrados;

    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private final ServicioCantidad servicioCantidad;
    private final ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;
  
    public CantidadProducto(
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
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cantidad = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        nombre = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(220, 209, 199));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(200, 100));

        jLabel1.setText("Cantidad");

        cantidad.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cantidad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadMouseClicked(evt);
            }
        });

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jButton1)
                .addContainerGap(110, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        if(validaciones()){
            
            String nombre = this.nombre.getText();
            int cant = Integer.parseInt(this.cantidad.getValue().toString());
            
            for(int i = 0;i<Inicio.TablaProductos.getRowCount();i++){
                if(Inicio.TablaProductos.getValueAt(i,0).equals(nombre)){
                    int porciones = Integer.parseInt(Inicio.TablaProductos.getValueAt(i,1).toString());
                    int precioprod = Integer.parseInt(Inicio.TablaProductos.getValueAt(i,2).toString());
                    int precioencargo = Integer.parseInt(Inicio.textprecio.getText());
                    
                    porciones = porciones*cant;
                    precioprod = precioprod*cant;
                    precioencargo = precioencargo + precioprod;
                    
                    String porcion = String.valueOf(porciones);
                    String precio = String.valueOf(precioencargo);
                    String cantidadprod = String.valueOf(cant);
                    
                    DefaultTableModel tabla = (DefaultTableModel) Inicio.TablaEncargo.getModel();
                    String [] dato = {nombre,cantidadprod,porcion};
                    tabla.addRow(dato);
                    
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
                                cantidadf = redondear(cantidadf + obtenerCantidad(desde,hasta,cantidadi)*cant);
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

    private void cantidadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMouseClicked

    }//GEN-LAST:event_cantidadMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JSpinner cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
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
    
        Object valor = cantidad.getValue();
        if(!(valor instanceof Number)){
            JOptionPane.showMessageDialog(null,"Sólo puede ingresar valores numéricos","Alerta",JOptionPane.INFORMATION_MESSAGE);
            return false;
        }else{
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
