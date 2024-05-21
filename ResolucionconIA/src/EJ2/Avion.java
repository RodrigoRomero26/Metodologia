package EJ2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Avion {
    private String matricula;
    private TipoAvion tipo;
    private Hangar hangar;
    private List<Propietario> propietarios;
    private LocalDate fechaAdquisicion;
    private List<Servicio> servicios;

    public Avion(String matricula, TipoAvion tipo, Hangar hangar, LocalDate fechaAdquisicion) {
        this.matricula = matricula;
        this.tipo = tipo;
        this.hangar = hangar;
        this.fechaAdquisicion = fechaAdquisicion;
        this.propietarios = new ArrayList<>();
        this.servicios = new ArrayList<>();
    }

    // Getters y setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public TipoAvion getTipo() {
        return tipo;
    }

    public void setTipo(TipoAvion tipo) {
        this.tipo = tipo;
    }

    public Hangar getHangar() {
        return hangar;
    }

    public void setHangar(Hangar hangar) {
        this.hangar = hangar;
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void agregarPropietario(Propietario propietario) {
        this.propietarios.add(propietario);
    }

    public LocalDate getFechaAdquisicion() {
        return fechaAdquisicion;
    }

    public void setFechaAdquisicion(LocalDate fechaAdquisicion) {
        this.fechaAdquisicion = fechaAdquisicion;
    }

    public List<Servicio> getServicios() {
        return servicios;
    }

    public void agregarServicio(Servicio servicio) {
        for (Servicio s : servicios) {
            if (s.equals(servicio)) {
                throw new IllegalArgumentException("No puede haber dos servicios realizados al mismo avión en la misma fecha con el mismo tipo de trabajo");
            }
        }
        this.servicios.add(servicio);
    }
}
