package View.EntrySystem;

import java.awt.Color;

public class NewPassword extends javax.swing.JFrame {

    private boolean limpiarContraseña = true;
    private boolean limpiarRepetirContraseña = true;

    public NewPassword() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelDiseñoLateral = new javax.swing.JPanel();
        lbTituloLogin = new javax.swing.JLabel();
        lbTituloLogin1 = new javax.swing.JLabel();
        lbTituloLogin2 = new javax.swing.JLabel();
        lbTituloLogin4 = new javax.swing.JLabel();
        lbTituloLogin3 = new javax.swing.JLabel();
        lbTituloDatos = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtRepetirContraseñaa = new javax.swing.JPasswordField();
        btnCambiarContraseña = new javax.swing.JButton();
        barraVerificacionRoja = new javax.swing.JProgressBar();
        barraVerificacionAmarillo = new javax.swing.JProgressBar();
        barraVerificacionVerde = new javax.swing.JProgressBar();
        mostrarContraseña = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));

        panelDiseñoLateral.setBackground(new java.awt.Color(14, 125, 128));
        panelDiseñoLateral.setMaximumSize(new java.awt.Dimension(500, 700));
        panelDiseñoLateral.setMinimumSize(new java.awt.Dimension(500, 700));

        lbTituloLogin.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("RECOMENDACIONES");

        lbTituloLogin1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin1.setText("Incluye letras, números y símbolos.");

        lbTituloLogin2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin2.setText("No utilices palabras o frases comunes.");

        lbTituloLogin4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin4.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin4.setText("Utiliza una longitud minima de 12 caracteres.");

        lbTituloLogin3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin3.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin3.setText("Actualiza tu contraseña constantemente ");

        javax.swing.GroupLayout panelDiseñoLateralLayout = new javax.swing.GroupLayout(panelDiseñoLateral);
        panelDiseñoLateral.setLayout(panelDiseñoLateralLayout);
        panelDiseñoLateralLayout.setHorizontalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiseñoLateralLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloLogin3, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lbTituloLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbTituloLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbTituloLogin4))
                .addGap(48, 48, 48))
        );
        panelDiseñoLateralLayout.setVerticalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoLateralLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbTituloLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloLogin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloLogin4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloLogin3)
                .addContainerGap(339, Short.MAX_VALUE))
        );

        lbTituloDatos.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloDatos.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloDatos.setText("CAMBIAR CONTRASEÑA");

        txtContraseña.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setText("Contraseña");
        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContraseñaFocusLost(evt);
            }
        });
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });

        txtRepetirContraseñaa.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtRepetirContraseñaa.setForeground(new java.awt.Color(153, 153, 153));
        txtRepetirContraseñaa.setText("Repetir Contraseña");
        txtRepetirContraseñaa.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtRepetirContraseñaa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRepetirContraseñaaFocusLost(evt);
            }
        });
        txtRepetirContraseñaa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRepetirContraseñaaMousePressed(evt);
            }
        });

        btnCambiarContraseña.setBackground(new java.awt.Color(14, 207, 181));
        btnCambiarContraseña.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarContraseña.setText("Cambiar Contraseña");
        btnCambiarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        barraVerificacionRoja.setBackground(new java.awt.Color(255, 0, 0));

        barraVerificacionAmarillo.setBackground(new java.awt.Color(255, 255, 0));

        barraVerificacionVerde.setBackground(new java.awt.Color(0, 255, 0));

        mostrarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mostrarContraseña.setBorder(null);
        mostrarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRepetirContraseñaa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(barraVerificacionRoja, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(barraVerificacionAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(barraVerificacionVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mostrarContraseña)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(250, 250, 250)))
                .addComponent(panelDiseñoLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDiseñoLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloDatos)
                .addGap(50, 50, 50)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtRepetirContraseñaa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraVerificacionRoja, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraVerificacionAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraVerificacionVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtContraseña.getText().equals("")) {
            txtContraseña.setText("Contraseña");
            txtContraseña.setEchoChar((char) 0);
            txtContraseña.setForeground(Color.decode("#999999"));
            limpiarContraseña = true;
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limpiarContraseña) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
            txtContraseña.setEchoChar('*');
            limpiarContraseña = false;
        }
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtRepetirContraseñaaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepetirContraseñaaFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtRepetirContraseñaa.getText().equals("")) {
            txtRepetirContraseñaa.setText("Repetir Contraseña");
            txtRepetirContraseñaa.setEchoChar((char) 0);
            txtRepetirContraseñaa.setForeground(Color.decode("#999999"));
            limpiarRepetirContraseña = true;
        }
    }//GEN-LAST:event_txtRepetirContraseñaaFocusLost

    private void txtRepetirContraseñaaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRepetirContraseñaaMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limpiarRepetirContraseña) {
            txtRepetirContraseñaa.setText("");
            txtRepetirContraseñaa.setForeground(Color.black);
            txtRepetirContraseñaa.setEchoChar('*');
            limpiarRepetirContraseña = false;
        }
    }//GEN-LAST:event_txtRepetirContraseñaaMousePressed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JProgressBar barraVerificacionAmarillo;
    public javax.swing.JProgressBar barraVerificacionRoja;
    public javax.swing.JProgressBar barraVerificacionVerde;
    public javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JLabel lbTituloDatos;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloLogin1;
    private javax.swing.JLabel lbTituloLogin2;
    private javax.swing.JLabel lbTituloLogin3;
    private javax.swing.JLabel lbTituloLogin4;
    public javax.swing.JCheckBox mostrarContraseña;
    private javax.swing.JPanel panelDiseñoLateral;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JPasswordField txtRepetirContraseñaa;
    // End of variables declaration//GEN-END:variables
}
