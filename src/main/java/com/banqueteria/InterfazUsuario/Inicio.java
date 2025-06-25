package com.banqueteria.InterfazUsuario;


import com.banqueteria.recetario.cantidad.Cantidad;
import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.Categoria;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ListaIngredientes;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.MedidaIngrediente;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.Producto;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.awt.Image;
import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Locale;


public class Inicio extends javax.swing.JFrame {
    
    DefaultTableModel tabla;
    List<Producto> productos;
    List<Producto> productosFiltrados;
    List<Categoria> categoria;
    List<ListaIngredientes> ingredientesProductos;
    List<Ingrediente> ingredientes;
    List<Cantidad> medida;
    
    private ServicioCategoria servicioCategoria;
    private ServicioIngrediente servicioIngrediente;
    private final ServicioCantidad servicioCantidad;
    private final ServicioProducto servicioProducto;
    private ServicioListaIngredientes servicioListaIngredientes;
    private ServicioMedidaIngrediente servicioMedidaIngrediente;

    public Inicio(
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
        
        this.setLocationRelativeTo(null);
        
        this.setSize(1200, 800);
        
        corregirImagen(this.labeld,"src/main/resources/static/imagend.png");
        corregirImagen(this.labeli,"src/main/resources/static/imageni.png");
        
        llenarCategorias();
        llenarTablaInicio();
        llenarProducto();
        
        ListSelectionModel model = TablaProductos.getSelectionModel();
        model.addListSelectionListener(new ListSelectionListener(){
            public void ValueChanged(ListSelectionEvent e){
                
            }

            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()){
                    int filaSeleccionada = TablaProductos.getSelectedRow();
                    if(filaSeleccionada != -1){
                        String nom = TablaProductos.getValueAt(filaSeleccionada, 0).toString();
                        String receta = buscarProducto(nom).getReceta();
                        listarIngredientes(buscarProducto(nom));
                        TextoPreparacion.setText(receta);
                        LabelNombreProd.setText(nom);
                    }
                }
            }
        });
        
    }

    Inicio() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        popmenuproductos = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        popmenuencargoprod = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        PanelFondo = new javax.swing.JPanel();
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
        TextBuscarProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        PanelProducto = new javax.swing.JPanel();
        LabelNombreProd = new javax.swing.JLabel();
        TextoReceta = new javax.swing.JScrollPane();
        TextoPreparacion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaIngredientes = new javax.swing.JTable();
        btnAgregarProd = new javax.swing.JButton();
        PanelCategoria = new javax.swing.JPanel();
        labeli = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cat1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cat2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cat3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        cat4 = new javax.swing.JLabel();
        labeld = new javax.swing.JLabel();

        jMenuItem2.setText("Modificar producto");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        popmenuproductos.add(jMenuItem2);

        jMenuItem1.setText("Agregar al Encargo");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        popmenuproductos.add(jMenuItem1);

        jMenuItem3.setText("^");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        popmenuencargoprod.add(jMenuItem3);

        jMenuItem4.setText("v");
        jMenuItem4.setToolTipText("");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        popmenuencargoprod.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(220, 209, 199));
        PanelFondo.setPreferredSize(new java.awt.Dimension(1200, 800));
        PanelFondo.setRequestFocusEnabled(false);
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCalculo.setBackground(new java.awt.Color(186, 192, 165));
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
        if (TablaIngEncargo.getColumnModel().getColumnCount() > 0) {
            TablaIngEncargo.getColumnModel().getColumn(0).setResizable(false);
            TablaIngEncargo.getColumnModel().getColumn(1).setResizable(false);
            TablaIngEncargo.getColumnModel().getColumn(2).setResizable(false);
        }

        PanelCalculo.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 320, 280));

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
        TablaEncargo.setComponentPopupMenu(popmenuencargoprod);
        jScrollPane4.setViewportView(TablaEncargo);
        if (TablaEncargo.getColumnModel().getColumnCount() > 0) {
            TablaEncargo.getColumnModel().getColumn(0).setResizable(false);
            TablaEncargo.getColumnModel().getColumn(1).setResizable(false);
            TablaEncargo.getColumnModel().getColumn(2).setResizable(false);
        }

        PanelCalculo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 250));

        jLabel1.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cliente");
        PanelCalculo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));
        PanelCalculo.add(textencargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 30));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Precio estimado");
        PanelCalculo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 120, 30));

        textprecio.setText("0");
        PanelCalculo.add(textprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 130, 30));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelCalculo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 690, 120, -1));

        PanelFondo.add(PanelCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 770));

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

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre", "porciones", "precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaProductos.setComponentPopupMenu(popmenuproductos);
        TablaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TablaProductos.setFillsViewportHeight(true);
        TablaProductos.setName("TablaProductos"); // NOI18N
        TablaProductos.setSelectionBackground(new java.awt.Color(159, 173, 138));
        TablaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaProductos);
        if (TablaProductos.getColumnModel().getColumnCount() > 0) {
            TablaProductos.getColumnModel().getColumn(0).setResizable(false);
            TablaProductos.getColumnModel().getColumn(1).setResizable(false);
        }

        PanelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 350, 450));

        PanelProducto.setBackground(new java.awt.Color(189, 160, 127));
        PanelProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        PanelProducto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelNombreProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNombreProd.setText("Nombre Producto");
        LabelNombreProd.setToolTipText("");
        PanelProducto.add(LabelNombreProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, 39));

        TextoPreparacion.setEditable(false);
        TextoPreparacion.setColumns(20);
        TextoPreparacion.setLineWrap(true);
        TextoPreparacion.setRows(5);
        TextoPreparacion.setWrapStyleWord(true);
        TextoReceta.setViewportView(TextoPreparacion);

        PanelProducto.add(TextoReceta, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 235, 324, 207));

        TablaIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ingrediente", "Cantidad", "Medida"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(TablaIngredientes);
        if (TablaIngredientes.getColumnModel().getColumnCount() > 0) {
            TablaIngredientes.getColumnModel().getColumn(0).setResizable(false);
            TablaIngredientes.getColumnModel().getColumn(1).setResizable(false);
            TablaIngredientes.getColumnModel().getColumn(2).setResizable(false);
        }

        PanelProducto.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 53, 324, 170));

        PanelFondo.add(PanelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 340, 450));

        btnAgregarProd.setBackground(new java.awt.Color(163, 181, 135));
        btnAgregarProd.setText("Agregar Producto");
        btnAgregarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdActionPerformed(evt);
            }
        });
        PanelFondo.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 710, 170, -1));

        PanelCategoria.setBackground(new java.awt.Color(186, 192, 165));
        PanelCategoria.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labeli.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/imageni.png"))); // NOI18N
        labeli.setAutoscrolls(true);
        labeli.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeli.setPreferredSize(new java.awt.Dimension(35, 15));
        labeli.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labeliMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeliMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeliMouseExited(evt);
            }
        });
        PanelCategoria.add(labeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 100));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(150, 100));

        cat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat1, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        PanelCategoria.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, 100));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(150, 100));

        cat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        PanelCategoria.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 150, -1));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel3.setPreferredSize(new java.awt.Dimension(150, 100));

        cat3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat3, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cat3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        PanelCategoria.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 150, 100));

        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cat4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cat4.setPreferredSize(null);
        cat4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cat4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat4, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cat4, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );

        PanelCategoria.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 30, 150, 100));

        labeld.setIcon(new javax.swing.ImageIcon(getClass().getResource("/static/imagend.png"))); // NOI18N
        labeld.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        labeld.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        labeld.setPreferredSize(new java.awt.Dimension(35, 15));
        labeld.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labeldMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                labeldMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                labeldMouseExited(evt);
            }
        });
        PanelCategoria.add(labeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 30, -1, 100));

        PanelFondo.add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 840, 160));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(PanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, 1206, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PanelCalculoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCalculoMouseEntered
               
    }//GEN-LAST:event_PanelCalculoMouseEntered

    private void PanelCalculoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PanelCalculoMouseExited
               
    }//GEN-LAST:event_PanelCalculoMouseExited

    private void labeldMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeldMouseEntered
        this.labeld.setBorder(new BevelBorder(0));
    }//GEN-LAST:event_labeldMouseEntered

    private void TextBuscarProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextBuscarProdMouseClicked
        llenarTabla();
        this.TextBuscarProd.setText("");
    }//GEN-LAST:event_TextBuscarProdMouseClicked

    private void btnAgregarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProdActionPerformed
        AgregarProducto abrir = new AgregarProducto(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente);
        abrir.setVisible(true);
        
        dispose();
    }//GEN-LAST:event_btnAgregarProdActionPerformed

    private void labeliMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeliMouseClicked
    Categoria cn = new Categoria();
            Categoria cv = new Categoria();
            Categoria cu = new Categoria();

            cu = categoria.getLast();
            cv = categoria.get(0);

            for(int i = 0;i<categoria.size()-1;i++){
                cn = cv;
                cv = categoria.get(i+1);
                categoria.set(i+1, cn);
            }

            categoria.set(0, cu);

            reordenarCategorias();        
    }//GEN-LAST:event_labeliMouseClicked

    private void TextBuscarProdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBuscarProdKeyReleased
        String texto = this.TextBuscarProd.getText();
        filtrar(texto);
    }//GEN-LAST:event_TextBuscarProdKeyReleased

    private void TablaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaProductosMouseClicked

    }//GEN-LAST:event_TablaProductosMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked

    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void labeliMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeliMouseEntered
        this.labeli.setBorder(new BevelBorder(0));
    }//GEN-LAST:event_labeliMouseEntered

    private void labeliMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeliMouseExited
        this.labeli.setBorder(new EtchedBorder());
    }//GEN-LAST:event_labeliMouseExited

    private void labeldMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeldMouseExited
        this.labeld.setBorder(new EtchedBorder());
    }//GEN-LAST:event_labeldMouseExited

    private void labeldMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labeldMouseClicked
        Categoria c = new Categoria();
        
        c.setId(categoria.get(0).getId());
        c.setDetalle(categoria.get(0).getDetalle());
        
        categoria.remove(0);
        
        reordenarCategorias();
        
        categoria.add(c);
    }//GEN-LAST:event_labeldMouseClicked

    
    private void cat1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat1MouseClicked
        String categoria = this.cat1.getText();
        TablaProductos.clearSelection();
        llenarTablaPorCategoria(categoria);
    }//GEN-LAST:event_cat1MouseClicked

    private void cat2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat2MouseClicked
        String categoria = this.cat2.getText();
        TablaProductos.clearSelection();
        llenarTablaPorCategoria(categoria);
    }//GEN-LAST:event_cat2MouseClicked

    private void cat3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat3MouseClicked
        String categoria = this.cat3.getText();
        TablaProductos.clearSelection();
        llenarTablaPorCategoria(categoria);
    }//GEN-LAST:event_cat3MouseClicked

    private void cat4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cat4MouseClicked
        String categoria = this.cat4.getText();
        TablaProductos.clearSelection();
        llenarTablaPorCategoria(categoria);
    }//GEN-LAST:event_cat4MouseClicked

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        String nom = TablaProductos.getValueAt(TablaProductos.getSelectedRow(), 0).toString();
        String preparacion = this.TextoPreparacion.getText();
        
        productos = servicioProducto.getAllProducto();
        for(int i = 0;i<productos.size();i++){
            if(nom.equals(productos.get(i).getNombre())){
                Producto p = new Producto();
                p.setId(productos.get(i).getId());
                p.setCategoria(productos.get(i).getCategoria());
                p.setPorciones(productos.get(i).getPorciones());
                p.setPrecio(productos.get(i).getPrecio());
                AgregarProducto abrir = new AgregarProducto(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente);
                abrir.setVisible(true);
                abrir.TextoNombre.setText(nom);
                abrir.TextoReceta.setText(preparacion);
                abrir.labelid.setText(p.getId().toString());
                abrir.textPorcionesProd.setText(p.getPorciones());
                abrir.textPrecioProd.setText(p.getPrecio());
                
                int index = 0;
                String nomcat = obtenerDetalleCategoria(p.getCategoria().getId());
                for(int a = 0;a<abrir.CBCategoria.getItemCount();a++){
                    if(abrir.CBCategoria.getItemAt(index).equals(nomcat)){
                        abrir.CBCategoria.setSelectedIndex(index);
                    }else{
                        index = index + 1;
                    }
                }
                
                ingredientesProductos = servicioListaIngredientes.getAll();
                
                tabla = (DefaultTableModel) abrir.TablaListaIng.getModel();
        
                String ingrediente;
                String cantidad;
                String medida;
                double contador = 0;
        
                for (int q = 0; q<ingredientesProductos.size();q++){
                    if(ingredientesProductos.get(q).getProducto().getId().equals(p.getId())){
                        ingrediente = buscarNombreIngrediente(ingredientesProductos.get(q).getIngrediente().getId());
                        cantidad = ingredientesProductos.get(q).getCantidad();
                        medida = buscarMedida(ingredientesProductos.get(q).getMedida().getId());
                        String[] prod = {ingrediente,cantidad,medida};
                        tabla.addRow(prod);
                        
                        Long id = obtenerIngrediente(ingrediente).getMedidaingrediente().getId();
                        String medida2 = obtenerMedidaIngrediente(id);
                        int cantidadIng = Integer.parseInt(obtenerIngrediente(ingrediente).getCantidad());
                        double precioIng = Double.parseDouble(obtenerIngrediente(ingrediente).getPrecio());
                        
                        contador = contador +redondear(obtenerPrecio(medida,medida2,corregirDecimales(cantidad),precioIng,cantidadIng));
                        
                        
                    }
                }
                AgregarProducto.textPrecioIng.setText(String.valueOf(contador));
                dispose();
            }
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
        CantidadProducto abrir = new CantidadProducto(servicioCantidad,servicioCategoria,servicioIngrediente, 
                                                    servicioProducto,servicioListaIngredientes,servicioMedidaIngrediente);
        abrir.setVisible(true); 
        abrir.setLocation(obtenerPosicionX(), obtenerPosicionY());
        abrir.nombre.setText((String) this.TablaProductos.getValueAt(this.TablaProductos.getSelectedRow(),0));
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       String nom = this.textencargo.getText();
       Document documento = new Document();
       String ruta = "ListaEncargo"+nom+".pdf";
       
        try {
            
            PdfWriter.getInstance(documento, new FileOutputStream(ruta));
            documento.open();
            
            documento.add(new Paragraph("Lista Productos:"));
            documento.add(new Paragraph(" "));
            
            int contadorprod = 0;
            
            for(int a = 0;a<TablaEncargo.getRowCount();a++){
                
                String nombre = TablaEncargo.getValueAt(a,0).toString();
                String cantidad = TablaEncargo.getValueAt(a,1).toString();
                   
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
            
            int contadoring = 0;
            
            for(int b=0;b<TablaIngEncargo.getRowCount();b++){
            
                String nombre = TablaIngEncargo.getValueAt(b,0).toString();
                String cantidad = TablaIngEncargo.getValueAt(b,1).toString();
                String medida = TablaIngEncargo.getValueAt(b,2).toString();
                documento.add(new Paragraph(cantidad+" "+medida+" de "+nombre));
                double precio = Double.parseDouble(buscarIngrediente(nombre).getPrecio());
                double cantidading = Double.parseDouble(buscarIngrediente(nombre).getCantidad());
                documento.add(new Paragraph("Precio estimado del ingrediente: "+String.valueOf(precio)+" pesos por "+cantidading+" "+medida));
                double preciofinal = redondear((precio*Double.parseDouble(cantidad))/cantidading);
                documento.add(new Paragraph("Precio estimado del total necesario: "+preciofinal+" pesos por "+cantidad+" "+medida));
                documento.add(new Paragraph("-----------------------------------------"));
                contadoring = (int) (contadoring + preciofinal);
                
            }
            
            documento.add(new Paragraph(" "));
            documento.add(new Paragraph("Precio final estimado: "+String.valueOf(contadoring)));
            
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
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
        int fila = this.TablaEncargo.getSelectedRow();
        int cantidad  = Integer.parseInt(this.TablaEncargo.getValueAt(fila,1).toString());
        cantidad = cantidad + 1;
        this.TablaEncargo.setValueAt(cantidad,fila,1);
        
        String producto = this.TablaEncargo.getValueAt(this.TablaEncargo.getSelectedRow(),0).toString();
        int precio = Integer.parseInt(this.textprecio.getText());
        for(int q = 0;q<this.TablaProductos.getRowCount();q++){
            if(this.TablaProductos.getValueAt(q,0).equals(producto)){
                precio = precio + Integer.parseInt(this.TablaProductos.getValueAt(q,2).toString());
                this.textprecio.setText(String.valueOf(precio));
            }
        }
        
        for(int i = 0;i<this.TablaIngredientes.getRowCount();i++){
            String ingrediente = this.TablaIngredientes.getValueAt(i,0).toString();
            String cantidading = this.TablaIngredientes.getValueAt(i,1).toString();
            String medida = this.TablaIngredientes.getValueAt(i,2).toString();
            
            for(int t = 0;t<this.TablaIngEncargo.getRowCount();t++){
                if(this.TablaIngEncargo.getValueAt(t,0).equals(ingrediente)){
                    Double cantidadn = obtenerCantidad(medida,this.TablaIngEncargo.getValueAt(t,2).toString(),corregirDecimales(cantidading));
                    Double cantidade = Double.parseDouble(this.TablaIngEncargo.getValueAt(t,1).toString());
                    Double cantidadf = cantidadn + cantidade;
                    this.TablaIngEncargo.setValueAt(String.format(Locale.ENGLISH,"%.2f",cantidadf),t,1);
                }
            }
                                  
        }
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       
        int fila = this.TablaEncargo.getSelectedRow();
        int cantidad  = Integer.parseInt(this.TablaEncargo.getValueAt(fila,1).toString());
        cantidad = cantidad - 1;
        this.TablaEncargo.setValueAt(cantidad,fila,1);
        
        String producto = this.TablaEncargo.getValueAt(this.TablaEncargo.getSelectedRow(),0).toString();
        int precio = Integer.parseInt(this.textprecio.getText());
        for(int q = 0;q<this.TablaProductos.getRowCount();q++){
            if(this.TablaProductos.getValueAt(q,0).equals(producto)){
                precio = precio - Integer.parseInt(this.TablaProductos.getValueAt(q,2).toString());
                this.textprecio.setText(String.valueOf(precio));
            }
        }
        
        for(int i = 0;i<this.TablaIngredientes.getRowCount();i++){
            String ingrediente = this.TablaIngredientes.getValueAt(i,0).toString();
            String cantidading = this.TablaIngredientes.getValueAt(i,1).toString();
            String medida = this.TablaIngredientes.getValueAt(i,2).toString();
            
            for(int t = 0;t<this.TablaIngEncargo.getRowCount();t++){
                if(this.TablaIngEncargo.getValueAt(t,0).equals(ingrediente)){
                    Double cantidadn = obtenerCantidad(medida,this.TablaIngEncargo.getValueAt(t,2).toString(),corregirDecimales(cantidading));
                    Double cantidade = Double.parseDouble(this.TablaIngEncargo.getValueAt(t,1).toString());
                    Double cantidadf = cantidade - cantidadn;
                    this.TablaIngEncargo.setValueAt(String.format(Locale.ENGLISH,"%.2f",cantidadf),t,1);
                }
            }
                                  
        }
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNombreProd;
    private javax.swing.JPanel PanelCalculo;
    private javax.swing.JPanel PanelCategoria;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelProducto;
    public static javax.swing.JTable TablaEncargo;
    public static javax.swing.JTable TablaIngEncargo;
    public static javax.swing.JTable TablaIngredientes;
    public static javax.swing.JTable TablaProductos;
    private javax.swing.JTextField TextBuscarProd;
    private javax.swing.JTextArea TextoPreparacion;
    private javax.swing.JScrollPane TextoReceta;
    private javax.swing.JButton btnAgregarProd;
    private javax.swing.JLabel cat1;
    private javax.swing.JLabel cat2;
    private javax.swing.JLabel cat3;
    private javax.swing.JLabel cat4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel labeld;
    private javax.swing.JLabel labeli;
    private javax.swing.JPopupMenu popmenuencargoprod;
    private javax.swing.JPopupMenu popmenuproductos;
    private javax.swing.JTextField textencargo;
    public static javax.swing.JTextField textprecio;
    // End of variables declaration//GEN-END:variables

    private void corregirImagen(JLabel label, String root){
    
        ImageIcon image = new ImageIcon(root);
        Icon icon = new ImageIcon(
            image.getImage().getScaledInstance(
                label.getWidth(), label.getHeight(), Image.SCALE_DEFAULT));
        label.setIcon(icon);
        
    }
        
    private void llenarTablaInicio(){
        
        String nomcat=this.cat1.getText();
        
        productos = servicioProducto.getAllProducto();
        List<Producto> productosFiltrados = new ArrayList<>();
        
        if(productos.isEmpty()){
            String dato = "lista vacía";
            String[] prod = {dato,"",""};
            tabla = (DefaultTableModel) this.TablaProductos.getModel();
            tabla.addRow(prod);
        }else{
            for(int i=0;i<productos.size();i++){
                if(productos.get(i).getCategoria().getId().equals(filtrarCategoria(nomcat))){
                   productosFiltrados.add(productos.get(i));
                }
            }
            
            for (int i = 0; i<productosFiltrados.size();i++){
                String nombre = productosFiltrados.get(i).getNombre();
                String porciones = productosFiltrados.get(i).getPorciones();
                String precio = productosFiltrados.get(i).getPrecio();
                String[] prod = {nombre,porciones,precio};
                tabla = (DefaultTableModel) this.TablaProductos.getModel();
                tabla.addRow(prod);
            }
            
        }
           
    }
    
    private void llenarTabla(){
        
        tabla = (DefaultTableModel) this.TablaProductos.getModel();
        
        while(tabla.getRowCount()>0)tabla.removeRow(0); 
        
        productos = servicioProducto.getAllProducto();
        
        for (int i = 0; i<productos.size();i++){
            String nombre = productos.get(i).getNombre();
            String porciones = productos.get(i).getPorciones();
            String precio = productos.get(i).getPrecio();
            String[] prod = {nombre,porciones,precio};
            tabla = (DefaultTableModel) this.TablaProductos.getModel();
            tabla.addRow(prod);
        }
    
    }
    
    private void llenarTablaPorCategoria(String categoria){
        
        tabla = (DefaultTableModel) this.TablaProductos.getModel();
        
        while(tabla.getRowCount()>0)tabla.removeRow(0);
        
        productos = servicioProducto.getAllProducto();
        productosFiltrados = new ArrayList();
        
        for(int i=0;i<productos.size();i++){
            if(productos.get(i).getCategoria().getId().equals(filtrarCategoria(categoria))){
                productosFiltrados.add(productos.get(i));
            }
        }   
        
        for (int i = 0; i<productosFiltrados.size();i++){
            String nombre = productosFiltrados.get(i).getNombre();
            String porciones = productosFiltrados.get(i).getPorciones();
            String precio = productosFiltrados.get(i).getPrecio();
            String[] prod = {nombre,porciones,precio};
            tabla = (DefaultTableModel) this.TablaProductos.getModel();
            tabla.addRow(prod);
        }
    
    }
    
    private Long filtrarCategoria(String nomcat){
        
        Categoria c = new Categoria();
        Long id = null;
        
        for(int i=0;i<categoria.size();i++){
            if(categoria.get(i).getDetalle().equals(nomcat)){
                c = categoria.get(i);
                id = c.getId();
            }
        }
        
        return id;
        
    }

    private void llenarProducto(){
        
        if(productos.isEmpty()){
            this.TextoPreparacion.setText("");
            this.LabelNombreProd.setText("Nombre Producto");
        }else{
            String receta = productos.get(0).getReceta();
            String nombre  = productos.get(0).getNombre();
            this.TextoPreparacion.setText(receta);
            this.LabelNombreProd.setText(nombre);
            listarIngredientes(productos.get(0));
        }
        
    }
    
    private void llenarCategorias(){
    
        categoria = servicioCategoria.getAll();
        
        if (categoria.size()<5){
            this.labeli.setVisible(false);
            this.labeld.setVisible(false);
            switch (categoria.size()) {
                case 1:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    break;
                case 2:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    break;
                case 3:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    this.cat3.setText(categoria.get(2).getDetalle());
                    break;
                case 4: 
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    this.cat3.setText(categoria.get(2).getDetalle());
                    this.cat4.setText(categoria.get(3).getDetalle());
                    break;
                default:
                    break;
            }
            
        } else {
            this.labeli.setVisible(true);
            this.labeld.setVisible(true);
            this.cat1.setText(categoria.get(0).getDetalle());
            this.cat2.setText(categoria.get(1).getDetalle());
            this.cat3.setText(categoria.get(2).getDetalle());
            this.cat4.setText(categoria.get(3).getDetalle());
        }
    
    }
    
    private void reordenarCategorias(){
        
        if (categoria.size()<5){
            switch (categoria.size()) {
                case 1:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    break;
                case 2:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    break;
                case 3:
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    this.cat3.setText(categoria.get(2).getDetalle());
                    break;
                case 4: 
                    this.cat1.setText(categoria.get(0).getDetalle());
                    this.cat2.setText(categoria.get(1).getDetalle());
                    this.cat3.setText(categoria.get(2).getDetalle());
                    this.cat4.setText(categoria.get(3).getDetalle());
                    break;
                default:
                    break;
            }
            
        } else {
            this.labeli.setVisible(true);
            this.labeld.setVisible(true);
            this.cat1.setText(categoria.get(0).getDetalle());
            this.cat2.setText(categoria.get(1).getDetalle());
            this.cat3.setText(categoria.get(2).getDetalle());
            this.cat4.setText(categoria.get(3).getDetalle());
        }
    
    }

    private void filtrar(String texto){
    
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(tabla);
        this.TablaProductos.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(texto));
        
    }
    
    private void listarIngredientes(Producto p){
        
        tabla = (DefaultTableModel) this.TablaIngredientes.getModel();
        
        while(tabla.getRowCount()>0)tabla.removeRow(0);
        
        Long id = p.getId();
        
        ingredientesProductos = servicioListaIngredientes.getAll();
        
        String ingrediente;
        String cantidad;
        String medida;
        
        for (int i = 0; i<ingredientesProductos.size();i++){
            if(ingredientesProductos.get(i).getProducto().getId().equals(id)){
                ingrediente = buscarNombreIngrediente(ingredientesProductos.get(i).getIngrediente().getId());
                cantidad = ingredientesProductos.get(i).getCantidad();
                medida = buscarMedida(ingredientesProductos.get(i).getMedida().getId());
                String[] prod = {ingrediente,cantidad,medida};
                tabla.addRow(prod);
            }
        }
    
    }
    
    private String buscarNombreIngrediente(Long idingrediente){
        
        ingredientes = servicioIngrediente.getAll();
        
        for (Ingrediente i : ingredientes){
            if(i.getId().equals(idingrediente)){
                return i.getNombre();
            }
        }
        return null;
    }
    
    private Ingrediente buscarIngrediente(String nombre){
    
        ingredientes = servicioIngrediente.getAll();
        
        for (Ingrediente i : ingredientes){
            if(i.getNombre().equals(nombre)){
                return i;
            }
        }
        return null;
        
    }
    
    private String buscarMedidaCompraIngrediente(Long id){
        
        List<MedidaIngrediente> medida = servicioMedidaIngrediente.getAll();
        
        for (MedidaIngrediente mi : medida){
            if(mi.getId().equals(id)){
                return mi.getDetalle();
            }
        }
        return null;
    }
    
    private String buscarMedida(Long idmedida){
        
        medida = servicioCantidad.getAll();
        
        for (Cantidad c : medida){
            if(c.getId().equals(idmedida)){
                return c.getDescripcion();
            }
        }
        return null;
    }
    
    private Producto buscarProducto(String nombre){
        
        for (Producto p : productos){
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;
    }
    
    private String obtenerDetalleCategoria(Long id){
        
        categoria = servicioCategoria.getAll();
        
        for(int i = 0;i<categoria.size();i++){
            if(categoria.get(i).getId().equals(id)){
                return categoria.get(i).getDetalle();
            }
        }
        return null;
    }
    
    private int obtenerPosicionY(){
        Point mouse1 = this.PanelFondo.getMousePosition();
        Point mouse2 = this.PanelFondo.getLocationOnScreen();
        int y = mouse1.y + mouse2.y;
        return y;
    }

    private int obtenerPosicionX(){
        Point mouse1 = this.PanelFondo.getMousePosition();
        Point mouse2 = this.PanelFondo.getLocationOnScreen();
        int x = mouse1.x + mouse2.x;
        return x;
    }
    
    private double redondear(double valor){
        
        double redondeado = Math.round(valor * 10) / 10;
        return redondeado;
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
    
        List <MedidaIngrediente> ListaMedIng = servicioMedidaIngrediente.getAll();
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
