/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secure;

/**
 *
 * @author Himanshi-pc
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Connect {
    static Connection conn=null;
    public static Connection Connect()
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
             String uname="log";
            String pswd="log";
            conn=DriverManager.getConnection("jdbc:derby://localhost:1527/Log",uname,pswd);
            return conn;
        }catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                    return null;
                }
    }
}
