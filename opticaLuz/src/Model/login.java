/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TOMAS
 */
public class login {
    private String usuario = "cristian";
    private String usuario1 = "nahuel";
    private String contraseña = "cris1979";

    public login() {
    }
    
    public login(String usuario, String contraseña, String usuario1){
        this.usuario = usuario;
        this.usuario1 = usuario1;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }
    public String getUsuario1(){
        return usuario1;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setUsuario1(String usuario1){
        this.usuario1 = usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
