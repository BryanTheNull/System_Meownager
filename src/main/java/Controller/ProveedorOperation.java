package Controller;

import Config.MySQLConnection;
import Model.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProveedorOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public List SQL_ConsultarProveedores() {
        List<Proveedor> DatosProveedores = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT ID_Proveedor, Rut, Nombre, Email, Telefono, Direccion, Estado FROM Proveedores";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor p = new Proveedor();
                p.setID_Proveedor(rs.getInt(1));
                p.setRut(rs.getString(2));
                p.setNombre(rs.getString(3));
                p.setEmail(rs.getString(4));
                p.setTelefono(rs.getString(5));
                p.setDireccion(rs.getString(6));
                p.setEstado(rs.getString(7));
                DatosProveedores.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosProveedores;
    }

    public int SQL_AgregarNuevoProveedor(Proveedor proveedor) {
        int r = 0;
        String sql = "INSERT INTO Proveedores (Rut, Nombre, Email, Telefono, Direccion, Estado) \n"
                + "VALUE(?,?,?,?,?,?)";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRut());
            ps.setString(2, proveedor.getNombre());
            ps.setString(3, proveedor.getEmail());
            ps.setString(4, proveedor.getTelefono());
            ps.setString(5, proveedor.getDireccion());
            ps.setString(6, proveedor.getEstado());

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

    public int SQL_EliminarProveedor(int ID_Proveedor) {
        int r = 0;
        String sql = "DELETE FROM Proveedores WHERE ID_Proveedor=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Proveedor);
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

    public int SQL_ActualizarProveedor(Proveedor proveedor) {
        int r = 0;
        String sql = "UPDATE Proveedores SET Rut=?, Nombre=?, Email=?, Telefono=?, Direccion=?, Estado=? WHERE ID_Proveedor=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, proveedor.getRut());
            ps.setString(2, proveedor.getNombre());
            ps.setString(3, proveedor.getEmail());
            ps.setString(4, proveedor.getTelefono());
            ps.setString(5, proveedor.getDireccion());
            ps.setString(6, proveedor.getEstado());
            ps.setInt(7, proveedor.getID_Proveedor());

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
