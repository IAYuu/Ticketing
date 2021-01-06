package com.utils.database;


public class Test {
    public static void main(String[] args) throws Exception {

    DataBase st = new Station();
    SqlCmd sc = new SqlCmd(CMDTYPE.INSERT, "stations");
    sc.setProperty("id", "4");
    sc.setProperty("start", "'a'");
    sc.setProperty("reach", "'b'");
    sc.setProperty("price", "20");
    sc.setProperty("start_time", "'12:30'");
    sc.setProperty("reach_time", "'11:30'");
    st.execute(sc);
    
    }
}