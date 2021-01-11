<?php

// namespace Services\TickSrv;

// if (isset($_GET["start"]))
//     echo $_GET["start"];
// if (isset($_GET["reach"]))
//     echo $_GET["reach"];

error_reporting(E_ALL);

define("THRIFT_ROOT", "D:/Program/thrift/lib/php/lib/");
define("ROOT", "D:/Program/vscode/Java/ticketing/src/main/java/com/web/php");
require THRIFT_ROOT . "ClassLoader/ThriftClassLoader.php";
require THRIFT_ROOT . "Protocol/TProtocol.php";
require THRIFT_ROOT . "Transport/TTransport.php";
require THRIFT_ROOT . "Transport/TBufferedTransport.php";
require THRIFT_ROOT . "Protocol/TBinaryProtocol.php";
require THRIFT_ROOT . "Transport/TSocket.php";
require THRIFT_ROOT . "Exception/TException.php";
require THRIFT_ROOT . "Exception/TTransportException.php";
require THRIFT_ROOT . "Type/TType.php";
require THRIFT_ROOT . "StringFunc/TStringFunc.php";
require THRIFT_ROOT . "Factory\TStringFuncFactory.php";
require THRIFT_ROOT . "Type/TMessageType.php";
require THRIFT_ROOT . "StringFunc/Core.php";

include "thrift/TickSrvIf.php";
include "thrift/TickSrvClient.php";
include "thrift/TickSrv_login_args.php";

use Thrift\ClassLoader\ThriftClassLoader;
use Thrift\Protocol\TBinaryProtocol;
use Thrift\Transport\TSocket;
use Thrift\Transport\TBufferedTransport;
use Thrift\Exception\TException;
use Thrift\Type\TType;

$loader = new ThriftClassLoader();
$loader->registerNamespace('Thrift', THRIFT_ROOT);
$loader->registerDefinition('Service', ROOT . 'thrift');
$loader->register();

try {
    $sock = new TSocket('localhost', 333);
    $transport = new TBufferedTransport($sock);
    $proto = new TBinaryProtocol($transport);
    $client = new TickSrvClient($proto);
    $transport->open();
    $recv = $client->login("abc", "abc");
} catch (Exception $ex) {
    print 'I am not ready ' . $ex->getMessage() . '\n';
}

?>

<!-- post: <?php echo var_dump($_POST) ?>
get: <?php echo var_dump($_GET) ?> -->