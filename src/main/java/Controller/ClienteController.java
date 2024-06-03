package Controller;

import Model.Cliente;
import View.Form.ClienteForm;
import View.Paneles.PanelClientes;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ClienteController implements ActionListener {

    private PanelClientes panelClientes;
    private ClienteForm clienteForm;
    private Frame MainInterface;

    // Instaciar clases a utilizar
    ClienteOperation clienteOp = new ClienteOperation();
    Cliente c = new Cliente();
    DefaultTableModel model = new DefaultTableModel();

    public ClienteController(PanelClientes panelClientes) {
        this.panelClientes = panelClientes;
        this.clienteForm = new ClienteForm(MainInterface, true);
        this.panelClientes.btnAgregarCliente.addActionListener(this);
        this.panelClientes.btnModificarCliente.addActionListener(this);
        this.panelClientes.btnEliminarCliente.addActionListener(this);
        this.panelClientes.btnActualizarPagina.addActionListener(this);
        this.clienteForm.btnCliente.addActionListener(this);
        consultarClientes(panelClientes.jTableClientes);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelClientes.btnAgregarCliente) {
            limpiarFormulario();
            clienteForm.btnCliente.setText("Añadir Cliente");
            clienteForm.setVisible(true);
        }

        if (e.getSource() == panelClientes.btnModificarCliente) {
            clienteForm.btnCliente.setText("Guardar Cliente");
            modificarCliente();
        }

        if (e.getSource() == panelClientes.btnEliminarCliente) {
            eliminarCliente();
        }

        if (e.getSource() == panelClientes.btnActualizarPagina) {
            consultarClientes(panelClientes.jTableClientes);
        }

        if (e.getSource() == clienteForm.btnCliente) {
            String boton = clienteForm.btnCliente.getText();
            if (boton.equals("Añadir Cliente")) {
                agregarNuevoCliente();
            } else {
                actualizarCliente();
            }
        }
    }

    private void consultarClientes(JTable tablaClientes) {
        limpiarTablaClientes();
        centrarCeldasClientes(tablaClientes);
        model = (DefaultTableModel) tablaClientes.getModel();
        tablaClientes.setModel(model);
        List<Cliente> lista = clienteOp.SQL_ConsultarClientes();
        Object[] objeto = new Object[7];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Cliente();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getApellido();
            objeto[3] = lista.get(i).getEmail();
            objeto[4] = lista.get(i).getTelefono();
            objeto[5] = lista.get(i).getDireccion();
            objeto[6] = lista.get(i).getEstado();
            model.addRow(objeto);
        }
    }

    private void centrarCeldasClientes(JTable tablaClientes) {
        DefaultTableCellRenderer dtm = new DefaultTableCellRenderer();
        dtm.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < panelClientes.jTableClientes.getColumnCount(); i++) {
            tablaClientes.getColumnModel().getColumn(i).setCellRenderer(dtm);
        }
    }

    private void limpiarTablaClientes() {
        for (int i = 0; i < panelClientes.jTableClientes.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    private boolean validarCamposCliente() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        String nombre = clienteForm.txtNombre.getText();
        String apellido = clienteForm.txtApellido.getText();
        String email = clienteForm.txtEmail.getText();
        String telefono = clienteForm.txtTelefono.getText();
        String direccion = clienteForm.txtDireccion.getText();
        String estado = (String) clienteForm.jComboBoxEstado.getSelectedItem();

        // Validar Nombre
        return true;
    }

    private void agregarNuevoCliente() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        String nombre = clienteForm.txtNombre.getText();
        String apellido = clienteForm.txtApellido.getText();
        String email = clienteForm.txtEmail.getText();
        String telefono = clienteForm.txtTelefono.getText();
        String direccion = clienteForm.txtDireccion.getText();
        String estado = (String) clienteForm.jComboBoxEstado.getSelectedItem();

        // SETEAR VALORES A CLASE CLIENTE
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setEmail(email);
        c.setTelefono(telefono);
        c.setDireccion(direccion);
        c.setEstado(estado);

        int r = clienteOp.SQL_AgregarNuevoCliente(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(clienteForm, "El cliente ha sido añadido exitosamente.", "Cliente añadido", JOptionPane.INFORMATION_MESSAGE);
            clienteForm.dispose();
            consultarClientes(panelClientes.jTableClientes);
        } else {
            JOptionPane.showMessageDialog(clienteForm, "Se ha producido un error al intentar añadir al cliente.", "Error al añadir cliente", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarCliente() {
        int fila = panelClientes.jTableClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelClientes, "Debe seleccionar una fila para eliminar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            int ID_Cliente = (int) panelClientes.jTableClientes.getValueAt(fila, 0);
            int r = clienteOp.SQL_EliminarCliente(ID_Cliente);
            if (r == 1) {
                JOptionPane.showMessageDialog(panelClientes, "Cliente eliminado con exito.", "Cliente Eliminado", JOptionPane.INFORMATION_MESSAGE);
                consultarClientes(panelClientes.jTableClientes);
            } else {
                JOptionPane.showMessageDialog(panelClientes, "Se ha producido un error al intentar eliminar el cliente.", "Error al elimianar Cliente", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void modificarCliente() {
        int fila = panelClientes.jTableClientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelClientes, "Debe seleccionar una fila para modificar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            // OBTENER VALORES DE LA FILA SELECCIONADA
            int ID_Cliente = (int) panelClientes.jTableClientes.getValueAt(fila, 0);
            String nombre = (String) panelClientes.jTableClientes.getValueAt(fila, 1);
            String apellido = (String) panelClientes.jTableClientes.getValueAt(fila, 2);
            String email = (String) panelClientes.jTableClientes.getValueAt(fila, 3);
            String telefono = (String) panelClientes.jTableClientes.getValueAt(fila, 4);
            String direccion = (String) panelClientes.jTableClientes.getValueAt(fila, 5);
            String estado = (String) panelClientes.jTableClientes.getValueAt(fila, 6);

            // SETEAR VALORES AL FORMULARIO DE MODIFICACION
            clienteForm.txtIdCliente.setText(String.valueOf(ID_Cliente));
            clienteForm.txtNombre.setText(nombre);
            clienteForm.txtApellido.setText(apellido);
            clienteForm.txtEmail.setText(email);
            clienteForm.txtTelefono.setText(telefono);
            clienteForm.txtDireccion.setText(direccion);
            clienteForm.jComboBoxEstado.setSelectedItem(estado);

            // ABRIR FORMULARIO
            clienteForm.setVisible(true);
        }

    }

    private void actualizarCliente() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        int ID_Cliente = Integer.parseInt(clienteForm.txtIdCliente.getText());
        String nombre = clienteForm.txtNombre.getText();
        String apellido = clienteForm.txtApellido.getText();
        String email = clienteForm.txtEmail.getText();
        String telefono = clienteForm.txtTelefono.getText();
        String direccion = clienteForm.txtDireccion.getText();
        String estado = (String) clienteForm.jComboBoxEstado.getSelectedItem();

        // SETEAR VALORES A CLASE CLIENTE
        c.setID_Cliente(ID_Cliente);
        c.setNombre(nombre);
        c.setApellido(apellido);
        c.setEmail(email);
        c.setTelefono(telefono);
        c.setDireccion(direccion);
        c.setEstado(estado);

        int r = clienteOp.SQL_ActualizarCliente(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(panelClientes, "Cliente actualizado con exito.", "Cliente actualizado", JOptionPane.INFORMATION_MESSAGE);
            consultarClientes(panelClientes.jTableClientes);
            clienteForm.dispose();
        } else {
            JOptionPane.showMessageDialog(panelClientes, "Se ha producido un error al intentar actualizar al cliente.", "Error al actualizar cliente", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void limpiarFormulario() {
        clienteForm.txtIdCliente.setText("");
        clienteForm.txtNombre.setText("");
        clienteForm.txtApellido.setText("");
        clienteForm.txtEmail.setText("");
        clienteForm.txtTelefono.setText("");
        clienteForm.txtDireccion.setText("");
        clienteForm.jComboBoxEstado.setSelectedIndex(0);
    }
}
