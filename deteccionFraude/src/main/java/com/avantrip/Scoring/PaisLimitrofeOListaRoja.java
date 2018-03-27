package com.avantrip.Scoring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("paisLimitrofeOListaRoja")
public class PaisLimitrofeOListaRoja {

    public Integer paisLimitrofeOListaroja(String pais){
        List<String> paisesLimitrofesOListaRoja = new ArrayList<String>();
        paisesLimitrofesOListaRoja.add("Uruguay");
        paisesLimitrofesOListaRoja.add("Brasil");
        paisesLimitrofesOListaRoja.add("Paraguay");
        paisesLimitrofesOListaRoja.add("Bolivia");
        paisesLimitrofesOListaRoja.add("Chile");
        paisesLimitrofesOListaRoja.add("Venezuela");
        if(paisesLimitrofesOListaRoja.contains(pais)){
            return 40;
        }
        return 0;
    }

}
