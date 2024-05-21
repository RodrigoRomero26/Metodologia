package EJ2;

import java.util.List;
import java.util.ArrayList;

public class Piloto extends Persona {
    private String numeroLicencia;
    private String restricciones;
    private List<TipoAvion> tiposAvion;

    public Piloto(String dni, String nombre, String direccion, String telefono, String numeroLicencia, String restricciones) {
        super(dni, nombre, direccion, telefono);
        this.numeroLicencia = numeroLicencia;
        this.restricciones = restricciones;
        this.tiposAvion = new ArrayList<>();
    }

    // Getters y setters
    public String getNumeroLicencia() {
        return numeroLicencia;
    }

    public void setNumeroLicencia(String numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public String getRestricciones() {
        return restricciones;
    }

    public void setRestricciones(String restricciones) {
        this.restricciones = restricciones;
    }

    public List<TipoAvion> getTiposAvion() {
        return tiposAvion;
    }

    public void agregarTipoAvion(TipoAvion tipoAvion) {
        this.tiposAvion.add(tipoAvion);
    }
}
