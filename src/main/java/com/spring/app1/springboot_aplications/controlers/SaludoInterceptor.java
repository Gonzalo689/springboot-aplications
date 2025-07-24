package com.spring.app1.springboot_aplications.controlers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class SaludoInterceptor {
    @RequestMapping("/saludo")
    public String saludar() throws InterruptedException {
        Thread.sleep(1000); // Simula un retraso de 1 segundo
        return "¡Hola, mundo!";
    }   

}
