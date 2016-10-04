/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mx.uach.proyecto1erparcial.operaciones;

import java.sql.CallableStatement;
import java.sql.SQLException;
import java.sql.Types;
import mx.uach.proyecto1erparcial.conexion.Conexion;

/**
 *
 * @author Daniela Santillanes Castro
 * @version 1.0
 * @since 03/10/2016
 */
public class Orden {
    
     public static void crearOrden(String order_id, String cust_name, String product_name, String unit_price, String quantity) throws SQLException {
        CallableStatement pstmt = Conexion.getInstance().getCon().prepareCall("{call crearOrden(?,?,?,?,?)}");
        pstmt.setString(1, order_id);
        pstmt.setString(2, cust_name);
        pstmt.setString(3, product_name);
        pstmt.setString(4, unit_price);
        pstmt.setString(5, quantity);
        pstmt.executeUpdate();
        pstmt.close();
        System.out.println("Orden creada.");
    }
     
    public static void leerOrden(String order_id) throws SQLException {
        CallableStatement pstmt = Conexion.getInstance().getCon().prepareCall("{call leerOrden(?,?)}");
        pstmt.setString(1, order_id);
        pstmt.registerOutParameter(2, Types.VARCHAR);
        pstmt.executeUpdate();
        String order = pstmt.getString(2);
        System.out.println("Orden encontrada:");
        pstmt.close();
    } 
    
    public static void modificarOrden(String order_id, String product_name) throws SQLException {
        CallableStatement pstmt = Conexion.getInstance().getCon().prepareCall("{call modificarOrden(?,?)}");
        pstmt.setString(1, order_id);
        pstmt.setString(2, product_name);
        pstmt.executeUpdate();
        System.out.println("Orden actualizada.");
        pstmt.close();
    }
    
    public static void eliminarOrden(String order_id) throws SQLException {
        CallableStatement pstmt = Conexion.getInstance().getCon().prepareCall("{call eliminarOrden(?)}");
        pstmt.setString(1, order_id);
        pstmt.executeUpdate();
        System.out.println("Orden eliminada.");
        pstmt.close();
    }
}
