<?php

error_reporting(E_ALL);

define("THRIFT_ROOT", "D:/Program/thrift/lib/php/lib/");
define("ROOT", "D:/Program/vscode/Java/ticketing/src/main/java/com/web/php");
require THRIFT_ROOT . "Thrift/ClassLoader/ThriftClassLoader.php";
require_once "vendor/autoload.php";
require_once "vendor/mustangostang/spyc/Spyc.php";

include "thrift/TickSrvIf.php";
include "thrift/TickSrvClient.php";
include "thrift/TickSrv_login_args.php";
include "thrift/TickSrv_login_result.php";
include "thrift/TickSrv_search_args.php";
include "thrift/TickSrv_search_result.php";
include "thrift/SearchReq.php";
include "thrift/Departure.php";

use Thrift\ClassLoader\ThriftClassLoader;

$loader = new ThriftClassLoader();
$loader->registerNamespace('Thrift', THRIFT_ROOT);
$loader->registerDefinition('TickSrv', ROOT . 'thrift');
$loader->register();

use Thrift\Protocol\TBinaryProtocol;
use Thrift\protocol\TMultiplexedProtocol;
use Thrift\Transport\TSocket;
use Thrift\Transport\TBufferedTransport;

try {
    //FIXME:yml
        // $config = spyc_load_file('srv.yml.lnk');
        // var_dump($config);
        $sock = new TSocket('localhost',333, true);
        $transport = new TBufferedTransport($sock);
        $proto = new TBinaryProtocol($transport);
        $proto = new TMultiplexedProtocol($proto, "TickSrv");
        $client = new TickSrvClient($proto);
        $transport->open();

        $var = array("start"=>$_POST["start"], "reach"=>$_POST["reach"]); 
        $searchReq = new SearchReq($var);
        // echo $_POST["start"]. "......".$_POST["reach"];
        // echo $searchReq->reach;
        $recv = json_encode($client->search($searchReq));
        echo $recv;
        // echo 'I am ready';
} catch (Exception $ex) {
    print 'I am not ready ' . $ex->getMessage() . '\n';
}
