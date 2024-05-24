package Controller;

import View.Paneles.PanelInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class InicioController implements ActionListener{
    private PanelInicio panelInicio;
    InicioOperation InicioOp = new InicioOperation();

    public InicioController(PanelInicio panelInicio){
        this.panelInicio = panelInicio;
        
        // Realizar consultas de resumen
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
    }
    
    
}
