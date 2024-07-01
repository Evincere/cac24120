package herencia.empresa.infrastructure.persistencia;

import herencia.empresa.models.clasespadre.Empleado;
import java.util.ArrayList;

public interface IPersistencia {

  void guardarEmpleados(ArrayList<Empleado> empleados);
  ArrayList<Empleado> leerNomina();
}
