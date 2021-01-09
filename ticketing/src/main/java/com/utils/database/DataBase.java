package com.utils.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

public abstract class DataBase {

    private static String URL;
    private static String USER;
    private static String PASSWORD;
    protected String name = "";
    private Logger logger = null;

    public DataBase() {
        logger = Logger.getLogger(DataBase.class.getName());
        Config config = new Config();
        URL = (String)config.getProp("database", "URL");
        USER = (String)config.getProp("database", "USER");
        PASSWORD = (String)config.getProp("database", "PASSWORD");
    }

    protected String getClassName() {
        return name;
    }

    public ArrayList<HashMap> query(SqlCmd sc) {
        logger.info("execute query: " + sc.toString());
        return executeQuery(sc);
    }

    public boolean insert(SqlCmd sc) {
        executeUpdate(sc);
        return false;
    }

    public boolean delete(SqlCmd sc) {
        executeUpdate(sc);
        return false;
    }

    public boolean update(SqlCmd sc) {
        executeUpdate(sc);
        return false;
    }

    private void executeUpdate(SqlCmd sc) {
        try {
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                // test
                String sql = sc.toString();
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    ps.executeUpdate();
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

    private ArrayList<HashMap> executeQuery(SqlCmd sc) {
        ArrayList<HashMap> list = null;
        try {
            try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
                // test
                String sql = sc.toString();
                logger.info(String.format("sql cmd: %s", sql));
                try (PreparedStatement ps = conn.prepareStatement(sql)) {
                    try (ResultSet rs = ps.executeQuery()) {
                        ResultSetMetaData md = rs.getMetaData();
                        int columnCount = md.getColumnCount();
                        list = new ArrayList<>();
                        while (rs.next()) {
                            HashMap rowData = new HashMap();
                            for (int i = 1; i <= columnCount; ++i)
                                rowData.put(md.getColumnName(i), rs.getObject(i));
                            list.add(rowData);

                        }
                    }
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println("executeQueryError: " + e);
        }
        return list;
    }
}
