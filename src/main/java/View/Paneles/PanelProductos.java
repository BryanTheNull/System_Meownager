package View.Paneles;


public class PanelProductos extends javax.swing.JPanel {


    public PanelProductos() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        backgound = new javax.swing.JPanel();
        txtMensaje = new javax.swing.JLabel();
        panelBarraSuperior = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        btnAgregarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        btnModificarProducto = new javax.swing.JButton();
        btnActualizarPagina = new javax.swing.JButton();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setMaximumSize(new java.awt.Dimension(950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));
        setPreferredSize(new java.awt.Dimension(950, 700));

        backgound.setBackground(new java.awt.Color(250, 251, 253));
        backgound.setMaximumSize(new java.awt.Dimension(950, 700));
        backgound.setMinimumSize(new java.awt.Dimension(950, 700));

        txtMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMensaje.setText("Bienvenido a tu sistema favorito ♥");

        panelBarraSuperior.setBackground(new java.awt.Color(14, 164, 157));
        panelBarraSuperior.setMaximumSize(new java.awt.Dimension(950, 100));
        panelBarraSuperior.setMinimumSize(new java.awt.Dimension(950, 100));

        txtFecha.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Hoy es {diaSemana} {dia} de {mes} de {año} y son las {hora} con {minutos} minutos");

        txtFecha1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFecha1.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha1.setText("Meownager/ Administracion de Productos");

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jScrollPane2.setBorder(null);

        jTableProductos.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Proveedor", "Categoria", "Nombre", "Descripcion", "Codigo", "Precio", "Stock"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
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

        btnAgregarProducto.setBackground(new java.awt.Color(14, 207, 181));
        btnAgregarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setText("Agregar Producto");

        btnEliminarProducto.setBackground(new java.awt.Color(14, 207, 181));
        btnEliminarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnEliminarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarProducto.setText("Eliminar Producto");

        btnModificarProducto.setBackground(new java.awt.Color(14, 207, 181));
        btnModificarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnModificarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnModificarProducto.setText("Modificar Producto");

        btnActualizarPagina.setBackground(new java.awt.Color(14, 207, 181));
        btnActualizarPagina.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnActualizarPagina.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarPagina.setText("Actualizar Pagina");

        javax.swing.GroupLayout backgoundLayout = new javax.swing.GroupLayout(backgound);
        backgound.setLayout(backgoundLayout);
        backgoundLayout.setHorizontalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgoundLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 920, Short.MAX_VALUE)
                            .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(backgoundLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnActualizarPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
        );
        backgoundLayout.setVerticalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnModificarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnActualizarPagina, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(backgound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backgound;
    public javax.swing.JButton btnActualizarPagina;
    public javax.swing.JButton btnAgregarProducto;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnModificarProducto;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTableProductos;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtFecha1;
    private javax.swing.JLabel txtMensaje;
    // End of variables declaration//GEN-END:variables
}
