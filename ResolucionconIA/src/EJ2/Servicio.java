package EJ2;

import java.time.LocalDate;
import java.util.Objects;

public class Servicio {
    private Mecanico mecanico;
    private Avion avion;
    private LocalDate fecha;
    private int horasInvertidas;
    private String tipoTrabajo;

    public Servicio(Mecanico mecanico, Avion avion, LocalDate fecha, int horasInvertidas, String tipoTrabajo) {
        this.mecanico = mecanico;
        this.avion = avion;
        this.fecha = fecha;
        this.horasInvertidas = horasInvertidas;
        this.tipoTrabajo = tipoTrabajo;
    }

    // Getters y setters
    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public int getHorasInvertidas() {
        return horasInvertidas;
    }

    public void setHorasInvertidas(int horasInvertidas) {
        this.horasInvertidas = horasInvertidas;
    }

    public String getTipoTrabajo() {
        return tipoTrabajo;
    }

    public void setTipoTrabajo(String tipoTrabajo) {
        this.tipoTrabajo = tipoTrabajo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Servicio servicio = (Servicio) o;
        return Objects.equals(avion, servicio.avion) && Objects.equals(fecha, servicio.fecha) && Objects.equals(tipoTrabajo, servicio.tipoTrabajo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(avion, fecha, tipoTrabajo);
    }
}
