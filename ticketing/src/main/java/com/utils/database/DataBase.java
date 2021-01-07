package com.utils.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.PreparedStatement;

public abstract class DataBase<T> {
    private static final String URL = "jdbc:mysql://localhost:3306/ticketing";
    private static final String USER = "root";
    private static final String PASSWORD = "123";
    protected String name = "";

    // JDBC查询
    public void retrive() throws Exception {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            try (PreparedStatement ps = conn.prepareStatement("select * from " + name)) {
                try (ResultSet rs = ps.executeQuery()) {
                    // test/
                    while (rs.next()) {
                        String start = rs.getString(1);
                        String end = rs.getString(2);
                        int distance = rs.getInt(3);
                        System.out.println(start + "->" + end + "\t" + distance);
                    }
                }
            }
        }
    }

    // JDBC插入
    public void insert(T[] args) throws Exception {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // test
            try (PreparedStatement ps = conn
                    .prepareStatement("insert into " + name + " (start, end, distance) values(?,?,?);")) {
                for (int i = 1; i <= args.length; ++i)
                    ps.setObject(i, args[i]);
                int n = ps.executeUpdate();
                System.out.println("insert:" + n);
            }
        }
    }

    // JDBC更新
    public void update(T[] args) throws Exception {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // test
            try (PreparedStatement ps = conn.prepareStatement("update" + name + " set ? where ? = ? ")) {
                for (int i = 1; i <= args.length; ++i)
                    ps.setObject(i, args[i]);
                int n = ps.executeUpdate();
                System.out.println("update:" + n);
            }

        }
    }

    // JDBC删除
    public void delete(T[] args) throws Exception {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            // test
            try (PreparedStatement ps = conn.prepareStatement("delete from" + name + " where ? = ?")) {
                for (int i = 1; i <= args.length; ++i)
                    ps.setObject(i, args[i]);
                int n = ps.executeUpdate();
                System.out.println("delete:" + n);
            }

        }
    }

    public static void main(String args[]) throws Exception {
        // TODO:
        // DataBase db = new DataBase();
    }
}
