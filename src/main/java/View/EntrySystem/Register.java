package View.EntrySystem;


public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        panelDiseñoRegistro = new javax.swing.JPanel();
        lbTituloLogin = new javax.swing.JLabel();
        lbSubTitulo = new javax.swing.JLabel();
        lbTituloLogin2 = new javax.swing.JLabel();
        btnIniciarSesión = new javax.swing.JButton();
        panelDatosRegistro = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1200, 700));
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setPreferredSize(new java.awt.Dimension(1200, 700));
        setSize(new java.awt.Dimension(1200, 700));

        background.setMaximumSize(new java.awt.Dimension(1200, 700));
        background.setMinimumSize(new java.awt.Dimension(1200, 700));
        background.setPreferredSize(new java.awt.Dimension(1200, 700));
        background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelDiseñoRegistro.setBackground(new java.awt.Color(13, 71, 160));
        panelDiseñoRegistro.setMaximumSize(new java.awt.Dimension(500, 700));
        panelDiseñoRegistro.setMinimumSize(new java.awt.Dimension(500, 700));
        panelDiseñoRegistro.setPreferredSize(new java.awt.Dimension(500, 700));

        lbTituloLogin.setFont(new java.awt.Font("SansSerif", 1, 30)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("Bienvenido!");

        lbSubTitulo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbSubTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbSubTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSubTitulo.setText(" ¿Ya tienes cuenta? ");

        lbTituloLogin2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin2.setText("Inicia Sesión y comienza a utilizar Meownager.");

        btnIniciarSesión.setBackground(new java.awt.Color(66, 183, 42));
        btnIniciarSesión.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnIniciarSesión.setForeground(new java.awt.Color(255, 255, 255));
        btnIniciarSesión.setText("Iniciar Sesión");
        btnIniciarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelDiseñoRegistroLayout = new javax.swing.GroupLayout(panelDiseñoRegistro);
        panelDiseñoRegistro.setLayout(panelDiseñoRegistroLayout);
        panelDiseñoRegistroLayout.setHorizontalGroup(
            panelDiseñoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoRegistroLayout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(panelDiseñoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiseñoRegistroLayout.createSequentialGroup()
                        .addGap(0, 58, Short.MAX_VALUE)
                        .addComponent(btnIniciarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(142, 142, 142))
                    .addGroup(panelDiseñoRegistroLayout.createSequentialGroup()
                        .addGroup(panelDiseñoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbSubTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTituloLogin, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelDiseñoRegistroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTituloLogin2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDiseñoRegistroLayout.setVerticalGroup(
            panelDiseñoRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDiseñoRegistroLayout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lbSubTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTituloLogin2)
                .addGap(64, 64, 64)
                .addComponent(btnIniciarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(329, Short.MAX_VALUE))
        );

        background.add(panelDiseñoRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 700));

        panelDatosRegistro.setBackground(new java.awt.Color(255, 255, 255));
        panelDatosRegistro.setMaximumSize(new java.awt.Dimension(700, 700));
        panelDatosRegistro.setMinimumSize(new java.awt.Dimension(700, 700));
        panelDatosRegistro.setRequestFocusEnabled(false);

        javax.swing.GroupLayout panelDatosRegistroLayout = new javax.swing.GroupLayout(panelDatosRegistro);
        panelDatosRegistro.setLayout(panelDatosRegistroLayout);
        panelDatosRegistroLayout.setHorizontalGroup(
            panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelDatosRegistroLayout.setVerticalGroup(
            panelDatosRegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        background.add(panelDatosRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 0, -1, 700));

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
    }// </editor-fold>//GEN-END:initComponents

    private void txtContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtContraseñaMousePressed
        if (limiarCampo) {
            txtContraseña.setText("");
            txtContraseña.setEchoChar('*');
            limiarCampo = false;
        }
    }//GEN-LAST:event_txtContraseñaMousePressed

    private void txtRepetirContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRepetirContraseñaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRepetirContraseñaMousePressed


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btnIniciarSesión;
    private javax.swing.JLabel lbSubTitulo;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloLogin2;
    private javax.swing.JPanel panelDatosRegistro;
    private javax.swing.JPanel panelDiseñoRegistro;
    // End of variables declaration//GEN-END:variables
}
