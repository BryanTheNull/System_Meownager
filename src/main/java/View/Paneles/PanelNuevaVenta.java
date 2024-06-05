package View.Paneles;


public class PanelNuevaVenta extends javax.swing.JPanel {

    public PanelNuevaVenta() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgound = new javax.swing.JPanel();
        panelBarraSuperior = new javax.swing.JPanel();
        txtInformacion = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();
        jPanelDatos = new javax.swing.JPanel();
        lbTituloLogin1 = new javax.swing.JLabel();
        txtID_Cliente = new javax.swing.JTextField();
        jComboBoxClientes = new javax.swing.JComboBox<>();
        lbTituloLogin2 = new javax.swing.JLabel();
        txtID_Producto = new javax.swing.JTextField();
        jComboBoxProductos = new javax.swing.JComboBox<>();
        btnAgregarProducto = new javax.swing.JButton();
        jSpinnerCantidad = new javax.swing.JSpinner();
        txtPrecioUnitario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVenta = new javax.swing.JTable();
        lbTituloLogin3 = new javax.swing.JLabel();
        txtNroVenta = new javax.swing.JTextField();
        btnRealizarVenta = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnCancelarVenta = new javax.swing.JButton();
        lbTituloLogin4 = new javax.swing.JLabel();
        txtTotalPagar = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));
        setPreferredSize(new java.awt.Dimension(950, 700));

        backgound.setBackground(new java.awt.Color(250, 251, 253));
        backgound.setMaximumSize(new java.awt.Dimension(950, 700));
        backgound.setMinimumSize(new java.awt.Dimension(950, 700));
        backgound.setPreferredSize(new java.awt.Dimension(950, 700));

        panelBarraSuperior.setBackground(new java.awt.Color(14, 164, 157));
        panelBarraSuperior.setMaximumSize(new java.awt.Dimension(950, 100));
        panelBarraSuperior.setMinimumSize(new java.awt.Dimension(950, 100));

        txtInformacion.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtInformacion.setForeground(new java.awt.Color(255, 255, 255));
        txtInformacion.setText("Meownager/ Realizando nueva venta");

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(576, Short.MAX_VALUE))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtInformacion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        txtMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMensaje.setText("Bienvenido a tu sistema favorito ♥");

        jPanelDatos.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanelDatos.setOpaque(false);

        lbTituloLogin1.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lbTituloLogin1.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuario (3).png"))); // NOI18N
        lbTituloLogin1.setText("Datos Cliente");

        txtID_Cliente.setEditable(false);
        txtID_Cliente.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        jComboBoxClientes.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        lbTituloLogin2.setFont(new java.awt.Font("Roboto Medium", 1, 14)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/caja (2).png"))); // NOI18N
        lbTituloLogin2.setText("Datos Producto");

        txtID_Producto.setEditable(false);
        txtID_Producto.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        jComboBoxProductos.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        btnAgregarProducto.setBackground(new java.awt.Color(14, 207, 181));
        btnAgregarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setText("Agregar Producto");

        jSpinnerCantidad.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        jSpinnerCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, null, 1));

        txtPrecioUnitario.setEditable(false);
        txtPrecioUnitario.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanelDatosLayout = new javax.swing.GroupLayout(jPanelDatos);
        jPanelDatos.setLayout(jPanelDatosLayout);
        jPanelDatosLayout.setHorizontalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanelDatosLayout.createSequentialGroup()
                                .addComponent(txtID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                .addComponent(jComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnAgregarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanelDatosLayout.createSequentialGroup()
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jSpinnerCantidad)
                                    .addComponent(txtID_Producto))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBoxProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTituloLogin1))
                    .addGroup(jPanelDatosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbTituloLogin2)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanelDatosLayout.setVerticalGroup(
            jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDatosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lbTituloLogin1)
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtID_Cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(lbTituloLogin2)
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtID_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioUnitario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSpinnerCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jTableVenta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nro Detalle", "Nro Porducto", "Producto", "Cantidad ", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTableVenta);

        lbTituloLogin3.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lbTituloLogin3.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin3.setText("NRO. VENTA");

        txtNroVenta.setEditable(false);
        txtNroVenta.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        txtNroVenta.setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        btnRealizarVenta.setBackground(new java.awt.Color(34, 175, 50));
        btnRealizarVenta.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnRealizarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnRealizarVenta.setText("Realizar Venta");

        btnEliminarProducto.setBackground(new java.awt.Color(229, 242, 36));
        btnEliminarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar Producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        btnCancelarVenta.setBackground(new java.awt.Color(219, 55, 36));
        btnCancelarVenta.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnCancelarVenta.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelarVenta.setText("Cancelar Venta");
        btnCancelarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarVentaActionPerformed(evt);
            }
        });

        lbTituloLogin4.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N
        lbTituloLogin4.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin4.setText("Total a pagar");

        txtTotalPagar.setEditable(false);
        txtTotalPagar.setFont(new java.awt.Font("Roboto Medium", 1, 18)); // NOI18N

        javax.swing.GroupLayout backgoundLayout = new javax.swing.GroupLayout(backgound);
        backgound.setLayout(backgoundLayout);
        backgoundLayout.setHorizontalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgoundLayout.createSequentialGroup()
                        .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgoundLayout.createSequentialGroup()
                                .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)
                                .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgoundLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbTituloLogin4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTotalPagar)
                            .addComponent(btnCancelarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE))))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgoundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloLogin3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        backgoundLayout.setVerticalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNroVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTituloLogin3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgoundLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTotalPagar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTituloLogin4))
                        .addGap(18, 18, 18)
                        .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRealizarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelarVenta, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(100, 100, 100))
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

        getAccessibleContext().setAccessibleName("");
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void btnCancelarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarVentaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel backgound;
    public javax.swing.JButton btnAgregarProducto;
    public javax.swing.JButton btnCancelarVenta;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnRealizarVenta;
    public javax.swing.JComboBox<String> jComboBoxClientes;
    public javax.swing.JComboBox<String> jComboBoxProductos;
    private javax.swing.JPanel jPanelDatos;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JSpinner jSpinnerCantidad;
    public javax.swing.JTable jTableVenta;
    private javax.swing.JLabel lbTituloLogin1;
    private javax.swing.JLabel lbTituloLogin2;
    private javax.swing.JLabel lbTituloLogin3;
    private javax.swing.JLabel lbTituloLogin4;
    private javax.swing.JPanel panelBarraSuperior;
    public javax.swing.JTextField txtID_Cliente;
    public javax.swing.JTextField txtID_Producto;
    private javax.swing.JLabel txtInformacion;
    private javax.swing.JLabel txtMensaje;
    public javax.swing.JTextField txtNroVenta;
    public javax.swing.JTextField txtPrecioUnitario;
    public javax.swing.JTextField txtTotalPagar;
    // End of variables declaration//GEN-END:variables
}
