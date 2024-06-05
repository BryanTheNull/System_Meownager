package View.EntrySystem;

import Controller.EntrySystem.RecoverPasswordController;
import java.awt.Color;

public class RecoverPassword extends javax.swing.JFrame {

    private RecoverPasswordController controller;
    public boolean estadoDePanel = true;
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
        lbTituloLogin = new javax.swing.JLabel();
        lbTituloLogin1 = new javax.swing.JLabel();
        lbTituloLogin2 = new javax.swing.JLabel();
        lbTituloLogin3 = new javax.swing.JLabel();
        lbTituloLogin4 = new javax.swing.JLabel();
        btnRecoverPassword = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        lbIniciarSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Recuperar Contraseña");
        setMinimumSize(new java.awt.Dimension(1000, 600));
        setResizable(false);

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));
        background.setPreferredSize(new java.awt.Dimension(1200, 700));

        lbTituloDatos.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloDatos.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloDatos.setText("RECUPERAR CONTRASEÑA");

        panelDiseñoLateral.setBackground(new java.awt.Color(14, 125, 128));
        panelDiseñoLateral.setMaximumSize(new java.awt.Dimension(333, 600));
        panelDiseñoLateral.setMinimumSize(new java.awt.Dimension(333, 600));
        panelDiseñoLateral.setPreferredSize(new java.awt.Dimension(333, 600));

        lbTituloLogin.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("RECOMENDACIONES");

        lbTituloLogin1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin1.setText("Ingresa tu correo electronico.");

        lbTituloLogin2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin2.setText("Recibirás un codigo de 6 digitos.");

        lbTituloLogin3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin3.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin3.setText("Crea tu nueva contraseña.");

        lbTituloLogin4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin4.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin4.setText("Verifica tu correo electronico. ");

        javax.swing.GroupLayout panelDiseñoLateralLayout = new javax.swing.GroupLayout(panelDiseñoLateral);
        panelDiseñoLateral.setLayout(panelDiseñoLateralLayout);
        panelDiseñoLateralLayout.setHorizontalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiseñoLateralLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTituloLogin3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTituloLogin4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTituloLogin2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lbTituloLogin1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        panelDiseñoLateralLayout.setVerticalGroup(
            panelDiseñoLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoLateralLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(lbTituloLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloLogin2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloLogin4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloLogin3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnRecoverPassword.setBackground(new java.awt.Color(14, 207, 181));
        btnRecoverPassword.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRecoverPassword.setForeground(new java.awt.Color(255, 255, 255));
        btnRecoverPassword.setText("Enviar Codigo");
        btnRecoverPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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

        lbIniciarSesion.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
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
                        .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addGroup(backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtEmail)
                                    .addComponent(lbTituloDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(0, 300, Short.MAX_VALUE)
                        .addComponent(lbIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)))
                .addComponent(panelDiseñoLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(lbIniciarSesion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRecoverPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(309, Short.MAX_VALUE))
            .addComponent(panelDiseñoLateral, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
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

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (estadoDePanel) {
            if (txtEmail.getText().equals("")) {
                txtEmail.setText("Código");
                txtEmail.setForeground(Color.decode("#999999"));
                limpiarCorreo = true;
            }
        } else {
             if (txtEmail.getText().equals("")) {
                txtEmail.setText("Código");
                txtEmail.setForeground(Color.decode("#999999"));
                limpiarCorreo = true;
            }
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
    public javax.swing.JButton btnRecoverPassword;
    public javax.swing.JLabel lbIniciarSesion;
    private javax.swing.JLabel lbTituloDatos;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloLogin1;
    private javax.swing.JLabel lbTituloLogin2;
    private javax.swing.JLabel lbTituloLogin3;
    private javax.swing.JLabel lbTituloLogin4;
    private javax.swing.JPanel panelDiseñoLateral;
    public javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
