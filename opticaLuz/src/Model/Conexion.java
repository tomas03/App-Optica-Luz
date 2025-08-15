/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TOMAS
 */
public class Conexion {
    Connection con;
    public Connection getConnection(){
        try{
            String DB = "jdbc:mysql://localhost:3306/opticaluz?serverTimezone=UTC";
            con = DriverManager.getConnection(DB, "root", "2003");
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());   
        }
        return null;
    }
}
