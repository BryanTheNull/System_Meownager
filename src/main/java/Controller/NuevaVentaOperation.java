package Controller;

import Config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NuevaVentaOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;

    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public List SQL_ConsultarNombresClientes() {
        List<String> DatosNombresClientes = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT CONCAT(Nombre, ' ',Apellido) AS Nombre FROM Clientes";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DatosNombresClientes.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosNombresClientes;
    }

    public int SQL_ConsultarID_Cliente(String v_Nombre) {
        int ID_Cliente = 0;
        String sql = "SELECT ID_Cliente FROM Clientes WHERE CONCAT(Nombre, ' ',Apellido) = ?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Nombre);
            rs = ps.executeQuery();

            if (rs.next()) {
                ID_Cliente = rs.getInt("ID_Cliente");
            }
        } catch (Exception e) {
        }
        return ID_Cliente;
    }

    public List SQL_ConsultarNombresProductos() {
        List<String> DatosNombresProductos = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT Nombre FROM Productos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DatosNombresProductos.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosNombresProductos;
    }

    public int SQL_ConsultarID_Producto(String v_Nombre) {
        int ID_Producto = 0;
        String sql = "SELECT ID_Producto FROM Productos WHERE Nombre=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Nombre);
            rs = ps.executeQuery();

            if (rs.next()) {
                ID_Producto = rs.getInt("ID_Producto");
            }
        } catch (Exception e) {
        }
        return ID_Producto;
    }

    public int SQL_ConsultarPrecioUnitario(String v_Nombre) {
        int precio = 0;
        String sql = "SELECT Precio FROM Productos WHERE Nombre=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Nombre);
            rs = ps.executeQuery();

            if (rs.next()) {
                precio = rs.getInt("Precio");
            }
        } catch (Exception e) {
        }
        return precio;
    }
    
    public int SQL_ConsultarNroVenta(){
        int Nro = 0;
        String sql = "SELECT ID_Venta FROM Ventas ORDER BY ID_Venta DESC LIMIT 1";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            if (rs.next()) {
                Nro = rs.getInt("ID_Venta");
            }
        } catch (Exception e) {
        }
        
        
        return Nro;
    }
    
    public int SQL_InsertarVenta(int ID_Venta, int ID_Cliente, int Total) {
        int r = 0;
        String sql = "INSERT INTO Ventas(ID_Venta, ID_Cliente, Total) VALUES(?,?,?)";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Venta);
            ps.setInt(2, ID_Cliente);
            ps.setInt(3, Total);

            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } else {
                return 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }
    
     public void SQL_InsertarDetalleVenta(int ID_Venta, int ID_Producto, int cantidad, int precio_Unitario){
        String sql = "INSERT INTO DetalleVentas(ID_Venta, ID_Producto, Cantidad, Precio_Unitario) VALUES(?,?,?,?)";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Venta);
            ps.setInt(2, ID_Producto);
            ps.setInt(3, cantidad);
            ps.setInt(3, precio_Unitario);
            ps.executeUpdate();
            System.out.println(ps.toString());
        } catch (SQLException e) {
            e.printStackTrace();
        }  
    }
}
