package View.Paneles;

import Controller.NuevaVentaController;
import View.MainInterface;
import java.awt.BorderLayout;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import javax.swing.JPanel;
import javax.swing.Timer;


public class PanelInicio extends javax.swing.JPanel {
    private Timer timer;
    
    // Crear instancias de interfazes para manejar ventanas.
    PanelNuevaVenta panelNuevaVenta = new PanelNuevaVenta();
    NuevaVentaController nuevaVentaController = new NuevaVentaController(panelNuevaVenta);
    
    
    public PanelInicio() {
        initComponents();
        
        // Iniciar temporizador para fecha y hora
        setFecha();
        timer = new Timer(1000, e -> setFecha());
        timer.start();
        
        
    }
    
    private void ShowPanel(JPanel p) {
        p.setSize(950, 700);
        p.setLocation(0, 0);

        // Configurar el layout de backgound como BorderLayout
        backgound.setLayout(new BorderLayout());
        
        backgound.removeAll();
        backgound.add(p, BorderLayout.CENTER);
        backgound.revalidate();
        backgound.repaint();

    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backgound = new javax.swing.JPanel();
        imagen = new javax.swing.JLabel();
        panelBarraSuperior = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JLabel();
        lbTituloLogin = new javax.swing.JLabel();
        lbTituloLogin1 = new javax.swing.JLabel();
        lbTituloLogin2 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        lbTituloLogin3 = new javax.swing.JLabel();
        lbTituloLogin4 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));

        backgound.setBackground(new java.awt.Color(250, 251, 253));
        backgound.setMaximumSize(new java.awt.Dimension(950, 700));
        backgound.setMinimumSize(new java.awt.Dimension(950, 700));

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vender_productos.png"))); // NOI18N
        imagen.setToolTipText("");
        imagen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        panelBarraSuperior.setBackground(new java.awt.Color(14, 164, 157));
        panelBarraSuperior.setMaximumSize(new java.awt.Dimension(950, 100));
        panelBarraSuperior.setMinimumSize(new java.awt.Dimension(950, 100));
        panelBarraSuperior.setPreferredSize(new java.awt.Dimension(950, 100));

        txtFecha.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Hoy es {diaSemana} {dia} de {mes} de {año} y son las {hora} con {minutos} minutos");

        txtFecha1.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        txtFecha1.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha1.setText("Meownager/ Menu Principal");

        javax.swing.GroupLayout panelBarraSuperiorLayout = new javax.swing.GroupLayout(panelBarraSuperior);
        panelBarraSuperior.setLayout(panelBarraSuperiorLayout);
        panelBarraSuperiorLayout.setHorizontalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(379, Short.MAX_VALUE))
        );
        panelBarraSuperiorLayout.setVerticalGroup(
            panelBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        lbTituloLogin.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("REALIZAR NUEVA VENTA");

        lbTituloLogin1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin1.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin1.setText("Selecciona un cliente.");

        lbTituloLogin2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin2.setText("Agrega los productos al carro de compras.");

        txtMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMensaje.setText("Bienvenido a tu sistema favorito ♥");

        btnAgregarProducto.setBackground(new java.awt.Color(14, 207, 181));
        btnAgregarProducto.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        btnAgregarProducto.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vender.png"))); // NOI18N
        btnAgregarProducto.setText("Realizar Venta");
        btnAgregarProducto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnAgregarProductoMousePressed(evt);
            }
        });

        lbTituloLogin3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin3.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin3.setText("Genera la venta.");

        lbTituloLogin4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin4.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin4.setText("Incrementa tus ganancias.");

        javax.swing.GroupLayout backgoundLayout = new javax.swing.GroupLayout(backgound);
        backgound.setLayout(backgoundLayout);
        backgoundLayout.setHorizontalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBarraSuperior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtMensaje, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backgoundLayout.createSequentialGroup()
                        .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(backgoundLayout.createSequentialGroup()
                        .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTituloLogin1)
                            .addComponent(lbTituloLogin2)
                            .addComponent(lbTituloLogin3)
                            .addGroup(backgoundLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbTituloLogin4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        backgoundLayout.setVerticalGroup(
            backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgoundLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(txtMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelBarraSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 199, Short.MAX_VALUE)
                .addComponent(lbTituloLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(backgoundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(imagen, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(backgoundLayout.createSequentialGroup()
                        .addComponent(lbTituloLogin1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTituloLogin2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTituloLogin3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTituloLogin4)
                        .addGap(50, 50, 50)
                        .addComponent(btnAgregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgound, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgound, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarProductoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarProductoMousePressed
        ShowPanel(panelNuevaVenta);
    }//GEN-LAST:event_btnAgregarProductoMousePressed

    // Metodos para panel de Inicio
    private void setFecha() {
        LocalDateTime now = LocalDateTime.now();
        int dia = now.getDayOfMonth();
        int mes = now.getMonthValue();
        int año = now.getYear();
        DayOfWeek diaSemana = now.getDayOfWeek();
        int hora = now.getHour();
        int minutos = now.getMinute();

        String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octuble", "Noviembre", "Diciembre"};
        String nombreMes = meses[mes - 1];

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String nombreDiaSemana = diasSemana[diaSemana.getValue() - 1];

        String fechaFormateada = "Hoy es " + nombreDiaSemana + " "+ dia + " de " + nombreMes + " de " + año + " - " + hora+":"+minutos;

        txtFecha.setText(fechaFormateada);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel backgound;
    public javax.swing.JButton btnAgregarProducto;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloLogin1;
    private javax.swing.JLabel lbTituloLogin2;
    private javax.swing.JLabel lbTituloLogin3;
    private javax.swing.JLabel lbTituloLogin4;
    private javax.swing.JPanel panelBarraSuperior;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtFecha1;
    private javax.swing.JLabel txtMensaje;
    // End of variables declaration//GEN-END:variables
}
