package View.EntrySystem;

import Controller.EntrySystem.RecoverPasswordController;
import java.awt.Color;

public class RecoverPassword extends javax.swing.JFrame {

    private RecoverPasswordController controller;
    boolean limpiarCorreo = true;

    public RecoverPassword() {
        initComponents();

        controller = new RecoverPasswordController(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        lbTituloDatos = new javax.swing.JLabel();
        panelDiseñoLateral = new javax.swing.JPanel();
        btnEnviarCodigo = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lbIniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperar Contraseña");
        setMaximumSize(new java.awt.Dimension(800, 500));
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(1000, 600));
        background.setMinimumSize(new java.awt.Dimension(1000, 600));

        lbTituloDatos.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloDatos.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloDatos.setText("RECUPERAR CONTRASEÑA");

        panelDiseñoLateral.setBackground(new java.awt.Color(14, 125, 128));
        panelDiseñoLateral.setMaximumSize(new java.awt.Dimension(333, 600));
        panelDiseñoLateral.setMinimumSize(new java.awt.Dimension(333, 600));
        panelDiseñoLateral.setPreferredSize(new java.awt.Dimension(333, 600));

        javax.swing.GroupLayout panelDiseñoLateralLayout = new javax.swing.GroupLayout(panelDiseñoLateral);
        panelDiseñoLateral.setLayout(panelDiseñoLateralLayout);
        panelDiseñoLateralLayout.setHorizontalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );
        panelDiseñoLateralLayout.setVerticalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        btnEnviarCodigo.setBackground(new java.awt.Color(66, 183, 42));
        btnEnviarCodigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEnviarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarCodigo.setText("Enviar Codigo");
        btnEnviarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txtEmail.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Email");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmailFocusLost(evt);
            }
        });
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailMousePressed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        lbIniciarSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbIniciarSesion.setText("Regresar");
        lbIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbIniciarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbIniciarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbIniciarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbIniciarSesionMousePressed(evt);
            }
        });

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(btnEnviarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lbIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloDatos)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(panelDiseñoLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(lbIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEnviarCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panelDiseñoLateral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("Email");
            txtEmail.setForeground(Color.decode("#999999"));
            limpiarCorreo = true;
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limpiarCorreo) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
            limpiarCorreo = false;
        }
    }//GEN-LAST:event_txtEmailMousePressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // Evento: Limpiar campo cuando se presione alguna tecla en este.
        if (limpiarCorreo) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
            limpiarCorreo = false;
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void lbIniciarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIniciarSesionMouseEntered
        lbIniciarSesion.setForeground(Color.decode("#0B57D3"));
    }//GEN-LAST:event_lbIniciarSesionMouseEntered

    private void lbIniciarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIniciarSesionMouseExited
        lbIniciarSesion.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbIniciarSesionMouseExited

    private void lbIniciarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbIniciarSesionMousePressed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbIniciarSesionMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JButton btnEnviarCodigo;
    public javax.swing.JLabel lbIniciarSesion;
    private javax.swing.JLabel lbTituloDatos;
    private javax.swing.JPanel panelDiseñoLateral;
    public javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
