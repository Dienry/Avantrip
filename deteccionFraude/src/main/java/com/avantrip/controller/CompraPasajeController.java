package com.avantrip.controller;

import com.avantrip.model.Pasaje;
import com.avantrip.model.RespuestaCompraPasaje;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/compra")
public class CompraPasajeController {

    @ResponseBody
    public RespuestaCompraPasaje getScoring(@RequestBody Pasaje pasaje){

        RespuestaCompraPasaje rcp = new RespuestaCompraPasaje(pasaje);
        return rcp.getScoring();
    }

}
