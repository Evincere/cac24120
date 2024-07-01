package herencia.empresa.infrastructure.persistencia;

import herencia.empresa.models.clasespadre.Empleado;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class PersistenciaArchivoImpl implements IPersistencia {

  private static final String RUTA_NOMINA_PERSONAL = "src/main/resources/data/empleados.json";


  @Override
  public void guardarEmpleados(ArrayList<Empleado> empleados) {

    try {
      FileWriter writer = new FileWriter(RUTA_NOMINA_PERSONAL);
      for(Empleado empleado : empleados){
        writer.write(String.valueOf(empleado));
        writer.write("\n");
      }
      writer.close();
      System.out.println("Empleados guardados exitosamente en " + RUTA_NOMINA_PERSONAL);
    } catch (IOException e) {
      System.out.println("Error al guardar los empleados: " + e.getMessage());
    }


  }

  @Override
  public ArrayList<Empleado> leerNomina() {
    return null;
  }
}
