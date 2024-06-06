package Controller;

import View.Paneles.PanelReportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;

public class ReporteController implements ActionListener {

    private PanelReportes panelReportes;
    private String nombreReporte;
    private String consultaSQL;

    ReporteOperation reporteOp = new ReporteOperation();

    public ReporteController(PanelReportes panelReportes) {
        this.panelReportes = panelReportes;
        this.panelReportes.btnSeleccionarRuta.addActionListener(this);
        this.panelReportes.btnGenerarReporte.addActionListener(this);
        this.panelReportes.jComboBoxTipoReporte.addActionListener(this);

        inicarRutaDefecto();
        cambiarDescripcion();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panelReportes.btnSeleccionarRuta) {
            // ABRIR JFileChooser Y SELECCIONAR LA RUTA DE CREACION
            seleccionarRuta();
        }
        if (e.getSource() == panelReportes.btnGenerarReporte) {
            generarReporteExcel();
        }
        if (e.getSource() == panelReportes.jComboBoxTipoReporte) {
            cambiarDescripcion();
        }
    }

    private void seleccionarRuta() {
        /**
         * Descripcion: Crear una interfaz que le permita al usuario seleccionar
         * un directorio en donde creara las carpetas y guardara esta ruta.
         */

        JFileChooser fileChooser = new JFileChooser();
        // PERMITIR SOLO SELECCIONAR DIRECTORIO Y NO ARCHIVOS
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);

        // CREAR CUADRO DE SELECCION
        int seleccionar = fileChooser.showDialog(panelReportes, "SELECCIONE RUTA DE CREACION");

        if (seleccionar == JFileChooser.APPROVE_OPTION) {
            File rutaSeleccionada = fileChooser.getSelectedFile();

            // CAMBIAR EL TEXTO DEL BOTON
            panelReportes.btnSeleccionarRuta.setText(rutaSeleccionada.toString());
        }
    }

    private void inicarRutaDefecto() {
        String ruraDefecto = obtenerRutaEscritorio();
        // CAMBIAR EL TEXTO DEL BOTON
        panelReportes.btnSeleccionarRuta.setText(ruraDefecto);
    }

    private String obtenerRutaEscritorio() {
        String userHome = System.getProperty("user.home");
        String desktopPath;

        // Determinar la ruta del escritorio dependiendo del sistema operativo
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            desktopPath = Paths.get(userHome, "Desktop").toString();
        } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            desktopPath = Paths.get(userHome, "Desktop").toString();
        } else {
            desktopPath = Paths.get(userHome, "Escritorio").toString(); // Para la mayoría de distribuciones de Linux en español
        }

        return desktopPath;
    }

    private void cambiarDescripcion() {
        int NroReporte = panelReportes.jComboBoxTipoReporte.getSelectedIndex() + 1;
        switch (NroReporte) {
            case 1:
                panelReportes.txtDescripcion.setText("Genera un reporte de todos los productos disponibles en la tienda, incluyendo su nombre, código, precio unitario,cantidad en stock y la categoría a la que pertenecen.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "SELECT * FROM Productos";
                break;
            case 2:
                panelReportes.txtDescripcion.setText("Genera un reporte de todas las ventas realizadas, mostrando el número de venta, fecha, nombre del cliente, nombre del producto vendido,cantidad vendida, tipo de pago, Observaciones y el monto total de la venta.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "";
                break;
            case 3:

                panelReportes.txtDescripcion.setText("Genera una lista de todos los clientes registrados en la tienda, incluyendo su identificación, nombre, apellido, correo electrónico, número de teléfono y fecha de registro.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "";
                break;
            case 4:
                panelReportes.txtDescripcion.setText("Genera un resumen de las ventas agrupadas por categoría de productos, indicando la cantidad total de productos vendidos y los ingresos generados por cada categoría ordenados de mayor a menor.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "";
                break;
            case 5:
                panelReportes.txtDescripcion.setText("Genera una lista de todos los proveedores de la tienda, incluyendo su identificación, nombre, apellido, correo electrónico, número de teléfono y fecha de registro.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "";
                break;
            case 6:
                panelReportes.txtDescripcion.setText("Genera un resumen de las ventas realizadas por cada cliente, indicando su identificación, nombre, rut, correo electrónico, cantidad total de productos comprados y el monto total de las compras ordenados de mayor a menor.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "";
                break;
        }
    }

    private void generarReporteExcel() {
        List<Map<String, Object>> datosReporte = reporteOp.SQL_ConsultarReporte(consultaSQL);
        // Imprimir los resultados
        for (Map<String, Object> fila : datosReporte) {
            System.out.println(fila);
        }
    }
}
