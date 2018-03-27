package com.avantrip.model;

import java.util.Date;

public class Destino {
    private String pais;
    private String ciudad;
    private boolean idaVuelta;
    private Date fechaIda;
    private Date fechaVuelta;

    public Destino(String pais, String ciudad, boolean idaVuelta, Date fechaIda, Date fechaVuelta) {
        this.pais = pais;
        this.ciudad = ciudad;
        this.idaVuelta = idaVuelta;
        this.fechaIda = fechaIda;
        this.fechaVuelta = fechaVuelta;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public boolean isIdaVuelta() {
        return idaVuelta;
    }

    public void setIdaVuelta(boolean idaVuelta) {
        this.idaVuelta = idaVuelta;
    }

    public Date getFechaIda() {
        return fechaIda;
    }

    public void setFechaIda(Date fechaIda) {
        this.fechaIda = fechaIda;
    }

    public Date getFechaVuelta() {
        return fechaVuelta;
    }

    public void setFechaVuelta(Date fechaVuelta) {
        this.fechaVuelta = fechaVuelta;
    }
}
