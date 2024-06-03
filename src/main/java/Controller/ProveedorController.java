package Controller;

import Model.Proveedor;
import View.Form.ProveedorForm;
import View.Paneles.PanelProveedores;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ProveedorController implements ActionListener {

    private PanelProveedores panelProveedores;
    private ProveedorForm proveedorForm;
    private Frame MainInterface;

    // Instaciar clases a utilizar
    ProveedorOperation proveedorOp = new ProveedorOperation();
    Proveedor p = new Proveedor();
    DefaultTableModel model = new DefaultTableModel();

    public ProveedorController(PanelProveedores panelProveedores) {
        this.panelProveedores = panelProveedores;
        this.proveedorForm = new ProveedorForm(MainInterface, true);
        this.panelProveedores.btnAgregarProveedor.addActionListener(this);
        this.panelProveedores.btnModificarProveedor.addActionListener(this);
        this.panelProveedores.btnEliminarProveedor.addActionListener(this);
        this.panelProveedores.btnActualizarPagina.addActionListener(this);
        this.proveedorForm.btnProveedor.addActionListener(this);

        consultarProveedores(panelProveedores.jTableProveedores);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelProveedores.btnAgregarProveedor) {
            limpiarFormulario();
            proveedorForm.btnProveedor.setText("Añadir Proveedor");
            proveedorForm.setVisible(true);
        }

        if (e.getSource() == panelProveedores.btnModificarProveedor) {
            proveedorForm.btnProveedor.setText("Guardar Proveedor");
            modificarProveedor();
        }

        if (e.getSource() == panelProveedores.btnEliminarProveedor) {
            eliminarProveedor();
        }

        if (e.getSource() == panelProveedores.btnActualizarPagina) {
            consultarProveedores(panelProveedores.jTableProveedores);
        }

        if (e.getSource() == proveedorForm.btnProveedor) {
            String boton = proveedorForm.btnProveedor.getText();
            if (boton.equals("Añadir Proveedor")) {
                agregarNuevoProveedor();
            } else {
                actualizarProveedor();
            }
        }
    }

    private void consultarProveedores(JTable tablaProveedores) {
        limpiarTablaProveedores();
        centrarCeldasProveedores(tablaProveedores);
        model = (DefaultTableModel) tablaProveedores.getModel();
        tablaProveedores.setModel(model);
        List<Proveedor> lista = proveedorOp.SQL_ConsultarProveedores();
        Object[] objeto = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Proveedor();
            objeto[1] = lista.get(i).getRut();
            objeto[2] = lista.get(i).getNombre();
            objeto[3] = lista.get(i).getEmail();
            objeto[4] = lista.get(i).getTelefono();
            objeto[5] = lista.get(i).getDireccion();
            objeto[6] = lista.get(i).getEstado();
            model.addRow(objeto);
        }
    }

    private void centrarCeldasProveedores(JTable tablaProveedores) {
        DefaultTableCellRenderer dtm = new DefaultTableCellRenderer();
        dtm.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < panelProveedores.jTableProveedores.getColumnCount(); i++) {
            tablaProveedores.getColumnModel().getColumn(i).setCellRenderer(dtm);
        }
    }

    private void limpiarTablaProveedores() {
        for (int i = 0; i < panelProveedores.jTableProveedores.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    private void agregarNuevoProveedor() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        String rut = proveedorForm.txtRut.getText();
        String nombre = proveedorForm.txtNombre.getText();
        String email = proveedorForm.txtEmail.getText();
        String telefono = proveedorForm.txtTelefono.getText();
        String direccion = proveedorForm.txtDireccion.getText();
        String estado = (String) proveedorForm.jComboBoxEstado.getSelectedItem();

        // SETEAR VALORES A CLASE CLIENTE
        p.setRut(rut);
        p.setNombre(nombre);
        p.setEmail(email);
        p.setTelefono(telefono);
        p.setDireccion(direccion);
        p.setEstado(estado);

        int r = proveedorOp.SQL_AgregarNuevoProveedor(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(proveedorForm, "El proveedor ha sido añadido exitosamente.", "Proveedor añadido", JOptionPane.INFORMATION_MESSAGE);
            proveedorForm.dispose();
            consultarProveedores(panelProveedores.jTableProveedores);
        } else {
            JOptionPane.showMessageDialog(proveedorForm, "Se ha producido un error al intentar añadir al proveedor.", "Error al añadir proveedor", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarProveedor() {
        int fila = panelProveedores.jTableProveedores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelProveedores, "Debe seleccionar una fila para eliminar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            int ID_Proveedor = (int) panelProveedores.jTableProveedores.getValueAt(fila, 0);
            int r = proveedorOp.SQL_EliminarProveedor(ID_Proveedor);
            if (r == 1) {
                JOptionPane.showMessageDialog(panelProveedores, "proveedor eliminado con exito.", "Proveedor Eliminado", JOptionPane.INFORMATION_MESSAGE);
                consultarProveedores(panelProveedores.jTableProveedores);
            } else {
                JOptionPane.showMessageDialog(panelProveedores, "Se ha producido un error al intentar eliminar el proveedor.", "Error al elimianar Proveedor", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
    
    private void modificarProveedor() {
        int fila = panelProveedores.jTableProveedores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelProveedores, "Debe seleccionar una fila para modificar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            // OBTENER VALORES DE LA FILA SELECCIONADA
            int ID_Proveedor = (int) panelProveedores.jTableProveedores.getValueAt(fila, 0);
            String rut = (String) panelProveedores.jTableProveedores.getValueAt(fila, 1);
            String nombre = (String) panelProveedores.jTableProveedores.getValueAt(fila, 2);
            String email = (String) panelProveedores.jTableProveedores.getValueAt(fila, 3);
            String telefono = (String) panelProveedores.jTableProveedores.getValueAt(fila, 4);
            String direccion = (String) panelProveedores.jTableProveedores.getValueAt(fila, 5);
            String estado = (String) panelProveedores.jTableProveedores.getValueAt(fila, 6);

            // SETEAR VALORES AL FORMULARIO DE MODIFICACION
            proveedorForm.txtIdProveedor.setText(String.valueOf(ID_Proveedor));
            proveedorForm.txtRut.setText(rut);
            proveedorForm.txtNombre.setText(nombre);
            proveedorForm.txtEmail.setText(email);
            proveedorForm.txtTelefono.setText(telefono);
            proveedorForm.txtDireccion.setText(direccion);
            proveedorForm.jComboBoxEstado.setSelectedItem(estado);

            // ABRIR FORMULARIO
            proveedorForm.setVisible(true);
        }

    }
    
    private void actualizarProveedor() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        int ID_Proveedor = Integer.parseInt(proveedorForm.txtIdProveedor.getText());
        String rut = proveedorForm.txtRut.getText();
        String nombre = proveedorForm.txtNombre.getText();
        String email = proveedorForm.txtEmail.getText();
        String telefono = proveedorForm.txtTelefono.getText();
        String direccion = proveedorForm.txtDireccion.getText();
        String estado = (String) proveedorForm.jComboBoxEstado.getSelectedItem();

        // SETEAR VALORES A CLASE PROVEEDOR
        p.setID_Proveedor(ID_Proveedor);
        p.setRut(rut);
        p.setNombre(nombre);
        p.setEmail(email);
        p.setTelefono(telefono);
        p.setDireccion(direccion);
        p.setEstado(estado);

        int r = proveedorOp.SQL_ActualizarProveedor(p);
        if (r == 1) {
            JOptionPane.showMessageDialog(panelProveedores, "Proveedor actualizado con exito.", "Proveedor actualizado", JOptionPane.INFORMATION_MESSAGE);
            consultarProveedores(panelProveedores.jTableProveedores);
            proveedorForm.dispose();
        } else {
            JOptionPane.showMessageDialog(panelProveedores, "Se ha producido un error al intentar actualizar al proveedor.", "Error al actualizar proveedor", JOptionPane.ERROR_MESSAGE);
        }
    }


    private void limpiarFormulario() {
        proveedorForm.txtIdProveedor.setText("");
        proveedorForm.txtRut.setText("");
        proveedorForm.txtNombre.setText("");
        proveedorForm.txtEmail.setText("");
        proveedorForm.txtTelefono.setText("");
        proveedorForm.txtDireccion.setText("");
        proveedorForm.jComboBoxEstado.setSelectedIndex(0);
    }

}
