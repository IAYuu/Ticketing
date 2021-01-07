namespace java com.jelly.thrift.ticketing

service TickSrv {
    bool login(string username, string password);
}