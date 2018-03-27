package com.avantrip.Scoring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("compararMontoCompra")
public class CompararMontoCompra {

    private static int montoMaximoSinRiesgo;

    public Integer compraSuperaMonto(Float importe){
        if(importe > montoMaximoSinRiesgo){
            return 15;
        }
        return 0;
    }

    @Value("${app.montoMaximoSinRiesgo}")
    public void setMontoMaximoSinRiesgo(int montoMaximoSinRiesgo){
        CompararMontoCompra.montoMaximoSinRiesgo = montoMaximoSinRiesgo;}
}
