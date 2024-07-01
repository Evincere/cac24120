package herencia.empresa.models;

import herencia.empresa.models.clasespadre.Empleado;
import herencia.empresa.services.RecursosHumanosService;
import java.util.ArrayList;

public class RecursosHumanos {

  RecursosHumanosService service = new RecursosHumanosService();

  public void guardarEmpleados(ArrayList<Empleado> empleados) {
    service.guardarEmpleados(empleados);
  }

  public ArrayList<Empleado> leerNomina() {
    return new ArrayList<>();
  }
}
