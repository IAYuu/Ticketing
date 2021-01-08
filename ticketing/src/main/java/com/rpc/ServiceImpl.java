package com.rpc;

import org.apache.thrift.TException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.jelly.thrift.ticketing.*;
import com.rpc.Macro.CMDTYPE;
import com.utils.database.SqlCmd;
import com.utils.database.Station;

public class ServiceImpl implements TickSrv.Iface {

    @Override
    public boolean login(String username, String password) throws TException {
        // TODO Auto-generated method stub

        return false;
    }

    @Override
    public List<Departure> search(SearchReq req) throws TException {
        // TODO Auto-generated method stub
        List<Departure> depList = new ArrayList<>();

        Station st = new Station();
        SqlCmd sc = new SqlCmd(CMDTYPE.QUERY, "stations");
        List<HashMap> mapList = st.queryStaion(sc);

        for (HashMap map : mapList) {
            Departure dep = new Departure();
            dep.setStart(map.get("start").toString());
            dep.setReach(map.get("reach").toString());
            dep.setPrice((float)map.get("price"));
            dep.setStart_time(map.get("start_time").toString());
            dep.setReach_time(map.get("reach_time").toString());
            depList.add(dep);
        }
        return depList;
    }

}
