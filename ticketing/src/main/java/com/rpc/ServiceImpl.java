package com.rpc;

import org.apache.thrift.TException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Logger;

import com.jelly.thrift.ticketing.*;
import com.rpc.Macro.CMDTYPE;
import com.utils.database.SqlCmd;
import com.utils.database.Station;

public class ServiceImpl implements TickSrv.Iface {

    private static Logger logger = Logger.getLogger(Server.class.getName());

    @Override
    public boolean login(String username, String password) throws TException {
        // TODO Auto-generated method stub

        return false;
    }

    @Override
    public List<Departure> search(SearchReq req) throws TException {
        List<Departure> depList = new ArrayList<>();
        Station st = new Station();
        /**
         * set sqlcommand FIXME:
         */
        SqlCmd sc = new SqlCmd(CMDTYPE.QUERY, "stations");
        sc.setProperty("start", req.getStart());
        sc.setProperty("reach", req.getReach());
        logger.info("start: " + req.getStart() + "...reach: " + req.getReach());

        /**
         * get result
         */
        List<HashMap> mapList = st.queryStaion(sc);
        assert (mapList != null);
        logger.info("maplist--------------" + mapList);
        // assert (false);
        for (HashMap map : mapList) {
            Departure dep = new Departure();
            dep.setStart(map.get("start").toString());
            dep.setReach(map.get("reach").toString());
            dep.setPrice((double) map.get("price"));
            dep.setStart_time(map.get("start_time").toString());
            dep.setReach_time(map.get("reach_time").toString());
            depList.add(dep);
        }
        return depList;
    }

}
