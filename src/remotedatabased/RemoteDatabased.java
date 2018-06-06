/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotedatabased;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Jovanie
 */
public class RemoteDatabased {
    
    Connection con = null;
    private final static Logger logger = Logger.getLogger(RemoteDatabased.class.getName());
    public static Connection connectDB(){
        
        try {
        
            Class.forName("com.mysql.jdbc.Driver");   
            Connection con = DriverManager.getConnection("jdbc:mysql://107.180.54.180:3306/absoluteindustrialsolutions","scope_user_aisi","aisi10xyz20");      
            System.err.println("Connection Success");
            logger.log(Level.SEVERE,con.toString());
            return con;
           
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
    
}