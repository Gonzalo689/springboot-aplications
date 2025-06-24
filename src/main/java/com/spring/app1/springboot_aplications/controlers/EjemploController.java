package com.spring.app1.springboot_aplications.controlers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
  
    
    public String info(Model model) {
        model.addAttribute("titulo", "Servidor Spring Boot");
        model.addAttribute("servidor", "informaticonfig");
        model.addAttribute("version", "1.0.0");
        model.addAttribute("autor", "Gonzalo Contreras");


        return "detalles_info";
    }
}
