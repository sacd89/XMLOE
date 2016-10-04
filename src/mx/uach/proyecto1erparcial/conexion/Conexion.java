package mx.uach.proyecto1erparcial.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 03/10/2016
 */
public class Conexion {
        private static Conexion INSTANCE;
    private Connection con;
    private final static String USUARIO = "";
    private final static String PASSWORD = "";
    private final static String CONEXION = "jdbc:oracle:thin:@localhost:1521/xe";

    private Conexion() {
        initConnection();
    }
    
    private void initConnection(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection(CONEXION, USUARIO, PASSWORD);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static Conexion getInstance(){
        if(INSTANCE == null){
            INSTANCE = new Conexion();
        }
        return INSTANCE;
    }
    
    /**
     * @return the con
     */
    public Connection getCon() {
        return con;
    }
}
