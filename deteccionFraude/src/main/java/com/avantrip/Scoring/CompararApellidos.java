package com.avantrip.Scoring;

import com.avantrip.model.Persona;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("compararApellidos")
public class CompararApellidos {

    public Integer compararApellidosPasajeros(List<Persona> personas){
        String apellido = "";
        for (int i = 0; i < personas.size(); i++){
            if (i == 0){
                apellido = personas.get(i).getApellido();
            } else {
                if (apellido != personas.get(i).getApellido()){
                    return 25;
                }
            }
        }
        return 0;
    }
}
