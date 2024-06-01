package Controller;

import Model.Producto;
import View.Form.ProductoForm;
import View.Paneles.PanelProductos;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ProductoController implements ActionListener {

    private PanelProductos panelProductos;
    private ProductoForm productoForm;
    private Frame MainInterface;

    // Instaciar clases a utilizar
    ProductoOperation productoOp = new ProductoOperation();
    Producto p = new Producto();
    DefaultTableModel model = new DefaultTableModel();

    public ProductoController(PanelProductos panelProductos) {
        this.panelProductos = panelProductos;
        this.productoForm = new ProductoForm(MainInterface, true);
        this.panelProductos.btnAgregarProducto.addActionListener(this);
        this.panelProductos.btnEliminarProducto.addActionListener(this);
        this.panelProductos.btnModificarProducto.addActionListener(this);
        this.panelProductos.btnActualizarPagina.addActionListener(this);
        this.productoForm.btnProducto.addActionListener(this);

        consultarProductos(panelProductos.jTableProductos);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelProductos.btnAgregarProducto) {
            cargarNombresProveedores();
            cargarNombresCategorias();
            productoForm.setVisible(true);

        }
        if (e.getSource() == panelProductos.btnModificarProducto) {

        }
        if (e.getSource() == panelProductos.btnEliminarProducto) {

        }
        if (e.getSource() == panelProductos.btnActualizarPagina) {
            consultarProductos(panelProductos.jTableProductos);
        }
        if (e.getSource() == productoForm.btnProducto) {
            validarCamposProducto();
            agregarNuevoProducto();
        }
    }

    private void consultarProductos(JTable tablaProductos) {
        limpiarTablaProductos();
        centrarCeldasProductos(tablaProductos);
        model = (DefaultTableModel) tablaProductos.getModel();
        tablaProductos.setModel(model);
        List<Producto> lista = productoOp.SQL_ConsultarProductos();
        Object[] objeto = new Object[8];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Producto();
            objeto[1] = lista.get(i).getNombre_Proveedor();
            objeto[2] = lista.get(i).getNombre_Categoria();
            objeto[3] = lista.get(i).getNombre_Producto();
            objeto[4] = lista.get(i).getDescripcion();
            objeto[5] = lista.get(i).getCodigo();
            objeto[6] = lista.get(i).getPrecio();
            objeto[7] = lista.get(i).getStock();
            model.addRow(objeto);
        }
    }

    private void centrarCeldasProductos(JTable tablaProductos) {
        DefaultTableCellRenderer dtm = new DefaultTableCellRenderer();
        dtm.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < panelProductos.jTableProductos.getColumnCount(); i++) {
            tablaProductos.getColumnModel().getColumn(i).setCellRenderer(dtm);
        }
    }

    private void limpiarTablaProductos() {
        for (int i = 0; i < panelProductos.jTableProductos.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    private void cargarNombresProveedores() {
        List<String> DatosNombresProveedores = productoOp.SQL_ConsultarNombresProveedores();
        productoForm.jComboBoxProveedor.removeAllItems();
        productoForm.jComboBoxProveedor.addItem("<Seleccione un Proveedor>");
        productoForm.jComboBoxProveedor.setSelectedItem(1);
        for (String nombreProveedor : DatosNombresProveedores) {
            productoForm.jComboBoxProveedor.addItem(nombreProveedor);
        }
    }

    private void cargarNombresCategorias() {
        List<String> DatosNombresCategorias = productoOp.SQL_ConsultarNombresCategorias();
        productoForm.jComboBoxCategoria.removeAllItems();
        productoForm.jComboBoxCategoria.addItem("<Seleccione una categoria>");
        productoForm.jComboBoxCategoria.setSelectedItem(1);
        for (String nombreCategoria : DatosNombresCategorias) {
            productoForm.jComboBoxCategoria.addItem(nombreCategoria);
        }
    }

    private void validarCamposProducto() {
        // Obtener valores de los campos 
        String nombreProveedor = (String) productoForm.jComboBoxProveedor.getSelectedItem();
        String nombreCategoria = (String) productoForm.jComboBoxCategoria.getSelectedItem();
        String nombre = productoForm.txtNombre.getText();
        String descripcion = productoForm.txtDescripcion.getText();
        String codigo = productoForm.txtCodigo.getText();
        double precio = Double.parseDouble(productoForm.txtPrecio.getText());
        int stock = (int) productoForm.jSpinnerStock.getValue();

        // REALIZAR VALIDACIONES DE CAMPOS 
        // Validar nombre de proveedor
        if (nombreProveedor.equals("<Seleccione un Proveedor>")) {
            JOptionPane.showMessageDialog(productoForm, "El nombre del proveedor no puede estar vacio, selecciones un nombre de proveedor.", "Proveedor no seleccionado", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar nombre de categoria
        if (nombreCategoria.equals("<Seleccione una categoria>")) {
            JOptionPane.showMessageDialog(productoForm, "El nombre de la categoria no puede estar vacio, Seleccione un nombre de categoria", "Categoria no seleccionada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar si nombre de producto esta vacio o si contiene caracteres
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(productoForm, "El nombre del producto no puede estar vacio, Ingrese el nombre del producto.", "Nombre no ingresado", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!nombre.matches("[a-zA-Z0-9 ]*")) {
            JOptionPane.showMessageDialog(productoForm, "El nombre del producto no puede contener caracteres, Ingrese el nombre del producto correctamente.", "Formato de nombre invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar si la descripcion del producto esta vacia
        if (descripcion.isEmpty()) {
            JOptionPane.showMessageDialog(productoForm, "La descripcion del producto no puede estar vacia.", "Descripcion no ingresada", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar longitud del codigo y que no contenga caracteres especiales
        if (codigo.length() > 13 || codigo.length() < 13) {
            JOptionPane.showMessageDialog(productoForm, "El codigo del producto debe contener 13 digitos; Ej: 78065063XXXXX", "Formato de código invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (!codigo.matches("[a-zA-Z0-9 ]*")) {
            JOptionPane.showMessageDialog(productoForm, "El codigo del producto no debe contener caracteres especiales", "Formato de código invalido", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validar precio
        // Validar Stock
    }

    private void agregarNuevoProducto() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        String nombreProveedor = (String) productoForm.jComboBoxProveedor.getSelectedItem();
        int ID_Proveedor = productoOp.SQL_ConsultarID("ID_Proveedor", "SELECT ID_Proveedor FROM Proveedores WHERE Nombre = '" + nombreProveedor + "'");
        System.out.println("ID SEECCIOANDA:" + ID_Proveedor);

        String nombreCategoria = (String) productoForm.jComboBoxCategoria.getSelectedItem();
        int ID_Categoria = productoOp.SQL_ConsultarID("ID_Categoria", "SELECT ID_Categoria FROM Categorias WHERE Nombre = '" + nombreCategoria + "'");
        System.out.println("ID SEECCIOANDA:" + ID_Categoria);

        String nombre = productoForm.txtNombre.getText();
        String descripcion = productoForm.txtDescripcion.getText();
        String codigo = productoForm.txtCodigo.getText();
        double precio = Double.parseDouble(productoForm.txtPrecio.getText());
        int stock = (int) productoForm.jSpinnerStock.getValue();

        // SETEAR VALORES A CLASE PRODUCTO
        p.setID_Proveedor(ID_Proveedor);
        p.setID_Categoria(ID_Categoria);
        p.setNombre_Producto(nombre);
        p.setDescripcion(descripcion);
        p.setCodigo(codigo);
        p.setPrecio(precio);
        p.setStock(stock);

        int r = productoOp.SQL_AgregarNuevoProducto(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(productoForm, "El producto ha sido añadido exitosamente.", "Producto añadido", JOptionPane.INFORMATION_MESSAGE);
            productoForm.dispose();
            consultarProductos(panelProductos.jTableProductos);
        } else {
            JOptionPane.showMessageDialog(productoForm, "Se ha producido un error al intentar añadir el producto.", "Error al añadir producto", JOptionPane.ERROR_MESSAGE);
        }

    }
}
