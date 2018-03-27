package com.avantrip.model;

import java.util.Date;

public class Persona {
    private String nombre;
    private String apellido;
    private Date fechaNaciemiento;
    private String dni;
    private String residencia;

    public Persona(String nombre, String apellido, Date fechaNaciemiento, String dni, String residencia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNaciemiento = fechaNaciemiento;
        this.dni = dni;
        this.residencia = residencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaNaciemiento() {
        return fechaNaciemiento;
    }

    public void setFechaNaciemiento(Date fechaNaciemiento) {
        this.fechaNaciemiento = fechaNaciemiento;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }
}
