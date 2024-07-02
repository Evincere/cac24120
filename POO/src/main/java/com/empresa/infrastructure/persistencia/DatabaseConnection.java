package com.empresa.infrastructure.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/empresa";
    private static final String USER = "root";
    private static final String PASSWORD = "root";


    public static Connection getConnection() {
        try {
            System.out.println("Conexion con base de datos establecida ...");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            System.out.println("No se ha podido establecer la comunicacion con la BD " + URL);
        }
        return null;
    }

}
