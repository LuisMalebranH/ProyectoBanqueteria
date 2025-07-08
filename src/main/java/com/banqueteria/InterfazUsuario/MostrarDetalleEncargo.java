
package com.banqueteria.InterfazUsuario;

import static com.banqueteria.InterfazUsuario.Inicio.TablaEncargo;
import static com.banqueteria.InterfazUsuario.Inicio.TablaIngEncargo;
import com.banqueteria.recetario.cantidad.Cantidad;
import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.detalleencargo.DetalleEncargo;
import com.banqueteria.recetario.detalleencargo.ServicioDetalleEncargo;
import com.banqueteria.recetario.encargo.Encargo;
import com.banqueteria.recetario.encargo.ServicioEncargo;
import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.MedidaIngrediente;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.Producto;
import com.banqueteria.recetario.producto.ServicioProducto;
import com.banqueteria.recetario.transformacionunidades.Unidades;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MostrarDetalleEncargo extends javax.swing.JFrame {
    
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

    public MostrarDetalleEncargo(
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

        PanelCalculo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaIngEncargo = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaEncargo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        textencargo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        textprecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jfecha = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        labelfecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCalculo.setBackground(new java.awt.Color(186, 192, 165));
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
        PanelCalculo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaIngEncargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Cantidad", "Medida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaIngEncargo);

        PanelCalculo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, 320, 270));

        TablaEncargo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad", "Total Porciones"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(TablaEncargo);

        PanelCalculo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 320, 180));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente");
        PanelCalculo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));
        PanelCalculo.add(textencargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Precio estimado");
        PanelCalculo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 120, 30));

        textprecio.setText("0");
        PanelCalculo.add(textprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 130, 30));

        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelCalculo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 720, 120, -1));
        PanelCalculo.add(jfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 82, 130, 30));

        jButton2.setText("Repetir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelCalculo.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 720, 110, -1));
        PanelCalculo.add(labelfecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 130, 30));

        getContentPane().add(PanelCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void PanelCalculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCalculoMouseEntered

    }//GEN-LAST:event_PanelCalculoMouseEntered

    private void PanelCalculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCalculoMouseExited

    }//GEN-LAST:event_PanelCalculoMouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        long fecha = jfecha.getDate().getTime();
        java.sql.Date sqlfecha = new java.sql.Date(fecha);
        System.out.println(sqlfecha);
        System.out.println(this.labelfecha.getText());
        
        if(String.valueOf(sqlfecha).equals(this.labelfecha.getText())){
            
            JOptionPane.showMessageDialog(null,"Es necesario modificar la fecha","Alerta",JOptionPane.INFORMATION_MESSAGE);
        
        }else{
            
            Date hoy = new Date(System.currentTimeMillis());
            java.sql.Date sqlfechahoy = new java.sql.Date(hoy.getTime());
        
            String nom = this.textencargo.getText();
        
            Document documento = new Document();
            String ruta = "ListaEncargo"+nom+".pdf";

            try {

                PdfWriter.getInstance(documento, new FileOutputStream(ruta));
                documento.open();

                documento.add(new Paragraph("Lista Productos:"));
                documento.add(new Paragraph(" "));

                int contadorprod = 0;

                for(int a = 0;a<this.TablaEncargo.getRowCount();a++){

                    String nombre = this.TablaEncargo.getValueAt(a,0).toString();
                    String cantidad = this.TablaEncargo.getValueAt(a,1).toString();

                    documento.add(new Paragraph(cantidad+" "+nombre));
                    String precio = buscarProducto(nombre).getPrecio();
                    documento.add(new Paragraph("Precio por unidad: "+precio+" pesos"));
                    int preciototal = Integer.parseInt(precio)*Integer.parseInt(cantidad);
                    documento.add(new Paragraph("Precio total del producto: "+preciototal+" pesos"));
                    documento.add(new Paragraph("-----------------------------------------"));
                    contadorprod = contadorprod + preciototal;

                }

                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Costo total del encargo: "+contadorprod));
                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Lista Ingredientes:"));
                documento.add(new Paragraph(" "));

                int contadorprecio = 0;

                for(int b=0;b<TablaIngEncargo.getRowCount();b++){

                    String nombre = TablaIngEncargo.getValueAt(b,0).toString();
                    String cantidad = TablaIngEncargo.getValueAt(b,1).toString();
                    String medida = TablaIngEncargo.getValueAt(b,2).toString();
                    documento.add(new Paragraph(cantidad+" "+medida+" de "+nombre));
                    double precio = Double.parseDouble(buscarIngrediente(nombre).getPrecio());
                    double cantidading = Double.parseDouble(buscarIngrediente(nombre).getCantidad());
                    documento.add(new Paragraph("Precio estimado del ingrediente: "+String.valueOf(precio)+" pesos por "+cantidading+" "+medida));
                    
                    if(!cantidad.equals("0.0")){
                        int contadoringrediente = 1;
                        while(Double.parseDouble(cantidad)>(cantidading*contadoringrediente)){
                            contadoringrediente = contadoringrediente + 1;
                        }
                        double preciofinal = redondear((precio*contadoringrediente));
                        documento.add(new Paragraph("Precio estimado del total necesario: "+String.valueOf(precio*contadoringrediente)+" pesos por "+
                                        contadoringrediente+" paquete de "+cantidading+" "+medida));
                        documento.add(new Paragraph("Sobra del ingrediente por cantidad totalcomprada: "+((cantidading*contadoringrediente)-Double.parseDouble(cantidad))+" "+medida));
                        documento.add(new Paragraph("-----------------------------------------"));
                        contadorprecio = (int) (contadorprecio + preciofinal);
                    }else{
                        documento.add(new Paragraph("Sobra del ingrediente por cantidad totalcomprada: "+(cantidading-Double.parseDouble(cantidad))+" "+medida));
                        documento.add(new Paragraph("-----------------------------------------"));
                        contadorprecio = (int) (contadorprecio + precio);
                    }                    
                    

                }

                documento.add(new Paragraph(" "));
                documento.add(new Paragraph("Precio final estimado: "+String.valueOf(contadorprecio)));

            } catch (DocumentException | FileNotFoundException e) {
                e.printStackTrace();
            } finally {
                documento.close();
            }

            File archivo = new File(ruta);
            if(archivo.exists()){
               try {
                   Desktop.getDesktop().open(archivo);
               } catch (IOException ex) {
                   System.out.println("Error al abrir el archivo");
               }
            }
            
            Encargo e = new Encargo();
            e.setCliente(nom);
            e.setFechaEntrega(sqlfecha);
            e.setFechaElaboracion(sqlfechahoy);
            e.setPrecio(this.textprecio.getText());

            servicioEncargo.save(e);    

            for(int i = 0;i<TablaEncargo.getRowCount();i++){
                DetalleEncargo de = new DetalleEncargo();
                de.setEncargo(e);
                de.setProducto(obtenerProducto(TablaEncargo.getValueAt(i,0).toString()));
                de.setCantidad(TablaEncargo.getValueAt(i,1).toString());
                servicioDetalleEncargo.save(de);
            }
            
            dispose();
        
        }
        
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelCalculo;
    public static javax.swing.JTable TablaEncargo;
    public static javax.swing.JTable TablaIngEncargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    public static com.toedter.calendar.JDateChooser jfecha;
    public static javax.swing.JLabel labelfecha;
    public static javax.swing.JTextField textencargo;
    public static javax.swing.JTextField textprecio;
    // End of variables declaration//GEN-END:variables

    private void AgregarValorTabla(String nombre, String cantidad, String medida){
        
        String datos [] = {nombre, cantidad, medida};
        
        tabla = (DefaultTableModel) AgregarProducto.TablaListaIng.getModel();
        tabla.addRow(datos);
        
    }
    
    private int obtenerPosicionY(){
        Point mouse2 = this.PanelCalculo.getLocationOnScreen();
        int y = mouse2.y;
        return y;
    }

    private int obtenerPosicionX(){
        Point mouse2 = this.PanelCalculo.getLocationOnScreen();
        int x = mouse2.x;
        return x;
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
    
    private Ingrediente buscarIngrediente(String nombre){
        
        List<Ingrediente> ingredientes = new ArrayList<>();
        ingredientes = servicioIngrediente.getAll();
        
        for (Ingrediente i : ingredientes){
            if(i.getNombre().equals(nombre)){
                return i;
            }
        }
        return null;
        
    }
    
    private Producto buscarProducto(String nombre){
        
        List<Producto> productos = new ArrayList<>();
        productos = servicioProducto.getAllProducto();
        
        for (Producto p : productos){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    private Producto obtenerProducto(String nombre){
    
        List<Producto> prod = new ArrayList<>();
        prod = servicioProducto.getAllProducto();
        for(Producto p : prod){
            if(p.getNombre().equals(nombre)){
                return p;
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
    
}


