package com.spring.app1.springboot_aplications.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice // Contolla de manera global los errores de la aplicacion
public class ManejoErrores {

    @ExceptionHandler(ArithmeticException.class)  // Captura cualquier tipo de excepcion
    public ResponseEntity<String> manejarExcepcion(ArithmeticException e) {
        System.err.println("Error: " + e.getMessage()); // Imprime el error en la consola
        return new ResponseEntity<>("Division no permitida", HttpStatus.BAD_REQUEST); // Retorna un mensaje de error
    }
}
