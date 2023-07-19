package TestLogin;

import DAO.ConexionSQL;
import java.sql.*;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private final Connection conexion;

    public UsuarioDAO() {
        ConexionSQL conexionSQL = new ConexionSQL();
        conexion = conexionSQL.conexion();
    }

    public boolean autenticarUsuario(String tabla, String columnaEmpleado, String columnaContrasena, String usuario, String contrasena) {
        boolean ingresoValido = false;
        String query = "SELECT * FROM " + tabla + " WHERE " + columnaEmpleado + " = ?";

        try {
            try (PreparedStatement statement = conexion.prepareStatement(query)) {
                statement.setString(1, usuario);
                ResultSet resultSet = statement.executeQuery();

                if (!resultSet.next()) {
                    System.out.println("Usuario no existe");
                    JOptionPane.showMessageDialog(null, "El usuario no existe", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    String contrasenaDB = resultSet.getString(columnaContrasena);
                    if (contrasena.equals(contrasenaDB)) {
                        ingresoValido = true;
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        } catch (SQLException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        }
        return ingresoValido;
    }

    public static void main(String[] args) {
        UsuarioDAO k = new UsuarioDAO();
        
        if(k.autenticarUsuario("empleados", "dni", "contraseña", "admin", "1234")){
            System.out.println("Ingreso exitoso");
        }else{
            System.out.println("Ingreso fallido");
        }
        
    }

}
