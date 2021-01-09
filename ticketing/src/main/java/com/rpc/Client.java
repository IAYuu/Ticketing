package com.rpc;

import java.util.logging.Logger;

import com.jelly.thrift.ticketing.Departure;
import com.jelly.thrift.ticketing.SearchReq;
import com.jelly.thrift.ticketing.TickSrv;
import com.utils.database.Config;

import org.apache.thrift.TException;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

public class Client {
    private static String SERVER_IP;
    private static int SERVER_PORT;
    private static int TIMEOUT;
    private static Logger logger = Logger.getLogger(Client.class.getName());

    public Client() {
        Config config = new Config();
        SERVER_IP = (String)config.getProp("server", "SERVER_IP");
        SERVER_PORT = (Integer) config.getProp("server","SERVER_PORT");
        TIMEOUT = (Integer)config.getProp("server", "TIMEOUT");
        logger.info(String.format("ooooooo%sooooo%sooooo%s", SERVER_IP,SERVER_PORT,TIMEOUT));
    }

    public static void main(String[] args) throws TException {
        new Client();
        TTransport transport = null;
        transport = new TSocket(SERVER_IP, SERVER_PORT, TIMEOUT);
        TProtocol protocol = new TCompactProtocol(transport);
        TickSrv.Client client = new TickSrv.Client(protocol);
        transport.open();
        SearchReq sr = new SearchReq().setStart("a").setReach("b");
        logger.info(String.format("sr: %s", sr));
        for (Departure depart : client.search(sr)) {
            System.out.println(depart.toString());
        }
        transport.close();
    }
}
