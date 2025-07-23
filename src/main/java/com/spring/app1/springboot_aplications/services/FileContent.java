package com.spring.app1.springboot_aplications.services;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Service;

@Service
public class FileContent {

    
    public String lecturaArchivo(String fileName) {
        try {
            Path filePath = Paths.get(fileName);
            return Files.readString(filePath);

        } catch (IOException e) {
            throw new RuntimeException("Error al leer el archivo: " + e.getMessage(), e);
        }
  
    }
}
