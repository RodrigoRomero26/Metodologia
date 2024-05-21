package EJ1;

public class TestSistemaGastoPublico {
    public static void main(String[] args) {
        Ciudad ciudad1 = new Ciudad("CiudadA", "ProvinciaA", 150000, 100000, 50000, 30000, 20000, 10000, 250000);
        Ciudad ciudad2 = new Ciudad("CiudadB", "ProvinciaA", 200000, 200000, 150000, 100000, 50000, 25000, 600000);
        Ciudad ciudad3 = new Ciudad("CiudadC", "ProvinciaB", 120000, 300000, 200000, 150000, 100000, 50000, 800000);
        Ciudad ciudad4 = new Ciudad("CiudadD", "ProvinciaB", 110000, 400000, 250000, 200000, 150000, 100000, 1000000);
        Ciudad ciudad5 = new Ciudad("CiudadE", "ProvinciaB", 130000, 500000, 300000, 250000, 200000, 150000, 1200000);

        Provincia provinciaA = new Provincia("ProvinciaA");
        provinciaA.agregarCiudad(ciudad1);
        provinciaA.agregarCiudad(ciudad2);

        Provincia provinciaB = new Provincia("ProvinciaB");
        provinciaB.agregarCiudad(ciudad3);
        provinciaB.agregarCiudad(ciudad4);
        provinciaB.agregarCiudad(ciudad5);

        Pais pais = new Pais();
        pais.agregarProvincia(provinciaA);
        pais.agregarProvincia(provinciaB);

        System.out.println("Ciudades en déficit en ProvinciaA:");
        for (Ciudad ciudad : provinciaA.obtenerCiudadesEnDeficit()) {
            System.out.println(ciudad.getNombre());
        }

        System.out.println("Ciudades en déficit en ProvinciaB:");
        for (Ciudad ciudad : provinciaB.obtenerCiudadesEnDeficit()) {
            System.out.println(ciudad.getNombre());
        }

        System.out.println("Provincias con más de la mitad de las ciudades en déficit:");
        for (Provincia provincia : pais.obtenerProvinciasConMasDeLaMitadEnDeficit()) {
            System.out.println(provincia.getNombre());
        }
    }
}
