package Controller;

import Config.MySQLConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ReporteOperation {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    MySQLConnection dbConnection = MySQLConnection.getInstance();

    public List<Map<String, Object>> SQL_ConsultarReporte(String sql) {
        List<Map<String, Object>> resultados = new ArrayList<>();
        
        try {
            con = dbConnection.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();

            while (rs.next()) {
                Map<String, Object> fila = new HashMap<>();
                for (int i = 1; i <= columnCount; i++) {
                    String columnName = metaData.getColumnName(i);
                    Object columnValue = rs.getObject(i);
                    fila.put(columnName, columnValue);
                }
                resultados.add(fila);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return resultados;
    }
}
