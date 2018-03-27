package com.avantrip.Scoring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("tarjetaEnBlackList")
public class TarjetaEnBlackList {

    public Integer tarjetaEnBlackList(String numeroTarjeta){
        List<String> blackList = new ArrayList<String>();
        blackList.add("0000000000000000");
        blackList.add("1111111111111111");
        blackList.add("2222222222222222");
        if(blackList.contains(numeroTarjeta)){
            return 100;
        }
        return 0;
    }

}
