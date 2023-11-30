package proyectocarlos;

import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import com.mysql.jdbc.Driver;
import java.util.logging.Level;
import java.util.logging.Logger;


public class conexionMysql {
    
    Connection cn;
    
    public Connection conectar(){
    
    String host ="jdbc:mysql://190.1.0.131/";
    String user = "22progb18";
    String pass ="user18";
    String bd = "22progb18";
    
    try {
    
    cn = DriverManager.getConnection(host+bd,user,pass);
    //JOptionPane.showMessageDialog(null,"Conexion exitosa...");
    System.out.println("Conexion exitosa...");
    
    } catch(SQLException ex)
            {
                JOptionPane.showMessageDialog(null,"ERROR!!..."+ ex.getMessage());
                System.out.println(ex.getCause()+"ERROR!!!"); 
            }
    return cn;
    }
    
    
    
    
}
