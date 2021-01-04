package org.utils;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private static final String URL = "jdbc:mysql://localhost:3306/ticketing";
    private static final String USER = "root";
    private static final String PASSWORD = "123";

    public static void main(String args[]) throws SQLException {
        Connection conn = DriverManager.getConnection(URL,USER,PASSWORD);
        //TODO
        conn.close();
    }
}
