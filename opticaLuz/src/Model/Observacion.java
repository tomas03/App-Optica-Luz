package Model;

/**
 *
 * @author TOMAS
 */
public class Observacion {
    private int dni;
    private String obs;
    private String fecha;

    public Observacion() {
    }

    public Observacion(int dni, String obs, String fecha) {
        this.dni = dni;
        this.obs = obs;
        this.fecha = fecha;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }  
}
