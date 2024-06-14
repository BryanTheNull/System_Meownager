package Controller;

import Config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class InicioOperation {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();
    
    public int SQL_ConsultarProductoStock(){
        int r = 0;
        try {
            String sql = "SELECT COUNT(ID_Producto) AS ProductosDisponibles FROM Productos WHERE Stock >= 1";
            con = dbConnection.getConnection();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            
            //Acceder al resultado
            if (rs.next()) {
                r = rs.getInt("ProductosDisponibles");
            }
            return r;
            
        } catch (Exception e) {
        }
        
        return r;
        
    }
    
    public int SQL_ConsultarClientesDisponibles(){
        int r = 0;
        try {
            String sql = "SELECT COUNT(ID_Cliente) AS ClientesDisponibles FROM Clientes WHERE Estado = 'Activo'";
            con = dbConnection.getConnection();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            
            //Acceder al resultado
            if (rs.next()) {
                r = rs.getInt("ClientesDisponibles");
            }
            return r;
            
        } catch (Exception e) {
        }  
        return r;
    }
    
    public int SQL_ConsultarIngresosTotales(){
        int r = 0;
        try {
            String sql = "SELECT SUM(Total) AS GananciasTotales FROM Ventas";
            con = dbConnection.getConnection();
            ps = con.prepareCall(sql);
            rs = ps.executeQuery();
            
            //Acceder al resultado
            if (rs.next()) {
                r = rs.getInt("GananciasTotales");
            }
            return r;
            
        } catch (Exception e) {
        }  
        return r;
    }
}
