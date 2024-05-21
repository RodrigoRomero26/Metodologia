package EJ2;

import java.time.LocalDate;

public class TestAerodromo {
    public static void main(String[] args) {
        // Crear tipos de avión
        TipoAvion tipo1 = new TipoAvion("Boeing 737", 200, 80000);
        TipoAvion tipo2 = new TipoAvion("Airbus A320", 180, 77000);

        // Crear hangares
        Hangar hangar1 = new Hangar("H1", 5, "Zona A");
        Hangar hangar2 = new Hangar("H2", 3, "Zona B");

        // Crear propietarios
        Propietario propietario1 = new Propietario("12345678A", "John Doe", "123 Main St", "555-1234");
        Propietario propietario2 = new Propietario("87654321B", "Jane Smith", "456 Elm St", "555-5678");

        // Crear mecánicos
        Mecanico mecanico1 = new Mecanico("11111111C", "Mike Johnson", "789 Oak St", "555-7890", 40000, "Mañana");
        mecanico1.agregarTipoAvion(tipo1);
        mecanico1.agregarTipoAvion(tipo2);

        // Crear pilotos
        Piloto piloto1 = new Piloto("22222222D", "Sarah Brown", "321 Pine St", "555-3210", "LIC123", "Ninguna");
        piloto1.agregarTipoAvion(tipo1);

        // Crear aviones
        Avion avion1 = new Avion("ABC123", tipo1, hangar1, LocalDate.of(2020, 1, 1));
        avion1.agregarPropietario(propietario1);

        Avion avion2 = new Avion("XYZ789", tipo2, hangar2, LocalDate.of(2021, 6, 15));
        avion2.agregarPropietario(propietario2);

        // Crear servicios
        Servicio servicio1 = new Servicio(mecanico1, avion1, LocalDate.of(2022, 3, 10), 5, "Mantenimiento de motor");
        Servicio servicio2 = new Servicio(mecanico1, avion2, LocalDate.of(2022, 3, 11), 3, "Revisión general");

        // Agregar servicios a los aviones
        avion1.agregarServicio(servicio1);
        avion2.agregarServicio(servicio2);

        // Mostrar información de los aviones
        System.out.println("Información del avión 1:");
        System.out.println("Matrícula: " + avion1.getMatricula());
        System.out.println("Modelo: " + avion1.getTipo().getModelo());
        System.out.println("Hangar: " + avion1.getHangar().getNumero());
        System.out.println("Fecha de adquisición: " + avion1.getFechaAdquisicion());
        System.out.println("Propietarios:");
        for (Propietario p : avion1.getPropietarios()) {
            System.out.println(" - " + p.getNombre());
        }
        System.out.println("Servicios:");
        for (Servicio s : avion1.getServicios()) {
            System.out.println(" - Fecha: " + s.getFecha() + ", Trabajo: " + s.getTipoTrabajo() + ", Mecánico: " + s.getMecanico().getNombre());
        }
    }
}
