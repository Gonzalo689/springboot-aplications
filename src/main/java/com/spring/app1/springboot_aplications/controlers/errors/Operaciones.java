package com.spring.app1.springboot_aplications.controlers.errors;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/api/division")
public class Operaciones {
    @GetMapping
    public String Divide(@RequestParam (name = "numerador") String NumeratorStr,
                         @RequestParam (name = "denominador") String DenominatorStr) { 
        try {
            int numerator = Integer.parseInt(NumeratorStr);
            int denominator = Integer.parseInt(DenominatorStr);
            return "El resultado de la division es: " + (numerator / denominator);
        } catch (ArithmeticException e) {
            throw e;
        } catch (NumberFormatException e) {
            throw e;
        }
    }
    
}
