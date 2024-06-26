package View;

import Controller.CategoriaController;
import Controller.ClienteController;
import Controller.ConfiguracionController;
import Controller.InicioController;
import Controller.ProductoController;
import Controller.ProveedorController;
import Controller.ReporteController;
import View.EntrySystem.Login;
import View.Paneles.PanelCategorias;
import View.Paneles.PanelClientes;
import View.Paneles.PanelConfiguraciones;
import View.Paneles.PanelInicio;
import View.Paneles.PanelProductos;
import View.Paneles.PanelProveedores;
import View.Paneles.PanelReportes;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;

public class MainInterface extends javax.swing.JFrame {

    private MainInterface mainInterface;

    // Crear instancias de interfazes para manejar ventanas.
    PanelInicio panelInicio = new PanelInicio();
    InicioController inicioController = new InicioController(panelInicio);

    PanelProductos panelProductos = new PanelProductos();
    ProductoController productosController = new ProductoController(panelProductos);

    PanelCategorias panelCategorias = new PanelCategorias();
    CategoriaController categoriaController = new CategoriaController(panelCategorias);

    PanelClientes panelClientes = new PanelClientes();
    ClienteController clienteController = new ClienteController(panelClientes);

    PanelProveedores panelProveedores = new PanelProveedores();
    ProveedorController proveedorController = new ProveedorController(panelProveedores);

    PanelReportes panelReportes = new PanelReportes();
    ReporteController reporteController = new ReporteController(panelReportes);

    PanelConfiguraciones panelConfiguraciones = new PanelConfiguraciones();
    ConfiguracionController configuracionController = new ConfiguracionController(panelConfiguraciones);

    public MainInterface() {
        initComponents();
        ShowPanel(panelInicio);
    }

    public void ShowPanel(JPanel p) {
        p.setSize(950, 700);
        p.setLocation(0, 0);

        panelChanging.removeAll();
        panelChanging.add(p, BorderLayout.CENTER);
        panelChanging.revalidate();
        panelChanging.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        panelBarraNavegacion = new javax.swing.JPanel();
        jLabelLogoYNombre = new javax.swing.JLabel();
        jLabelBarraSeparacion = new javax.swing.JLabel();
        jLabelOperaciones = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JPanel();
        jLabelPrincipal = new javax.swing.JLabel();
        btnProductos = new javax.swing.JPanel();
        jLabelProductos = new javax.swing.JLabel();
        btnCategorias = new javax.swing.JPanel();
        jLabelCategorias = new javax.swing.JLabel();
        btnClientes = new javax.swing.JPanel();
        jLabelClientes = new javax.swing.JLabel();
        btnProveedores = new javax.swing.JPanel();
        txtSalir5 = new javax.swing.JLabel();
        jLabelAdministracion = new javax.swing.JLabel();
        btnReportes = new javax.swing.JPanel();
        jLabelReportes = new javax.swing.JLabel();
        btnConfiguracion = new javax.swing.JPanel();
        jLabelConfiguracion = new javax.swing.JLabel();
        btnCerrarSesion = new javax.swing.JPanel();
        jLabelCerrarSesion = new javax.swing.JLabel();
        panelChanging = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meownager");
        setLocation(new java.awt.Point(0, 0));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMaximumSize(new java.awt.Dimension(1200, 700));
        Background.setMinimumSize(new java.awt.Dimension(1200, 700));
        Background.setPreferredSize(new java.awt.Dimension(1200, 700));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBarraNavegacion.setBackground(new java.awt.Color(14, 125, 128));
        panelBarraNavegacion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelBarraNavegacion.setMaximumSize(null);
        panelBarraNavegacion.setMinimumSize(new java.awt.Dimension(250, 700));
        panelBarraNavegacion.setName(""); // NOI18N
        panelBarraNavegacion.setPreferredSize(new java.awt.Dimension(250, 700));

        jLabelLogoYNombre.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabelLogoYNombre.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogoYNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoYNombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/gatito.png"))); // NOI18N
        jLabelLogoYNombre.setText("Meownager");

        jLabelBarraSeparacion.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabelBarraSeparacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBarraSeparacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelBarraSeparacion.setText("_______");
        jLabelBarraSeparacion.setToolTipText("");
        jLabelBarraSeparacion.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelOperaciones.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabelOperaciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelOperaciones.setText("Operaciones");

        btnMenuPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMenuPrincipal.setMaximumSize(new java.awt.Dimension(250, 50));
        btnMenuPrincipal.setMinimumSize(new java.awt.Dimension(250, 50));
        btnMenuPrincipal.setOpaque(false);
        btnMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMousePressed(evt);
            }
        });

        jLabelPrincipal.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/aplicaciones.png"))); // NOI18N
        jLabelPrincipal.setText("Principal");

        javax.swing.GroupLayout btnMenuPrincipalLayout = new javax.swing.GroupLayout(btnMenuPrincipal);
        btnMenuPrincipal.setLayout(btnMenuPrincipalLayout);
        btnMenuPrincipalLayout.setHorizontalGroup(
            btnMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMenuPrincipalLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnMenuPrincipalLayout.setVerticalGroup(
            btnMenuPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnMenuPrincipalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelPrincipal)
                .addGap(13, 13, 13))
        );

        btnProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProductos.setMaximumSize(new java.awt.Dimension(250, 50));
        btnProductos.setMinimumSize(new java.awt.Dimension(250, 50));
        btnProductos.setOpaque(false);
        btnProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProductosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProductosMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProductosMousePressed(evt);
            }
        });

        jLabelProductos.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelProductos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelProductos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelProductos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/caja-abierta.png"))); // NOI18N
        jLabelProductos.setText("Productos");

        javax.swing.GroupLayout btnProductosLayout = new javax.swing.GroupLayout(btnProductos);
        btnProductos.setLayout(btnProductosLayout);
        btnProductosLayout.setHorizontalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnProductosLayout.setVerticalGroup(
            btnProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProductosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelProductos)
                .addGap(13, 13, 13))
        );

        btnCategorias.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCategorias.setMaximumSize(new java.awt.Dimension(250, 50));
        btnCategorias.setMinimumSize(new java.awt.Dimension(250, 50));
        btnCategorias.setOpaque(false);
        btnCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCategoriasMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCategoriasMousePressed(evt);
            }
        });

        jLabelCategorias.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelCategorias.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategorias.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCategorias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu.png"))); // NOI18N
        jLabelCategorias.setText("Categorias");

        javax.swing.GroupLayout btnCategoriasLayout = new javax.swing.GroupLayout(btnCategorias);
        btnCategorias.setLayout(btnCategoriasLayout);
        btnCategoriasLayout.setHorizontalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCategoriasLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCategoriasLayout.setVerticalGroup(
            btnCategoriasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCategoriasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCategorias)
                .addGap(13, 13, 13))
        );

        btnClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnClientes.setMaximumSize(new java.awt.Dimension(250, 50));
        btnClientes.setMinimumSize(new java.awt.Dimension(250, 50));
        btnClientes.setOpaque(false);
        btnClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnClientesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnClientesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnClientesMousePressed(evt);
            }
        });

        jLabelClientes.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelClientes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/usuario (1).png"))); // NOI18N
        jLabelClientes.setText("Clientes");

        javax.swing.GroupLayout btnClientesLayout = new javax.swing.GroupLayout(btnClientes);
        btnClientes.setLayout(btnClientesLayout);
        btnClientesLayout.setHorizontalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnClientesLayout.setVerticalGroup(
            btnClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelClientes)
                .addGap(13, 13, 13))
        );

        btnProveedores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProveedores.setMaximumSize(new java.awt.Dimension(250, 50));
        btnProveedores.setMinimumSize(new java.awt.Dimension(250, 50));
        btnProveedores.setOpaque(false);
        btnProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnProveedoresMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnProveedoresMousePressed(evt);
            }
        });

        txtSalir5.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        txtSalir5.setForeground(new java.awt.Color(255, 255, 255));
        txtSalir5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSalir5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/proveedor.png"))); // NOI18N
        txtSalir5.setText("Proveedores");

        javax.swing.GroupLayout btnProveedoresLayout = new javax.swing.GroupLayout(btnProveedores);
        btnProveedores.setLayout(btnProveedoresLayout);
        btnProveedoresLayout.setHorizontalGroup(
            btnProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProveedoresLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(txtSalir5, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnProveedoresLayout.setVerticalGroup(
            btnProveedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnProveedoresLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtSalir5)
                .addGap(13, 13, 13))
        );

        jLabelAdministracion.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        jLabelAdministracion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdministracion.setText("Administracion");

        btnReportes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReportes.setMaximumSize(new java.awt.Dimension(250, 50));
        btnReportes.setMinimumSize(new java.awt.Dimension(250, 50));
        btnReportes.setOpaque(false);
        btnReportes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnReportesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnReportesMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnReportesMousePressed(evt);
            }
        });

        jLabelReportes.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelReportes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelReportes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/reporte.png"))); // NOI18N
        jLabelReportes.setText("Reportes");

        javax.swing.GroupLayout btnReportesLayout = new javax.swing.GroupLayout(btnReportes);
        btnReportes.setLayout(btnReportesLayout);
        btnReportesLayout.setHorizontalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnReportesLayout.setVerticalGroup(
            btnReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnReportesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelReportes)
                .addGap(13, 13, 13))
        );

        btnConfiguracion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConfiguracion.setMaximumSize(new java.awt.Dimension(250, 50));
        btnConfiguracion.setMinimumSize(new java.awt.Dimension(250, 50));
        btnConfiguracion.setOpaque(false);
        btnConfiguracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfiguracionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnConfiguracionMousePressed(evt);
            }
        });

        jLabelConfiguracion.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelConfiguracion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelConfiguracion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelConfiguracion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ajustes.png"))); // NOI18N
        jLabelConfiguracion.setText("Cofiguracion");

        javax.swing.GroupLayout btnConfiguracionLayout = new javax.swing.GroupLayout(btnConfiguracion);
        btnConfiguracion.setLayout(btnConfiguracionLayout);
        btnConfiguracionLayout.setHorizontalGroup(
            btnConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConfiguracionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnConfiguracionLayout.setVerticalGroup(
            btnConfiguracionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnConfiguracionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelConfiguracion)
                .addGap(13, 13, 13))
        );

        btnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrarSesion.setMaximumSize(new java.awt.Dimension(250, 50));
        btnCerrarSesion.setMinimumSize(new java.awt.Dimension(250, 50));
        btnCerrarSesion.setOpaque(false);
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(250, 50));
        btnCerrarSesion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarSesionMousePressed(evt);
            }
        });

        jLabelCerrarSesion.setFont(new java.awt.Font("SansSerif", 1, 15)); // NOI18N
        jLabelCerrarSesion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCerrarSesion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cerrar-sesion24x24.png"))); // NOI18N
        jLabelCerrarSesion.setText("Cerrar Sesion");

        javax.swing.GroupLayout btnCerrarSesionLayout = new javax.swing.GroupLayout(btnCerrarSesion);
        btnCerrarSesion.setLayout(btnCerrarSesionLayout);
        btnCerrarSesionLayout.setHorizontalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        btnCerrarSesionLayout.setVerticalGroup(
            btnCerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCerrarSesionLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCerrarSesion)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout panelBarraNavegacionLayout = new javax.swing.GroupLayout(panelBarraNavegacion);
        panelBarraNavegacion.setLayout(panelBarraNavegacionLayout);
        panelBarraNavegacionLayout.setHorizontalGroup(
            panelBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                .addGroup(panelBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnClientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnProveedores, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReportes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnConfiguracion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                        .addGroup(panelBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabelLogoYNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelAdministracion)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraNavegacionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelBarraSeparacion)
                .addGap(54, 54, 54))
            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelOperaciones)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBarraNavegacionLayout.createSequentialGroup()
                .addComponent(btnCategorias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelBarraNavegacionLayout.setVerticalGroup(
            panelBarraNavegacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBarraNavegacionLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabelLogoYNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelBarraSeparacion, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelOperaciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenuPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnCategorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabelAdministracion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfiguracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        Background.add(panelBarraNavegacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 700));

        panelChanging.setBackground(new java.awt.Color(250, 251, 253));
        panelChanging.setMaximumSize(new java.awt.Dimension(950, 700));
        panelChanging.setMinimumSize(new java.awt.Dimension(950, 700));
        panelChanging.setPreferredSize(new java.awt.Dimension(950, 700));

        javax.swing.GroupLayout panelChangingLayout = new javax.swing.GroupLayout(panelChanging);
        panelChanging.setLayout(panelChangingLayout);
        panelChangingLayout.setHorizontalGroup(
            panelChangingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
        );
        panelChangingLayout.setVerticalGroup(
            panelChangingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        Background.add(panelChanging, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 950, 700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // EVENTOS PARA CAMBIAR PANELES.
    private void btnMenuPrincipalMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMousePressed
        PanelInicio panelInicio = new PanelInicio();
        InicioController inicioController = new InicioController(panelInicio);
        ShowPanel(panelInicio);
    }//GEN-LAST:event_btnMenuPrincipalMousePressed

    private void btnProductosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMousePressed

        ShowPanel(panelProductos);
    }//GEN-LAST:event_btnProductosMousePressed

    private void btnCategoriasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMousePressed

        ShowPanel(panelCategorias);
    }//GEN-LAST:event_btnCategoriasMousePressed

    private void btnProveedoresMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMousePressed

        ShowPanel(panelProveedores);
    }//GEN-LAST:event_btnProveedoresMousePressed

    private void btnReportesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMousePressed
        ShowPanel(panelReportes);
    }//GEN-LAST:event_btnReportesMousePressed

    private void btnConfiguracionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMousePressed

        ShowPanel(panelConfiguraciones);
    }//GEN-LAST:event_btnConfiguracionMousePressed

    private void btnCerrarSesionMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMousePressed
        this.dispose();
        Login iniciarSesion = new Login();
        iniciarSesion.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionMousePressed

    // EVENTOS PARA CUANDO ENTRA Y SALE EL MOUSE A EL BOTON CAMBAIR BACKGROUND
    private void btnMenuPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseEntered
        btnMenuPrincipal.setBackground(Color.decode("#0E8A88"));
        btnMenuPrincipal.setOpaque(true);
    }//GEN-LAST:event_btnMenuPrincipalMouseEntered

    private void btnMenuPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseExited
        btnMenuPrincipal.setBackground(Color.decode("#0E7D80"));
    }//GEN-LAST:event_btnMenuPrincipalMouseExited

    private void btnProductosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseEntered
        btnProductos.setBackground(Color.decode("#0E8A88"));
        btnProductos.setOpaque(true);
    }//GEN-LAST:event_btnProductosMouseEntered

    private void btnProductosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProductosMouseExited
        btnProductos.setBackground(Color.decode("#0E7D80"));
    }//GEN-LAST:event_btnProductosMouseExited

    private void btnCategoriasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseEntered
        btnCategorias.setBackground(Color.decode("#0E8A88"));
        btnCategorias.setOpaque(true);
    }//GEN-LAST:event_btnCategoriasMouseEntered

    private void btnCategoriasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCategoriasMouseExited
        btnCategorias.setBackground(Color.decode("#0E7D80"));
    }//GEN-LAST:event_btnCategoriasMouseExited

    private void btnClientesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseEntered
        btnClientes.setBackground(Color.decode("#0E8A88"));
        btnClientes.setOpaque(true);
    }//GEN-LAST:event_btnClientesMouseEntered

    private void btnClientesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseExited
        btnClientes.setBackground(Color.decode("#0E7D80"));
    }//GEN-LAST:event_btnClientesMouseExited

    private void btnProveedoresMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseEntered
        btnProveedores.setBackground(Color.decode("#0E8A88"));
        btnProveedores.setOpaque(true);
    }//GEN-LAST:event_btnProveedoresMouseEntered

    private void btnProveedoresMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProveedoresMouseExited
        btnProveedores.setBackground(Color.decode("#0E7D80"));
    }//GEN-LAST:event_btnProveedoresMouseExited

    private void btnReportesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseEntered
        btnReportes.setBackground(Color.decode("#0E8A88"));
        btnReportes.setOpaque(true);
    }//GEN-LAST:event_btnReportesMouseEntered

    private void btnReportesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnReportesMouseExited
        btnReportes.setBackground(Color.decode("#0E7D80"));
    }//GEN-LAST:event_btnReportesMouseExited

    private void btnConfiguracionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseEntered
        btnConfiguracion.setBackground(Color.decode("#0E8A88"));
        btnConfiguracion.setOpaque(true);
    }//GEN-LAST:event_btnConfiguracionMouseEntered

    private void btnConfiguracionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfiguracionMouseExited
        btnConfiguracion.setBackground(Color.decode("#0E7D80"));
    }//GEN-LAST:event_btnConfiguracionMouseExited

    private void btnCerrarSesionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseEntered
        btnCerrarSesion.setBackground(Color.decode("#0E8A88"));
        btnCerrarSesion.setOpaque(true);
    }//GEN-LAST:event_btnCerrarSesionMouseEntered

    private void btnCerrarSesionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarSesionMouseExited
        btnCerrarSesion.setBackground(Color.decode("#0E7D80"));
    }//GEN-LAST:event_btnCerrarSesionMouseExited

    private void btnClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMousePressed
        ShowPanel(panelClientes);
    }//GEN-LAST:event_btnClientesMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel btnCategorias;
    private javax.swing.JPanel btnCerrarSesion;
    private javax.swing.JPanel btnClientes;
    private javax.swing.JPanel btnConfiguracion;
    private javax.swing.JPanel btnMenuPrincipal;
    private javax.swing.JPanel btnProductos;
    private javax.swing.JPanel btnProveedores;
    private javax.swing.JPanel btnReportes;
    private javax.swing.JLabel jLabelAdministracion;
    private javax.swing.JLabel jLabelBarraSeparacion;
    private javax.swing.JLabel jLabelCategorias;
    private javax.swing.JLabel jLabelCerrarSesion;
    private javax.swing.JLabel jLabelClientes;
    private javax.swing.JLabel jLabelConfiguracion;
    private javax.swing.JLabel jLabelLogoYNombre;
    private javax.swing.JLabel jLabelOperaciones;
    private javax.swing.JLabel jLabelPrincipal;
    private javax.swing.JLabel jLabelProductos;
    private javax.swing.JLabel jLabelReportes;
    private javax.swing.JPanel panelBarraNavegacion;
    private javax.swing.JPanel panelChanging;
    private javax.swing.JLabel txtSalir5;
    // End of variables declaration//GEN-END:variables
}
