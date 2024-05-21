package View;

import Config.GradientPanel;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;


public class MainInterface extends javax.swing.JFrame {
    private JPanel panelDegradado;

    public MainInterface() {
        initComponents();
        degradadoPanel();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBackground = new javax.swing.JPanel();
        panelBarraNavegacion = new javax.swing.JPanel();
        lbLogoYNombre = new javax.swing.JLabel();
        lbBarraDeSeparacion = new javax.swing.JLabel();
        btnSalir1 = new javax.swing.JPanel();
        txtSalir = new javax.swing.JLabel();
        btnSalir2 = new javax.swing.JPanel();
        txtSalir1 = new javax.swing.JLabel();
        btnSalir4 = new javax.swing.JPanel();
        txtSalir3 = new javax.swing.JLabel();
        btnSalir5 = new javax.swing.JPanel();
        txtSalir4 = new javax.swing.JLabel();
        btnSalir6 = new javax.swing.JPanel();
        txtSalir5 = new javax.swing.JLabel();
        btnSalir7 = new javax.swing.JPanel();
        txtSalir6 = new javax.swing.JLabel();
        btnSalir8 = new javax.swing.JPanel();
        txtSalir7 = new javax.swing.JLabel();
        panelChanging = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meownager");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setResizable(false);

        panelBackground.setBackground(new java.awt.Color(255, 255, 255));
        panelBackground.setMaximumSize(new java.awt.Dimension(1200, 700));
        panelBackground.setMinimumSize(new java.awt.Dimension(1200, 700));
        panelBackground.setPreferredSize(new java.awt.Dimension(1200, 700));
        panelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarraNavegacion.setBackground(new java.awt.Color(0, 51, 204));
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
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(txtSalir)
                .addGap(13, 13, 13))
        );

        btnSalir2.setMaximumSize(new java.awt.Dimension(250, 50));
        btnSalir2.setMinimumSize(new java.awt.Dimension(250, 50));
        btnSalir2.setOpaque(false);

        txtSalir1.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir1.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir1.setText("Menu Principal");

        javax.swing.GroupLayout btnSalir2Layout = new javax.swing.GroupLayout(btnSalir2);
        btnSalir2.setLayout(btnSalir2Layout);
        btnSalir2Layout.setHorizontalGroup(
            btnSalir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnSalir2Layout.setVerticalGroup(
            btnSalir2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir2Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(txtSalir1)
                .addGap(13, 13, 13))
        );

        btnSalir4.setMaximumSize(new java.awt.Dimension(250, 50));
        btnSalir4.setMinimumSize(new java.awt.Dimension(250, 50));
        btnSalir4.setOpaque(false);

        txtSalir3.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir3.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir3.setText("Productos");

        javax.swing.GroupLayout btnSalir4Layout = new javax.swing.GroupLayout(btnSalir4);
        btnSalir4.setLayout(btnSalir4Layout);
        btnSalir4Layout.setHorizontalGroup(
            btnSalir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnSalir4Layout.setVerticalGroup(
            btnSalir4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir4Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(txtSalir3)
                .addGap(13, 13, 13))
        );

        btnSalir5.setMaximumSize(new java.awt.Dimension(250, 50));
        btnSalir5.setMinimumSize(new java.awt.Dimension(250, 50));
        btnSalir5.setOpaque(false);

        txtSalir4.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir4.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        txtSalir4.setText("Clientes");

        javax.swing.GroupLayout btnSalir5Layout = new javax.swing.GroupLayout(btnSalir5);
        btnSalir5.setLayout(btnSalir5Layout);
        btnSalir5Layout.setHorizontalGroup(
            btnSalir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir5Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnSalir5Layout.setVerticalGroup(
            btnSalir5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnSalir5Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
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
                .addContainerGap(13, Short.MAX_VALUE)
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
                .addContainerGap(13, Short.MAX_VALUE)
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
                .addContainerGap(13, Short.MAX_VALUE)
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
                    .addComponent(btnSalir2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSalir5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(btnSalir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSalir5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        panelChanging.setBackground(new java.awt.Color(255, 255, 255));
        panelChanging.setMaximumSize(new java.awt.Dimension(950, 700));
        panelChanging.setMinimumSize(new java.awt.Dimension(950, 700));
        panelChanging.setPreferredSize(new java.awt.Dimension(950, 700));

        javax.swing.GroupLayout panelChangingLayout = new javax.swing.GroupLayout(panelChanging);
        panelChanging.setLayout(panelChangingLayout);
        panelChangingLayout.setHorizontalGroup(
            panelChangingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        panelChangingLayout.setVerticalGroup(
            panelChangingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
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

    private void degradadoPanel() {
        // Crear panel degradado y pintar la barra de navegacion.
        panelDegradado = new GradientPanel(Color.decode("#1CB5E0"), Color.decode("#000046"));
        panelBarraNavegacion.setLayout(new BorderLayout());
        panelBarraNavegacion.add(panelDegradado, BorderLayout.CENTER);
    }
    
    private void panelesTransparentes(){
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btnSalir1;
    private javax.swing.JPanel btnSalir2;
    private javax.swing.JPanel btnSalir4;
    private javax.swing.JPanel btnSalir5;
    private javax.swing.JPanel btnSalir6;
    private javax.swing.JPanel btnSalir7;
    private javax.swing.JPanel btnSalir8;
    private javax.swing.JLabel lbBarraDeSeparacion;
    private javax.swing.JLabel lbLogoYNombre;
    private javax.swing.JPanel panelBackground;
    private javax.swing.JPanel panelBarraNavegacion;
    private javax.swing.JPanel panelChanging;
    private javax.swing.JLabel txtSalir;
    private javax.swing.JLabel txtSalir1;
    private javax.swing.JLabel txtSalir3;
    private javax.swing.JLabel txtSalir4;
    private javax.swing.JLabel txtSalir5;
    private javax.swing.JLabel txtSalir6;
    private javax.swing.JLabel txtSalir7;
    // End of variables declaration//GEN-END:variables
}
