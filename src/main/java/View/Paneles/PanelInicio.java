package View.Paneles;

import Controller.InicioController;
import Controller.NuevaVentaController;
import View.MainInterface;
import java.awt.BorderLayout;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import javax.swing.JPanel;
import javax.swing.Timer;

public class PanelInicio extends javax.swing.JPanel {

    private Timer timer;
    private InicioController inicioController;
    

    // Crear instancias de interfazes para manejar ventanas.
    PanelNuevaVenta panelNuevaVenta = new PanelNuevaVenta();
    NuevaVentaController nuevaVentaController = new NuevaVentaController(panelNuevaVenta);

    public PanelInicio() {
        initComponents();
        inicioController = new InicioController(this);

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
        txtStockProductos = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        panelBarraSuperior = new javax.swing.JPanel();
        txtFecha = new javax.swing.JLabel();
        txtFecha1 = new javax.swing.JLabel();
        lbTituloLogin = new javax.swing.JLabel();
        txtStockProductos6 = new javax.swing.JLabel();
        txtIngresosTotales = new javax.swing.JLabel();
        lbIconDinero = new javax.swing.JLabel();
        lbTituloLogin1 = new javax.swing.JLabel();
        lbTituloLogin2 = new javax.swing.JLabel();
        txtMensaje = new javax.swing.JLabel();
        btnAgregarProducto = new javax.swing.JButton();
        lbIconCaja = new javax.swing.JLabel();
        txtStockProductos3 = new javax.swing.JLabel();
        txtClientesDisponibles = new javax.swing.JLabel();
        lbIconCliente = new javax.swing.JLabel();
        lbTituloLogin3 = new javax.swing.JLabel();
        lbTituloLogin4 = new javax.swing.JLabel();
        txtStockProductos1 = new javax.swing.JLabel();
        imgen1 = new javax.swing.JLabel();
        imgen2 = new javax.swing.JLabel();
        imgen3 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(950, 700));
        setMinimumSize(new java.awt.Dimension(950, 700));

        backgound.setBackground(new java.awt.Color(250, 251, 253));
        backgound.setMaximumSize(new java.awt.Dimension(950, 700));
        backgound.setMinimumSize(new java.awt.Dimension(950, 700));
        backgound.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtStockProductos.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        txtStockProductos.setForeground(new java.awt.Color(255, 255, 255));
        txtStockProductos.setText("100");
        backgound.add(txtStockProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 60, -1));

        imagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/vender_productos.png"))); // NOI18N
        imagen.setToolTipText("");
        imagen.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        backgound.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 418, 482, 282));

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

        backgound.add(panelBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 952, -1));

        lbTituloLogin.setFont(new java.awt.Font("Roboto Black", 1, 36)); // NOI18N
        lbTituloLogin.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTituloLogin.setText("REALIZAR NUEVA VENTA");
        backgound.add(lbTituloLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 349, 451, 51));

        txtStockProductos6.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtStockProductos6.setForeground(new java.awt.Color(255, 255, 255));
        txtStockProductos6.setText("Ingreso Total");
        backgound.add(txtStockProductos6, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 240, 230, 30));

        txtIngresosTotales.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        txtIngresosTotales.setForeground(new java.awt.Color(255, 255, 255));
        txtIngresosTotales.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtIngresosTotales.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dolar.png"))); // NOI18N
        txtIngresosTotales.setText("100");
        backgound.add(txtIngresosTotales, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, 230, -1));

        lbIconDinero.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbIconDinero.setForeground(new java.awt.Color(255, 255, 255));
        lbIconDinero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bolsa.png"))); // NOI18N
        backgound.add(lbIconDinero, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 210, 30, 30));

        lbTituloLogin1.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin1.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin1.setText("Selecciona un cliente.");
        backgound.add(lbTituloLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 423, -1, -1));

        lbTituloLogin2.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin2.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin2.setText("Agrega los productos al carro de compras.");
        backgound.add(lbTituloLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 454, -1, -1));

        txtMensaje.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        txtMensaje.setText("Bienvenido a tu sistema favorito ♥");
        backgound.add(txtMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 27, 265, -1));

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
        btnAgregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarProductoActionPerformed(evt);
            }
        });
        backgound.add(btnAgregarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 590, 300, 60));

        lbIconCaja.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbIconCaja.setForeground(new java.awt.Color(255, 255, 255));
        lbIconCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/caja-abierta.png"))); // NOI18N
        backgound.add(lbIconCaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 30, 30));

        txtStockProductos3.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtStockProductos3.setForeground(new java.awt.Color(255, 255, 255));
        txtStockProductos3.setText("Clientes Disponibles");
        backgound.add(txtStockProductos3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 240, 30));

        txtClientesDisponibles.setFont(new java.awt.Font("Roboto Black", 1, 20)); // NOI18N
        txtClientesDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        txtClientesDisponibles.setText("100");
        backgound.add(txtClientesDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 270, 60, -1));

        lbIconCliente.setFont(new java.awt.Font("Roboto Black", 1, 18)); // NOI18N
        lbIconCliente.setForeground(new java.awt.Color(255, 255, 255));
        lbIconCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuario (1).png"))); // NOI18N
        backgound.add(lbIconCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 30, 30));

        lbTituloLogin3.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin3.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin3.setText("Genera la venta.");
        backgound.add(lbTituloLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 485, -1, -1));

        lbTituloLogin4.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lbTituloLogin4.setForeground(new java.awt.Color(14, 125, 128));
        lbTituloLogin4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbTituloLogin4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/marca-de-verificacion.png"))); // NOI18N
        lbTituloLogin4.setText("Incrementa tus ganancias.");
        backgound.add(lbTituloLogin4, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 516, -1, -1));

        txtStockProductos1.setFont(new java.awt.Font("Roboto Black", 1, 14)); // NOI18N
        txtStockProductos1.setForeground(new java.awt.Color(255, 255, 255));
        txtStockProductos1.setText("Productos Disponibles");
        backgound.add(txtStockProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 240, 30));

        imgen1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unnamed (2).png"))); // NOI18N
        imgen1.setToolTipText("");
        backgound.add(imgen1, new org.netbeans.lib.awtextra.AbsoluteConstraints(656, 185, -1, -1));

        imgen2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unnamed (1).png"))); // NOI18N
        imgen2.setToolTipText("");
        backgound.add(imgen2, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 185, -1, -1));

        imgen3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgen3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/unnamed.png"))); // NOI18N
        imgen3.setToolTipText("");
        backgound.add(imgen3, new org.netbeans.lib.awtextra.AbsoluteConstraints(351, 185, -1, -1));

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
        actualizarPanelInicio();
    }//GEN-LAST:event_btnAgregarProductoMousePressed

    private void btnAgregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarProductoActionPerformed

    // Metodos para panel de Inicio
    public void actualizarPanelInicio(){
        inicioController.consultarResumenes();
    }
    
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

        String fechaFormateada = "Hoy es " + nombreDiaSemana + " " + dia + " de " + nombreMes + " de " + año + " - " + hora + ":" + minutos;

        txtFecha.setText(fechaFormateada);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel backgound;
    public javax.swing.JButton btnAgregarProducto;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel imgen1;
    private javax.swing.JLabel imgen2;
    private javax.swing.JLabel imgen3;
    public javax.swing.JLabel lbIconCaja;
    public javax.swing.JLabel lbIconCliente;
    public javax.swing.JLabel lbIconDinero;
    private javax.swing.JLabel lbTituloLogin;
    private javax.swing.JLabel lbTituloLogin1;
    private javax.swing.JLabel lbTituloLogin2;
    private javax.swing.JLabel lbTituloLogin3;
    private javax.swing.JLabel lbTituloLogin4;
    private javax.swing.JPanel panelBarraSuperior;
    public javax.swing.JLabel txtClientesDisponibles;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JLabel txtFecha1;
    public javax.swing.JLabel txtIngresosTotales;
    private javax.swing.JLabel txtMensaje;
    public javax.swing.JLabel txtStockProductos;
    public javax.swing.JLabel txtStockProductos1;
    public javax.swing.JLabel txtStockProductos3;
    public javax.swing.JLabel txtStockProductos6;
    // End of variables declaration//GEN-END:variables
}
