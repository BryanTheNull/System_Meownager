package Controller;

import Config.MySQLConnection;
import Config.PasswordUtils;
import Model.GestionarUsuario;
import Model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GestionarUsuarioOperation {
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();
    
    public List SQL_ConsultarUsuarios(String v_Email) {
        List<GestionarUsuario> DatosUsuarios = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT ID_Usuario, Nombre, Apellido, Email, Fecha_Registro, Rango FROM Usuarios WHERE Email <> ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, v_Email);
            rs = ps.executeQuery();
            while (rs.next()) {
                GestionarUsuario u = new GestionarUsuario();
                u.setID_Usuario(rs.getInt(1));
                u.setNombre(rs.getString(2));
                u.setApellido(rs.getString(3));
                u.setEmail(rs.getString(4));
                u.setFecha_Registro(rs.getString(5));
                u.setRango(rs.getString(6));
                DatosUsuarios.add(u);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosUsuarios;
    }
    
    public int SQL_AgregarNuevoUsuario(GestionarUsuario usuario, String v_Contraseña) {
        int r = 0;
        String sql = "INSERT INTO Usuarios (Nombre, Apellido, Email,Contraseña, Rango) \n"
                + "VALUE(?,?,?,?,?)";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, PasswordUtils.hashPassword(v_Contraseña));
            ps.setString(5, usuario.getRango());
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
    public int SQL_EliminarUsuario(int ID_Usuario) {
        int r = 0;
        String sql = "DELETE FROM Usuarios WHERE ID_Usuario=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Usuario);
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
    
    public int SQL_ActualizarUsuario (GestionarUsuario usuario) {
        int r = 0;
        String sql = "UPDATE Usuarios SET Nombre=?, Apellido=?,"
                + "Email=?, Rango=? WHERE ID_Usuario=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getEmail());
            ps.setString(4, usuario.getRango());
            ps.setInt(5, usuario.getID_Usuario());


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
