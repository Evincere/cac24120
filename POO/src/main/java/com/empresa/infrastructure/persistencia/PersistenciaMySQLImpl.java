package com.empresa.infrastructure.persistencia;

import com.empresa.models.clasespadre.Empleado;
import java.sql.Connection;
import java.util.ArrayList;

public class PersistenciaMySQLImpl implements IPersistencia {

  @Override
  public void guardarEmpleados(ArrayList<Empleado> empleados) {
    String insertSQL = "INSERT INTO empleados (nombre, edad, salario, tipo) VALUES (?, ?, ?, ?)";
    Connection conn = DatabaseConnection.getConnection();
  }

  @Override
  public ArrayList<Empleado> leerNomina() {
    return null;
  }
}
