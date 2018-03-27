package com.avantrip.model;

import java.util.Date;
import java.util.List;

public class Pasaje {
    private String usuarioComprador;
    private Date fechaCompra;
    private List<Persona> pasajeroList;
    private Persona titularTarjeta;
    private String numeroTarjeta;
    private Persona personaFactura;
    private Destino destino;
    private Float importeCompra;

    public Pasaje(String usuarioComprador, Date fechaCompra, List<Persona> pasajeroList, Persona titularTarjeta, String numeroTarjeta, Persona personaFactura, Destino destino, Float importeCompra) {
        this.usuarioComprador = usuarioComprador;
        this.fechaCompra = fechaCompra;
        this.pasajeroList = pasajeroList;
        this.titularTarjeta = titularTarjeta;
        this.numeroTarjeta = numeroTarjeta;
        this.personaFactura = personaFactura;
        this.destino = destino;
        this.importeCompra = importeCompra;
    }

    public String getUsuarioComprador() {
        return usuarioComprador;
    }

    public void setUsuarioComprador(String usuarioComprador) {
        this.usuarioComprador = usuarioComprador;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public List<Persona> getPasajeroList() {
        return pasajeroList;
    }

    public void setPasajeroList(List<Persona> pasajeroList) {
        this.pasajeroList = pasajeroList;
    }

    public Persona getTitularTarjeta() {
        return titularTarjeta;
    }

    public void setTitularTarjeta(Persona titularTarjeta) {
        this.titularTarjeta = titularTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Persona getPersonaFactura() {
        return personaFactura;
    }

    public void setPersonaFactura(Persona personaFactura) {
        this.personaFactura = personaFactura;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Float getImporteCompra() {
        return importeCompra;
    }

    public void setImporteCompra(Float importeCompra) {
        this.importeCompra = importeCompra;
    }
}
