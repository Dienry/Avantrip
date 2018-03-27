package com.avantrip.Scoring;

import org.springframework.stereotype.Component;

import java.util.Date;

@Component("compararFechaPasaje")
public class CompararFechaPasaje {

    public Integer fechaPasaje(Date fecha){
        final long MILLIS_PER_DAY = 24 * 60 * 60 * 1000L;
        if(Math.abs(fecha.getTime() - new Date().getTime()) > MILLIS_PER_DAY) {
            return 30;
        }
        return 0;
    }
}
