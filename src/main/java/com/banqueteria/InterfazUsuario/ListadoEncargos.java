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
import java.util.ArrayList;
import java.util.List;
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

        PanelAP = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEncargos = new javax.swing.JTable();
        jPanel_Ingredientes = new javax.swing.JPanel();
        jBtn_Cancelar = new javax.swing.JButton();

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
        PanelAP.add(jPanel_Ingredientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 770));

        jBtn_Cancelar.setBackground(new java.awt.Color(159, 173, 138));
        jBtn_Cancelar.setText("Cancelar");
        jBtn_Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_CancelarActionPerformed(evt);
            }
        });
        PanelAP.add(jBtn_Cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 690, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelAP, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAP, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JPanel PanelAP;
    private javax.swing.JTable TablaEncargos;
    private javax.swing.JButton jBtn_Cancelar;
    private javax.swing.JPanel jPanel_Ingredientes;
    private javax.swing.JScrollPane jScrollPane1;
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
            nombre = lista.get(i).getCliente();
            fechaelab = String.valueOf(lista.get(i).getFechaElaboracion());
            fechaent = String.valueOf(lista.get(i).getFechaEntrega());
            precio = lista.get(i).getPrecio();
            String[] dato = {nombre, fechaelab, fechaent, precio};
            tabla.addRow(dato);
        }
        
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
    
}


