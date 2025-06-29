package com.spring.app1.springboot_aplications.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api/parametros")
public class RequestParamController {

    @GetMapping("/detalle")
    public ParametroDTO detalle(@RequestParam(required = false, defaultValue = "informacion") String informacion) {
        ParametroDTO parametro = new ParametroDTO();
        parametro.setInformacion(informacion);
        return parametro ;
    }
    

}
