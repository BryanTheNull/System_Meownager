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

        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDatosLogin.setBackground(new java.awt.Color(254, 254, 254));
        panelDatosLogin.setMaximumSize(new java.awt.Dimension(700, 700));
        panelDatosLogin.setMinimumSize(new java.awt.Dimension(700, 700));
        panelDatosLogin.setPreferredSize(new java.awt.Dimension(700, 700));
        panelDatosLogin.setRequestFocusEnabled(false);

        lbTituloDatos.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lbTituloDatos.setForeground(new java.awt.Color(0, 0, 204));
        lbTituloDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloDatos.setText("Iniciar Sesión");

        txtEmail.setForeground(new java.awt.Color(153, 153, 153));
        txtEmail.setText("Email");
        txtEmail.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtEmail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtEmailMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmailMousePressed(evt);
            }
        });

        txtContraseña.setForeground(new java.awt.Color(153, 153, 153));
        txtContraseña.setText("Contraseña");
        txtContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtContraseñaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtContraseñaMousePressed(evt);
            }
        });

        lbRecuperarContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRecuperarContraseña.setText("¿Olvidaste tu contraseña?");
        lbRecuperarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btnIniciarSesiónPrincipal.setBackground(new java.awt.Color(66, 183, 42));
        btnIniciarSesiónPrincipal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnIniciarSesiónPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesiónPrincipal.setText("Ingresar");
        btnIniciarSesiónPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelDatosLoginLayout = new javax.swing.GroupLayout(panelDatosLogin);
        panelDatosLogin.setLayout(panelDatosLoginLayout);
        panelDatosLoginLayout.setHorizontalGroup(
            panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosLoginLayout.createSequentialGroup()
                .addGap(0, 200, Short.MAX_VALUE)
                .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(panelDatosLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbRecuperarContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                    .addComponent(btnIniciarSesiónPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(240, 240, 240))
            .addGroup(panelDatosLoginLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addGroup(panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtEmail)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(144, 144, 144))
        );
        panelDatosLoginLayout.setVerticalGroup(
            panelDatosLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLoginLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbRecuperarContraseña)
                .addGap(29, 29, 29)
                .addComponent(btnIniciarSesiónPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        background.add(panelDatosLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 700));

        panelDiseñoLogin.setBackground(new java.awt.Color(13, 71, 160));
        panelDiseñoLogin.setMaximumSize(new java.awt.Dimension(500, 700));
        panelDiseñoLogin.setMinimumSize(new java.awt.Dimension(500, 700));

        lbTituloLogin.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("Bienvenido!");

        lbTituloLogin1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbTituloLogin1.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin1.setText(" ¿Es tu primera vez aquí? ");

        lbTituloLogin2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin2.setText("Regístrate y comienza a utilizar Meownager.");

        btnRegistraseSecundario.setBackground(new java.awt.Color(66, 183, 42));
        btnRegistraseSecundario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistraseSecundario.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistraseSecundario.setText("Registrarse");
        btnRegistraseSecundario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelDiseñoLoginLayout = new javax.swing.GroupLayout(panelDiseñoLogin);
        panelDiseñoLogin.setLayout(panelDiseñoLoginLayout);
        panelDiseñoLoginLayout.setHorizontalGroup(
            panelDiseñoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoLoginLayout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(panelDiseñoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiseñoLoginLayout.createSequentialGroup()
                        .addGroup(panelDiseñoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTituloLogin2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTituloLogin1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(96, 96, 96))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiseñoLoginLayout.createSequentialGroup()
                        .addComponent(btnRegistraseSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
        );
        panelDiseñoLoginLayout.setVerticalGroup(
            panelDiseñoLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoLoginLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(lbTituloLogin1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloLogin2)
                .addGap(109, 109, 109)
                .addComponent(btnRegistraseSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
        );

        background.add(panelDiseñoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 0, 500, 700));

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
//    // Metodos y Eventos para login
//    private int validarComplejidadContraseña(String contraseña) {
//    boolean contieneLetra = contraseña.matches(".*[a-zA-Z].*");
//    boolean contieneNumero = contraseña.matches(".*[0-9].*");
//    boolean contieneCaracter = contraseña.matches(".*[^a-zA-Z0-9].*");
//
//    if (contieneLetra && contieneNumero && contieneCaracter) {
//        return 3; // Contiene letra, número y caracter
//    } else if ((contieneLetra && contieneNumero) || (contieneNumero && contieneCaracter) || (contieneCaracter && contieneLetra)) {
//        return 2; // Contiene dos de las combinaciones
//    } else if (contieneLetra || contieneNumero || contieneCaracter) {
//        return 1; // Contiene solo una de las combinaciones
//    } else {
//        return 0; // No contiene ninguna combinación
//    }
//}
//    
    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if (limiarContraseña) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
            txtContraseña.setEchoChar('*');
            limiarContraseña = false;
            
        } 
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        if (limiarCorreo) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
            limiarCorreo = false;
            
        } 
    }//GEN-LAST:event_txtEmailMousePressed

    private void txtEmailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMouseExited
       if(txtEmail.getText().equals("")){
           txtEmail.setText("Email");
           txtEmail.setForeground(Color.decode("#999999"));
           limiarCorreo = true;    
       }
    }//GEN-LAST:event_txtEmailMouseExited

    private void txtContraseñaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMouseExited
        if(txtContraseña.getText().equals("")){
           txtContraseña.setText("Email");
           txtContraseña.setForeground(Color.decode("#999999"));
           limiarContraseña = true;    
       }
    }//GEN-LAST:event_txtContraseñaMouseExited

    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JButton btnIniciarSesiónPrincipal;
    public javax.swing.JButton btnRegistraseSecundario;
    public javax.swing.JLabel lbRecuperarContraseña;
    private javax.swing.JLabel lbTituloDatos;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloLogin1;
    private javax.swing.JLabel lbTituloLogin2;
    private javax.swing.JPanel panelDatosLogin;
    private javax.swing.JPanel panelDiseñoLogin;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtEmail;
    // End of variables declaration//GEN-END:variables
}
