package com.avantrip.service;

import com.avantrip.model.Persona;

import java.util.Date;
import java.util.List;

public interface CompraPasajeServiceImpl {
    Integer getScoringCompra(String numeroTarjeta, String pais, Date fechaPasaje, List<Persona> pasajeros, Persona apellidoTarjeta, Float importe);

    boolean compraFraudulenta(List<Persona> pasajeros,
                                            Persona titularTarjeta, String numeroTarjeta,
                                            String pais, Date fechaPasaje, Float importe);
}
