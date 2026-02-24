package config;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDB {

    public static Connection conectar() {
        try {
            Class.forName("org.sqlite.JDBC"); // ← REGISTRA EL DRIVER

            String url = "jdbc:sqlite:usuarios.db";
            return DriverManager.getConnection(url);

        } catch (Exception e) {
            System.out.println("Error conexión: " + e.getMessage());
            return null;
        }
    }
}