package herencia.empresa.models;

import herencia.empresa.models.clasespadre.Empleado;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class RecursosHumanos {
    private static final String NOMBRE_ARCHIVO = "src/main/resources/data/empleados.txt";

    public void guardarEmpleados(ArrayList<Empleado> empleados) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(NOMBRE_ARCHIVO))) {
            for (Empleado empleado : empleados) {
                writer.write(String.valueOf(empleado));
                writer.newLine(); // Agrega una nueva línea después de cada empleado
            }
            System.out.println("Empleados guardados exitosamente en " + NOMBRE_ARCHIVO);
        } catch (IOException e) {
            System.out.println("Error al guardar los empleados: " + e.getMessage());
        }
    }
}
