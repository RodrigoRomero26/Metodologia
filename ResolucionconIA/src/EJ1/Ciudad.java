package EJ1;

public class Ciudad {
    private String nombre;
    private String provincia;
    private int poblacion;
    private double imp1;
    private double imp2;
    private double imp3;
    private double imp4;
    private double imp5;
    private double gastosMantenimiento;

    public Ciudad(String nombre, String provincia, int poblacion, double imp1, double imp2, double imp3, double imp4, double imp5, double gastosMantenimiento) {
        this.nombre = nombre;
        this.provincia = provincia;
        this.poblacion = poblacion;
        this.imp1 = imp1;
        this.imp2 = imp2;
        this.imp3 = imp3;
        this.imp4 = imp4;
        this.imp5 = imp5;
        this.gastosMantenimiento = gastosMantenimiento;
    }

    public double calcularRecaudacion() {
        return imp1 + imp2 + imp3 + imp4 + imp5;
    }

    public boolean estaEnDeficit() {
        return gastosMantenimiento > calcularRecaudacion();
    }

    public String getNombre() {
        return nombre;
    }

    public String getProvincia() {
        return provincia;
    }

    public int getPoblacion() {
        return poblacion;
    }
}
