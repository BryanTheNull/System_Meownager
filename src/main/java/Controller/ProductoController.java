package Controller;

import Model.Producto;
import View.Form.ProductoForm;
import View.Paneles.PanelProductos;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class ProductoController implements ActionListener {

    private PanelProductos panelProductos;
    private ProductoForm productoForm;
    private Frame MainInterface;
    ProductoOperation productoOp = new ProductoOperation();
    DefaultTableModel model = new DefaultTableModel();

    public ProductoController(PanelProductos panelProductos) {
        this.panelProductos = panelProductos;
        this.productoForm = new ProductoForm(MainInterface, true);
        this.panelProductos.btnAgregarProducto.addActionListener(this);
        this.panelProductos.btnEliminarProducto.addActionListener(this);
        this.panelProductos.btnModificarProducto.addActionListener(this);
        this.panelProductos.btnActualizarPagina.addActionListener(this);
        this.productoForm.btnProducto.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelProductos.btnAgregarProducto) {
            productoForm.setVisible(true);

        }
    }

    void consultarProductos(JTable tablaProductos) {
        limpiarTablaProductos();
        centrarCeldasProductos(tablaProductos);
        model = (DefaultTableModel) tablaProductos.getModel();
        tablaProductos.setModel(model);
//        List<Producto> lista = productoOp.Consultar();
        Object[] objeto = new Object[8];
//        for (int i = 0; i < lista.size(); i++) {
//            objeto[0] = lista.get(i).getID_Producto();
//            objeto[1] = lista.get(i).getID_Categoria();
//            objeto[2] = lista.get(i).getID_Proveedor();
//            objeto[3] = lista.get(i).getCodigo();
//            objeto[4] = lista.get(i).getNombre();
//            objeto[5] = lista.get(i).getPrecio();
//            objeto[6] = lista.get(i).getStock();
//            modelo.addRow(objeto);
//        }
    }

    void centrarCeldasProductos(JTable tablaProductos) {
        DefaultTableCellRenderer dtm = new DefaultTableCellRenderer();
        dtm.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < panelProductos.jTableProductos.getColumnCount(); i++) {
            tablaProductos.getColumnModel().getColumn(i).setCellRenderer(dtm);
        }
    }

    void limpiarTablaProductos() {
        for (int i = 0; i < panelProductos.jTableProductos.getRowCount(); i++) {
            model.removeRow(i);
            i = i - 1;
        }
    }
}
