package Controller;

import View.Paneles.PanelProductos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ProductoController implements ActionListener{
    private PanelProductos panelProductos;
    ProductoOperation productoOp = new ProductoOperation();
    
    public ProductoController(PanelProductos panelProductos){
        this.panelProductos = panelProductos;
    }
    
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
