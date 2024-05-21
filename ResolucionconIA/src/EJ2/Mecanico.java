package EJ2;

import java.util.List;
import java.util.ArrayList;

public class Mecanico extends Persona {
    private double salario;
    private String turno;
    private List<TipoAvion> tiposAvion;
    private List<Servicio> serviciosRealizados;

    public Mecanico(String dni, String nombre, String direccion, String telefono, double salario, String turno) {
        super(dni, nombre, direccion, telefono);
        this.salario = salario;
        this.turno = turno;
        this.tiposAvion = new ArrayList<>();
        this.serviciosRealizados = new ArrayList<>();
    }

    // Getters y setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public List<TipoAvion> getTiposAvion() {
        return tiposAvion;
    }

    public void agregarTipoAvion(TipoAvion tipoAvion) {
        this.tiposAvion.add(tipoAvion);
    }

    public List<Servicio> getServiciosRealizados() {
        return serviciosRealizados;
    }

    public void agregarServicioRealizado(Servicio servicio) {
        this.serviciosRealizados.add(servicio);
    }
}
