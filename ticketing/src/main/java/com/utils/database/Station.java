package com.utils.database;

import java.util.ArrayList;
import java.util.HashMap;

public class Station extends DataBase {

    private String name = "Stations";

    public Station() {
    }

    @Override
    protected String getClassName() {
        return this.name;
    }

    public ArrayList<HashMap> queryStaion(SqlCmd sc) {
        return super.query(sc);
    }
}
