/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Observacion;
import Model.Cliente;
import Model.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author TOMAS
 */
public class ClienteDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    public boolean RegCli(Cliente cl){
        String sql = "INSERT INTO clientes(dni,nombrecompleto,nrotelefono,direccion) VALUES (?,?,?,?)";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cl.getDni());
            ps.setString(2,cl.getNcomp());
            ps.setString(3,cl.getTelefono());
            ps.setString(4,cl.getDireccion());
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "falló la creación del cliente "+e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public List ListCli(){
        List<Cliente> Listacl = new ArrayList();
        String sql = "SELECT * FROM clientes";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while(rs.next()){
               Cliente cl = new Cliente();
               cl.setDni(rs.getInt("DNI"));
               cl.setNcomp(rs.getString("nombrecompleto"));
               cl.setTelefono(rs.getString("nrotelefono"));
               cl.setDireccion(rs.getString("direccion"));
               Listacl.add(cl);
           }
        }catch(SQLException e){
            System.out.println(e.toString());
        }
        return Listacl;
    }
    
    public boolean DelCLi(int dni){
        String sql = "DELETE FROM clientes WHERE dni = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,dni);
            ps.execute();
            return true;
        }catch(SQLException e){
            System.out.println(e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }

        }
    }
    
    public boolean EdCli(Cliente cl){
        String sql = "UPDATE clientes SET nombrecompleto=?, nrotelefono=?, direccion=? where DNI =?";
        try{
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, cl.getNcomp());
            ps.setString(2, cl.getTelefono());
            ps.setString(3, cl.getDireccion());
            ps.setInt(4, cl.getDni());
            ps.execute();
            return true;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "falló la edición del cliente "+e.toString());
            return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
}
