package com.umg.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MariaDBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/colegio";
    private static final String USER = "root";
    private static final String PASSWORD = "Joder26.";

    private Connection connection;

    public MariaDBConnection() {
        try {
            
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos.");
        } catch (SQLException e) {
            System.err.println("Error al conectar a la base de datos: " + e.getMessage());
        }
    }


    public Connection getConnection() {
        return connection;
    }

   
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexión cerrada.");
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
       
        MariaDBConnection dbConnection = new MariaDBConnection();

        Connection conn = dbConnection.getConnection();

       

      
        dbConnection.closeConnection();
    }
}
