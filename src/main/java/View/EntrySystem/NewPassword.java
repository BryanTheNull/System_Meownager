package View.EntrySystem;

import java.awt.Color;


public class NewPassword extends javax.swing.JPanel {
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
        lbTituloDatos = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        txtRepetirContraseñaa = new javax.swing.JPasswordField();
        btnCambiarContraseña = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(1000, 600));
        setMinimumSize(new java.awt.Dimension(1000, 600));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));
        background.setPreferredSize(new java.awt.Dimension(1200, 700));

        panelDiseñoLateral.setBackground(new java.awt.Color(14, 125, 128));
        panelDiseñoLateral.setMaximumSize(new java.awt.Dimension(500, 700));
        panelDiseñoLateral.setMinimumSize(new java.awt.Dimension(500, 700));
        panelDiseñoLateral.setPreferredSize(new java.awt.Dimension(500, 700));

        javax.swing.GroupLayout panelDiseñoLateralLayout = new javax.swing.GroupLayout(panelDiseñoLateral);
        panelDiseñoLateral.setLayout(panelDiseñoLateralLayout);
        panelDiseñoLateralLayout.setHorizontalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        panelDiseñoLateralLayout.setVerticalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        btnCambiarContraseña.setBackground(new java.awt.Color(66, 183, 42));
        btnCambiarContraseña.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCambiarContraseña.setForeground(new java.awt.Color(255, 255, 255));
        btnCambiarContraseña.setText("Enviar Codigo");
        btnCambiarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtRepetirContraseñaa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(panelDiseñoLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDiseñoLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloDatos)
                .addGap(50, 50, 50)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtRepetirContraseñaa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCambiarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
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
    public javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JLabel lbTituloDatos;
    private javax.swing.JPanel panelDiseñoLateral;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JPasswordField txtRepetirContraseñaa;
    // End of variables declaration//GEN-END:variables
}
