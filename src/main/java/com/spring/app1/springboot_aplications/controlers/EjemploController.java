package com.spring.app1.springboot_aplications.controlers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.spring.app1.springboot_aplications.models.Empleados;

// Controller para manejar las peticiones HTTP y devolver vistas
// En este caso, se utiliza Thymeleaf como motor de plantillas para renderizar las vistas
@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
  
    public String info(Model model) {

        Empleados empleado = new Empleados( "Juan", "Pérez", null, "Desarrollador", 30, 123456789, 1);

        model.addAttribute("titulo", "Servidor Spring Boot");
        model.addAttribute("Empleado", empleado);

        return "detalles_info";
    }

    @ModelAttribute("Empleados")
    public List<Empleados> getEmpleados() {
        return Arrays.asList(
            new Empleados("Juan", "Pérez", "Calle Falsa 123", "Desarrollador", 30, 123456789, 1),
            new Empleados("Ana", "Gómez", "Avenida Siempre Viva 456", "Diseñadora", 28, 987654321, 2),
            new Empleados("Luis", "Martínez", "Calle Real 789", "Gerente", 35, 456789123, 3)
        );

    }
}
