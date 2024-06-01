package Controller;

import Config.MySQLConnection;
import Model.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductoOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Producto p = new Producto();
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public List SQL_ConsultarProductos() {
        List<Producto> DatosProductos = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT P.ID_Producto, \n"
                    + "      (SELECT PR.Nombre FROM Proveedores PR WHERE PR.ID_Proveedor = P.ID_Proveedor),\n"
                    + "	  (SELECT C.Nombre FROM Categorias C WHERE C.ID_Categoria = P.ID_Categoria),\n"
                    + "      P.Nombre,\n"
                    + "      P.Descripcion,\n"
                    + "      p.Codigo_Producto,\n"
                    + "      P.Precio, \n"
                    + "      P.Stock\n"
                    + "FROM Productos P\n"
                    + "ORDER BY P.ID_Producto";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Producto p = new Producto();
                p.setID_Producto(rs.getInt(1));
                p.setNombre_Proveedor(rs.getString(2));
                p.setNombre_Categoria(rs.getString(3));
                p.setNombre_Producto(rs.getString(4));
                p.setDescripcion(rs.getString(5));
                p.setCodigo(rs.getString(6));
                p.setPrecio(rs.getInt(7));
                p.setStock(rs.getInt(8));
                DatosProductos.add(p);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosProductos;
    }

    public List SQL_ConsultarNombresProveedores() {
        List<String> DatosNombresProveedores = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT Nombre FROM Proveedores";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DatosNombresProveedores.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosNombresProveedores;
    }

    public List SQL_ConsultarNombresCategorias() {
        List<String> DatosNombresCategorias = new ArrayList<>();
        try {
            con = dbConnection.getConnection();
            String sql = "SELECT Nombre FROM Categorias";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                DatosNombresCategorias.add(rs.getString("Nombre"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return DatosNombresCategorias;
    }

    public int SQL_ConsultarID(String v_Nombre, String v_sql) {
        int ID_Seleccionada = 0;
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(v_sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                ID_Seleccionada = rs.getInt(v_Nombre);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ID_Seleccionada;
    }

    public int SQL_AgregarNuevoProducto(Producto producto) {
        int r = 0;
        String sql = "INSERT INTO Productos (ID_Proveedor, ID_Categoria, Nombre, Descripcion, Codigo_Producto, Precio, Stock) \n"
                + "VALUE(?,?,?,?, ?,?,?)";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, producto.getID_Proveedor());
            ps.setInt(2, producto.getID_Categoria());
            ps.setString(3, producto.getNombre_Producto());
            ps.setString(4, producto.getDescripcion());
            ps.setString(5, producto.getCodigo());
            ps.setInt(6, producto.getPrecio());
            ps.setInt(7, producto.getStock());

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

    public int SQL_EliminarProducto(int ID_Producto) {
        int r = 0;
        String sql = "DELETE FROM Productos WHERE ID_Producto=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ID_Producto);
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

    public int SQL_ActualizarProducto(Producto producto) {
        int r = 0;
        String sql = "UPDATE Productos SET ID_Proveedor =?, ID_Categoria=?, Nombre=?, Descripcion=?,"
                + "Codigo_Producto=?, Precio=?, Stock=? WHERE ID_Producto=?";
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);

            ps.setInt(1, producto.getID_Proveedor());
            ps.setInt(2, producto.getID_Categoria());
            ps.setString(3, producto.getNombre_Producto());
            ps.setString(4, producto.getDescripcion());
            ps.setString(5, producto.getCodigo());
            ps.setInt(6, producto.getPrecio());
            ps.setInt(7, producto.getStock());
            ps.setInt(8, producto.getID_Producto());

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
