package Controller.EntrySystem;

import Config.MySQLConnection;
import Model.Usuario;
import com.sun.source.tree.TryTree;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();
    Usuario usuarioLogin = new Usuario();

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
                if(count > 0){
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
}
