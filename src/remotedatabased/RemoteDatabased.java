/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package remotedatabased;

import java.sql.*;



/**
 *
 * @author Jovanie
 */
public class RemoteDatabased {
    
    Connection con = null;
    
    public static Connection connectDB(){
        try {
        Class.forName("com.mysql.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://107.180.54.180:22/absoluteindustrialsolutions","useraisi","password1");  
           System.err.println("Connection Success");
           return con;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }
    }
    
    
}