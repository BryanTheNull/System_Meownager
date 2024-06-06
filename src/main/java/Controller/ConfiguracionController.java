package Controller;

import View.Paneles.PanelConfiguraciones;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConfiguracionController implements ActionListener{
    private PanelConfiguraciones panelConfiguraciones;
    
    // Instaciar clases a utilizar
    ConfiguracionOperation configuracionOp = new ConfiguracionOperation();

    public ConfiguracionController(PanelConfiguraciones panelConfiguraciones){
        this.panelConfiguraciones = panelConfiguraciones;
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
     
    }
    
    
}
