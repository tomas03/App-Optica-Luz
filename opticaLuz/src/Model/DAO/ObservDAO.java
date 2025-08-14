/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.DAO;

import Model.Conexion;
import Model.Observacion;
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
public class ObservDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public boolean RegOBS (Observacion obs){
        String sql = "INSERT INTO observaciones(dnipaciente,fecha,lejos,lejoslente,lejosmarco,cerca,cercalente,cercamarco) values (?,?,?,?,?,?,?,?)";
        try{
            con =cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, obs.getDni());
            ps.setString(2,obs.getFecha());
            ps.setString(3,obs.getLejos());
            ps.setString(4,obs.getLejosLente());
            ps.setString(5,obs.getLejosMarco());
            ps.setString(6,obs.getCerca());
            ps.setString(7,obs.getCercaLente());
            ps.setString(8,obs.getCercaMarco());
            ps.execute();
            return true;
        }catch(SQLException e){
          JOptionPane.showMessageDialog(null, "falló la creación de la observación "+e.toString());
          return false;
        }finally{
            try{
                con.close();
            }catch(SQLException e){
                System.out.println(e.toString());
            }
        }
    }
    
    public List<Observacion> ListOBS() {
        Observacion ob = new Observacion();
    List<Observacion> listob = new ArrayList<>();
    String sql = "SELECT * FROM observaciones"; 
    try {
        con = cn.getConnection();
        ps = con.prepareStatement(sql);
        rs = ps.executeQuery();
        
        while (rs.next()) {
            Observacion obs = new Observacion();
            obs.setDni(rs.getInt("dnipaciente"));
            obs.setFecha(rs.getString("fecha"));
            obs.setLejos(rs.getString("lejos"));
            obs.setLejosLente(rs.getString("lejoslente"));
            obs.setLejosMarco(rs.getString("lejosmarco"));
            obs.setCerca(rs.getString("cerca"));
            obs.setCercaLente(rs.getString("cercalente"));
            obs.setCercaMarco(rs.getString("cercamarco"));
            listob.add(obs);
        }
    } catch (SQLException e) {
        System.out.println(e.toString());
    }
    return listob;
}
    
    
    
}
