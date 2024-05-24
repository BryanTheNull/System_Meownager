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
        setMinimumSize(new java.awt.Dimension(600, 400));

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(600, 400));
        background.setMinimumSize(new java.awt.Dimension(600, 400));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbTituloDatos.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lbTituloDatos.setForeground(new java.awt.Color(0, 0, 204));
        lbTituloDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloDatos.setText("Recuperar Contraseña");
        background.add(lbTituloDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 350, 44));

        panelDiseñoLateral.setBackground(new java.awt.Color(13, 71, 160));
        panelDiseñoLateral.setMaximumSize(new java.awt.Dimension(500, 700));
        panelDiseñoLateral.setMinimumSize(new java.awt.Dimension(500, 700));

        javax.swing.GroupLayout panelDiseñoLateralLayout = new javax.swing.GroupLayout(panelDiseñoLateral);
        panelDiseñoLateral.setLayout(panelDiseñoLateralLayout);
        panelDiseñoLateralLayout.setHorizontalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelDiseñoLateralLayout.setVerticalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        background.add(panelDiseñoLateral, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 150, 400));

        btnEnviarCodigo.setBackground(new java.awt.Color(66, 183, 42));
        btnEnviarCodigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnEnviarCodigo.setForeground(new java.awt.Color(255, 255, 255));
        btnEnviarCodigo.setText("Enviar Codigo");
        btnEnviarCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        background.add(btnEnviarCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, 50));

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
        background.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 350, 40));

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
        background.add(lbIniciarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 160, -1));

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
