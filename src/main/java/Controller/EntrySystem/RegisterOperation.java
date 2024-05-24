package Controller.EntrySystem;

import Config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public int SQL_CrearCuenta(String v_Nombre, String v_Email, String v_Contraseña){
        int r = 0; 
        try {
            String sql = "INSERT INTO Usuarios(Nombre, Email, Contraseña) \n" +
                         "VALUE(?,?,?);";
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Nombre);
            ps.setString(2, v_Email);
            ps.setString(3, v_Contraseña);
            
            r = ps.executeUpdate();
            if (r == 1) {
                return 1;
            } 
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }
}
