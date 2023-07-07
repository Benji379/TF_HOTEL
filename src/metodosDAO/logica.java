package metodosDAO;

import ConexionBd.ConexionSQL;
import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class logica {

    public void transTxtField(javax.swing.JTextField txtField) {
        txtField.setBackground(new java.awt.Color(0, 0, 0, 1));
    }

    public static void AccederEnlace(String enlace) {
        String url = "C:\\Windows\\System32\\cmd.exe /K start " + enlace;
        try {
            Runtime.getRuntime().exec(url);
        } catch (IOException ex) {
        }
    }

    public String mostrarDatos(String nameTablaSQL, String nameColumna, String datoComparar, String columnaDatoRetornar) {

        ConexionSQL con1 = new ConexionSQL();
        Connection conet;
        Statement st;
        ResultSet rs;
        String datoRetornar = null;
        String aux, aux2;
        String sql = "select * from " + nameTablaSQL;
        int existe = 0;

        try {
            conet = con1.conexion();
            st = conet.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                aux = rs.getString(nameColumna);
                aux2 = rs.getString(columnaDatoRetornar);
                if (aux.equals(datoComparar)) {
                    existe = 1;
                    datoRetornar = aux2;
                }
            }
            if (existe == 0) {
//                System.out.println("CLIENTE NO EXISTE");
            }

        } catch (HeadlessException | SQLException e) {

        }
        return datoRetornar;
    }

    public void modificarDato(String nombreTablaSQL, String columnaComparar, String datoComparar, String columnaModificar, String datoModificar) {
        try {
            ConexionSQL con1 = new ConexionSQL();
            Connection conet;
            PreparedStatement pstmt;
            String updateSql = "UPDATE " + nombreTablaSQL + " SET " + columnaModificar + " = ? WHERE " + columnaComparar + " = ?";
            conet = con1.conexion();
            pstmt = conet.prepareStatement(updateSql);
            pstmt.setString(5, datoModificar);
            pstmt.setString(2, datoComparar);
            int filasAfectadas = pstmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Dato modificado correctamente.");
            } else {
                JOptionPane.showMessageDialog(null, "Habitacion no existe");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Habitacion no existe");
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
