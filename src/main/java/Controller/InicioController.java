package Controller;

import View.Paneles.PanelInicio;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.Timer;

public class InicioController implements ActionListener {

    private PanelInicio panelInicio;
    InicioOperation InicioOp = new InicioOperation();

    public InicioController(PanelInicio panelInicio) {
        this.panelInicio = panelInicio;

        // Realizar consultas de resumen
        consultarResumenes();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void consultarResumenes() {
        int resultado1 = InicioOp.SQL_ConsultarProductoStock();
        panelInicio.txtStockProductos.setText(String.valueOf(resultado1));

        int resultado2 = InicioOp.SQL_ConsultarClientesDisponibles();
        panelInicio.txtClientesDisponibles.setText(String.valueOf(resultado2));

        int resultado3 = InicioOp.SQL_ConsultarIngresosTotales();
        panelInicio.txtIngresosTotales.setText(String.valueOf(formatearAgregarPuntos(resultado3)));
    }

    public static String formatearAgregarPuntos(int numeros) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMANY);
        return numberFormat.format(numeros);
    }
}
