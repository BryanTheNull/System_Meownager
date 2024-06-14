package View.Paneles;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class PanelProductos extends javax.swing.JPanel {

    public PanelProductos() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        backgound = new javax.swing.JPanel();
        txtMensaje = new javax.swing.JLabel();
        panelBarraSuperior = new javax.swing.JPanel();
        txtInformacion = new javax.swing.JLabel();
        txtInformacion1 = new javax.swing.JLabel();
        jComboBoxFiltrarPor = new javax.swing.JComboBox<>();
        txtInformacion2 = new javax.swing.JLabel();
        txtBuscador = new javax.swing.JTextField();
        btnAgregarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnActualizarPagina = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setMaximumSize(new java.awt.Dimension(950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));
        setPreferredSize(new java.awt.Dimension(950, 700));

        backgound.setBackground(new java.awt.Color(250, 251, 253));
        backgound.setMaximumSize(new java.awt.Dimension(950, 700));
        backgound.setMinimumSize(new java.awt.Dimension(950, 700));
        backgound.setPreferredSize(new java.awt.Dimension(950, 700));
        backgound.setRequestFocusEnabled(false);

        txtMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMensaje.setText("Bienvenido a tu sistema favorito ♥");

        panelBarraSuperior.setBackground(new java.awt.Color(14, 164, 157));
        panelBarraSuperior.setMaximumSize(new java.awt.Dimension(950, 100));
        panelBarraSuperior.setMinimumSize(new java.awt.Dimension(950, 100));

        txtInformacion.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtInformacion.setForeground(new java.awt.Color(255, 255, 255));
        txtInformacion.setText("Meownager/ Administracion de Productos");

        txtInformacion1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtInformacion1.setForeground(new java.awt.Color(255, 255, 255));
        txtInformacion1.setText("FILTRAR POR:");
        txtInformacion1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        jComboBoxFiltrarPor.setBackground(new java.awt.Color(14, 164, 157));
        jComboBoxFiltrarPor.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jComboBoxFiltrarPor.setForeground(new java.awt.Color(255, 255, 255));
        jComboBoxFiltrarPor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "N° de Producto", "Nombre de Proveedor", "Nombre de Categoria", "Nombre de Producto", "Codigo de Producto", "Precio de Producto", "Stock de Productos" }));
        jComboBoxFiltrarPor.setOpaque(false);

        txtInformacion2.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtInformacion2.setForeground(new java.awt.Color(255, 255, 255));
        txtInformacion2.setText("BUSCADOR:");

        txtBuscador.setBackground(new java.awt.Color(14, 164, 157));
        txtBuscador.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtBuscador.setForeground(new java.awt.Color(255, 255, 255));
        txtBuscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscadorKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                        .addComponent(txtInformacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxFiltrarPor, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(txtInformacion2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInformacion1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxFiltrarPor, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(txtInformacion2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnAgregarProducto.setBackground(new java.awt.Color(14, 207, 181));
        btnAgregarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setText("Agregar Producto");
        btnAgregarProducto.setMaximumSize(new java.awt.Dimension(170, 50));
        btnAgregarProducto.setMinimumSize(new java.awt.Dimension(170, 50));
        btnAgregarProducto.setPreferredSize(new java.awt.Dimension(170, 50));
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setBackground(new java.awt.Color(14, 207, 181));
        btnEliminarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.setMaximumSize(new java.awt.Dimension(170, 50));
        btnEliminarProducto.setMinimumSize(new java.awt.Dimension(170, 50));
        btnEliminarProducto.setPreferredSize(new java.awt.Dimension(170, 50));

        btnModificarProducto.setBackground(new java.awt.Color(14, 207, 181));
        btnModificarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProducto.setText("Modificar Producto");
        btnModificarProducto.setMaximumSize(new java.awt.Dimension(170, 50));
        btnModificarProducto.setMinimumSize(new java.awt.Dimension(170, 50));
        btnModificarProducto.setPreferredSize(new java.awt.Dimension(170, 50));

        btnActualizarPagina.setBackground(new java.awt.Color(14, 207, 181));
        btnActualizarPagina.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnActualizarPagina.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarPagina.setText("Actualizar Pagina");
        btnActualizarPagina.setMaximumSize(new java.awt.Dimension(170, 50));
        btnActualizarPagina.setMinimumSize(new java.awt.Dimension(170, 50));
        btnActualizarPagina.setPreferredSize(new java.awt.Dimension(170, 50));

        jScrollPane2.setBorder(null);

        jTableProductos.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Proveedor", "Categoria", "Nombre", "Descripcion", "Codigo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableProductos);
        if (jTableProductos.getColumnModel().getColumnCount() > 0) {
            jTableProductos.getColumnModel().getColumn(0).setMinWidth(30);
            jTableProductos.getColumnModel().getColumn(0).setMaxWidth(30);
            jTableProductos.getColumnModel().getColumn(1).setResizable(false);
            jTableProductos.getColumnModel().getColumn(2).setResizable(false);
            jTableProductos.getColumnModel().getColumn(3).setResizable(false);
            jTableProductos.getColumnModel().getColumn(4).setResizable(false);
            jTableProductos.getColumnModel().getColumn(5).setResizable(false);
            jTableProductos.getColumnModel().getColumn(6).setResizable(false);
            jTableProductos.getColumnModel().getColumn(7).setResizable(false);
        }

        javax.swing.GroupLayout backgoundLayout = new javax.swing.GroupLayout(backgound);
        backgound.setLayout(backgoundLayout);
        backgoundLayout.setHorizontalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgoundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgoundLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnActualizarPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgoundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        backgoundLayout.setVerticalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnModificarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizarPagina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscadorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscadorKeyTyped
        int filtroSeleccionado = jComboBoxFiltrarPor.getSelectedIndex();

        switch (filtroSeleccionado) {

            case 0:
                filtrarColumna(0);
                break;

            case 1:
                filtrarColumna(1);
                break;

            case 2:
                filtrarColumna(2);
                break;

            case 3:
                filtrarColumna(3);
                break;

            case 4:
                filtrarColumna(5);
                break;

            case 5:
                filtrarColumna(6);
                break;

            case 6:
                filtrarColumna(7);
                break;

        }
    }//GEN-LAST:event_txtBuscadorKeyTyped

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    void filtrarColumna(int columnaIndice) {
        txtBuscador.addKeyListener(new KeyAdapter() {

            public void keyReleased(KeyEvent ke) {
                TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>((DefaultTableModel) jTableProductos.getModel());
                jTableProductos.setRowSorter(trs);
                trs.setRowFilter(RowFilter.regexFilter("(?i)^"+txtBuscador.getText(), columnaIndice));
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgound;
    public javax.swing.JButton btnActualizarPagina;
    public javax.swing.JButton btnAgregarProducto;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnModificarProducto;
    private javax.swing.JComboBox<String> jComboBoxFiltrarPor;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTableProductos;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JTextField txtBuscador;
    private javax.swing.JLabel txtInformacion;
    private javax.swing.JLabel txtInformacion1;
    private javax.swing.JLabel txtInformacion2;
    private javax.swing.JLabel txtMensaje;
    // End of variables declaration//GEN-END:variables
}
