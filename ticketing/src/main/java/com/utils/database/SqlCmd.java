package com.utils.database;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map.Entry;

enum CMDTYPE {
    INSERT, DELETE, UPDATE, SEARCH, NONE
};

public class SqlCmd {
    private Hashtable<String, String> hash;
    private String tableName;
    public CMDTYPE type = CMDTYPE.NONE;
    private ArrayList<String> pros;
    private ArrayList<String> vals;

    public SqlCmd(CMDTYPE type, String tableName) {
        this.type = type;
        this.tableName = tableName;
        hash = new Hashtable<>();
        pros = new ArrayList<>();
        vals = new ArrayList<>();
    }

    public String toString() {
        switch (this.type) {
            case INSERT:
                return toInsertString();
            case DELETE:
                return toDeleteString();
            case SEARCH:
                return toSearchString();
            case UPDATE:
                return toUpdateString();
            default:
                // return "insert into stations (id, start, reach, price, reach_time, start_time) values (2, '湖南', '火星', 12345, '00:11:22', '44:55:22')";
            assert(false);
        }
        return " ";
    }

    public boolean setProperty(String k, String v) {
        try {
            hash.put(k, v);
        } catch (Exception e) {
            // TODO: handle exception
            System.err.println(e);
            return false;
        }
        return true;
    }

    private void addProsAndVals() {
        hash.forEach((k, v) -> {
            pros.add(k);
            vals.add(v);
        });
    }

    // insert into ? (?,..) values (?,..)
    private String toInsertString() {
        addProsAndVals();
        return String.format("insert into %s (%s) values (%s)", tableName, String.join(",", pros),
                String.join(",", vals));
    }

    // delete from ? where id = ?
    private String toDeleteString() {
        addProsAndVals();
        // complete idmatch
        // TODO
        return String.format("delete from %s where id = %s;", tableName, "idmatch");
    }

    // search ?.. from ?
    private String toSearchString() {
        addProsAndVals();
        return String.format("search (%s) from %s", String.join(",", pros), tableName);
    }

    // update ? set ? = ? where ? = ?
    private String toUpdateString() {
        addProsAndVals();
        // complete idmatch
        // FIXME
        return String.format("update %s set %s = %s where ? = ?;", tableName, String.join(",", pros),
                String.join(",", vals), "idmatch");
    }
}