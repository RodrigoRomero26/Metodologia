package EJ1;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private List<Provincia> provincias;

    public Pais() {
        this.provincias = new ArrayList<>();
    }

    public void agregarProvincia(Provincia provincia) {
        provincias.add(provincia);
    }

    public List<Provincia> obtenerProvinciasConMasDeLaMitadEnDeficit() {
        List<Provincia> provinciasEnDeficit = new ArrayList<>();
        for (Provincia provincia : provincias) {
            if (provincia.tieneMasDeLaMitadEnDeficit()) {
                provinciasEnDeficit.add(provincia);
            }
        }
        return provinciasEnDeficit;
    }
}
