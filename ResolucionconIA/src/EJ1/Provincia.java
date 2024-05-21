package EJ1;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private String nombre;
    private List<Ciudad> ciudades;

    public Provincia(String nombre) {
        this.nombre = nombre;
        this.ciudades = new ArrayList<>();
    }

    public void agregarCiudad(Ciudad ciudad) {
        if (ciudad.getPoblacion() > 100000) {
            ciudades.add(ciudad);
        }
    }

    public List<Ciudad> obtenerCiudadesEnDeficit() {
        List<Ciudad> ciudadesEnDeficit = new ArrayList<>();
        for (Ciudad ciudad : ciudades) {
            if (ciudad.estaEnDeficit()) {
                ciudadesEnDeficit.add(ciudad);
            }
        }
        return ciudadesEnDeficit;
    }

    public boolean tieneMasDeLaMitadEnDeficit() {
        int contadorEnDeficit = 0;
        for (Ciudad ciudad : ciudades) {
            if (ciudad.estaEnDeficit()) {
                contadorEnDeficit++;
            }
        }
        return contadorEnDeficit > (ciudades.size() / 2.0);
    }

    public String getNombre() {
        return nombre;
    }
}
