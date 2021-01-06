package com.utils.database;

public class User extends DataBase {
    private String name = "User";

    public User() {}
    @Override
    protected String getClassName() {
        return this.name;
    }
}
