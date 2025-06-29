package com.spring.app1.springboot_aplications.controlers;

import org.springframework.web.bind.annotation.RestController;

import com.spring.app1.springboot_aplications.models.Empleados;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





@RestController
@RequestMapping("/api/variable")
public class PathVariableController {   
    @Value("${config.usuario}")
    private String usuario ;
    @Value("${config.codigo}")
    private int codigo ;
    @Value("${config.mensaje}")
    private String mensaje;
    @Value("${config.valores}")
    private String[] valores; 
     
    @GetMapping("/pagina1/{informacion}")
    public ParametroDTO pagina1(@PathVariable String informacion) {
        ParametroDTO parametro = new ParametroDTO();
        parametro.setInformacion(informacion);
        return parametro;
    }
    
    @PostMapping("/solicutud")
    public Empleados creaEmple(@RequestBody Empleados empleado1) {
        
        return empleado1;
    }
    
    @GetMapping("/valores")
    public Map<String, Object> valores() {
        return Map.of(
            "usuario", usuario,
            "codigo", codigo,
            "mensaje", mensaje,
            "valores", valores
        );
    }

}
