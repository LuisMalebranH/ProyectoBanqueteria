package com.banqueteria.InterfazUsuario;

import com.banqueteria.recetario.cantidad.Cantidad;
import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.Categoria;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.detalleencargo.DetalleEncargo;
import com.banqueteria.recetario.detalleencargo.ServicioDetalleEncargo;
import com.banqueteria.recetario.encargo.Encargo;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class ListadoEncargos extends javax.swing.JFrame {

    DefaultTableModel tabla;
    
    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private ServicioCantidad servicioCantidad;
    private ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;
    private ServicioEncargo servicioEncargo;
    private ServicioDetalleEncargo servicioDetalleEncargo;

    public ListadoEncargos(
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
        
        this.setSize(1200, 800);
        this.setLocationRelativeTo(null);
        
        llenarTabla();
    }

    ListadoEncargos(){
    
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        PanelAP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEncargos = new javax.swing.JTable();
        jPanel_Ingredientes = new javax.swing.JPanel();
        jBtn_Cancelar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        textonombre = new javax.swing.JTextField();
        jBtn_Cancelar = new javax.swing.JButton();

        jMenuItem2.setText("Ver detalle ");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelAP.setBackground(new java.awt.Color(220, 209, 199));
        PanelAP.setPreferredSize(new java.awt.Dimension(1200, 800));
        PanelAP.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaEncargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Fecha Elaboracion", "Fecha Entrega", "Precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEncargos.setComponentPopupMenu(jPopupMenu1);
        TablaEncargos.setSelectionBackground(new java.awt.Color(159, 173, 138));
        jScrollPane1.setViewportView(TablaEncargos);
        if (TablaEncargos.getColumnModel().getColumnCount() > 0) {
            TablaEncargos.getColumnModel().getColumn(0).setResizable(false);
            TablaEncargos.getColumnModel().getColumn(1).setResizable(false);
            TablaEncargos.getColumnModel().getColumn(2).setResizable(false);
            TablaEncargos.getColumnModel().getColumn(3).setResizable(false);
        }

        PanelAP.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 880, 480));

        jPanel_Ingredientes.setBackground(new java.awt.Color(159, 173, 138));
        jPanel_Ingredientes.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBtn_Cancelar1.setBackground(new java.awt.Color(220, 209, 199));
        jBtn_Cancelar1.setText("Actualizar");
        jBtn_Cancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Cancelar1ActionPerformed(evt);
            }
        });
        jPanel_Ingredientes.add(jBtn_Cancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 680, 140, 40));

        jLabel1.setText("Nombre cliente");
        jPanel_Ingredientes.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, 130, 30));

        textonombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                textonombreKeyReleased(evt);
            }
        });
        jPanel_Ingredientes.add(textonombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 160, 30));

        PanelAP.add(jPanel_Ingredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 770));

        jBtn_Cancelar.setBackground(new java.awt.Color(159, 173, 138));
        jBtn_Cancelar.setText("Cancelar");
        jBtn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_CancelarActionPerformed(evt);
            }
        });
        PanelAP.add(jBtn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 680, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 1, Short.MAX_VALUE)
                .addComponent(PanelAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(PanelAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Inicio abrir;
        abrir = new Inicio(servicioCantidad,servicioCategoria,servicioIngrediente, 
                            servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                            servicioEncargo,servicioDetalleEncargo);
        abrir.setVisible(true);
        dispose();
    }                                                           

    private void jBtn_CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_CancelarActionPerformed
        
        Inicio abrir = new Inicio(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                    servicioEncargo,servicioDetalleEncargo);
        
        abrir.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jBtn_CancelarActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        
        MostrarDetalleEncargo abrir  = new MostrarDetalleEncargo(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                    servicioEncargo,servicioDetalleEncargo);
        abrir.setLocationRelativeTo(null);
        
        DefaultTableModel tablaEncargo = (DefaultTableModel) abrir.TablaEncargo.getModel();
        DefaultTableModel tablaIngredientes = (DefaultTableModel) abrir.TablaIngEncargo.getModel();
        
        String cliente = this.TablaEncargos.getValueAt(this.TablaEncargos.getSelectedRow(),0).toString();
        
        String fechaelab = this.TablaEncargos.getValueAt(this.TablaEncargos.getSelectedRow(),1).toString();
        SimpleDateFormat formatoEntrada1 = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha1 = null;
        try {
            fecha1 = formatoEntrada1.parse(fechaelab);
        } catch (ParseException ex) {
            Logger.getLogger(ListadoEncargos.class.getName()).log(Level.SEVERE, null, ex);
        }
        SimpleDateFormat formatoSalida1 = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada1 = formatoSalida1.format(fecha1);
                
        String fechaent = this.TablaEncargos.getValueAt(this.TablaEncargos.getSelectedRow(),2).toString();
        SimpleDateFormat formatoEntrada2 = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha2 = null;
        try {
            fecha2 = formatoEntrada2.parse(fechaent);
        } catch (ParseException ex) {
            Logger.getLogger(ListadoEncargos.class.getName()).log(Level.SEVERE, null, ex);
        }
        SimpleDateFormat formatoSalida2 = new SimpleDateFormat("yyyy-MM-dd");
        String fechaFormateada2 = formatoSalida2.format(fecha2);
        
        String precio = this.TablaEncargos.getValueAt(this.TablaEncargos.getSelectedRow(),3).toString();
        
        abrir.textencargo.setText(cliente);
        abrir.textprecio.setText(precio);
        
        List<Encargo> lista = new ArrayList<>();
        lista = servicioEncargo.getAllEncargo();
        
        List<DetalleEncargo> listadetalle = new ArrayList<>();
        listadetalle = servicioDetalleEncargo.getAll();
        
        List<DetalleEncargo> listadetallefiltrado = new ArrayList<>();           
        
        for(Encargo e : lista){
            if(e.getCliente().equals(cliente)&
                    String.valueOf(e.getFechaElaboracion()).equals(fechaFormateada1)&
                    String.valueOf(e.getFechaEntrega()).equals(fechaFormateada2)&
                    e.getPrecio().equals(precio)){
                Encargo encargo = new Encargo();
                encargo.setId(e.getId());
                encargo.setFechaElaboracion(e.getFechaElaboracion());
                encargo.setFechaEntrega(e.getFechaEntrega());
                
                java.util.Date f = new java.util.Date(encargo.getFechaEntrega().getTime());
                abrir.jfecha.setDate(f);
                java.sql.Date fechasql = new java.sql.Date(f.getTime());
                abrir.labelfecha.setText(String.valueOf(fechasql));
                
                for(DetalleEncargo de : listadetalle){
                    if(de.getEncargo().getId().equals(encargo.getId())){
                        listadetallefiltrado.add(de);
                    }
                }
                
                for(DetalleEncargo de : listadetallefiltrado){
                    String nombre = obtenerProductoPorId(de.getProducto().getId()).getNombre();
                    int cantidad = Integer.parseInt(de.getCantidad());
                    String porciones = String.valueOf(Integer.parseInt(obtenerProductoPorId(de.getProducto().getId()).getPorciones())*cantidad);
                    String[] dato = {nombre,String.valueOf(cantidad),porciones};
                    tablaEncargo.addRow(dato);
                    
                    List<ListaIngredientes> listaingredientes = new ArrayList<>();
                    listaingredientes = servicioListaIngredientes.getAll();

                    List<ListaIngredientes> listaingredientesfiltrado = new ArrayList<>();
                    
                    for(ListaIngredientes li : listaingredientes){
                        if(obtenerProductoPorId(li.getProducto().getId()).getNombre().equals(nombre)){
                            listaingredientesfiltrado.add(li);
                        }
                    }
                    
                    for(ListaIngredientes li : listaingredientesfiltrado){
                        boolean encontrado = false;
                        
                        for(int i = 0;i<tablaIngredientes.getRowCount();i++){
                            if(obtenerIngredientePorId(li.getIngrediente().getId()).getNombre().equals(tablaIngredientes.getValueAt(i,0))){
                                
                                String desde = obtenerCantidadPorId(li.getMedida().getId()).getDescripcion();
                                String hasta = obtenerMedidaPorId(obtenerIngredientePorId(li.getIngrediente().getId()).getMedidaingrediente().getId()).getDetalle();
                                double cantidadingredientenuevo = corregirDecimales(li.getCantidad());
                                                            
                                double cantidadexistente = Double.parseDouble(tablaIngredientes.getValueAt(i,1).toString());
                                double cantidadfinal = redondear(cantidadexistente + obtenerCantidad(desde,hasta,cantidadingredientenuevo)*cantidad);
                                tablaIngredientes.setValueAt(String.valueOf(cantidadfinal),i,1);
                                
                                encontrado = true;
                                break;
                            }
                        }
                        
                        if(!encontrado){
                            String nombreingrediente = obtenerIngredientePorId(li.getIngrediente().getId()).getNombre();
                            String cantidadingrediente = String.valueOf(redondear(obtenerCantidad(obtenerCantidadPorId(li.getMedida().getId()).getDescripcion(),
                                                        obtenerMedidaPorId(obtenerIngredientePorId(li.getIngrediente().getId()).getMedidaingrediente().getId()).getDetalle(),
                                                        corregirDecimales(li.getCantidad()))*cantidad));
                            String medidaingrediente = obtenerMedidaPorId(obtenerIngredientePorId(li.getIngrediente().getId()).getMedidaingrediente().getId()).getDetalle();
                            String[] datoingrediente = {nombreingrediente,cantidadingrediente,medidaingrediente};
                            tablaIngredientes.addRow(datoingrediente);
                        }
                        
                    }
                    
                }
                
            }
        }
        
        abrir.setVisible(true);
        
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jBtn_Cancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Cancelar1ActionPerformed
        ListadoEncargos abrir = new ListadoEncargos(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente,
                                                    servicioEncargo,servicioDetalleEncargo);
        abrir.setVisible(true);
        dispose();
    }//GEN-LAST:event_jBtn_Cancelar1ActionPerformed

    private void textonombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textonombreKeyReleased
        String texto = this.textonombre.getText();
        filtrar(texto);
    }//GEN-LAST:event_textonombreKeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelAP;
    private javax.swing.JTable TablaEncargos;
    private javax.swing.JButton jBtn_Cancelar;
    private javax.swing.JButton jBtn_Cancelar1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel_Ingredientes;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField textonombre;
    // End of variables declaration//GEN-END:variables

    public void llenarTabla (){    
        
        tabla = (DefaultTableModel) this.TablaEncargos.getModel();
        
        while(tabla.getRowCount()>0)tabla.removeRow(0);
        
        String nombre;
        String fechaelab;
        String fechaent;
        String precio;
        
        List<Encargo> lista = new ArrayList<>();
        lista = servicioEncargo.getAllEncargo();
        
        for(int i = 0; i<lista.size();i++){
            try {
                nombre = lista.get(i).getCliente();
                
                fechaelab = String.valueOf(lista.get(i).getFechaElaboracion());
                SimpleDateFormat formatoEntrada1 = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha1 = formatoEntrada1.parse(fechaelab);
                SimpleDateFormat formatoSalida1 = new SimpleDateFormat("dd-MM-yyyy");
                String fechaFormateada1 = formatoSalida1.format(fecha1);
                
                fechaent = String.valueOf(lista.get(i).getFechaEntrega());
                SimpleDateFormat formatoEntrada2 = new SimpleDateFormat("yyyy-MM-dd");
                Date fecha2 = formatoEntrada2.parse(fechaent);
                SimpleDateFormat formatoSalida2 = new SimpleDateFormat("dd-MM-yyyy");
                String fechaFormateada2 = formatoSalida2.format(fecha2);
                
                precio = lista.get(i).getPrecio();
                String[] dato = {nombre, fechaFormateada1, fechaFormateada2, precio};
                tabla.addRow(dato);
            } catch (ParseException ex) {
                Logger.getLogger(ListadoEncargos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    private void filtrar(String texto){
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tabla);
        this.TablaEncargos.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(texto));
        
    } 

    private int obtenerPosicionY(){
        Point mouse1 = this.PanelAP.getMousePosition();
        Point mouse2 = this.PanelAP.getLocationOnScreen();
        int y = mouse1.y + mouse2.y;
        return y;
    }

    private int obtenerPosicionX(){
        Point mouse1 = this.PanelAP.getMousePosition();
        Point mouse2 = this.PanelAP.getLocationOnScreen();
        int x = mouse1.x + mouse2.x;
        return x;
    }  

    private Producto obtenerProductoPorId(Long id){
    
        List<Producto> lista = new ArrayList<>();
        lista = servicioProducto.getAllProducto();
        
        for(Producto p : lista){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    
    private Ingrediente obtenerIngredientePorId(Long id){
    
        List<Ingrediente> lista = new ArrayList<>();
        lista = servicioIngrediente.getAll();
        
        for(Ingrediente i : lista){
            if(i.getId().equals(id)){
                return i;
            }
        }
        return null;
    }
    
    private MedidaIngrediente obtenerMedidaPorId(Long id){
    
        List<MedidaIngrediente> lista = new ArrayList<>();
        lista = servicioMedidaIngrediente.getAll();
        
        for(MedidaIngrediente mi : lista){
            if(mi.getId().equals(id)){
                return mi;
            }
        }
        return null;
    }
    
    private Cantidad obtenerCantidadPorId(Long id){
    
        List<Cantidad> lista = new ArrayList<>();
        lista = servicioCantidad.getAll();
        
        for(Cantidad c : lista){
            if(c.getId().equals(id)){
                return c;
            }
        }
        return null;
    }
    
    private Encargo obtenerEncargo(String nombre, String fecha1, String fecha2, String precio){
    
        List<Encargo> lista = new ArrayList<>();
        lista = servicioEncargo.getAllEncargo();
        
        for(Encargo e : lista){
            if(e.getCliente().equals(nombre)&String.valueOf(e.getFechaElaboracion()).equals(fecha1)&
                    String.valueOf(e.getFechaEntrega()).equals(fecha2)&e.getPrecio().equals(precio)){
                return e;
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


