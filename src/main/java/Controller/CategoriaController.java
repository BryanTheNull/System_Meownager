package Controller;

import Model.Categoria;
import View.Form.CategoriaForm;
import View.Paneles.PanelCategorias;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class CategoriaController implements ActionListener {

    private PanelCategorias panelCategorias;
    private CategoriaForm categoriaForm;
    private Frame MainInterface;

    // Instaciar clases a utilizar
    CategoriaOperation categoriaOp = new CategoriaOperation();
    Categoria c = new Categoria();
    DefaultTableModel model = new DefaultTableModel();

    public CategoriaController(PanelCategorias panelCategorias) {
        this.panelCategorias = panelCategorias;
        this.categoriaForm = new CategoriaForm(MainInterface, true);
        this.panelCategorias.btnAgregarCategoria.addActionListener(this);
        this.panelCategorias.btnModificarCategoria.addActionListener(this);
        this.panelCategorias.btnEliminarCategoria.addActionListener(this);
        this.panelCategorias.btnActualizarPagina.addActionListener(this);
        this.categoriaForm.btnCategoria.addActionListener(this);

        consultarClientes(panelCategorias.jTableCategorias);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelCategorias.btnAgregarCategoria) {
            limpiarFormulario();
            categoriaForm.btnCategoria.setText("Añadir Categoria");
            categoriaForm.setVisible(true);
        }
        if (e.getSource() == panelCategorias.btnModificarCategoria) {
            categoriaForm.btnCategoria.setText("Guardar Categoria");
            modificarCategoria();
        }
        if (e.getSource() == panelCategorias.btnEliminarCategoria) {
            eliminarCategoria();
        }
        if (e.getSource() == panelCategorias.btnActualizarPagina) {
            consultarClientes(panelCategorias.jTableCategorias);
        }
        if (e.getSource() == categoriaForm.btnCategoria) {
            String boton = categoriaForm.btnCategoria.getText();
            if (boton.equals("Añadir Categoria")) {
                agregarNuevaCategoria();
            } else {
                actualizarCategoria();
            }
        }
    }

    private void consultarClientes(JTable tablaCategoria) {
        limpiarTablaCategoria();
        centrarCeldasCategoria(tablaCategoria);
        model = (DefaultTableModel) tablaCategoria.getModel();
        tablaCategoria.setModel(model);
        List<Categoria> lista = categoriaOp.SQL_ConsultarCategorias();
        Object[] objeto = new Object[3];
        for (int i = 0; i < lista.size(); i++) {
            objeto[0] = lista.get(i).getID_Categoria();
            objeto[1] = lista.get(i).getNombre();
            objeto[2] = lista.get(i).getDescripcion();
            model.addRow(objeto);
        }
    }

    private void centrarCeldasCategoria(JTable tablaCategoria) {
        DefaultTableCellRenderer dtm = new DefaultTableCellRenderer();
        dtm.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < panelCategorias.jTableCategorias.getColumnCount(); i++) {
            tablaCategoria.getColumnModel().getColumn(i).setCellRenderer(dtm);
        }
    }

    private void limpiarTablaCategoria() {
        for (int i = 0; i < panelCategorias.jTableCategorias.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }

    private boolean validarCamposCategoria() {
        return true;
    }

    private void agregarNuevaCategoria() {
        // OBTENER VALORES DE LOS CAMPOS DE ENTRADA
        String nombre = categoriaForm.txtNombre.getText();
        String descipcion = categoriaForm.txtDescripcion.getText();

        // SETEAR VALORES A CLASE CLIENTE
        c.setNombre(nombre);
        c.setDescripcion(descipcion);

        int r = categoriaOp.SQL_AgregarNuevaCategoria(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(categoriaForm, "la categoria ha sido añadido exitosamente.", "Categoria añadida", JOptionPane.INFORMATION_MESSAGE);
            categoriaForm.dispose();
            consultarClientes(panelCategorias.jTableCategorias);
        } else {
            JOptionPane.showMessageDialog(categoriaForm, "Se ha producido un error al intentar añadir la categoria.", "Error al añadir categoria", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void eliminarCategoria() {
        int fila = panelCategorias.jTableCategorias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelCategorias, "Debe seleccionar una fila para eliminar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            int ID_Categoria = (int) panelCategorias.jTableCategorias.getValueAt(fila, 0);
            int r = categoriaOp.SQL_EliminarCategoria(ID_Categoria);
            if (r == 1) {
                JOptionPane.showMessageDialog(panelCategorias, "Categoria eliminada con exito.", "Categoria Eliminado", JOptionPane.INFORMATION_MESSAGE);
                consultarClientes(panelCategorias.jTableCategorias);
            } else {
                JOptionPane.showMessageDialog(panelCategorias, "Se ha producido un error al intentar eliminar la categoria.", "Error al elimianar Categoria", JOptionPane.ERROR_MESSAGE);
            }

        }
    }

    private void modificarCategoria() {
        int fila = panelCategorias.jTableCategorias.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(panelCategorias, "Debe seleccionar una fila para modificar", "Fila no seleccionada", JOptionPane.ERROR_MESSAGE);
        } else {
            // OBTENER VALORES DE LA FILA SELECCIONADA
            int ID_Categoria = (int) panelCategorias.jTableCategorias.getValueAt(fila, 0);
            String nombre = (String) panelCategorias.jTableCategorias.getValueAt(fila, 1);
            String descripcion = (String) panelCategorias.jTableCategorias.getValueAt(fila, 2);

            // SETEAR VALORES AL FORMULARIO DE MODIFICACION
            categoriaForm.txtIdCategoria.setText(String.valueOf(ID_Categoria));
            categoriaForm.txtNombre.setText(nombre);
            categoriaForm.txtDescripcion.setText(descripcion);

            // ABRIR FORMULARIO
            categoriaForm.setVisible(true);
        }
    }

    private void actualizarCategoria() {
        // OBTENER VALORES DE LA FILA SELECCIONADA
        int ID_Categoria = Integer.parseInt(categoriaForm.txtIdCategoria.getText());
        String nombre = categoriaForm.txtNombre.getText();
        String descripcion = categoriaForm.txtDescripcion.getText();

        // SETEAR VALORES A CLASE CLIENTE
        c.setID_Categoria(ID_Categoria);
        c.setNombre(nombre);
        c.setDescripcion(descripcion);

        int r = categoriaOp.SQL_ActualizarCategoria(c);
        if (r == 1) {
            JOptionPane.showMessageDialog(panelCategorias, "Categoria actualizado con exito.", "Categoria actualizada", JOptionPane.INFORMATION_MESSAGE);
            consultarClientes(panelCategorias.jTableCategorias);
            categoriaForm.dispose();
        } else {
            JOptionPane.showMessageDialog(panelCategorias, "Se ha producido un error al intentar actualizar la categoria.", "Error al actualizar categoria", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limpiarFormulario() {
        categoriaForm.txtIdCategoria.setText("");
        categoriaForm.txtNombre.setText("");
        categoriaForm.txtDescripcion.setText("");
    }
}
