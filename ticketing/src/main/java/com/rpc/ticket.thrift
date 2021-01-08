namespace java com.jelly.thrift.ticketing

struct Departure {
    1: string start;
    2: string reach;
    3: double price;
    4: string start_time;
    5: string reach_time;
}

struct SearchReq {
    1: string start;
    2: string reach;
}

service TickSrv {
    bool login(1: string username, 2: string password);
    list<Departure> search(1: SearchReq req); 
}