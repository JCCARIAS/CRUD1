package com.umg.TestDao;

import com.umg.CRUD.Crud;
import com.umg.connection.MariaDBConnection;

import java.sql.Connection;

public class TestDao {
    public static void main(String[] args) {
 
        MariaDBConnection mysqlConnection = new MariaDBConnection();
        Connection connection = mysqlConnection.getConnection();

        Crud crud = new Crud(connection);

        if (crud.insertarEstudiantes()) {
            System.out.println("La información se guardó correctamente.");
        } else {
            System.out.println("Hubo un error al guardar la información.");
        }

        mysqlConnection.closeConnection();
    }
}
