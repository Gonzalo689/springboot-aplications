package com.spring.app1.springboot_aplications.controlers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.app1.springboot_aplications.services.FileContent;

@RestController
@RequestMapping("/archivo")
public class FileController {

    private final FileContent contenido ;

    public FileController(FileContent contenido) { 
        this.contenido = contenido;
    }

    @GetMapping("/read")
    public ResponseEntity<String> readFile(@RequestParam String filepath) {
        try {
            String fileContent = contenido.lecturaArchivo(filepath);
            System.err.println("Contenido del archivo: "); 
            return ResponseEntity.ok(fileContent);
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Se ha producido un error de puntero nulo: " + e.getMessage());
        }
        
    }

}
