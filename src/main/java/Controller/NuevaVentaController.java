package Controller;

import Model.DetalleVenta;
import Model.Venta;
import View.Paneles.PanelInicio;
import View.Paneles.PanelNuevaVenta;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class NuevaVentaController implements ActionListener {

    private PanelNuevaVenta panelNuevaVenta;
    private int contadorDetalleVenta = 1;
    private int sumaTotales = 0;

    // Instanciar clases a utilizar
    NuevaVentaOperation nuevaVentaOp = new NuevaVentaOperation();
    Venta v = new Venta();
    DetalleVenta dv = new DetalleVenta();
    DefaultTableModel model = new DefaultTableModel();

    public NuevaVentaController(PanelNuevaVenta panelNuevaVenta) {
        this.panelNuevaVenta = panelNuevaVenta;
        this.panelNuevaVenta.btnAgregarProducto.addActionListener(this);
        this.panelNuevaVenta.btnRealizarVenta.addActionListener(this);
        this.panelNuevaVenta.btnEliminarProducto.addActionListener(this);
        this.panelNuevaVenta.btnCancelarVenta.addActionListener(this);

        this.panelNuevaVenta.jComboBoxClientes.addActionListener(this);
        this.panelNuevaVenta.jComboBoxProductos.addActionListener(this);

        // Cargar al iniciar ventana
        cargarClientes();
        cargarProductos();
        consultarNroVenta();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelNuevaVenta.btnAgregarProducto) {
            agregarProducto();
        }
        if (e.getSource() == panelNuevaVenta.btnRealizarVenta) {
            insertarVenta();
        }
        if (e.getSource() == panelNuevaVenta.btnEliminarProducto) {
            eliminarProducto();
        }
        if (e.getSource() == panelNuevaVenta.btnCancelarVenta) {
            cancelarVenta();
        }
        if (e.getSource() == panelNuevaVenta.jComboBoxClientes) {
            cargarIDCliente();
        }
        if (e.getSource() == panelNuevaVenta.jComboBoxProductos) {
            cargarIDProductos();
            cargarPrecioUnitario();
        }
    }

    private void insertarVenta() {
        // OBTENER VALORES DE VENTA PARA INSERTAR
        int NroVenta = Integer.parseInt(panelNuevaVenta.txtNroVenta.getText());
        int ID_Cliente = Integer.parseInt(panelNuevaVenta.txtID_Cliente.getText());
        int Total = sumaTotales;

        // INSERTAR VENTA
        int r = nuevaVentaOp.SQL_InsertarVenta(NroVenta, ID_Cliente, Total);
        if (r == 1) {
            insertarDetallesDeVenta(NroVenta);
            JOptionPane.showMessageDialog(panelNuevaVenta, "La venta se ha realizado con éxito.", "Venta realizada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(panelNuevaVenta, "Se ha producido un error al intentar realizar la venta.", "Error al realizar venta", JOptionPane.ERROR_MESSAGE);
        }
        cancelarVenta();

    }

    private void insertarDetallesDeVenta(int NroVenta) {
        // OBTENER DATOS DE LAS JTABLE Y INSERTAR DETALLES DE VENTA
        for (int i = 0; i < model.getRowCount(); i++) {
            int ID_Venta = Integer.parseInt(panelNuevaVenta.txtNroVenta.getText());
            int ID_Producto = (int) model.getValueAt(i, 1);
            int Cantidad = (int) model.getValueAt(i, 3);
            String precioObtenido = (String) model.getValueAt(i, 4);
            int precioFormateado = formatearEliminarPuntos(precioObtenido);
            int Precio = precioFormateado / Cantidad;
            nuevaVentaOp.SQL_InsertarDetalleVenta(ID_Venta, ID_Producto, Cantidad, Precio);
        }

    }

    private void cargarClientes() {
        List<String> DatosNombresClientes = nuevaVentaOp.SQL_ConsultarNombresClientes();
        panelNuevaVenta.jComboBoxClientes.removeAllItems();
        panelNuevaVenta.jComboBoxClientes.addItem("Seleccione un cliente");
        panelNuevaVenta.jComboBoxClientes.setSelectedItem(1);
        for (String nombreCliente : DatosNombresClientes) {
            panelNuevaVenta.jComboBoxClientes.addItem(nombreCliente);
        }
    }

    private void cargarIDCliente() {
        String nombreCliente = panelNuevaVenta.jComboBoxClientes.getSelectedItem().toString();
        int IdCliente = nuevaVentaOp.SQL_ConsultarID_Cliente(nombreCliente);
        panelNuevaVenta.txtID_Cliente.setText(String.valueOf(IdCliente));
    }

    private void cargarProductos() {
        List<String> DatosNombresProductos = nuevaVentaOp.SQL_ConsultarNombresProductos();
        panelNuevaVenta.jComboBoxProductos.removeAllItems();
        panelNuevaVenta.jComboBoxProductos.addItem("Seleccione un producto");
        panelNuevaVenta.jComboBoxProductos.setSelectedItem(1);
        for (String nombreProductos : DatosNombresProductos) {
            panelNuevaVenta.jComboBoxProductos.addItem(nombreProductos);
        }
    }

    private void cargarIDProductos() {
        String nombreProducto = panelNuevaVenta.jComboBoxProductos.getSelectedItem().toString();
        int IdProducto = nuevaVentaOp.SQL_ConsultarID_Producto(nombreProducto);
        panelNuevaVenta.txtID_Producto.setText(String.valueOf(IdProducto));
    }

    private void cargarPrecioUnitario() {
        String nombreProducto = panelNuevaVenta.jComboBoxProductos.getSelectedItem().toString();
        int precio = nuevaVentaOp.SQL_ConsultarPrecioUnitario(nombreProducto);
        String precioFormateado = formatearAgregarPuntos(precio);
        panelNuevaVenta.txtPrecioUnitario.setText(String.valueOf(precioFormateado));

    }

    private void cancelarVenta() {
        PanelInicio panelinicio = new PanelInicio();
        InicioController inicioController = new InicioController(panelinicio);
        ShowPanel(panelinicio);
    }

    private void agregarProducto() {
        if (!validarCamposNuevaVenta()) {
            return;
        }

        // OBTENER VALORES DE CAMPOS DE ENTRADA DE TEXTO
        int NroDetalle = contadorDetalleVenta;
        int NroProducto = Integer.parseInt(panelNuevaVenta.txtID_Producto.getText());
        String producto = (String) panelNuevaVenta.jComboBoxProductos.getSelectedItem();
        int cantidad = (int) panelNuevaVenta.jSpinnerCantidad.getValue();
        String precioConPuntos = (String) panelNuevaVenta.txtPrecioUnitario.getText();
        int precio = formatearEliminarPuntos(precioConPuntos) * cantidad;
        String precioFormateado = formatearAgregarPuntos(precio);

        // CARGAR TABLA CON VAORES
        model = (DefaultTableModel) panelNuevaVenta.jTableVenta.getModel();
        panelNuevaVenta.jTableVenta.setModel(model);

        Object[] nuevaFila = {NroDetalle, NroProducto, producto, cantidad, precioFormateado};
        model.addRow(nuevaFila);
        contadorDetalleVenta++;

        // LIMPIAR CAMPOS DE ENTRADA DE TEXTO
        panelNuevaVenta.jComboBoxProductos.setSelectedIndex(0);
        panelNuevaVenta.txtPrecioUnitario.setText("");
        panelNuevaVenta.jSpinnerCantidad.setValue(1);
        // BLOQUEAR CLIENTE
        panelNuevaVenta.jComboBoxClientes.setEnabled(false);

        // CALCULAR PRECIO TOTAL DE CARRO DE COMPRAS
        for (int i = 0; i < model.getRowCount(); i++) {
            String valorFila = model.getValueAt(i, 4).toString();
            sumaTotales += formatearEliminarPuntos(valorFila);
        }
        String valorFormateado = formatearAgregarPuntos(sumaTotales);
        panelNuevaVenta.txtTotalPagar.setText("$" + valorFormateado + " CLP");
    }

    private boolean validarCamposNuevaVenta() {
        // OBTER CAMPOS DE ENTRADA DE TEXTO
        String ID_Cliente = panelNuevaVenta.txtID_Cliente.getText();
        String ID_Producto = panelNuevaVenta.txtID_Producto.getText();

        if (ID_Cliente.equals("0")) {
            JOptionPane.showMessageDialog(panelNuevaVenta, "Para añadir un producto al carro debe seleccionar un cliente", "Seleccione un cliente", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (ID_Producto.equals("0")) {
            JOptionPane.showMessageDialog(panelNuevaVenta, "Para añadir un producto al carro debe seleccionar un producto", "Seleccione un producto", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private void eliminarProducto() {
        int fila = panelNuevaVenta.jTableVenta.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelNuevaVenta, "Debe seleccionar un producto para eliminar.", "Seleccione una fila", JOptionPane.ERROR_MESSAGE);
        } else {
            model.removeRow(fila);
            // ACTUALIZAR NOS Nro DE VENTA
            for (int i = 0; i < model.getRowCount(); i++) {
                model.setValueAt(i + 1, i, 0);
                contadorDetalleVenta = model.getRowCount() + 1;
            }
        }
    }

    private void consultarNroVenta() {
        int NroVenta = nuevaVentaOp.SQL_ConsultarNroVenta() + 1;
        panelNuevaVenta.txtNroVenta.setText(String.valueOf(NroVenta));
    }

    public static String formatearAgregarPuntos(int numeros) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMANY);
        return numberFormat.format(numeros);
    }

    public static int formatearEliminarPuntos(String numeros) {
        String numberSinPunto = numeros.replace(".", "");
        return Integer.parseInt(numberSinPunto);
    }

    private void ShowPanel(JPanel p) {
        p.setSize(950, 700);
        p.setLocation(0, 0);

        panelNuevaVenta.removeAll();
        panelNuevaVenta.add(p, BorderLayout.CENTER);
        panelNuevaVenta.revalidate();
        panelNuevaVenta.repaint();

    }
}
