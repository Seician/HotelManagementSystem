/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import com.mysql.cj.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author Asus
 */
public class ConnectionProvider {
    public static Connection getCon() throws ClassNotFoundException{
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
       Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel","root","alfabetromanesc1");
       return con;        
        } catch(Exception e){
            return null;
        } 
    }
}
