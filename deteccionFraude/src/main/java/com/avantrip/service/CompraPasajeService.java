package com.avantrip.service;

import com.avantrip.Scoring.*;
import com.avantrip.model.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import java.util.Date;
import java.util.List;

@Component
@Service
public class CompraPasajeService implements CompraPasajeServiceImpl{

    private static int minScoringFraudulento;

    @Autowired
    private TarjetaEnBlackList tarjetaEnBlackList;
    private PaisLimitrofeOListaRoja paisLimitrofeOListaRoja;
    private CompararFechaPasaje compararFechaPasaje;
    private CompararApellidos compararApellidos;
    private CompararApellidosTarjeta compararApellidosTarjeta;
    private CompararMontoCompra compararMontoCompra;


    public Integer getScoringCompra(String numeroTarjeta, String pais, Date fechaPasaje, List<Persona> pasajeros, Persona apellidoTarjeta, Float importe) {
        Integer scoring = 0;
        scoring += tarjetaEnBlackList.tarjetaEnBlackList(numeroTarjeta);
        scoring += paisLimitrofeOListaRoja.paisLimitrofeOListaroja(pais);
        scoring += compararFechaPasaje.fechaPasaje(fechaPasaje);
        scoring += compararApellidos.compararApellidosPasajeros(pasajeros);
        scoring += compararApellidosTarjeta.compararApellidoTarjetaConPasajeros(pasajeros, apellidoTarjeta.getApellido());
        scoring += compararMontoCompra.compraSuperaMonto(importe);
        
        return scoring;
    }

    public boolean compraFraudulenta(List<Persona> pasajeros,
                                     Persona titularTarjeta, String numeroTarjeta,
                                     String pais, Date fechaPasaje, Float importe) {
        if (this.getScoringCompra(numeroTarjeta, pais, fechaPasaje, pasajeros, titularTarjeta, importe) < minScoringFraudulento){
            return false;
        } else {
            return true;
        }
    }

    @Value("${app.minScoringFraudulento}")
    public void setMinScoringFraudulento(int minScoringFraudulento){CompraPasajeService.minScoringFraudulento = minScoringFraudulento;}

}
