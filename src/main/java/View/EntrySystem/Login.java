package View.EntrySystem;

import Controller.EntrySystem.LoginController;
import java.awt.Color;


public class Login extends javax.swing.JFrame {

    private LoginController controller;
    private boolean limiarCorreo = true;
    private boolean limiarContraseña = true;

    public Login() {

        initComponents();
        controller = new LoginController(this);
        txtContraseña.setEchoChar((char) 0);
       
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelDatosLogin = new javax.swing.JPanel();
        lbTituloDatos = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        lbRecuperarContraseña = new javax.swing.JLabel();
        btnIniciarSesiónPrincipal = new javax.swing.JButton();
        mostrarContraseña = new javax.swing.JCheckBox();
        panelDiseñoLogin = new javax.swing.JPanel();
        lbTituloLogin = new javax.swing.JLabel();
        lbTituloLogin1 = new javax.swing.JLabel();
        lbTituloLogin2 = new javax.swing.JLabel();
        btnRegistraseSecundario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 700));

        panelDatosLogin.setBackground(new java.awt.Color(252, 252, 247));
        panelDatosLogin.setMaximumSize(new java.awt.Dimension(700, 700));
        panelDatosLogin.setMinimumSize(new java.awt.Dimension(700, 700));
        panelDatosLogin.setPreferredSize(new java.awt.Dimension(700, 700));
        panelDatosLogin.setRequestFocusEnabled(false);

        lbTituloDatos.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloDatos.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloDatos.setText("INICIAR SESIÓN");

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
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyPressed(evt);
            }
        });

        lbRecuperarContraseña.setFont(new java.awt.Font("Roboto Medium", 0, 12)); // NOI18N
        lbRecuperarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRecuperarContraseña.setText("¿Olvidaste tu contraseña?");
        lbRecuperarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lbRecuperarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbRecuperarContraseñaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbRecuperarContraseñaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lbRecuperarContraseñaMousePressed(evt);
            }
        });

        btnIniciarSesiónPrincipal.setBackground(new java.awt.Color(14, 207, 181));
        btnIniciarSesiónPrincipal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnIniciarSesiónPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesiónPrincipal.setText("Ingresar");
        btnIniciarSesiónPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        mostrarContraseña.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        mostrarContraseña.setBorder(null);
        mostrarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelDatosLoginLayout = new javax.swing.GroupLayout(panelDatosLogin);
        panelDatosLogin.setLayout(panelDatosLoginLayout);
        panelDatosLoginLayout.setHorizontalGroup(
            panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLoginLayout.createSequentialGroup()
                .addGroup(panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLoginLayout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addGroup(panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnIniciarSesiónPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbRecuperarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                    .addGroup(panelDatosLoginLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addGroup(panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtEmail)
                            .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mostrarContraseña))
                    .addGroup(panelDatosLoginLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(81, 81, 81))
        );
        panelDatosLoginLayout.setVerticalGroup(
            panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLoginLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mostrarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbRecuperarContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIniciarSesiónPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(274, Short.MAX_VALUE))
        );

        panelDiseñoLogin.setBackground(new java.awt.Color(14, 125, 128));
        panelDiseñoLogin.setMaximumSize(new java.awt.Dimension(500, 700));
        panelDiseñoLogin.setMinimumSize(new java.awt.Dimension(500, 700));
        panelDiseñoLogin.setPreferredSize(new java.awt.Dimension(500, 700));

        lbTituloLogin.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("BIENVENIDO");

        lbTituloLogin1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin1.setText(" ¿Es tu primera vez aquí? ");

        lbTituloLogin2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin2.setText("Regístrate y comienza a utilizar Meownager.");

        btnRegistraseSecundario.setBackground(new java.awt.Color(14, 207, 181));
        btnRegistraseSecundario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistraseSecundario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistraseSecundario.setText("Registrarse");
        btnRegistraseSecundario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelDiseñoLoginLayout = new javax.swing.GroupLayout(panelDiseñoLogin);
        panelDiseñoLogin.setLayout(panelDiseñoLoginLayout);
        panelDiseñoLoginLayout.setHorizontalGroup(
            panelDiseñoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoLoginLayout.createSequentialGroup()
                .addGroup(panelDiseñoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDiseñoLoginLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panelDiseñoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTituloLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTituloLogin1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panelDiseñoLoginLayout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(btnRegistraseSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelDiseñoLoginLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        panelDiseñoLoginLayout.setVerticalGroup(
            panelDiseñoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoLoginLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbTituloLogin1)
                .addGap(0, 0, 0)
                .addComponent(lbTituloLogin2)
                .addGap(96, 96, 96)
                .addComponent(btnRegistraseSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(275, 275, 275))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelDatosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDiseñoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDatosLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelDiseñoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limiarContraseña) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
            txtContraseña.setEchoChar('*');
            limiarContraseña = false;
        }
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limiarCorreo) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
            limiarCorreo = false;
        }
    }//GEN-LAST:event_txtEmailMousePressed

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("Email");
            txtEmail.setForeground(Color.decode("#999999"));
            limiarCorreo = true;
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtContraseña.getText().equals("")) {
            txtContraseña.setText("Contraseña");
            txtContraseña.setForeground(Color.decode("#999999"));
            txtContraseña.setEchoChar((char) 0);
            limiarContraseña = true;
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // Evento: Limpiar campo cuando se presione alguna tecla en este.
         if (limiarCorreo) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
            limiarCorreo = false;
        }
    }//GEN-LAST:event_txtEmailKeyPressed

    private void txtContraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyPressed
        // Evento: Limpiar campo cuando se presione alguna tecla en este.
        if (limiarContraseña) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
            txtContraseña.setEchoChar('*');
            limiarContraseña = false;
        }
    }//GEN-LAST:event_txtContraseñaKeyPressed

    private void lbRecuperarContraseñaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRecuperarContraseñaMouseEntered
        lbRecuperarContraseña.setForeground(Color.decode("#0B57D3"));
    }//GEN-LAST:event_lbRecuperarContraseñaMouseEntered

    private void lbRecuperarContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRecuperarContraseñaMouseExited
        lbRecuperarContraseña.setForeground(Color.BLACK);
    }//GEN-LAST:event_lbRecuperarContraseñaMouseExited

    private void lbRecuperarContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbRecuperarContraseñaMousePressed
        RecoverPassword recoverPassword = new RecoverPassword();
        recoverPassword.setVisible(true);
        dispose();
    }//GEN-LAST:event_lbRecuperarContraseñaMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JButton btnIniciarSesiónPrincipal;
    public javax.swing.JButton btnRegistraseSecundario;
    public javax.swing.JLabel lbRecuperarContraseña;
    private javax.swing.JLabel lbTituloDatos;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloLogin1;
    private javax.swing.JLabel lbTituloLogin2;
    public javax.swing.JCheckBox mostrarContraseña;
    private javax.swing.JPanel panelDatosLogin;
    private javax.swing.JPanel panelDiseñoLogin;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
