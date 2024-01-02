
package br.com.mcs.agenda;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Suporte Totem
 */
public class ConnectionDatabase {
    public static Connection getConnnection(){
    try{
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/schedule?user=root&password=root");
    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }
    
}
}
