package Controller;

import Config.MySQLConnection;
import Model.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CategoriaOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public List SQL_ConsultarCategorias() {
        List<Categoria> DatosCategorias = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT * FROM Categorias";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Categoria c = new Categoria();
                c.setID_Categoria(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                DatosCategorias.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosCategorias;

    }

    public int SQL_AgregarNuevaCategoria(Categoria categoria) {
        int r = 0;
        String sql = "INSERT INTO Categorias(Nombre, Descripcion) VALUE(?,?)";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getDescripcion());

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

    public int SQL_EliminarCategoria(int ID_Categoria) {
        int r = 0;
        String sql = "DELETE FROM Categorias WHERE ID_Categoria=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Categoria);
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

    public int SQL_ActualizarCategoria(Categoria categoria) {
        int r = 0;
        String sql = "UPDATE Categorias SET Nombre=?, Descripcion=? WHERE ID_Categoria=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, categoria.getNombre());
            ps.setString(2, categoria.getDescripcion());
            ps.setInt(3, categoria.getID_Categoria());

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
