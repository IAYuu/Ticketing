<?php

class ServiceImpl  implements TickSrvIf
{
    public function login($username, $password) 
    {
        return false;
    }

    public function search(\SearchReq $req)
    {
        $depArray = array();
        
        foreach ($depArray as $val) 
        echo $val;
        
        return null;

    }
    
}
