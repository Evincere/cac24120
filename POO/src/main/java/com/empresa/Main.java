package com.empresa;

import com.empresa.models.claseshijas.Gerente;
import com.empresa.models.RecursosHumanos;
import com.empresa.models.claseshijas.Desarrollador;
import com.empresa.models.claseshijas.Disenador;
import com.empresa.models.clasespadre.Empleado;
import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        ArrayList<Empleado> empleados = new ArrayList<>();
        Random random = new Random();
        String[] nombres = {"Juan", "Ana", "Carlos", "Maria", "Pedro", "Laura", "Fernando", "Beatriz", "Jorge", "Carmen",
          "Rafael", "Isabel", "Manuel", "María", "José", "Sofía", "Antonio", "Lucía", "Francisco", "Patricia"};

        for (int i = 0; i < 20; i++) {
            String tipoEmpleado = getRandomTipo(random);
            String nombre = nombres[random.nextInt(nombres.length)];
            int edad = random.nextInt(60) + 18; // Edades entre 18 y 78 años
            double salario = random.nextDouble() * 5000 + 1000; // Salarios entre 1000 y 6000
            if (tipoEmpleado.equals("Gerente")) {
                int departamento = random.nextInt(20) + 1;
                Empleado empleado = new Gerente(nombre, edad, salario, departamento);
                empleados.add(empleado);
            } else if (tipoEmpleado.equals("Disenador")) {
                String software = getSoftware(random);
                Empleado empleado = new Disenador(nombre, edad, salario, software);
                empleados.add(empleado);
            } else {
                String lenguaje = getLenguaje(random);
                Empleado empleado = new Desarrollador(nombre, edad, salario, lenguaje);
                empleados.add(empleado);
            }
        }

        RecursosHumanos rrhh = new RecursosHumanos();
        rrhh.guardarEmpleados(empleados);
    }

    private static String getRandomTipo(Random random) {
        String[] tipos = {"Gerente", "Disenador", "Desarrollador"};
        return tipos[random.nextInt(tipos.length)];
    }

    private static String getSoftware(Random random) {
        String[] softwares = {"Photoshop", "Illustrator", "InDesign"};
        return softwares[random.nextInt(softwares.length)];
    }

    private static String getLenguaje(Random random) {
        String[] lenguajes = {"Java", "Python", "JavaScript", "C#", "C++", "Ruby"};
        return lenguajes[random.nextInt(lenguajes.length)];
    }


}
