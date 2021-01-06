package com.utils.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public abstract class DataBase {
    private static final String URL = "jdbc:mysql://localhost:3306/ticketing";
    private static final String USER = "root";
    private static final String PASSWORD = "123";
    protected String name = "";

    public DataBase() {
    }

    protected String getClassName() {
        return name;
    }

    public Boolean execute(SqlCmd sc) {
        try {
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                // test
                String sql = sc.toString();
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    int n = ps.executeUpdate();
                    System.out.println("insert:" + n);
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
            return false;
        }
        return true;
    }

}
