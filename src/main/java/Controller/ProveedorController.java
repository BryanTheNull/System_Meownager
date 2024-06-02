package Controller;

import Model.Proveedor;
import View.Form.ProveedorForm;
import View.Paneles.PanelProveedores;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;


public class ProveedorController implements ActionListener{
    
    private PanelProveedores panelProveedores;
    private ProveedorForm proveedorForm;
    private Frame MainInterface;
    
    // Instaciar clases a utilizar
    ProveedorOperation proveedorOp = new ProveedorOperation();
    Proveedor p = new Proveedor();
    DefaultTableModel model = new DefaultTableModel();
    
    public ProveedorController(PanelProveedores panelProveedores){
        this.panelProveedores = panelProveedores;
        this.proveedorForm = new ProveedorForm(MainInterface, true);
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
