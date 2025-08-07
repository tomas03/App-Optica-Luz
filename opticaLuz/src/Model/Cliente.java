/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author TOMAS
 */
public class Cliente {
    private int dni;
    private String ncomp;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int dni, String ncomp, String telefono, String direccion) {
        this.dni = dni;
        this.ncomp = ncomp;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNcomp() {
        return ncomp;
    }

    public void setNcomp(String ncomp) {
        this.ncomp = ncomp;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
