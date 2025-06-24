package com.spring.app1.springboot_aplications.controlers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Controlador REST para manejar las peticiones HTTP y devolver respuestas en formato JSON o texto plano o xml
@RestController 
public class EjemploRestController {

    @GetMapping("/detalles_info_rest")
  
    public Map<String, Object> detalles_info_rest() {
        Map<String, Object> respuesta = new HashMap<>();

        respuesta.put("titulo", "Servidor Spring Boot");
        respuesta.put("servidor", "informaticonfig");
        respuesta.put("version", "1.0.0");
        respuesta.put("autor", "Gonzalo Contreras");


        return respuesta;
    }
    
}
