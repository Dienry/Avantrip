package com.avantrip.model;

import org.springframework.beans.factory.annotation.Autowired;
import com.avantrip.service.CompraPasajeService;

public class RespuestaCompraPasaje {
    private Integer scoring;
    private boolean fraudulento;
    private Pasaje pasaje;

    @Autowired
    CompraPasajeService cps;

    public RespuestaCompraPasaje(Integer scoring, boolean fraudulento) {
        this.scoring = scoring;
        this.fraudulento = fraudulento;
    }

    public RespuestaCompraPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }

    public RespuestaCompraPasaje getScoring() {
        Integer scoring = cps.getScoringCompra(pasaje.getNumeroTarjeta(), pasaje.getDestino().getPais(), pasaje.getDestino().getFechaIda(),
                pasaje.getPasajeroList(), pasaje.getTitularTarjeta(), pasaje.getImporteCompra());
        boolean fraudulento = cps.compraFraudulenta(pasaje.getPasajeroList(),
                pasaje.getTitularTarjeta(), pasaje.getNumeroTarjeta(),
                pasaje.getDestino().getPais(), pasaje.getDestino().getFechaIda(), pasaje.getImporteCompra());
        return new RespuestaCompraPasaje(scoring, fraudulento);
    }

    public void setScoring(Integer scoring) {
        this.scoring = scoring;
    }

    public boolean isFraudulento() {
        return fraudulento;
    }

    public void setFraudulento(boolean fraudulento) {
        this.fraudulento = fraudulento;
    }

    public Pasaje getPasaje() {
        return pasaje;
    }

    public void setPasaje(Pasaje pasaje) {
        this.pasaje = pasaje;
    }
}
