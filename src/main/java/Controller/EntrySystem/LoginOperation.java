package Controller.EntrySystem;

import Config.MySQLConnection;
import Config.PasswordUtils;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LoginOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public int SQL_VerificarExistenciaUsuario(String v_Email) {
        int r = 0;
        try {
            con = dbConnection.getConnection(); // Conectar con la bd
            String sql = "SELECT COUNT(*) FROM Usuarios WHERE Email =?";
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Email);   // Pasar parametros a consulta sql

            rs = ps.executeQuery(); // Ejecutar consulta sql

            // Verificar si el usuario existe
            if (rs.next()) {
                int count = rs.getInt(1);
                if (count > 0) {
                    r = 1; // El usuario existe
                }
            }
            // Cerrar coneccion
            dbConnection.closeConnection(con);

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return r;
    }

    public boolean SQL_VerificarContraseña(String v_Email, String v_ContraseñaIngresada) {
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT Contraseña FROM Usuarios WHERE Email = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Email);

            rs = ps.executeQuery();

            if (rs.next()) {
                String contraseñaAlmacenada = rs.getString("Contraseña");
                if (PasswordUtils.checkPassword(v_ContraseñaIngresada, contraseñaAlmacenada)) {
                    return true;
                }
            }
            dbConnection.closeConnection(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Usuario SQL_ObtenerDatosUsuario(String v_Email) {
        Usuario usuario = null;
        String sql = "SELECT Nombre, Apellido, Email, Rango FROM Usuarios WHERE Email=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Email);

            rs = ps.executeQuery();

            if (rs.next()) {
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                String email = rs.getString("Email");
                String rango = rs.getString("Rango");

                usuario = Usuario.getInstance();
                usuario.setNombre(nombre);
                usuario.setApellido(apellido);
                usuario.setEmail(email);
                usuario.setRango(rango);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuario;
    }
}
