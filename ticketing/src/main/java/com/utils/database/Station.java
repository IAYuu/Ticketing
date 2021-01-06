package com.utils.database;

public class Station extends DataBase {
    private String name = "Stations";
    
    public Station() {}
    @Override
    protected String getClassName() {
        return this.name;
    }

    
}