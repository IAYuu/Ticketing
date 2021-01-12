package com.rpc;

import java.io.IOException;
import java.net.ServerSocket;
import java.util.logging.Logger;

import com.jelly.thrift.ticketing.TickSrv;
import com.utils.database.Config;

import org.apache.thrift.TMultiplexedProcessor;
import org.apache.thrift.server.TServer;
import org.apache.thrift.server.TThreadPoolServer;
import org.apache.thrift.transport.TServerSocket;
import org.apache.thrift.transport.TTransportException;

public class Server {
    private static Logger logger = Logger.getLogger(Server.class.getName());
    public static void main(String[] args) throws IOException, TTransportException {
        try {
            Config config = new Config();
            int port = (Integer)(config.getProp("server", "SERVER_PORT"));
            TServerSocket serverTransport = new TServerSocket(port);
            TickSrv.Processor tickProcessor = new TickSrv.Processor(new ServiceImpl());
            TMultiplexedProcessor processor = new TMultiplexedProcessor();
            processor.registerProcessor("TickSrv", tickProcessor);
            TServer server = new TThreadPoolServer(new TThreadPoolServer.Args(
                serverTransport).processor(processor));
            System.out.println("running server");
            server.serve();

        //     TickSrv.Processor<TickSrv.Iface> tprocessor = new TickSrv.Processor<TickSrv.Iface>(new ServiceImpl());
        //     Config config = new Config();
        //     int port = (Integer)(config.getProp("server", "SERVER_PORT"));
        //     logger.info("----------" + port);
        //     ServerSocket socket = new ServerSocket(port);
        //     TServerSocket serverTransport = new TServerSocket(socket);
        //     TServer.Args tArgs = new TServer.Args(serverTransport);
        //     tArgs.processor(tprocessor);
        //     tArgs.protocolFactory(new TCompactProtocol.Factory());
        //     TServer server = new TSimpleServer(tArgs);
        //     System.out.println("Running server...");
        //     server.serve();
        } catch (Exception e) {
            //TODO: handle exception
            System.err.println(e);
        }
    }
    
}
