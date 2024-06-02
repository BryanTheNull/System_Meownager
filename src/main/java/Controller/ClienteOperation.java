package Controller;

import Config.MySQLConnection;
import Model.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ClienteOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();
    
    public List SQL_ConsultarClientes() {
        List<Cliente> DatosClientes = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT ID_Cliente, Nombre, Apellido, Email, Telefono, Direccion, Estado FROM Clientes";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente c = new Cliente();
                c.setID_Cliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setApellido(rs.getString(3));
                c.setEmail(rs.getString(4));
                c.setTelefono(rs.getString(5));
                c.setDireccion(rs.getString(6));
                c.setEstado(rs.getString(7));
                DatosClientes.add(c);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosClientes;
    }
    
    public int SQL_AgregarNuevoCliente(Cliente cliente) {
        int r = 0;
        String sql = "INSERT INTO Clientes (Nombre, Apellido, Email, Telefono, Direccion, Estado) \n"
                + "VALUE(?,?,?,?,?,?)";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getEstado());

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

    public int SQL_EliminarCliente(int ID_Cliente){
        int r = 0;
        String sql = "DELETE FROM Clientes WHERE ID_Cliente=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Cliente);
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
    
    public int SQL_ActualizarCliente(Cliente cliente) {
        int r = 0;
        String sql = "UPDATE Clientes SET Nombre=?, Apellido=?, Email=?, Telefono=?, Direccion=?, Estado=? WHERE ID_Cliente=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getEmail());
            ps.setString(4, cliente.getTelefono());
            ps.setString(5, cliente.getDireccion());
            ps.setString(6, cliente.getEstado());
            ps.setInt(7, cliente.getID_Cliente());

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
