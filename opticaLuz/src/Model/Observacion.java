package Model;

/**
 *
 * @author TOMAS
 */
public class Observacion {
    private int dni;
    private String lejos;
    private String lejosLente;
    private String lejosMarco;
    private String cerca;
    private String cercaLente;
    private String cercaMarco;
    private String fecha;

    public Observacion() {
    }

    public Observacion(int dni, String lejos, String lejosLente, String lejosMarco, String cerca, String cercaLente, String cercaMarco, String fecha) {
        this.dni = dni;
        this.lejos = lejos;
        this.lejosLente = lejosLente;
        this.lejosMarco = lejosMarco;
        this.cerca = cerca;
        this.cercaLente = cercaLente;
        this.cercaMarco = cercaMarco;
        this.fecha = fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getLejos() {
        return lejos;
    }

    public void setLejos(String lejos) {
        this.lejos = lejos;
    }

    public String getLejosLente() {
        return lejosLente;
    }

    public void setLejosLente(String lejosLente) {
        this.lejosLente = lejosLente;
    }

    public String getLejosMarco() {
        return lejosMarco;
    }

    public void setLejosMarco(String lejosMarco) {
        this.lejosMarco = lejosMarco;
    }

    public String getCerca() {
        return cerca;
    }

    public void setCerca(String cerca) {
        this.cerca = cerca;
    }

    public String getCercaLente() {
        return cercaLente;
    }

    public void setCercaLente(String cercaLente) {
        this.cercaLente = cercaLente;
    }

    public String getCercaMarco() {
        return cercaMarco;
    }

    public void setCercaMarco(String cercaMarco) {
        this.cercaMarco = cercaMarco;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
}
