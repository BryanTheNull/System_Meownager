package View.EntrySystem;

import Controller.EntrySystem.RegisterController;
import java.awt.Color;

public class Register extends javax.swing.JFrame {

    private RegisterController controller;

    private boolean limpiarNombre = true;
    private boolean limpiarEmail = true;
    private boolean limpiarContraseña = true;
    private boolean limpiarRepetirContraseña = true;

    public Register() {
        initComponents();
        controller = new RegisterController(this);
        txtContraseña.setEchoChar((char) 0);
        txtRepetirContraseñaa.setEchoChar((char) 0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelDiseñoRegistro = new javax.swing.JPanel();
        lbTituloLogin = new javax.swing.JLabel();
        lbSubTitulo = new javax.swing.JLabel();
        lbTituloLogin2 = new javax.swing.JLabel();
        btnIniciarSesiónSecundario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        panelDatosRegistro = new javax.swing.JPanel();
        lbTituloDatos = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();
        txtRepetirContraseñaa = new javax.swing.JPasswordField();
        btnRegistrarsePrincipal = new javax.swing.JButton();
        barraVerificacionRoja = new javax.swing.JProgressBar();
        barraVerificacionAmarillo = new javax.swing.JProgressBar();
        barraVerificacionVerde = new javax.swing.JProgressBar();
        mostrarContraseña = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));

        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));
        background.setPreferredSize(new java.awt.Dimension(1200, 700));

        panelDiseñoRegistro.setBackground(new java.awt.Color(14, 125, 128));
        panelDiseñoRegistro.setMaximumSize(new java.awt.Dimension(500, 700));
        panelDiseñoRegistro.setMinimumSize(new java.awt.Dimension(500, 700));
        panelDiseñoRegistro.setPreferredSize(new java.awt.Dimension(500, 700));

        lbTituloLogin.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("BIENVENIDO");

        lbSubTitulo.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubTitulo.setText(" ¿Ya tienes cuenta? ");

        lbTituloLogin2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin2.setText("Inicia Sesión y comienza a utilizar Meownager.");

        btnIniciarSesiónSecundario.setBackground(new java.awt.Color(14, 207, 181));
        btnIniciarSesiónSecundario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnIniciarSesiónSecundario.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesiónSecundario.setText("Iniciar Sesión");
        btnIniciarSesiónSecundario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelDiseñoRegistroLayout = new javax.swing.GroupLayout(panelDiseñoRegistro);
        panelDiseñoRegistro.setLayout(panelDiseñoRegistroLayout);
        panelDiseñoRegistroLayout.setHorizontalGroup(
            panelDiseñoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoRegistroLayout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(panelDiseñoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTituloLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiseñoRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnIniciarSesiónSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
            .addGroup(panelDiseñoRegistroLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panelDiseñoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbSubTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDiseñoRegistroLayout.setVerticalGroup(
            panelDiseñoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoRegistroLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbSubTitulo)
                .addGap(0, 0, 0)
                .addComponent(lbTituloLogin2)
                .addGap(27, 27, 27)
                .addComponent(btnIniciarSesiónSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );

        panelDatosRegistro.setBackground(new java.awt.Color(252, 252, 247));
        panelDatosRegistro.setMaximumSize(new java.awt.Dimension(700, 700));
        panelDatosRegistro.setMinimumSize(new java.awt.Dimension(700, 700));
        panelDatosRegistro.setRequestFocusEnabled(false);

        lbTituloDatos.setFont(new java.awt.Font("Roboto Black", 1, 30)); // NOI18N
        lbTituloDatos.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloDatos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloDatos.setText("REGISTRARSE");

        txtNombre.setFont(new java.awt.Font("Roboto Medium", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        txtNombre.setText("Nombre");
        txtNombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });

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

        btnRegistrarsePrincipal.setBackground(new java.awt.Color(14, 207, 181));
        btnRegistrarsePrincipal.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnRegistrarsePrincipal.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarsePrincipal.setText("Crear Cuenta");
        btnRegistrarsePrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        barraVerificacionRoja.setBackground(new java.awt.Color(255, 0, 0));

        barraVerificacionAmarillo.setBackground(new java.awt.Color(255, 255, 0));

        barraVerificacionVerde.setBackground(new java.awt.Color(0, 255, 0));

        mostrarContraseña.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        mostrarContraseña.setBorder(null);
        mostrarContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panelDatosRegistroLayout = new javax.swing.GroupLayout(panelDatosRegistro);
        panelDatosRegistro.setLayout(panelDatosRegistroLayout);
        panelDatosRegistroLayout.setHorizontalGroup(
            panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosRegistroLayout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDatosRegistroLayout.createSequentialGroup()
                        .addComponent(txtRepetirContraseñaa, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(panelDatosRegistroLayout.createSequentialGroup()
                        .addGroup(panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDatosRegistroLayout.createSequentialGroup()
                                .addComponent(barraVerificacionRoja, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(barraVerificacionAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addComponent(barraVerificacionVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelDatosRegistroLayout.createSequentialGroup()
                                .addGroup(panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtNombre)
                                        .addComponent(txtEmail)
                                        .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mostrarContraseña)))
                        .addGap(0, 121, Short.MAX_VALUE))))
            .addGroup(panelDatosRegistroLayout.createSequentialGroup()
                .addGap(250, 250, 250)
                .addComponent(btnRegistrarsePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosRegistroLayout.setVerticalGroup(
            panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosRegistroLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mostrarContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRepetirContraseñaa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(barraVerificacionRoja, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraVerificacionAmarillo, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(barraVerificacionVerde, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnRegistrarsePrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(panelDiseñoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelDatosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelDiseñoRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelDatosRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        getAccessibleContext().setAccessibleName("Login");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRepetirContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseña1MousePressed
        // #Evento generado por error y no se puede borrar!!! EVT y la CTM!
    }//GEN-LAST:event_txtContraseña1MousePressed

    // EVENTOS PARA LIMPIAR CAMPOS DE TEXTO AL SER PRESIONADO
    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limpiarNombre) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
            limpiarNombre = false;
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtEmailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmailMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limpiarEmail) {
            txtEmail.setText("");
            txtEmail.setForeground(Color.black);
            limpiarEmail = false;
        }
    }//GEN-LAST:event_txtEmailMousePressed

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limpiarContraseña) {
            txtContraseña.setText("");
            txtContraseña.setForeground(Color.black);
            txtContraseña.setEchoChar('*');
            limpiarContraseña = false;
        }
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtRepetirContraseñaaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRepetirContraseñaaMousePressed
        // Evento: Cuando el mouse presiona el campo
        if (limpiarRepetirContraseña) {
            txtRepetirContraseñaa.setText("");
            txtRepetirContraseñaa.setForeground(Color.black);
            txtRepetirContraseñaa.setEchoChar('*');
            limpiarRepetirContraseña = false;
        }
    }//GEN-LAST:event_txtRepetirContraseñaaMousePressed

    
    
    
    
    // EVENTOS PARA RELLENAR LOS CAMPOS CUANDO ESTAN VACIOS
    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtNombre.getText().equals("")) {
            txtNombre.setText("Nombre");
            txtNombre.setForeground(Color.decode("#999999"));
            limpiarNombre = true;
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmailFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtEmail.getText().equals("")) {
            txtEmail.setText("Email");
            txtEmail.setForeground(Color.decode("#999999"));
            limpiarEmail = true;
        }
    }//GEN-LAST:event_txtEmailFocusLost

    private void txtContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContraseñaFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtContraseña.getText().equals("")) {
            txtContraseña.setText("Contraseña");
            txtContraseña.setEchoChar((char) 0);
            txtContraseña.setForeground(Color.decode("#999999"));
            limpiarContraseña = true;
        }
    }//GEN-LAST:event_txtContraseñaFocusLost

    private void txtRepetirContraseñaaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRepetirContraseñaaFocusLost
        // Evento: Cuando el mouse sale del campo y este esta vacio
        if (txtRepetirContraseñaa.getText().equals("")) {
            txtRepetirContraseñaa.setText("Repetir Contraseña");
            txtRepetirContraseñaa.setEchoChar((char) 0);
            txtRepetirContraseñaa.setForeground(Color.decode("#999999"));
            limpiarRepetirContraseña = true;
        }
    }//GEN-LAST:event_txtRepetirContraseñaaFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    public javax.swing.JProgressBar barraVerificacionAmarillo;
    public javax.swing.JProgressBar barraVerificacionRoja;
    public javax.swing.JProgressBar barraVerificacionVerde;
    public javax.swing.JButton btnIniciarSesiónSecundario;
    public javax.swing.JButton btnRegistrarsePrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTituloDatos;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloLogin2;
    public javax.swing.JCheckBox mostrarContraseña;
    private javax.swing.JPanel panelDatosRegistro;
    private javax.swing.JPanel panelDiseñoRegistro;
    public javax.swing.JPasswordField txtContraseña;
    public javax.swing.JTextField txtEmail;
    public javax.swing.JTextField txtNombre;
    public javax.swing.JPasswordField txtRepetirContraseñaa;
    // End of variables declaration//GEN-END:variables
}
