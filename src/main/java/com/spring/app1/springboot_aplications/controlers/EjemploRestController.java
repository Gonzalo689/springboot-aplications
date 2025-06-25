package com.spring.app1.springboot_aplications.controlers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app1.springboot_aplications.models.dto.ClassDTO;


// Controlador REST para manejar las peticiones HTTP y devolver respuestas en formato JSON o texto plano o xml
@RestController 
@RequestMapping("/api") 
public class EjemploRestController {

    // @GetMapping("/detalles_info_rest")
    @GetMapping(path = "/detalles_info_rest")

    
    public ClassDTO detalles_info_rest() {
        // Empleados empleado = new Empleados( "Juan", "Pérez", "Calle Falsa 123", "Desarrollador", 30, 123456789, 1);

        // Map<String, Object> respuesta = new HashMap<>();

        // respuesta.put("Empleado",  empleado);
        
        ClassDTO usuario = new ClassDTO();
        usuario.setTitulo("Servidor Spring Boot");
        usuario.setUsuario("Juan Pérez");

        
        return usuario;
    }
    
}
