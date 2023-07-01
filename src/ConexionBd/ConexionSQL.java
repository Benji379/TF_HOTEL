package ConexionBd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionSQL {

    Connection conectar = null;

    public Connection conexion() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            //usar la bd localmente
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/tf_hotel", "root", "");
            //usar la bd dentro de un MySQLHost (inactivo)
            //conectar = (Connection) DriverManager.getConnection("jdbc:mysql://admin/boyzeosthxmnb6wpbikw", "u6ircgzlzmholzfg", "XytuZwo053UIRvPUqSCd");
            
        } catch (SQLException ex) {
            Logger.getLogger(ConexionSQL.class.getName()).log(Level.SEVERE, null, ex);
        }
        return conectar;
    }

}
