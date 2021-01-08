package com.rpc;

import java.io.IOException;
import java.net.ServerSocket;

import com.jelly.thrift.ticketing.TickSrv;
import com.utils.database.Config;

import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TSimpleServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

public class Server {
    public static void main(String[] args) throws IOException, TTransportException {
        try {
            TickSrv.Processor<TickSrv.Iface> tprocessor = new TickSrv.Processor<TickSrv.Iface>(new ServiceImpl());
            int host = (Integer)(new Config().getProp("server", "SERVER_IP"));
            ServerSocket socket = new ServerSocket(host);
            TServerSocket serverTransport = new TServerSocket(socket);
            TServer.Args tArgs = new TServer.Args(serverTransport);
            tArgs.processor(tprocessor);
            tArgs.protocolFactory(new TCompactProtocol.Factory());
            TServer server = new TSimpleServer(tArgs);
            System.out.println("Running server...");
            server.serve();
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println(e);
        }
    }
    
}
