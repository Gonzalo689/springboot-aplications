package com.spring.app1.springboot_aplications.controlers.errors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/division")
public class Operaciones {
    @GetMapping
    public String Divide() {
        
        return "El resultado de la division es: " + 2/ 0; // Esto generará una excepción de división por cero
    }
    
}
