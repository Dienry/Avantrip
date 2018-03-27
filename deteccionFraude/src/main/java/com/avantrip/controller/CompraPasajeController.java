package com.avantrip.controller;

import com.avantrip.model.Pasaje;
import com.avantrip.model.RespuestaCompraPasaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.avantrip.service.CompraPasajeService;

@RestController
@RequestMapping("/compra")
public class CompraPasajeController {

    @Autowired
    CompraPasajeService cp;

    @RequestMapping("/test/")
    public String test(){
        return "Hello World";
    }

    @ResponseBody
    public RespuestaCompraPasaje getScoring(@RequestBody Pasaje pasaje){

        RespuestaCompraPasaje rcp = new RespuestaCompraPasaje(pasaje);
        return rcp.getScoring();
    }

}
