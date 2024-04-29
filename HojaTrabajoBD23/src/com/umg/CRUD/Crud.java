package com.umg.CRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Crud {
    private Connection connection;

    public Crud(Connection connection) {
        this.connection = connection;
    }

    public boolean insertarEstudiantes() {
        String sql = "INSERT INTO estudiantes (primernombre, segundonombre, otronombre, primerapellido, segundoapellido, otroapellido, genero, fecha_nacimiento, telefono, dpi, colegiatura, usuario_creacion) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            
            pstmt.setString(1, "Juan");
            pstmt.setString(2, "Carlos");
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Perez");
            pstmt.setString(5, "Gomez");
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1990-05-15");
            pstmt.setString(9, "123456789");
            pstmt.setString(10, "1234567890123");
            pstmt.setDouble(11, 5000.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();

          
            pstmt.setString(1, "Maria");
            pstmt.setString(2, "Isabel");
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Martinez");
            pstmt.setString(5, "Gonzalez");
            pstmt.setNull(6, java.sql.Types.VARCHAR);
            pstmt.setString(7, "Femenino");
            pstmt.setString(8, "1995-09-20");
            pstmt.setString(9, "987654321");
            pstmt.setString(10, "9876543210987");
            pstmt.setDouble(11, 6000.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();

 
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR);
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR);
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR);
            pstmt.setNull(6, java.sql.Types.VARCHAR);
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR);
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR);
            pstmt.setNull(3, java.sql.Types.VARCHAR);
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR);
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR);
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR);
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR);
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR);
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR); 
            pstmt.setNull(6, java.sql.Types.VARCHAR);
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            
            pstmt.setString(1, "Pedro");
            pstmt.setNull(2, java.sql.Types.VARCHAR); 
            pstmt.setNull(3, java.sql.Types.VARCHAR); 
            pstmt.setString(4, "Rodriguez");
            pstmt.setNull(5, java.sql.Types.VARCHAR);
            pstmt.setNull(6, java.sql.Types.VARCHAR); 
            pstmt.setString(7, "Masculino");
            pstmt.setString(8, "1992-03-10");
            pstmt.setString(9, "555555555");
            pstmt.setString(10, "5555555555555");
            pstmt.setDouble(11, 5500.00);
            pstmt.setString(12, "admin");
            pstmt.executeUpdate();
            System.out.println("Estudiantes insertados correctamente.");
            return true; 
        } catch (SQLException e) {
            System.err.println("Error al insertar estudiantes: " + e.getMessage());
            return false; 
        }
    }
}


