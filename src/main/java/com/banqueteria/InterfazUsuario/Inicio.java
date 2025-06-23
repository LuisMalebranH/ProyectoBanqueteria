package com.banqueteria.InterfazUsuario;


import com.banqueteria.recetario.cantidad.Cantidad;
import com.banqueteria.recetario.cantidad.ServicioCantidad;
import com.banqueteria.recetario.categoria.Categoria;
import com.banqueteria.recetario.categoria.ServicioCategoria;
import com.banqueteria.recetario.ingrediente.Ingrediente;
import com.banqueteria.recetario.ingrediente.ServicioIngrediente;
import com.banqueteria.recetario.listaingredientes.ListaIngredientes;
import com.banqueteria.recetario.listaingredientes.ServicioListaIngredientes;
import com.banqueteria.recetario.medidaingredientes.ServicioMedidaIngrediente;
import com.banqueteria.recetario.producto.Producto;
import com.banqueteria.recetario.producto.ServicioProducto;
import java.awt.Image;
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
        
        this.PanelCalculo.setSize(300, 680); 
        
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

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        PanelFondo = new javax.swing.JPanel();
        PanelCalculo = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        TextBuscarProd = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        PanelProducto = new javax.swing.JPanel();
        LabelNombreProd = new javax.swing.JLabel();
        TextoReceta = new javax.swing.JScrollPane();
        TextoPreparacion = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaIngredientes = new javax.swing.JTable();
        labelImagen = new javax.swing.JLabel();
        btnAgregarProd = new javax.swing.JButton();
        btnIniCalculo = new javax.swing.JButton();
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
        jPopupMenu2.add(jMenuItem2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PanelFondo.setBackground(new java.awt.Color(220, 209, 199));
        PanelFondo.setPreferredSize(new java.awt.Dimension(1200, 800));
        PanelFondo.setRequestFocusEnabled(false);
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Ingrediente", "Cantidad"
            }
        ));
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Producto", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
        }

        javax.swing.GroupLayout PanelCalculoLayout = new javax.swing.GroupLayout(PanelCalculo);
        PanelCalculo.setLayout(PanelCalculoLayout);
        PanelCalculoLayout.setHorizontalGroup(
            PanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        PanelCalculoLayout.setVerticalGroup(
            PanelCalculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCalculoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 338, Short.MAX_VALUE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        PanelFondo.add(PanelCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 340, 730));

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
        TablaProductos.setComponentPopupMenu(jPopupMenu2);
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

        PanelFondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 350, 450));

        PanelProducto.setBackground(new java.awt.Color(189, 160, 127));
        PanelProducto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        LabelNombreProd.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelNombreProd.setText("Nombre Producto");
        LabelNombreProd.setToolTipText("");

        TextoPreparacion.setEditable(false);
        TextoPreparacion.setColumns(20);
        TextoPreparacion.setLineWrap(true);
        TextoPreparacion.setRows(5);
        TextoPreparacion.setWrapStyleWord(true);
        TextoReceta.setViewportView(TextoPreparacion);

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

        labelImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelImagen.setText("Imagen del Producto");
        labelImagen.setToolTipText("");
        labelImagen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                labelImagenMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout PanelProductoLayout = new javax.swing.GroupLayout(PanelProducto);
        PanelProducto.setLayout(PanelProductoLayout);
        PanelProductoLayout.setHorizontalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TextoReceta, javax.swing.GroupLayout.DEFAULT_SIZE, 324, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelProductoLayout.createSequentialGroup()
                        .addComponent(LabelNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelProductoLayout.setVerticalGroup(
            PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelProductoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelProductoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombreProd, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextoReceta, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelFondo.add(PanelProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 230, 340, 450));

        btnAgregarProd.setText("Agregar Producto");
        btnAgregarProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProdActionPerformed(evt);
            }
        });
        PanelFondo.add(btnAgregarProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 710, 170, -1));

        btnIniCalculo.setText("Iniciar Cálculo");
        PanelFondo.add(btnIniCalculo, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 710, 170, -1));

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
        PanelCategoria.add(labeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, 100));

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cat1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addContainerGap())
        );

        PanelCategoria.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 30, 150, 100));

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

        PanelCategoria.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(235, 30, 150, -1));

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

        PanelCategoria.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(395, 30, 150, 100));

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

        PanelCategoria.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 30, 150, 100));

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
        PanelCategoria.add(labeld, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 30, -1, 100));

        PanelFondo.add(PanelCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 810, 150));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelFondo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
                for (int q = 0; q<ingredientesProductos.size();q++){
                    if(ingredientesProductos.get(q).getProducto().getId().equals(p.getId())){
                        ingrediente = buscarIngrediente(ingredientesProductos.get(q).getIngrediente().getId());
                        cantidad = ingredientesProductos.get(q).getCantidad();
                        medida = buscarMedida(ingredientesProductos.get(q).getMedida().getId());
                        String[] prod = {ingrediente,cantidad,medida};
                        tabla.addRow(prod);
                    }
                }
                dispose();
            }
        }
        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void labelImagenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_labelImagenMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_labelImagenMouseClicked

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelNombreProd;
    private javax.swing.JPanel PanelCalculo;
    private javax.swing.JPanel PanelCategoria;
    private javax.swing.JPanel PanelFondo;
    private javax.swing.JPanel PanelProducto;
    private javax.swing.JTable TablaIngredientes;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JTextField TextBuscarProd;
    private javax.swing.JTextArea TextoPreparacion;
    private javax.swing.JScrollPane TextoReceta;
    private javax.swing.JButton btnAgregarProd;
    private javax.swing.JButton btnIniCalculo;
    private javax.swing.JLabel cat1;
    private javax.swing.JLabel cat2;
    private javax.swing.JLabel cat3;
    private javax.swing.JLabel cat4;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel labelImagen;
    private javax.swing.JLabel labeld;
    private javax.swing.JLabel labeli;
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
            String nombre = productos.get(i).getNombre();
            String porciones = productos.get(i).getPorciones();
            String precio = productos.get(i).getPrecio();
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
                ingrediente = buscarIngrediente(ingredientesProductos.get(i).getIngrediente().getId());
                cantidad = ingredientesProductos.get(i).getCantidad();
                medida = buscarMedida(ingredientesProductos.get(i).getMedida().getId());
                String[] prod = {ingrediente,cantidad,medida};
                tabla.addRow(prod);
            }
        }
    
    }
    
    private String buscarIngrediente(Long idingrediente){
        
        ingredientes = servicioIngrediente.getAll();
        
        for (Ingrediente i : ingredientes){
            if(i.getId().equals(idingrediente)){
                return i.getNombre();
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

}
