package Controller;

import Model.GestionarUsuario;
import Model.Usuario;
import View.Form.GestionarUsuarioForm;
import View.Paneles.PanelConfiguraciones;
import View.Paneles.PanelGestionarUsuarios;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionarUsuarioController implements ActionListener {

    private PanelGestionarUsuarios panelGestionarUsuarios;
    private GestionarUsuarioForm gestionarUsuarioForm;
    private Frame MainInterface;

    // Instaciar clases a utilizar
    GestionarUsuarioOperation gestionarUsuarioOp = new GestionarUsuarioOperation();
    GestionarUsuario u = new GestionarUsuario();
    DefaultTableModel model = new DefaultTableModel();

    public GestionarUsuarioController(PanelGestionarUsuarios panelGestionarUsuarios) {
        this.panelGestionarUsuarios = panelGestionarUsuarios;
        this.gestionarUsuarioForm = new GestionarUsuarioForm(MainInterface, true);
        this.panelGestionarUsuarios.btnAgregarUsuario.addActionListener(this);
        this.panelGestionarUsuarios.btnEliminarUsuario.addActionListener(this);
        this.panelGestionarUsuarios.btnModificarUsuario.addActionListener(this);
        this.panelGestionarUsuarios.btnVolverAtras.addActionListener(this);
        this.gestionarUsuarioForm.btnUsuarios.addActionListener(this);

        consultarUsuarios(panelGestionarUsuarios.jTableUsuarios);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelGestionarUsuarios.btnAgregarUsuario) {
            limpiarFormulario();
            gestionarUsuarioForm.btnUsuarios.setText("Añadir Usuario");
            gestionarUsuarioForm.setVisible(true);
        }
        if (e.getSource() == panelGestionarUsuarios.btnEliminarUsuario) {
            eliminarUsuario();
        }
        if (e.getSource() == panelGestionarUsuarios.btnModificarUsuario) {
            gestionarUsuarioForm.btnUsuarios.setText("Guardar Usuario");
            modificarUsuario();
        }
        if (e.getSource() == panelGestionarUsuarios.btnVolverAtras) {
            PanelConfiguraciones panelConfiguraciones = new PanelConfiguraciones();
            ShowPanel(panelConfiguraciones);
        }
        if (e.getSource() == gestionarUsuarioForm.btnUsuarios) {
            String boton = gestionarUsuarioForm.btnUsuarios.getText();
            if (boton.equals("Añadir Usuario")) {
                agregarNuevoUsuario();
            } else {
                actualizarUsuario();
            }
        }
    }

    private void consultarUsuarios(JTable tablaUsuarios) {
        limpiarTablaUsuarios();
        centrarCeldasUsuarios(tablaUsuarios);
        model = (DefaultTableModel) tablaUsuarios.getModel();
        tablaUsuarios.setModel(model);
        Usuario usuario = Usuario.getInstance();

        List<GestionarUsuario> lista = gestionarUsuarioOp.SQL_ConsultarUsuarios(usuario.getEmail());
        Object[] objeto = new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Usuario();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getApellido();
            objeto[3] = lista.get(i).getEmail();
            objeto[4] = lista.get(i).getFecha_Registro();
            objeto[5] = lista.get(i).getRango();
            model.addRow(objeto);
        }
    }

    private void centrarCeldasUsuarios(JTable tablaUsuarios) {
        DefaultTableCellRenderer dtm = new DefaultTableCellRenderer();
        dtm.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < panelGestionarUsuarios.jTableUsuarios.getColumnCount(); i++) {
            tablaUsuarios.getColumnModel().getColumn(i).setCellRenderer(dtm);
        }
    }

    private void limpiarTablaUsuarios() {
        for (int i = 0; i < panelGestionarUsuarios.jTableUsuarios.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    private void agregarNuevoUsuario() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        String nombre = gestionarUsuarioForm.txtNombre.getText();
        String apellido = gestionarUsuarioForm.txtApellido.getText();
        String email = gestionarUsuarioForm.txtEmail.getText();
        String rango = gestionarUsuarioForm.jComboBoxRango.getSelectedItem().toString();

        // SETEAR VALORES A CLASE GESTIOARUSUARIO
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setEmail(email);
        u.setRango(rango);

        int r = gestionarUsuarioOp.SQL_AgregarNuevoUsuario(u, nombre);
        if (r == 1) {
            JOptionPane.showMessageDialog(gestionarUsuarioForm, "El usuario ha sido añadido exitosamente.", "Usuario añadido", JOptionPane.INFORMATION_MESSAGE);
            gestionarUsuarioForm.dispose();
            consultarUsuarios(panelGestionarUsuarios.jTableUsuarios);
        } else {
            JOptionPane.showMessageDialog(gestionarUsuarioForm, "Se ha producido un error al intentar añadir al usuario.", "Error al añadir usuario", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarUsuario() {
        int fila = panelGestionarUsuarios.jTableUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelGestionarUsuarios, "Debe seleccionar una fila para eliminar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            int ID_Usuario = (int) panelGestionarUsuarios.jTableUsuarios.getValueAt(fila, 0);
            int r = gestionarUsuarioOp.SQL_EliminarUsuario(ID_Usuario);
            if (r == 1) {
                JOptionPane.showMessageDialog(panelGestionarUsuarios, "Usuario eliminado con exito.", "Usuario Eliminado", JOptionPane.INFORMATION_MESSAGE);
                consultarUsuarios(panelGestionarUsuarios.jTableUsuarios);
            } else {
                JOptionPane.showMessageDialog(panelGestionarUsuarios, "Se ha producido un error al intentar eliminar el usuario.", "Error al eliminar usuario", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void modificarUsuario() {
        int fila = panelGestionarUsuarios.jTableUsuarios.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelGestionarUsuarios, "Debe seleccionar una fila para modificar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            // OBTENER VALORES DE LA FILA SELECCIONADA
            int ID_Usuario = (int) panelGestionarUsuarios.jTableUsuarios.getValueAt(fila, 0);
            String nombre = (String) panelGestionarUsuarios.jTableUsuarios.getValueAt(fila, 1);
            String apellido = (String) panelGestionarUsuarios.jTableUsuarios.getValueAt(fila, 2);
            String email = (String) panelGestionarUsuarios.jTableUsuarios.getValueAt(fila, 3);
            String rango = (String) panelGestionarUsuarios.jTableUsuarios.getValueAt(fila, 5);

            // SETEAR VALORES AL FORMULARIO DE MODIFICACION
            gestionarUsuarioForm.txtIdUsuario.setText(String.valueOf(ID_Usuario));
            gestionarUsuarioForm.txtNombre.setText(nombre);
            gestionarUsuarioForm.txtApellido.setText(apellido);
            gestionarUsuarioForm.txtEmail.setText(email);
            gestionarUsuarioForm.jComboBoxRango.setSelectedItem(rango);

            // ABRIR FORMULARIO
            gestionarUsuarioForm.setVisible(true);

        }
    }

    private void actualizarUsuario() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        int ID_Usuario = Integer.parseInt(gestionarUsuarioForm.txtIdUsuario.getText());
        String nombre = gestionarUsuarioForm.txtNombre.getText();
        String apellido = gestionarUsuarioForm.txtApellido.getText();
        String email = gestionarUsuarioForm.txtEmail.getText();
        String rango = gestionarUsuarioForm.jComboBoxRango.getSelectedItem().toString();

        // SETEAR VALORES A CLASE PROVEEDOR
        u.setID_Usuario(ID_Usuario);
        u.setNombre(nombre);
        u.setApellido(apellido);
        u.setEmail(email);
        u.setRango(rango);

        int r = gestionarUsuarioOp.SQL_ActualizarUsuario(u);
        if (r == 1) {
            JOptionPane.showMessageDialog(panelGestionarUsuarios, "Usuario actualizado con exito.", "Usuario actualizado", JOptionPane.INFORMATION_MESSAGE);
            consultarUsuarios(panelGestionarUsuarios.jTableUsuarios);
            gestionarUsuarioForm.dispose();
        } else {
            JOptionPane.showMessageDialog(panelGestionarUsuarios, "Se ha producido un error al intentar actualizar al usuario.", "Error al actualizar usuario", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarFormulario() {
        gestionarUsuarioForm.txtIdUsuario.setText("");
        gestionarUsuarioForm.txtNombre.setText("");
        gestionarUsuarioForm.txtApellido.setText("");
        gestionarUsuarioForm.jComboBoxRango.setSelectedItem(1);
    }

    private void ShowPanel(JPanel p) {
        p.setSize(950, 700);
        p.setLocation(0, 0);

        panelGestionarUsuarios.removeAll();
        panelGestionarUsuarios.add(p, BorderLayout.CENTER);
        panelGestionarUsuarios.revalidate();
        panelGestionarUsuarios.repaint();

    }
}
