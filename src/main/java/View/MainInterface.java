package View;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MainInterface extends javax.swing.JFrame {

    public MainInterface() {
        initComponents();
        setFecha();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelBarraNavegacion = new javax.swing.JPanel();
        lbLogoYNombre = new javax.swing.JLabel();
        lbBarraDeSeparacion = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JPanel();
        txtSalir1 = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        txtSalir3 = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        txtSalir4 = new javax.swing.JLabel();
        btnSalir6 = new javax.swing.JPanel();
        txtSalir5 = new javax.swing.JLabel();
        btnSalir7 = new javax.swing.JPanel();
        txtSalir6 = new javax.swing.JLabel();
        btnSalir8 = new javax.swing.JPanel();
        txtSalir7 = new javax.swing.JLabel();
        panelChanging = new javax.swing.JPanel();
        panelBarraSuperior = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meownager");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setMaximumSize(new java.awt.Dimension(1200, 700));
        panelBackground.setMinimumSize(new java.awt.Dimension(1200, 700));
        panelBackground.setPreferredSize(new java.awt.Dimension(1200, 700));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarraNavegacion.setBackground(new java.awt.Color(13, 71, 160));
        panelBarraNavegacion.setMaximumSize(null);
        panelBarraNavegacion.setMinimumSize(new java.awt.Dimension(250, 700));
        panelBarraNavegacion.setName(""); // NOI18N
        panelBarraNavegacion.setPreferredSize(new java.awt.Dimension(250, 700));

        lbLogoYNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbLogoYNombre.setForeground(new java.awt.Color(255, 255, 255));
        lbLogoYNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogoYNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gatito.png"))); // NOI18N
        lbLogoYNombre.setText("Meownager");

        lbBarraDeSeparacion.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        lbBarraDeSeparacion.setForeground(new java.awt.Color(255, 255, 255));
        lbBarraDeSeparacion.setText("_______");
        lbBarraDeSeparacion.setToolTipText("");
        lbBarraDeSeparacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        btnMenuPrincipal.setMaximumSize(new java.awt.Dimension(250, 50));
        btnMenuPrincipal.setMinimumSize(new java.awt.Dimension(250, 50));
        btnMenuPrincipal.setOpaque(false);
        btnMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMousePressed(evt);
            }
        });

        txtSalir1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir1.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir1.setText("Menu Principal");

        javax.swing.GroupLayout btnMenuPrincipalLayout = new javax.swing.GroupLayout(btnMenuPrincipal);
        btnMenuPrincipal.setLayout(btnMenuPrincipalLayout);
        btnMenuPrincipalLayout.setHorizontalGroup(
            btnMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMenuPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnMenuPrincipalLayout.setVerticalGroup(
            btnMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSalir1)
                .addGap(13, 13, 13))
        );

        btnSalir1.setMaximumSize(new java.awt.Dimension(250, 50));
        btnSalir1.setMinimumSize(new java.awt.Dimension(250, 50));
        btnSalir1.setOpaque(false);
        btnSalir1.setPreferredSize(new java.awt.Dimension(250, 50));

        txtSalir.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnSalir1Layout = new javax.swing.GroupLayout(btnSalir1);
        btnSalir1.setLayout(btnSalir1Layout);
        btnSalir1Layout.setHorizontalGroup(
            btnSalir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnSalir1Layout.setVerticalGroup(
            btnSalir1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSalir)
                .addGap(13, 13, 13))
        );

        btnProductos.setMaximumSize(new java.awt.Dimension(250, 50));
        btnProductos.setMinimumSize(new java.awt.Dimension(250, 50));
        btnProductos.setOpaque(false);

        txtSalir3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir3.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir3.setText("Productos");

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSalir3)
                .addGap(13, 13, 13))
        );

        btnClientes.setMaximumSize(new java.awt.Dimension(250, 50));
        btnClientes.setMinimumSize(new java.awt.Dimension(250, 50));
        btnClientes.setOpaque(false);

        txtSalir4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir4.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir4.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSalir4)
                .addGap(13, 13, 13))
        );

        btnSalir6.setMaximumSize(new java.awt.Dimension(250, 50));
        btnSalir6.setMinimumSize(new java.awt.Dimension(250, 50));
        btnSalir6.setOpaque(false);

        txtSalir5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir5.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir5.setText("Proveedores");

        javax.swing.GroupLayout btnSalir6Layout = new javax.swing.GroupLayout(btnSalir6);
        btnSalir6.setLayout(btnSalir6Layout);
        btnSalir6Layout.setHorizontalGroup(
            btnSalir6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnSalir6Layout.setVerticalGroup(
            btnSalir6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSalir5)
                .addGap(13, 13, 13))
        );

        btnSalir7.setMaximumSize(new java.awt.Dimension(250, 50));
        btnSalir7.setMinimumSize(new java.awt.Dimension(250, 50));
        btnSalir7.setOpaque(false);

        txtSalir6.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir6.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir6.setText("Reportes");

        javax.swing.GroupLayout btnSalir7Layout = new javax.swing.GroupLayout(btnSalir7);
        btnSalir7.setLayout(btnSalir7Layout);
        btnSalir7Layout.setHorizontalGroup(
            btnSalir7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir7Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnSalir7Layout.setVerticalGroup(
            btnSalir7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSalir6)
                .addGap(13, 13, 13))
        );

        btnSalir8.setMaximumSize(new java.awt.Dimension(250, 50));
        btnSalir8.setMinimumSize(new java.awt.Dimension(250, 50));
        btnSalir8.setOpaque(false);

        txtSalir7.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir7.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir7.setText("Cofiguracion");

        javax.swing.GroupLayout btnSalir8Layout = new javax.swing.GroupLayout(btnSalir8);
        btnSalir8.setLayout(btnSalir8Layout);
        btnSalir8Layout.setHorizontalGroup(
            btnSalir8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir8Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnSalir8Layout.setVerticalGroup(
            btnSalir8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSalir7)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout panelBarraNavegacionLayout = new javax.swing.GroupLayout(panelBarraNavegacion);
        panelBarraNavegacion.setLayout(panelBarraNavegacionLayout);
        panelBarraNavegacionLayout.setHorizontalGroup(
            panelBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                .addGroup(panelBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                        .addGroup(panelBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lbLogoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lbBarraDeSeparacion)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnSalir1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBarraNavegacionLayout.setVerticalGroup(
            panelBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lbLogoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbBarraDeSeparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSalir6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSalir8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(144, Short.MAX_VALUE))
        );

        panelBackground.add(panelBarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 700));

        panelChanging.setBackground(new java.awt.Color(250, 251, 253));
        panelChanging.setMaximumSize(new java.awt.Dimension(950, 700));
        panelChanging.setMinimumSize(new java.awt.Dimension(950, 700));
        panelChanging.setPreferredSize(new java.awt.Dimension(950, 700));

        panelBarraSuperior.setBackground(new java.awt.Color(24, 118, 210));

        txtFecha.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Hoy es {diaSemana} {dia} de {mes} de {año}");

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(585, Short.MAX_VALUE))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        txtMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMensaje.setText("Bienvenido a tu sistema favorito ♥");

        javax.swing.GroupLayout panelChangingLayout = new javax.swing.GroupLayout(panelChanging);
        panelChanging.setLayout(panelChangingLayout);
        panelChangingLayout.setHorizontalGroup(
            panelChangingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelChangingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelChangingLayout.setVerticalGroup(
            panelChangingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelChangingLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(txtMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(549, Short.MAX_VALUE))
        );

        panelBackground.add(panelChanging, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 950, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setFecha() {
        LocalDate now = LocalDate.now();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();
        int año = now.getYear();
        DayOfWeek diaSemana = now.getDayOfWeek();

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octuble", "Noviembre", "Diciembre"};
        String nombreMes = meses[mes - 1];

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String nombreDiaSemana = diasSemana[diaSemana.getValue() - 1];

        String fechaFormateada = "Hoy es " + nombreDiaSemana + " "+ dia + " de " + nombreMes + " de " + año;

        txtFecha.setText(fechaFormateada);
    }

    private void btnMenuPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuPrincipalMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnMenuPrincipal;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel btnSalir1;
    private javax.swing.JPanel btnSalir6;
    private javax.swing.JPanel btnSalir7;
    private javax.swing.JPanel btnSalir8;
    private javax.swing.JLabel lbBarraDeSeparacion;
    private javax.swing.JLabel lbLogoYNombre;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelBarraNavegacion;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JPanel panelChanging;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtMensaje;
    private javax.swing.JLabel txtSalir;
    private javax.swing.JLabel txtSalir1;
    private javax.swing.JLabel txtSalir3;
    private javax.swing.JLabel txtSalir4;
    private javax.swing.JLabel txtSalir5;
    private javax.swing.JLabel txtSalir6;
    private javax.swing.JLabel txtSalir7;
    // End of variables declaration//GEN-END:variables
}
