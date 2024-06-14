package Controller;

import View.Paneles.PanelReportes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import javax.swing.JFileChooser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReporteController implements ActionListener {

    private PanelReportes panelReportes;
    private String nombreReporte;
    private String consultaSQL;
    private String rutaCreacion;

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
            rutaCreacion = rutaSeleccionada.toString();
        }
    }

    private void inicarRutaDefecto() {
        rutaCreacion = obtenerRutaDocumentos();
        // CAMBIAR EL TEXTO DEL BOTON
        panelReportes.btnSeleccionarRuta.setText(rutaCreacion);
    }

    private String obtenerRutaDocumentos() {
        String userHome = System.getProperty("user.home");
        String documentsPath;

        // Determinar la ruta del directorio de documentos dependiendo del sistema operativo
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            documentsPath = Paths.get(userHome, "Documents").toString();
        } else if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            documentsPath = Paths.get(userHome, "Documents").toString();
        } else {
            documentsPath = Paths.get(userHome, "Documentos").toString(); // Para la mayoría de distribuciones de Linux en español
        }

        return documentsPath;
    }

    private void cambiarDescripcion() {
        int NroReporte = panelReportes.jComboBoxTipoReporte.getSelectedIndex() + 1;
        switch (NroReporte) {
            case 1:
                panelReportes.txtDescripcion.setText("Este reporte muestra una lista de todos los productos disponibles en el inventario, incluyendo detalles como nombre, descripción, código de producto, precio, y cantidad en stock.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "SELECT Nombre, Descripcion, Codigo_Producto, Precio, Stock FROM Productos;";
                break;
            case 2:
                panelReportes.txtDescripcion.setText("Este reporte presenta un resumen de todas las ventas realizadas, mostrando detalles como el número de venta, fecha de venta, cliente, productos vendidos, cantidad, precio unitario y el total de la venta.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "SELECT V.ID_Venta, V.Fecha_Venta, C.Nombre AS Nombre_Cliente, P.Nombre AS Nombre_Producto, DV.Cantidad, DV.Precio_Unitario, V.Total\n" +
                              "FROM Ventas V\n" +
                              "INNER JOIN Clientes C ON V.ID_Cliente = C.ID_Cliente\n" +
                              "INNER JOIN DetalleVentas DV ON V.ID_Venta = DV.ID_Venta\n" +
                              "INNER JOIN Productos P ON DV.ID_Producto = P.ID_Producto;";
                break;
            case 3:

                panelReportes.txtDescripcion.setText("Este reporte proporciona una lista de todos los clientes registrados en la tienda, incluyendo detalles como nombre, apellido, correo electrónico, número de teléfono y fecha de registro.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "SELECT Nombre, Apellido, Email, Telefono, Fecha_Registro FROM Clientes;";
                break;
            case 4:
                panelReportes.txtDescripcion.setText("Este reporte ofrece un análisis de las ventas realizadas, agrupadas por categoría de productos. Muestra la cantidad total de productos vendidos y los ingresos generados por cada categoría, ordenados de mayor a menor.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "SELECT C.Nombre AS Categoria, SUM(DV.Cantidad) AS Cantidad_Vendida, SUM(DV.Precio_Unitario * DV.Cantidad) AS Ingresos\n" +
                              "FROM DetalleVentas DV\n" +
                              "INNER JOIN Productos P ON DV.ID_Producto = P.ID_Producto\n" +
                              "INNER JOIN Categorias C ON P.ID_Categoria = C.ID_Categoria\n" +
                              "GROUP BY C.Nombre\n" +
                              "ORDER BY Cantidad_Vendida DESC;";
                break;
            case 5:
                panelReportes.txtDescripcion.setText("Este reporte muestra una lista de todos los proveedores registrados en la tienda, incluyendo detalles como nombre, rut, correo electrónico, número de teléfono y fecha de registro.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "SELECT Nombre, Rut, Email, Telefono, Fecha_Registro FROM Proveedores;";
                break;
            case 6:
                panelReportes.txtDescripcion.setText("Este reporte proporciona un resumen de las ventas realizadas por cada cliente, mostrando su identificación, nombre, correo electrónico, cantidad total de productos comprados y el monto total de las compras, ordenados de mayor a menor.");
                nombreReporte = panelReportes.jComboBoxTipoReporte.getSelectedItem().toString();
                consultaSQL = "";
                break;
        }
    }

    private void generarReporteExcel() {
        List<Map<String, Object>> datosReporte = reporteOp.SQL_ConsultarReporte(consultaSQL);
        try (Workbook workbook = new XSSFWorkbook()) {
            Sheet sheet = workbook.createSheet(nombreReporte);

            if (!datosReporte.isEmpty()) {
                // Crear encabezados
                Row headerRow = sheet.createRow(0);
                Map<String, Object> primeraFila = datosReporte.get(0);
                int headerColumnIndex = 0;
                for (String columnName : primeraFila.keySet()) {
                    Cell cell = headerRow.createCell(headerColumnIndex++);
                    cell.setCellValue(columnName);

                    // Establecer el estilo para el encabezado
                    CellStyle headerStyle = workbook.createCellStyle();
                    headerStyle.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex()); // Color de fondo gris claro
                    headerStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                    cell.setCellStyle(headerStyle); // Aplicar el estilo a la celda
                }

                // Ajustar el ancho de las columnas para que se ajusten al contenido
                for (int i = 0; i < headerColumnIndex; i++) {
                    sheet.autoSizeColumn(i);
                }

                // Llenar datos
                int rowIndex = 1;
                for (Map<String, Object> fila : datosReporte) {
                    Row row = sheet.createRow(rowIndex++);
                    int columnIndex = 0;
                    for (Object value : fila.values()) {
                        Cell cell = row.createCell(columnIndex++);
                        if (value instanceof String) {
                            cell.setCellValue((String) value);
                        } else if (value instanceof Integer) {
                            cell.setCellValue((Integer) value);
                        } else if (value instanceof Double) {
                            cell.setCellValue((Double) value);
                        } else if (value instanceof Boolean) {
                            cell.setCellValue((Boolean) value);
                        } else if (value != null) {
                            cell.setCellValue(value.toString());
                        }
                    }
                }
            }
            // Escribir archivo

            String nombreArchivo = nombreReporte + ".xlsx";
            String rutaArchivo = Paths.get(rutaCreacion, nombreArchivo).toString();

            try (FileOutputStream fileOut = new FileOutputStream(rutaArchivo)) {
                workbook.write(fileOut);
            }
        } catch (IOException e) {
            e.printStackTrace();
            // Manejo de errores o logging
        }
    }
}
