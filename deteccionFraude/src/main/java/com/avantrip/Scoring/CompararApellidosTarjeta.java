package com.avantrip.Scoring;

import com.avantrip.model.Persona;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("compararApellidosTarjeta")
public class CompararApellidosTarjeta {

    public Integer compararApellidoTarjetaConPasajeros(List<Persona> personas, String apellidoPasajero){
        List<String> apellido = new ArrayList<String>();
        for (Persona persona: personas) {
            apellido.add(persona.getApellido());
        }
        if (apellido.contains(apellidoPasajero)){
            return 20;
        }
        return 0;
    }
}
