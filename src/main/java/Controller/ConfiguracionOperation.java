package Controller;

import Config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConfiguracionOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public int SQL_ActualziarNombre(String Nombre, String Email) {
        int r = 0;
        String sql = "UPDATE Usuarios SET Nombre=? WHERE Email=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Nombre);
            ps.setString(2, Email);

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
    
    public int SQL_ActualziarApellido(String Apellido, String Email) {
        int r = 0;
        String sql = "UPDATE Usuarios SET Apellido=? WHERE Email=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Apellido);
            ps.setString(2, Email);

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
    
      public int SQL_ActualziarEmail(String Email, String EmailUsuario) {
        int r = 0;
        String sql = "UPDATE Usuarios SET Email=? WHERE Email=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, Email);
            ps.setString(2, EmailUsuario);

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
}
